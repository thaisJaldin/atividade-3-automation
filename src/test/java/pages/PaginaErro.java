package pages;

import support.DriverQA;

public class PaginaErro {

    private DriverQA driver;

    public PaginaErro(DriverQA stepDriver){
        driver = stepDriver;
    }

    public String getResult(){
        return driver.getText("result");
    }

    public String buscarMesagem() {
        return "erro Login!";
    }
}
