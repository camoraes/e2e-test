package starter.stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;
import starter.interactions.NavigateTo;
import starter.interactions.PesquisaComQASteps;

public class PesquisaComQaStepDefinitions {

    @Steps
    NavigateTo navigateTo;
    @Steps
    PesquisaComQASteps pesquisaComQASteps;

    @Dado("que eu acesse a página da VV Test")
    public void que_eu_acesse_a_página_da_VV_Test() {
        navigateTo.theVvHomePage();
    }

    @Dado("acesse o menu {string}")
    public void acesse_o_menu(String menuOption) {
        pesquisaComQASteps.confirmOption(menuOption);
    }

    @Quando("eu preencher todos os campos obrigatórios")
    public void eu_preencher_todos_os_campos_obrigatórios() {
        pesquisaComQASteps.preencheCamposObrigatoriosPesquisaQa();
    }

    @Então("deve ser direcionado para uma página de sucesso")
    public void deve_ser_direcionado_para_uma_página_de_sucesso() {
        pesquisaComQASteps.validateSucessMessage();
    }

}
