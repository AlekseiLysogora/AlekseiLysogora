package hw4.baseclass.steps.action;

import hw4.baseclass.pages.DifferentElementsPage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class SecondExerciseActionStep {

    private DifferentElementsPage differentElementsPage;

    public SecondExerciseActionStep(WebDriver driver, DifferentElementsPage differentElementsPage) {
        this.differentElementsPage = differentElementsPage;
    }

    //STEP #5: Open through the header menu Service -> Different Elements Page
    //DATA: -
    //EXPECTED RESULT: Page is opened
    @Step("STEP #5: Open through the header menu Service -> Different Elements Page")
    public void openPage() {
        differentElementsPage.openPage();
    }

    //STEP #6: Select checkboxes
    //DATA: Water, Wind
    //EXPECTED RESULT: Elements are checked
    @Step("STEP #6: Select checkboxes")
    public void selectCheckboxes() {
        differentElementsPage.selectCheckboxes();
    }

    //STEP #7: Select radio
    //DATA: Selen
    //EXPECTED RESULT: Element is checked
    @Step("STEP #7: Select radio")
    public void selectRadio() {
        differentElementsPage.selectRadio();
    }

    //STEP #8: Select in dropdown
    //DATA: Yellow
    //EXPECTED RESULT: Element is selected
    @Step("STEP #8: Select in dropdown")
    public void selectInDropdown() {
        differentElementsPage.selectInDropdown();
    }
}