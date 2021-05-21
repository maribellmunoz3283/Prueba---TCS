package certification.proyectobase.stepdefinitions;

import certification.proyectobase.model.DataLoguin;
import certification.proyectobase.model.DataTable;
import certification.proyectobase.questions.TheAnswer;
import certification.proyectobase.questions.TheAnswerRegister;
import certification.proyectobase.questions.TheAnswerUser;
import certification.proyectobase.tasks.*;
import certification.proyectobase.userinterface.LoguinPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TestStepdefinitions {




    @Given("^wants to access the Web Automation Demo Site$")
    public void wantsToAccessTheWebAutomationDemoSite()  {

        OnStage.theActorCalled("maribell").wasAbleTo(OpenUp.openUpPage());

    }

    @When("^he performs the login on the page$")
    public void hePerformsTheLoginOnThePage()  {
        OnStage.theActorInTheSpotlight().attemptsTo(User.user());
    }



    @Then("^verifies that the screen is loading with text (.*)$")
    public void verifiesThatTheScreenIsLoadingWithTextDoubleClickOnEditIconToEDITTheTableRow(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.is(question)));
    }




    @Given("^she quiere registrar sus datos en the Web Automation advantageonlines$")
    public void sheQuiereRegistrarSusDatosEnTheWebAutomationAdvantageonlines()  {

        OnStage.theActorCalled("maribell").wasAbleTo(RegisterOpenUP.registerUPPage());
    }

    @When("^she enter your personal data$")
    public void sheEnterYourPersonalData(List<DataTable> dataTable)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.user(dataTable));

    }

    @Then("^verifies that is loading with text (.*)$")
    public void verifiesThatIsLoadingWithTextSuccessfulRegistration(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerRegister.is(question)));

    }

    @Given("^that she wants to enter the system$")
    public void thatSheWantsToEnterTheSystem()  {
        OnStage.theActorCalled("maribell").wasAbleTo(OpenUp.openUpPage());
    }


    @When("^she enters username and password$")
    public void sheEntersUsernameAndPassword(List<DataLoguin> dataLoguin)  {

        OnStage.theActorInTheSpotlight().attemptsTo(LoguinUser.user(dataLoguin));


    }

    @Then("^verifies that is loading (.*)$")
    public void verifiesThatIsLoadingORDERPAYMENT(String question)  {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerUser.is(question)));

    }








}





