package starter.navigation;

import br.com.six2six.fixturefactory.Fixture;
import net.thucydides.core.annotations.Step;
import starter.data.Messages;
import starter.data.UserModel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PesquisaComQASteps {

    MenuOptionPage menuOptionPage;
    QuestionarioComQAPage questionarioComQAPage;
    UserModel userModel;


    @Step
    public void confirmOption(String menuOption) {
        menuOptionPage.confirmMenuOption(menuOption);
    }

    @Step
    public void preencheCamposObrigatoriosPesquisaQa() {
        userModel = Fixture.from(UserModel.class).gimme("user_model");
        questionarioComQAPage.preencheFormaluraio(userModel);
        questionarioComQAPage.enviaFormulario();
        ;
    }

    @Step
    public void validateSucessMessage() {
        assertThat(questionarioComQAPage.validateSucessMessage(), equalTo(Messages.SUCCESS.getMessage()));
    }

}
