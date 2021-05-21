package certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UserPage {

    public static final Target TABLETS = Target.the("")
            .located(By.xpath("//div[@id='tabletsImg']"));
    public static final Target SHOPNOW = Target.the("")
            .located(By.xpath("//a[contains(text(),'HP Elite x2 1011 G1 Tablet')]"));
    public static final Target ADDTOCAR = Target.the("")
            .located(By.name("save_to_cart"));
    public static final Target CHECKOUT = Target.the("")
            .located(By.id("checkOutPopUp"));
    public static final Target ANSWER = Target.the("")
            .located(By.xpath("//a[contains(text(),'ORDER PAYMENT')]"));



}
