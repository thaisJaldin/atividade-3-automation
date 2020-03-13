package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class CRUDSelenium extends BaseSteps {

    private Home home = new Home(driver);
    private MenuImpacta menu = new MenuImpacta(driver);
    private GridProcess gridProcess = new GridProcess(driver);
    private IncludeProcess includeProcess = new IncludeProcess(driver);
    private SaveProcess saveProcess = new SaveProcess(driver);
    private ShowProcess showProcess = new ShowProcess(driver);
    private EditProcess editProcess = new EditProcess(driver);
    private DeleteProcess deleteProcess = new DeleteProcess(driver);

    @Given("^POST - A user want to add a item$")
    public void postAUserWantToAddAItem() {
        home.open();
    }

    @And("^The user click on menu \"([^\"]*)\"$")
    public void theUserClickOnMenu(String vMenu) {
        menu.clickMenu(vMenu);
    }

    @And("^The user click on button novo processo$")
    public void theUserClickOnButtonNovoProcesso() {
        gridProcess.clickNovoProcesso();
    }

    @And("^The user click on field \"([^\"]*)\" and set value \"([^\"]*)\"$")
    public void theUserClickOnFieldAndSetValue(String field, String value) {
        includeProcess.FillField(field, value);
    }

    @And("^The user select \"([^\"]*)\" value on urgente field$")
    public void theUserSelectValueOnUrgenteField(String value) {
        includeProcess.selectUrgencia(value);
    }

    @And("^The user click \"([^\"]*)\" radio button$")
    public void theUserClickRadioButton(String value) {
        includeProcess.clickFieldArbitramento(value);
    }

    @When("^The user click on button \"([^\"]*)\" to save$")
    public void theUserClickOnButtonToSave(String button) {
        saveProcess.clickSave(button);
    }

    @Then("^The user should see the message \"([^\"]*)\"$")
    public void theUserShouldSeeTheMessage(String message) {
        Assert.assertTrue(gridProcess.existText(message));
        showProcess.clickBack();
    }

    @Given("^GET - A user want to see a item details$")
    public void getAUserWantToSeeAItemDetails() {
        home.open();
    }

    @When("^The user click on button Mostrar of list with id \"([^\"]*)\"$")
    public void userSelectTheItemOfListWithId(String id) {
        showProcess.clickShow(id);
    }

    @Then("^The user should see the details os process$")
    public void theUserShouldSeeTheDetailsOsProcess() {
        Assert.assertTrue(gridProcess.existText("Vara"));
    }

    @Given("^PUT - A user want to update a item$")
    public void putAUserWantToUpdateAItem() {
        home.open();
    }

    @And("^The user click on button Editar of item with id \"([^\"]*)\"$")
    public void theUserClickOnButtonEditarOfItemWithId(String id) {
        editProcess.clickEdit(id);
    }

    @Given("^DELETE - A user want to delete a item")
    public void deleteAUserWantToDeleteAItem() {
        home.open();
    }

    @When("^user press button Apagar of item with id \"([^\"]*)\"$")
    public void userPressButtonApagarOfItemWithId(String id) {
        deleteProcess.clickDelete(id);
    }

    @Then("^The item with id \"([^\"]*)\" should not exist$")
    public void theItemWithIdShouldNotExist(String id) throws Throwable {
        Assert.assertFalse(gridProcess.existText("btn-delete_" + id));
    }
}
