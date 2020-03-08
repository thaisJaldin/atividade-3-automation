package pages;

import support.DriverQA;

public class PaginaSucesso {

    private DriverQA driver;

    public PaginaSucesso(DriverQA stepDriver){
        driver = stepDriver;
    }

    public String getResult(){
        return driver.getText("result");
    }

    public String buscarMesagem() {
        return "success Login!";
    }
}
