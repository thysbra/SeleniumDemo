package be.refleqt.testing.steps;

import be.refleqt.testing.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    @Given("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String userName, String password) {
        new HomePage()
                .fillInUsername(userName)
                .fillInPassword(password)
                .submitLogin();
    }

    @When("I add a random item to the shopping cart")
    public void i_add_a_random_item_to_the_shopping_cart() {
    }

    @Then("{int} item is added to the shopping cart")
    public void item_is_added_to_the_shopping_cart(Integer amountOfItems) {
    }

}
