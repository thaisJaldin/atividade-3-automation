package pages;

import support.DriverQA;

public class ShowProcess {

    private DriverQA driver;

    public ShowProcess(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void clickShow(String id) {
        driver.click("btn-show_" + id);
    }

    public String recuperarMensagemComSucesso() {
        return driver.getText("notice");
    }

    public void clicarVoltar() {
        driver.click(".ls-btn-primary-danger", "css");
    }
}
