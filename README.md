# e2e-test

Projeto de testes automatizados utilizando SerenityBDD com Cucumber e Selenium.

##  Instalação

1. JDK 1.8.x
2. Gradle 4.x
3. Google Chrome.


## Drivers.
Este projeto utiliza um driver customizado e gerenciado pelo WebDriverManager para google chrome.
 
WebDriverManager é uma biblioteca que permite automatizar a gestão dos drivers (por exemplo chromedriver , geckodriver , etc.) exigido pelo Selenium WebDriver.

## Executando os testes

Para executar seus testes você pode definir uma ou mais tags na execução, você encontra as tags nas features automatizadas.

Executando os testes via linha de comando você também pode definir suas tags:

```gradle clean test -Dcucumber.options="--tags '@Regressivo'"```

```gradle clean test -Dcucumber.options="--tags '@PesquisaComQA'"```

```gradle clean test -Dcucumber.options="--tags '@PreenchePesquisaComDadosObrigatoriosSucesso'"```

Você pode definir um ambiente para execução através do profile:

```gradle clean test  -Denvironment=staging```


## Cenários e tags automatizados:
### Funcionalidade: Pesquisa com o QA
```
@PesquisaComQA
 - Cenário: @PreenchePesquisaComDadosObrigatoriosSucesso
 - Tag: @Regressivo
```
```

## Resultado da execução dos testes:
Os resultados do teste serão registrados no diretório `target/site/serenity`.
