package certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoguinPage {

    public static final Target ICON = Target.the("")
            .located(By.id("menuUserLink"));
    public static final Target USER = Target.the("")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("")
            .located(By.name("password"));
    public static final Target SIGN_IN = Target.the("")
            .located(By.xpath("//button[@id='sign_in_btnundefined']"));
    public static final Target ANSWER = Target.the("")
            .located(By.xpath("(//span[contains(.,'Maribell')])[2]"));








}
