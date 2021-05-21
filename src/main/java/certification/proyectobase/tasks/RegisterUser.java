package certification.proyectobase.tasks;

import certification.proyectobase.model.DataTable;
import certification.proyectobase.userinterface.RegisterUPPage;
import certification.proyectobase.userinterface.RegisterUserPage;
import certification.proyectobase.userinterface.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class RegisterUser implements Task {

    private  List<DataTable> dataTable;

    public RegisterUser(List<DataTable> dataTable) {
        this.dataTable = dataTable;
    }

    public static RegisterUser user(List<DataTable> dataTable) {

        return Tasks.instrumented(RegisterUser.class,dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        DataTable info = dataTable.get(0);

       actor.attemptsTo(
               WaitUntil.the(RegisterUserPage.USERNAME, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
               Enter.theValue(info.getUserName()).into(RegisterUserPage.USERNAME),
               Enter.theValue(info.getEmail()).into(RegisterUserPage.EMAIL),
               Enter.theValue(info.getPassword()).into(RegisterUserPage.PASSWORD),
               Enter.theValue(info.getConfirm_password()).into(RegisterUserPage.CONFIRM_PASSWORD),
               Enter.theValue(info.getFirst_Name()).into(RegisterUserPage.FIRST_NAME),
               Enter.theValue(info.getLast_name()).into(RegisterUserPage.LAST_NAME),
               Enter.theValue(info.getPhone_Number()).into(RegisterUserPage.PHONE_NUMBER),
               SelectFromOptions.byVisibleText(info.getCountry()).from(RegisterUserPage.COUNTRY),
               Enter.theValue(info.getCity()).into(RegisterUserPage.CITY),
               Enter.theValue(info.getAddress()).into(RegisterUserPage.ADDRESS),
               Enter.theValue(info.getState()).into(RegisterUserPage.STATE),
               Enter.theValue(info.getPostal_Code()).into(RegisterUserPage.POSTAL),
              Click.on(RegisterUserPage.CHECK),
              Click.on(RegisterUserPage.REGISTER));



             // Enter.theValue(info.getUserName()).into(RegisterUserPage.USERNAME),
             // Click.on(UserPage.SHOPNOW),
            //  WaitUntil.the(UserPage.SHOPNOW, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
            //  Click.on(UserPage.ADDTOCAR),
           //   WaitUntil.the(UserPage.ADDTOCAR, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
           //    Click.on(UserPage.CHECKOUT));
       ;
              // WaitUntil.the(UserPage.BOTON, WebElementStateMatchers.isVisible()).forNoMoreThan(320).seconds());

            // Enter.theValue(info.getName()).into(UserPage.USERNAME),
         //   Enter.theValue(info.getLastName()).into(UserPage.PASSWORD));

      //  WaitUntil.the(SearchPage.ONLY_GO, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
         //        Click.on(SearchPage.ONLY_GO),
           //  Enter.theValue(info.getPhone()).into(DoctorHomePage.PHONE_DOCTOR),
           //  Click.on(DoctorHomePage.PHONE_DOCTOR),
          //   SelectFromOptions.byVisibleText(info.getDocumentType()).from(DoctorHomePage.LISTDOCUMENT),
           //  Enter.theValue(info.getDocumentNumber()).into(DoctorHomePage.DOCUMENT_NUMBER_DOCTOR),
          //   Click.on(DoctorHomePage.CLICK_GUARDAR));

    }
}
