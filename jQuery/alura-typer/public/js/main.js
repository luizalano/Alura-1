
/* 
	A função abaixo só é executada após o carregamento de todo o html
	Duas forma de chamar:
		$(document).ready(function(){ 
	ou simplesmente
		$(function(){ 
*/
/*$(document).ready(function(){*/
$(function(){ 
	pegaTamanhoInicial();
	atribuiEventoFocoAoTexto();
	inicializaCronometro();
	atribuiFuncaoReset();
})

function pegaTamanhoInicial (){
	var frase = $(".frase").text();
	var palavras = frase.split(" ");
	var numeroPalavras = frase.split(" ").length;

	var tamanhoFrase = $("#tamanho-frase");

	tamanhoFrase.text(numeroPalavras);
}

function atribuiEventoFocoAoTexto(){
	
	var campo = $(".campo-digitacao");
	campo.on("input", function(){
		var conteudo = campo.val();
		var qtdeCaracteresDoCampo = conteudo.length;

		/*qtdePalavrasDoCampo = conteudo.split(" ").length;*/
		qtdePalavrasDoCampo = conteudo.split(/\S+/).length - 1;  /*  a expressão regular S+ considera qualquer espaçõ vazio */

		var contadorCaracteres = $("#contador-caracteres");
		contadorCaracteres.text(qtdeCaracteresDoCampo);

		var contadorPalavras = $("#contador-palavras");
		contadorPalavras.text(qtdePalavrasDoCampo);

		var gabarito = $(".frase").text().substr(0, qtdeCaracteresDoCampo);
		
		if (gabarito == conteudo) { 
			campo.removeClass("borda-vermelha");
			campo.addClass("borda-verde");
		} else {
			campo.removeClass("borda-verde");
			campo.addClass("borda-vermelha");
		}

	})
}

function inicializaCronometro(){	
	var tempoRestante = $("#tempo-restante").text();
	/* 	a Função on, ee entrar no campo várias vezes, chama a função várias vezes  
	   	Para corrigir, usar a função one, ue só chama a função uma vez
	*/
	var campo = $(".campo-digitacao");
	campo.one("focus", function(){
		var cronometroId = setInterval(function(){
			tempoRestante--;
			$("#tempo-restante").text(tempoRestante);
			if (tempoRestante <= 0) {
				finalizaJogo();
				clearInterval(cronometroId);
			}
			
		}, 1000);
	});

}

function finalizaJogo(){
	$(".campo-digitacao").attr("disabled",true);
	/* altera uma configuração CSS do elemento*/
	/* campo.css("background-color", "#FFCCD3");
	   a função toggleClas alterna entre adicionar e remover uma classe
	*/
	$(".campo-digitacao").addClass("campo-desativado");
	inserePlacar();
}

function resetJogo(){
	$(".campo-digitacao").attr("disabled", false);
	$(".campo-digitacao").val("");
	$("#tempo-restante").text(tempoDeJogo);
	$("#contador-caracteres").text("0");
	$("#contador-palavras").text("0");
	$(".campo-digitacao").removeClass("campo-desativado");
	$(".campo-digitacao").removeClass("borda-verde");
	$(".campo-digitacao").removeClass("borda-vermelha");
	inicializaCronometro();
}

function atribuiFuncaoReset(){
	/*  $("#botao-reiniciar").on("click", function(){ 
		as funções de eventos mais comuns podem ser chamadas de outra forma no jQuery
		*/ 
	$("#botao-reiniciar").click(resetJogo);
}

var tempoDeJogo = $("#tempo-restante").text();
