package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Formulario;
import pages.Metodos;

public class FormularioTest {
	
	Metodos metodos = new Metodos();
	Formulario form = new Formulario();
	

	@Dado("que eu esteja no formulario")
	public void queEuEstejaNoFormulario() {
		metodos.abrirBrowser("file:///C:/Users/carme/OneDrive/%C3%81rea%20de%20Trabalho/semana%20piramede%20de%20testes/index.html");

	}

	@Quando("eu preencher e enviar o formulario")
	public void euPreencherEEnviarOFormulario() throws IOException {
		form.preencherFormulario("E2E Treinamentos", "e2etreiamentos@e2etreinamentos.com.br", "Semana da piramede de testes");

	}

	@Entao("sou direcionado para o site da escola")
	public void souDirecionadoParaOSiteDaEscola() {
		metodos.validarTitle("E2E Treinamentos");

	}

}
