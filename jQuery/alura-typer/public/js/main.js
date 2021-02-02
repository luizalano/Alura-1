function pegaTamanhoInicial (){
	var frase = $(".frase").text();
	var palavras = frase.split(" ");
	var numeroPalavras = frase.split(" ").length;

	var tamanhoFrase = $("#tamanho-frase");

	tamanhoFrase.text(numeroPalavras);
}

function atribuiCliqueAoTexto(){
	
	var campo = $(".campo-digitacao");
	campo.on("input", function(){
		conteudo = campo.val();
		console.log(conteudo);		
		qtdeCaracteresDoCampo = conteudo.length;

		/*qtdePalavrasDoCampo = conteudo.split(" ").length;*/
		qtdePalavrasDoCampo = conteudo.split(/\S+/).length - 1;  /*  a expressão regular S+ considera qualquer espaçõ vazio */

		contadorCaracteres = $("#contador-caracteres");
		contadorCaracteres.text(qtdeCaracteresDoCampo);

		contadorPalavras = $("#contador-palavras");
		contadorPalavras.text(qtdePalavrasDoCampo);

	})

}

pegaTamanhoInicial();
atribuiCliqueAoTexto();
