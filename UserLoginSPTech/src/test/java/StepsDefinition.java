import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StepsDefinition {

    WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafal\\IdeaProjects\\parishTestOffice\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("a user in a test.sptech.pl page")
    public void userIsOnPage()
    {
        driver.get("test.sptech.pl/");  // open page
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    }

    @When("the user clicks on login")
    public void userClicksOnLoginButton()
    {
        driver.findElement(By.cssSelector(".user-info > a:nth-child(1) > span:nth-child(2)")).click();
        Assert.assertTrue(Boolean.parseBoolean("Zaloguj się do swojego konta"));
    }

    @And("the user type e-mail")
    public void userTypeEmail(String text)
    {
        driver.findElement(By.cssSelector("div.form-group:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).click();
        input.sendKeys(text);
    }

    @And("type password")
    public void userTypePassword(String text2)
    {
        driver.findElement(By.cssSelector(".js-child-focus")).click();
        input.sendKeys(text2);
    }

    @And("press login button")
    public void userClicksConfirmationOfLogin
    {
        driver.findElement(By.cssSelector("#submit-login")).click();
    }

    @Then("the user go to account panel")
    public void assertLoginResult()
    {
        Assert.assertTrue(Boolean.parseBoolean("Twoje konto"));
    }

    @After
    public void tearDown()
    {
        driver.quit();
        driver = null;
    }

}
