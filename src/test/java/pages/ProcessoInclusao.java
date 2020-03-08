package pages;

import support.DriverQA;

public class ProcessoInclusao {
    private DriverQA driver;

    public ProcessoInclusao(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void preencherCampo(String campo, String valor) {
        driver.sendKeys(valor, campo);
    }

    public void selecionarUrgencia(String valor) {
        driver.selectByText(valor, "processo_urgente");
    }

    public void clicaCampoArbitramento(String valor) {
        driver.click( "processo_arbitramento_s");
    }
}
