package starter.stepdefinitions.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.VvHomePage;

public class NavigateTo {

    VvHomePage vvHomePage;

    @Step
    public void theVvHomePage() {
        vvHomePage.open();
    }
}
