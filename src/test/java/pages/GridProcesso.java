package pages;

import support.DriverQA;

public class GridProcesso {

    private DriverQA driver;

    public GridProcesso(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickNovoProcesso() {
       driver.click("btn-novo");
    }

    public boolean existeTexto(String menssage) {
        return driver.getTextAllPage(menssage);
    }
}
