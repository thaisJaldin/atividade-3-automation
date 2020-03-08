package pages;

import support.DriverQA;

public class ProcessoMostrar {

    private DriverQA driver;

    public ProcessoMostrar(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public String recuperarMensagemComSucesso() {
        return driver.getText("notice");
    }

    public void clicarVoltar() {
        driver.click(".ls-btn-primary-danger", "css");
    }
}
