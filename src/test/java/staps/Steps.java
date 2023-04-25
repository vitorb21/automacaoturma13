package staps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.elementos;
import metodos.Metodos;

public class Steps {
	
	Metodos m = new Metodos();
	elementos e = new elementos();
	
	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
	m.executarNavegador(url, "descricaoPasso");
	   
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
	   m.click(e.getBtnAbrirConta(),"selecionando o botao abrir conta");
	  
	}

	@Given("^selecionar o botao abrir conta para voce$")
	public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
		m.click(e.getBtnParavoce(), "Selecionando botao abrir conta");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {

		m.preencher(e.getCampoNome(), "flash code", "preenchendo o campo nome");
		m.preencher(e.getCampoTelefone(), "11111111111", "preenchendo o campo telefone");
		m.preencher(e.getCampoEmail(), "test@teste.com.br", "preenchendo o campo email");
		m.preencher(e.getCampoCpf(), "12573318095", "preenchendo o campo CPF");
		
	} 

	@When("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
		m.click(e.getBtnQueroSerCliente(), "selecionando botao quero ser cliente");
	}  

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {
	} 

}
