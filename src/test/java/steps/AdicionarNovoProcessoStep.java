package steps;

import cucumber.api.java.pt.*;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class AdicionarNovoProcessoStep extends BaseSteps {

    private Home home = new Home(driver);
    private MenuImpacta menu = new MenuImpacta(driver);
    private GridProcesso gridProcesso = new GridProcesso(driver);
    private ProcessoInclusao processoInclusao = new ProcessoInclusao(driver);
    private ProcessoSalvar processoSalvar = new ProcessoSalvar(driver);
    private ProcessoMostrar processoMostrar = new ProcessoMostrar(driver);

    @Dado("^que um usuario esta na pagina Agapito Software Testing$")
    public void queUmUsuarioEstaNaPaginaAgapitoSoftwareTesting() {
        home.abrirPagina();
    }

    @E("^o usuario clica no menu \"([^\"]*)\"$")
    public void oUsuarioClicaNoMenu(String vMenu) throws Throwable {
        menu.clicarMenu(vMenu);
    }

    @E("^o usuario clica no botao novo processo$")
    public void oUsuarioClicaNoBotaoNovoProcesso() {
        gridProcesso.clickNovoProcesso();
    }

    @E("^o usuario clica no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioClicaNoCampoOValor(String campo, String valor) throws Throwable {
        processoInclusao.preencherCampo(campo, valor);
    }

    @Quando("^o usuario clicar no botao \"([^\"]*)\" salvar$")
    public void oUsuarioClicarNoBotaoSalvar(String botao) throws Throwable {
        processoSalvar.clicarSalvar(botao);
    }

    @Entao("^usuario deveria visualizar a mensagem \"([^\"]*)\"$")
    public void usuarioDeveriaVisualizarAMensagem(String messagem) throws Throwable {
        Assert.assertEquals(messagem, processoMostrar.recuperarMensagemComSucesso());
    }

    @E("^o usuario selecionar o campo urgente com valor \"([^\"]*)\"$")
    public void oUsuarioSelecionarOCampoUrgenteOValor(String valor) throws Throwable {
        processoInclusao.selecionarUrgencia(valor);
    }

    @E("^o usuario clica no campo processo_arbitramento_s com valor \"([^\"]*)\"$")
    public void oUsuarioClicaNoCampoProcesso_arbitramento_sComValor(String valor) throws Throwable {
        processoInclusao.clicaCampoArbitramento(valor);
    }

    @Quando("^o usuario clicar no voltar$")
    public void oUsuarioClicarNoVoltar() {
        processoMostrar.clicarVoltar();
    }

    @Então("^o usuario deveria ver o texto \"([^\"]*)\"$")
    public void oUsuarioDeveriaVerOTexto(String menssage) throws Throwable {
        Assert.assertTrue(gridProcesso.existeTexto(menssage));
    }
}
