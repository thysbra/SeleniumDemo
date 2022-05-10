package be.refleqt.testing.steps;

import be.refleqt.testing.pages.HeaderPage;
import io.cucumber.java.en.Then;

public class ShoppingCartSteps {

    public ShoppingCartSteps() {
    }

    @Then("{int} item is added to the shopping cart")
    public void theItemIsAddedToTheShoppingCart(int amountOfItems) {
        new HeaderPage()
                .goToShoppingCart()
                .validateItem(amountOfItems);
    }

}
