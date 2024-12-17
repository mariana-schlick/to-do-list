<h1> to-do-list </h1>
Criação de API de tarefas para fazer, com Java e Spring Boot. Pretendo aperfeiçoar conforme meus estudos em Java forem se aprofundando. 

## Descrição
Este projeto está sendo criado com base em um desafio de vaga para Desenvolvedor Backend Junior. Desenvolvimento de uma aplicação web utilizando uma linguagem de programação e um framework. A aplicação consiste em um sistema de gerenciamento de tarefas, onde podemos criar, visualizar, editar e excluir tarefas.

## Conteúdo
* Banco de dados
* Campos da entidade
    * Nome
    * Descrição
    * Realizado
    * Prioridade
* CRUD de tarefas

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


