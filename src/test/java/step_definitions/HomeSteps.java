package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();

    }

    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        // Write code here that turns the phrase above into concrete actions

        BrowserUtils.getDriver();
    }

    @Then("Verify title text is {string}")
    public void verify_title_text_is(String title) {
        // Write code here that turns the phrase above into concrete actions
//        WebElement element = null;
//                switch (title.toLowerCase()) {
//            case "advance systems - home":
//                element = page.titleText;
//                break;
//            default:
//                System.out.println("WebElement is not defined");
//        }
//             BrowserUtils.assertEquals(page.titleText.getText(), title);
//    }

   // BrowserUtils.assertEquals(page.titleText.getText(), title);
        System.out.println("Advance");
}}