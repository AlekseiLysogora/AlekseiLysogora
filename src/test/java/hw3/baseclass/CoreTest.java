package hw3.baseclass;

import hw3.baseclass.commonsteps.CommonActionStep;
import hw3.baseclass.commonsteps.CommonAssertSteps;
import hw3.ex1.pages.FramePage;
import hw3.ex1.pages.HomePage;
import hw3.ex1.steps.FirstExerciseActionStep;
import hw3.ex1.steps.FirstExerciseAssertionStep;
import hw3.ex2.steps.SecondExerciseActionStep;
import hw3.ex2.steps.SecondExerciseAssertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public abstract class CoreTest {

    protected WebDriver driver;
    protected SoftAssert softAssertion;
    protected WebDriverWait wait;
    protected BaseClass commonSteps;

    protected HomePage homePage;
    protected FramePage framePage;

    protected FirstExerciseActionStep firstExerciseActionStep;
    protected FirstExerciseAssertionStep firstExerciseAssertionStep;

    protected SecondExerciseAssertionStep secondExerciseAssertionStep;
    protected SecondExerciseActionStep secondExerciseActionStep;

    protected CommonActionStep commonActionStep;
    protected CommonAssertSteps commonAssertSteps;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver =  DriverManager.setupDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();
        commonSteps = new BaseClass(driver, wait);

        homePage = new HomePage(driver);
        framePage = new FramePage(driver);

        commonActionStep = new CommonActionStep(driver, wait);
        commonAssertSteps = new CommonAssertSteps(driver, softAssertion);

        firstExerciseActionStep = new FirstExerciseActionStep(driver);
        firstExerciseAssertionStep = new FirstExerciseAssertionStep(driver, softAssertion);

        secondExerciseActionStep = new SecondExerciseActionStep(driver);
        secondExerciseAssertionStep = new SecondExerciseAssertionStep(driver, softAssertion);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}