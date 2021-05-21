package certification.proyectobase.questions;

import certification.proyectobase.userinterface.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswer implements Question<Boolean> {
    private String question;

    public TheAnswer (String question) {
        this.question = question;

    }

    public static TheAnswer is(String question) {
        return new TheAnswer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String answer = Text.of(UserPage.ANSWER).viewedBy(actor).asString();
        if (question.equals(answer)) {
            result = true;
        }else {
            result = false;
        }
        return result;



    }


}

