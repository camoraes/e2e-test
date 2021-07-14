package starter.data;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;


public class FixtureLoaderTemplates implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(UserModel.class).addTemplate("user_model", new Rule() {{
            add("nome", "Caio");
            add("sobreNome", "Ribeiro");
            add("email", "email@email.com");
            add("confirmacaoEmail", "email@email.com");
            add("idade", "31-49");
            add("telefone", "11-95955-5599");
            add("tempoNaArea", "mais de 5 anos");
            add("atracaoNaArea", "desafio");
            add("precisaMelhorar", "Comunicação");
            add("linguagensDeProgramacao", "Java, Java Script, PHP, Groovy script");
            add("resumoPlanoCarreira", "\n" +
                    "\n" +
                    "What is Lorem Ipsum?\n" +
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        }});
    }
}
