package elementos;

import org.openqa.selenium.By;

public class elementos {
	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnParavoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	
	

	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");

	

	private By textoFaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnParavoce() {
		return btnParavoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}
	public By getCampoCpf() {
		return campoCpf;
		
}
	public By getCampoTelefone() {
		return campoTelefone;
	}


}
