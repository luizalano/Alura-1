$("#botao-texto").click(trocaTexto);
$("#botao-frase-id").click(buscaFrase);

function trocaTexto(){
	$("#erro").hide();
	$("#spinner").show();

	var i = Math.floor((Math.random() * 10));

	var endereco = "http://localhost:3000/frasses";
	if ((i % 2) == 0) endereco = "http://localhost:3000/frases";

	$.get(endereco, trocaTextoRetornado).fail(function(){
		$("#erro").show();
	}).always(function(){
		$("#spinner").hide();
	});
}

function trocaTextoRetornado(dados){
	var textoAtual = $(".frase");

	textoAtual.text("");
	i = -1;

	while (i < 0){
		/*   floor arredonda para baixo*/
		j = Math.floor((Math.random() * dados.length));
		if (j < dados.length) i = j;
	}

	textoAtual.text(dados[i].texto);
	pegaTamanhoInicial();
	tempoDeJogo = dados[i].tempo;
	resetJogo();
}

function trocaTextoExato(dados){
	var textoAtual = $(".frase");

	textoAtual.text("");

	textoAtual.text(dados.texto);
	pegaTamanhoInicial();
	tempoDeJogo = dados.tempo;
	resetJogo();
}


function buscaFrase(){
	$("#erro").hide();
	$("#spinner").show();

	var fraseId = $("#frase-id").val();

	var dados = { id: fraseId};

 	endereco = "http://localhost:3000/frases";

	$.get(endereco, dados, trocaTextoExato).fail(function(){
		$("#erro").show();
	}).always(function(){
		$("#spinner").hide();
	});	
}