package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    VvHomePage vvHomePage;

    @Step()
    public void theVvHomePage() {
        vvHomePage.open();
    }
}
