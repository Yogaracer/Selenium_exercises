package lt.marius.pom.pages.seleniumeasy;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class HomePage {
    public static void open() {

        Common.setUpDriver();
        Common.openUrl("https://demo.seleniumeasy.com/");
    }

    public static void clickOnMenuItemInputForms() {
        Common.clickOnElementByAction(
                Locators.Seleniumeasy.Home.menuItemInputForms
        );
    }

    public static void clickOnDropdownListItemRadioButtonsDemo() {
        Common.clickOnElementByAction(
                Locators.Seleniumeasy.Home.dropdownlistItemRadioButtonsDemo
        );


    }
}
