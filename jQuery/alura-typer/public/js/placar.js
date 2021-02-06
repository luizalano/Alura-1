$("#botao-placar").click(mostraPlacar);
$("#botao-sync").click(sincronizaPlacar);

function mostraPlacar(){
	/* .stop para a animação anterior para executar a nova 
	   para os casos emq ue o usuário fica clicando continuamente
	   sem esperar a animação encerrar */
	$(".placar").stop().slideToggle(600);
}

function atribuiEventoBotaoRemover(){
	event.preventDefault();
	/* 
	um elemento do html não tem acesso às funções do jQuery.
	Por isso é necessário colcocá-lo dentro da função jQuery,
	neste caso $(this)
	*/

	linha = $(this).parent().parent(); // Sem a atribuição, o this não funcionou dentro da função
	linha.fadeOut(1000);
	setTimeout(function(){
		linha.remove(); 
	},1000);
	
}


function inserePlacar(){
	/*  busca a classe placar e procura um filho pelo elemento tbody*/
	var tabela =$(".placar").find("tbody");

	var resultado = "x";

	if ($(".campo-digitacao").val() == $(".frase").text()) {
		resultado = "SUCESSO";
	} else {
		resultado = "SBAGLIATO";
	}

	var usuario = $("#usuarios").val();
	var contadorCaracteres = $("#contador-caracteres").text();
	var contadorPalavras = $("#contador-palavras").text();

	var linha = novaLinha(usuario, contadorPalavras, resultado);
	linha.find(".botao-remover").click(atribuiEventoBotaoRemover);

	tabela.prepend(linha);

	$(".placar").slideDown(500);
	rolaPaginaParaPlacar();
}

function rolaPaginaParaPlacar (){
	var posicaoPlacar = $(".placar").offset().top;
	$(".body").animate({
		scroolTop: posicaoPlacar + "px"
	},1000);
}

function novaLinha(nomeUsuario, numeroPalavras, resultado){
	/* retorna um objeto e não uma string*/

	/* cria um objeto do tipo <tr>*/
	var linha= $("<tr>");
	var colunaUsuario = $("<td>").text(nomeUsuario);
	var colunaPalavras = $("<td>").text(numeroPalavras);
	var colunaResultado = $("<td>").text(resultado);
	var colunaRemover = $("<td>");
	var link = $("<a>").addClass("botao-remover").attr("href","#");
	var icone = $("<i>").addClass("small").addClass("material-icons").text("delete");

	link.append(icone);
	colunaRemover.append(link);
	linha.append(colunaUsuario);
	linha.append(colunaPalavras);
	linha.append(colunaResultado);
	linha.append(colunaRemover);

	return linha;
}

function getPlacarTela(){
	var placar = [];
	// Recupera todas as tr filhas diretas de tbody
	var linhas = $("tbody>tr");
	linhas.each(function(){
		var usuario = $(this).find("td:nth-child(1)").text();
		var pontos = $(this).find("td:nth-child(2)").text();
		var resultado = $(this).find("td:nth-child(3)").text();

		var score ={
			usuario: usuario,
			pontos: pontos,
			resultado: resultado
		}
		
		placar.push(score);
	})
	/* 
		placar contém um array com a estrutura montada
		a função retorna un json com o array placar
	*/
	return { placar : placar};
}

function sincronizaPlacar(){
	var placar = getPlacarTela();

	$.post("http://localhost:3000/placar", placar, function(){
		alert("Dados salvos!");
	})

}

function obtemPlacarArmazenado(){
	$.get("http://localhost:3000/placar", function(data){
		
		$(data).each(function(){
			
			var linha = novaLinha(this.usuario, this.pontos, this.resultado);
			
			linha.find(".botao-remover").click(atribuiEventoBotaoRemover);
			$("tbody").append(linha);

		})

		$(".placar").slideDown(500);
		rolaPaginaParaPlacar();
	})
}
