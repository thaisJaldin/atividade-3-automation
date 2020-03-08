package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.Acesso;
import pages.PaginaErro;
import pages.PaginaSucesso;
import support.BaseSteps;

public class LoginPortuguesSteps extends BaseSteps {

    private static Acesso acesso = new Acesso(driver);
    private static PaginaErro pageFail = new PaginaErro(driver);
    private static PaginaSucesso paginaSucesso = new PaginaSucesso(driver);

    @Dado("^que o usuario esta na pagina de login$")
    public void queOUsuarioEstaNaPaginaDeLogin() {
        acesso.abrirPagina();
    }

    @E("^o usuario preenche no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioPreencheNoCampoOValor(String nomeCampo, String valorCampo) throws Throwable {
        acesso.preencherCampo(nomeCampo, valorCampo);
    }

    @Quando("^o usuario clicar no botao login$")
    public void oUsuarioClicarNoBotaoLogin() {
        acesso.clicarBotaoLogin();
    }

    @Entao("^usuario deveria ver a mensagem de \"([^\"]*)\"$")
    public void usuarioDeveriaVerAMensagemDe(String mensagem) throws Throwable {

        Assert.assertEquals(mensagem, paginaSucesso.buscarMesagem());
    }

    @Entao("^usuario deveria ver a mensagem de erro \"([^\"]*)\"$")
    public void usuarioDeveriaVerAMensagemDeErro(String mensagem) throws Throwable {
        Assert.assertEquals(mensagem, pageFail.buscarMesagem());
    }
}
