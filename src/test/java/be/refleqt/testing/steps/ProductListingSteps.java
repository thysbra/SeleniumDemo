package be.refleqt.testing.steps;

import be.refleqt.testing.pages.ProductListingPage;
import io.cucumber.java.en.When;

public class ProductListingSteps {

    public ProductListingSteps(){

    }

    @When("I add a random item to the shopping cart")
    public void iAddARandomItemToTheShoppingCart() {
        new ProductListingPage().addRandomItemToCart();
    }
}
