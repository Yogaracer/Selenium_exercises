package lt.marius.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Seleniumeasy {

        public class Home {

            public static By menuItemInputForms =
                    By.xpath("//div[@id='navbar-brand-centered']//a[contains(text(),'Input Forms')]");


            public static By dropdownlistItemRadioButtonsDemo =
                    By.xpath("//div[@id='navbar-brand-centered']//a[contains(text(),'Radio Buttons Demo')]");
        }
    }
}



