package certification.proyectobase.tasks;

import certification.proyectobase.userinterface.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class User implements Task {
    public User() {

    }

    public static User user() {
        return Tasks.instrumented(User.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {




       actor.attemptsTo(
               WaitUntil.the(UserPage.TABLETS, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
               Click.on(UserPage.TABLETS),
               WaitUntil.the(UserPage.SHOPNOW, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
               Click.on(UserPage.SHOPNOW),
               WaitUntil.the(UserPage.ADDTOCAR, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
               Click.on(UserPage.ADDTOCAR),
               WaitUntil.the(UserPage.CHECKOUT, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
               Click.on(UserPage.CHECKOUT),
               WaitUntil.the(UserPage.ANSWER, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds());

    }
}
