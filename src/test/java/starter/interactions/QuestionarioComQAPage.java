package starter.interactions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import starter.data.UserModel;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionarioComQAPage extends PageObject {

    @FindBy(name = "fname")
    private WebElementFacade inputNome;

    @FindBy(name = "lname")
    private WebElementFacade inputSobrenome;

    @FindBy(name = "email")
    private WebElementFacade inputEmail;

    @FindBy(id = "nf-field-8")
    private WebElementFacade inputConfirmacaoEmail;

    @FindBy(id = "nf-field-17")
    private WebElementFacade inputTelefone;

    @FindBy(xpath = "//*[@id='nf-field-10-container']//ul/li/label")
    private List<WebElementFacade> listRdbIdade;

    @FindBy(id = "nf-field-11")
    private WebElementFacade selectTempoNaArea;

    @FindBy(id = "nf-field-12")
    private WebElementFacade selectAtracaoNaArea;

    @FindBy(xpath = "//*[@id='nf-field-13-wrap']//ul/li/label")
    private List<WebElementFacade> listRdbPrecisaMelhorar;

    @FindBy(id = "nf-field-14")
    private WebElementFacade inputLinguagensDeProgramacao;

    @FindBy(id = "nf-field-15")
    private WebElementFacade inputPlanoDeCarreira;

    @FindBy(css = "input[value='Enviar']")
    private WebElementFacade btnEnviar;

    @FindBy(css = ".nf-response-msg")
    private WebElementFacade lblSuccess;

    public void preencheFormaluraio(final UserModel userModel) {
        inputNome.typeAndTab(userModel.getNome());
        inputSobrenome.typeAndTab(userModel.getSobreNome());
        inputEmail.typeAndTab(userModel.getEmail());
        inputConfirmacaoEmail.typeAndTab(userModel.getEmail());
        inputTelefone.typeAndTab(userModel.getTelefone());
        selecRdbIdade(userModel.getIdade());
        selectTempoNaArea.selectByVisibleText(userModel.getTempoNaArea());
        selectAtracaoNaArea.selectByValue(userModel.getAtracaoNaArea());
        selecRdbPrecisaMelhorar(userModel.getPrecisaMelhorar());
        inputLinguagensDeProgramacao.typeAndTab(userModel.getLinguagensDeProgramacao());
        inputPlanoDeCarreira.typeAndTab(userModel.getResumoPlanoCarreira());
    }

    public void enviaFormulario() {
        btnEnviar.click();
    }

    public void selecRdbIdade(String menuOption) {
        listRdbIdade.stream()
                .filter(menulist -> menulist.getText().equalsIgnoreCase(menuOption))
                .collect(Collectors.toList())
                .forEach(WebElementFacade::click);
    }

    public void selecRdbPrecisaMelhorar(String menuOption) {
        listRdbPrecisaMelhorar.stream()
                .filter(menulist -> menulist.getText().equalsIgnoreCase(menuOption))
                .collect(Collectors.toList())
                .forEach(WebElementFacade::click);
    }

    public String validateSucessMessage() {
        return lblSuccess.getText();
    }

}
