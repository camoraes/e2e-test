package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class MenuOptionPage extends PageObject {

    @FindBy(xpath = "//*[@id='site-navigation']//ul/li/a")
    private List<WebElementFacade> menulist;

    public void confirmMenuOption(final String menuOption) {
        menulist.stream()
                .filter(menulist -> menulist.getText().equalsIgnoreCase(menuOption))
                .collect(Collectors.toList())
                .forEach(WebElementFacade::click);
    }
}