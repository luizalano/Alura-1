$("#botao-placar").click(mostraPlacar);

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

	var usuario = "Eu"
	var contadorCaracteres = $("#contador-caracteres").text();
	var contadorPalavras = $("#contador-palavras").text();

	var linha = novaLinha("Eu", contadorPalavras, resultado);
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

