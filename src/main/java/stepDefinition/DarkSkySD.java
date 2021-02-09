package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DarkSkyHomePage;

public class DarkSkySD {

    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("I am on Darksky Home Page")
    public void i_am_on_darksky_home_page() {

      String actual =  SharedSD.getDriver().getTitle();
      String expected = "Dark Sky - NH 65, Pune, Maharashtra";
        Assert.assertEquals(actual,expected,"we are not on darksky page");

    }

    @Then("I verify current temp is equal to Temperature from Daily Timeline")
    public void i_verify_current_temp_is_equal_to_temperature_from_daily_timeline() {

        String expected = darkSkyHomePage.getCurrTemp();
        String actual = darkSkyHomePage.getTimeLineTemp();

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"temperatures are different");

    }

}
