package starter.data;


public class UserModel {

    private String nome;
    private String sobreNome;
    private String email;
    private String confirmacaoEmail;
    private String idade;
    private String tempoNaArea;
    private String atracaoNaArea;
    private String precisaMelhorar;
    private String linguagensDeProgramacao;
    private String resumoPlanoCarreira;
    private String telefone;


    public UserModel(String nome, String sobreNome, String email, String confirmacaoEmail, String idade, String tempoNaArea, String atracaoNaArea, String precisaMelhorar, String linguagensDeProgramacao, String resumoPlanoCarreira, String telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.confirmacaoEmail = confirmacaoEmail;
        this.idade = idade;
        this.tempoNaArea = tempoNaArea;
        this.atracaoNaArea = atracaoNaArea;
        this.precisaMelhorar = precisaMelhorar;
        this.linguagensDeProgramacao = linguagensDeProgramacao;
        this.resumoPlanoCarreira = resumoPlanoCarreira;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmacaoEmail() {
        return confirmacaoEmail;
    }

    public void setConfirmacaoEmail(String confirmacaoEmail) {
        this.confirmacaoEmail = confirmacaoEmail;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTempoNaArea() {
        return tempoNaArea;
    }

    public void setTempoNaArea(String tempoNaArea) {
        this.tempoNaArea = tempoNaArea;
    }

    public String getAtracaoNaArea() {
        return atracaoNaArea;
    }

    public void setAtracaoNaArea(String atracaoNaArea) {
        this.atracaoNaArea = atracaoNaArea;
    }

    public String getPrecisaMelhorar() {
        return precisaMelhorar;
    }

    public void setPrecisaMelhorar(String precisaMelhorar) {
        this.precisaMelhorar = precisaMelhorar;
    }

    public String getLinguagensDeProgramacao() {
        return linguagensDeProgramacao;
    }

    public void setLinguagensDeProgramacao(String linguagensDeProgramacao) {
        this.linguagensDeProgramacao = linguagensDeProgramacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getResumoPlanoCarreira() {
        return resumoPlanoCarreira;
    }

    public void setResumoPlanoCarreira(String resumoPlanoCarreira) {
        this.resumoPlanoCarreira = resumoPlanoCarreira;
    }

}
