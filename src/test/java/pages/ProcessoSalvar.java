package pages;

import support.DriverQA;

public class ProcessoSalvar {
    private DriverQA driver;

    public ProcessoSalvar(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clicarSalvar(String botao) {
        driver.click(botao);
    }
}
