function atribuiEventoDigitacaoFiltro(){
	var campoFiltro = document.querySelector("#filtrar-tabela");
	campoFiltro.addEventListener("input", filtraDados);
}

function filtraDados(){
	nomeFiltro = this.value;

	var pacientes = document.querySelectorAll(".paciente");

	if (nomeFiltro.length > 0) {
		pacientes.forEach(function(paciente){
			var tdNome = paciente.querySelector(".info-nome");
			nomePaciente = tdNome.textContent;
			
			/* Definindo uma expressão regular
				o argumento "i" define case insensitivy
			*/
			var expressao = new RegExp(nomeFiltro, "i");
			/* a sentença abaixo testa a variável nomePaciente com o nomefiltro que 
			   está armazenado na expressão regular. Como se fosse %like% */
			if (!expressao.test(nomePaciente)){
				paciente.classList.add("invisivel");
			} else {
				paciente.classList.remove("invisivel");
			}

		})
	} else {
		pacientes.forEach(function(paciente){
			paciente.classList.remove("invisivel");
		})
	}

}


atribuiEventoDigitacaoFiltro();