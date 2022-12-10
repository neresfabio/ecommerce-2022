# Desenvolvimento

## Índice

- [Desenvolvimento](#desenvolvimento)
  - [Índice](#índice)
  - [Metodologia](#metodologia)
  - [Ferramentas Selecionadas](#ferramentas-selecionadas)
  - [Dependências](#dependências)
  - [Projeto](#projeto)

## Metodologia

> Modelo Iterativo

```
Para esse projeto o modelo adotado para orientar no desenvolvimento é o modelo iterativo, para ser entregue um produto com qualidade, que corresponda com as expectativas do cliente. O processo iterativo permite a subdivisão de tarefas, onde a cada ciclo pode-se analisar e refinar pouco a pouco o sistema.
```
**Processo**:

* Análise de requisitos;
* Projeto;
* Implemetação e Teste;
* Implantação;
* Prototipação;

## Ferramentas Selecionadas

> LucidChart (UML – Unified Modeling Language)

É uma plataforma web para colaboração visual, oferece uma interface intuitiva e
alguns modelos básicos prontos para modelagem de sistemas. Essa ferramenta web permite a
elaboração de gráficos e diagramas, auxiliando as equipes da área de engenharia de software.

Disponibiliza gratuitamente o uso de alguns componentes visuais de modelagem, ferramenta
ideal para auxiliar no desenvolvimento (LUCIDCHART, 2022). Nesse projeto essa
ferramenta é utilizada para modelagem visual, como na criação do diagrama de casos de uso
utilizando a linguagem UML.

> Spring Boot (Framework Java)

Trata-se de uma extensão do Spring Framework que permite a criação fácil e rápida de
aplicações web prontas para produção com o conceito de just run (apenas executar). Ele
requer uma mínima configuração sendo complementado por outros módulos da Spring
Plataform e bibliotecas de terceiros, isso possibilita que o desenvolvedor foque somente a
entender a regra de negócio, a parte lógica do sistema (SPRING BOOT, 2022). É usado como
gerenciador que decide a melhor forma de se fazer algo. Ele toma as decisões baseados em
convenções, aplicando configurações padrões e facilitando o trabalho, também permite ao
desenvolvedor criar suas próprias configurações.

> MySQL

É uma ferramenta visual unificada para DBA, desenvolvedores ou arquitetos de banco
de dados. MySQL fornece modelagem de dados, desenvolvimento de SQL e ferramentas de
administração abrangentes para configuração de servidor, administração de usuários, backup e
muito mais, está disponível em Windows, Linux e Mac OS X (MySQL, 2022). Uma opção
para quando o sistema estiver quase finalizado, esta ferramenta é ideal para quando se
trabalha com armazenamentos de dados em produção. Nesse projeto, é utilizado para
armazenar os dados que passam pela API.

> Postman

É uma API Client que facilita aos desenvolvedores criar, compartilhar, testar e
documentar APIs. Isso é feito, permitindo aos usuários criar e salvar requisições HTTP e
HTTPS simples e complexas, bem como ler suas respostas (POSTMAN,2022).
Após a escolha do método que conduzirá o desenvolvimento e das ferramentas
adequadas, a próxima etapa é desenvolver o sistema. A seção 3 apresenta o registro dos
artefatos criados nas etapas que estão definidas no processo de desenvolvimento.

## Dependências

Para criar o projeto Spring Boot utilizou-se a platforma [spring initializr](https://start.spring.io/) com as seguintes dependências.

- **Spring Web**: para criar aplicação web usando o padrão MVC (Model-View-Controller) e outros recursos que vem por padrão.

- **MySQL Driver**: driver para conectar ao banco de dados.

- **Spring Data JPA**: para a persistência dos dados.

## Projeto

> **Modelo para o banco de dados**

<figure>
  <img src="https://user-images.githubusercontent.com/50967217/206866258-03fbddef-872a-45e3-a6aa-679f9d2ca164.png" alt="Modelo ER">
  <figcaption>Primeiro modelo V1.0.0</figcaption>
</figure>

> Configuração da conexão com banco de dados `application.properties`

```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/teste
spring.datasource.username= nome_usuario
spring.datasource.password= senha_usuario
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql= true
spring.jpa.properties.hibernate.format_sql=true
```

> **Criação das entidades**

- [x] **Curso**






