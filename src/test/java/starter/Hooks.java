package starter;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class Hooks {

    @Before
    public void setupDriver() {
        ChromeDriverManager.chromedriver().setup();
        FixtureFactoryLoader.loadTemplates("starter.data");
    }

}
