package lt.marius.pom.tests.seleniumeasy;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.seleniumeasy.HomePage;
import lt.marius.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonDemoPageTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnMenuItemInputForms();
        HomePage.clickOnDropdownListItemRadioButtonsDemo();
    }

    @Test
    public void testRadioButtonDemoPageOpenWithAction() {
        Common.sleep(3000);
    }
}
