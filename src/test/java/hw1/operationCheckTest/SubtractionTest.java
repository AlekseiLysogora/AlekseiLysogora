package hw1.operationCheckTest;

import hw1.dataProviders.SubtractionDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubtractionTest extends AbstractCalculatorTest {

    @Test(
            description = "Test for approve sum functional, Jira binding cab be here",
            dataProvider = "Subtraction data provider",
            dataProviderClass = SubtractionDataProvider.class
    )
    public void dataProviderSubtractionTest(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = calculator.sub(firstNumber, secondNumber);
        assertEquals(actualResult, expectedResult);
    }
}
