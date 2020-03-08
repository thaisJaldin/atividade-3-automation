package pages;

import support.DriverQA;

public class Acesso {

    private DriverQA driver;

    public Acesso(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickLogin(){
        driver.click("btnLogin");
    }

    public void fillLogin(String value){
        driver.sendKeys(value,"login");
    }

    public void fillPass(String value){
        driver.sendKeys(value,"password");
    }

    public void abrirPagina() {
        String url = "file:///D:/Impacta/aulas/Automation/selenium-webdriver/html/login.html";
        driver.openURL(url);
    }

    public String getGeneralResult(){
        return driver.getText("result");
    }

    public void fillLoginXpath(String value) {
        driver.sendKeys(value,"//*[@id=\"login\"]", "xpath");
    }

    public void fillLoginCSS(String value) {
        driver.sendKeys(value,"#login", "css");
    }

    public void fillLoginName(String value) {
        driver.sendKeys(value,"uname", "name");
    }

    public void preencherCampo(String nomeCampo, String valorCampo) {
         driver.sendKeys(valorCampo, nomeCampo);
    }

    public void clicarBotaoLogin() {
        driver.click("#btnLogin","css");
    }
}
