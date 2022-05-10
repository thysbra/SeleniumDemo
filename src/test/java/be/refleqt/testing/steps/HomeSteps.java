package be.refleqt.testing.steps;

import be.refleqt.testing.pages.HomePage;
import io.cucumber.java.en.When;

public class HomeSteps {

    public HomeSteps() {
    }

    @When("I login with username {string} and password {string}")
    public void iLoginWithUsernameAndPassword(String username, String password) {
        new HomePage()
                .fillInUsername(username)
                .fillInPassword(password)
                .login();
    }
}
