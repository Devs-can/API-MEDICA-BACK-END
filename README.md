# Sobre o projeto

A gestão de uma clínica médica pode ser uma tarefa complexa, com a necessidade de gerenciar informações de pacientes, médicos e agendamentos de consultas. Nesse sentido, criei o projeto Clínica Médica Java- PACIMED Essa API permite o cadastro de pacientes e médicos, bem como a realização de operações CRUD em um banco de dados MySQL, oferecendo uma solução completa e eficiente para a gestão de informações médicas.
O projeto Clínica Médica Java,consiste em uma API REST denominada PACIMED. Esta API é responsável por cadastrar médicos e pacientes, além de permitir a realização de operações CRUD (Create, Read, Update and Delete) em um banco de dados MySQL.
A API PACIMED foi desenvolvida utilizando o framework Spring Boot, que é uma ferramenta amplamente utilizada no desenvolvimento de aplicações Java. Este framework permite que os desenvolvedores possam criar aplicações mais rapidamente, já que ele possui diversas funcionalidades pré-configuradas que podem ser utilizadas sem a necessidade de uma configuração mais complexa.
Com a API PACIMED, é possível cadastrar informações pessoais e profissionais de médicos e pacientes, tais como nome completo, endereço, telefone, e-mail, número do registro profissional, especialidade médica, dentre outras. 


# 🏥  PaciMed 🏥

Bem-vindo ao projeto de documentação da clínica médica fictícia, PaciMed.
Neste projeto, criarei um aplicativo com algumas opções, onde você pode fazer o CRUD, tanto de médicos quanto de pacientes.
Nesta documentação, abordarei as tecnologias a serem usadas, os objetivos a serem alcançados e as funcionalidades que farão parte deste aplicativo.

![image](https://github.com/Devs-can/API-MEDICA-BACK-END/assets/91226847/be06cd54-9402-43db-b43a-1fb3f539eb1c)


## 📊 Tecnologias 📊

Neste projeto serão utilizadas as seguintes tecnologias:

- Spring Boot 3
- Java 17
- Lombok
- MySQL/ Flyway
- JPA/Hibernate
- Maven
- Insomnia

## 🎯 Objetivos 🎯

Este projeto tem os seguintes objetivos:

- Desenvolvimento de uma API Rest
- CRUD (Create, Read, Update e Delete)
- Validações
- Paginação e ordenação

## 🤝 Funcionalidades 🤝

Este aplicativo terá as seguintes funcionalidades:

- Cadastro de médicos
- Cadastro de pacientes
- Agendamento de consultas
- Cancelamento de consultas
- Visualização de consultas
- Realização de consultas
- Paginação e ordenação dos dados
- Validações
- Edição de médicos e pacientes
- Exclusão de médicos e pacientes

## Rotas
### Médico
| Rota               | Método  | Descrição                                                                                                                      |
|--------------------|---------|---------------------------------------------------------------------------------------------------------------------------------|
| /medicos           | POST    | Cadastra um novo médico                                                                                                      |
| /medicos           | GET     | Retorna todos os médicos cadastrados                                                                                         |
| /medicos/{id}      | GET     | Retorna um médico especifico                                                                                                  |
| /medicos/{id}      | PUT     | Atualiza os dados do médico especificado                                                                                     |
| /medicos/{id}      | DELETE  | Remove o médico especificado    

### Paciente

| Rota        | Método  | Descrição                                               |
|-------------|---------|---------------------------------------------------------|
| /pacientes             | POST    | Cadastrar paciente                                      |
| /pacientes             | GET     | Listar pacientes                                        |
| /pacientes /{id}       | GET     | Buscar paciente por id                                  |
| /pacientes /{id}       | PUT     | Atualizar dados do paciente                             |
| /pacientes /{id}       | DELETE  | Remover paciente                                        |


## 🔧Começando 🔧

Para começar a trabalhar neste projeto, siga as instruções abaixo para configurar o ambiente de desenvolvimento:

1. Instale o [Java 17](https://www.oracle.com/java/technologies/javase-downloads.html);
2. Instale o [Spring Boot 3](https://start.spring.io/);
3. Instale o [Lombok](https://projectlombok.org/setup/overview);
4. Instale o [MySQL](https://dev.mysql.com/doc/refman/8.0/en/installing.html) e o [Flyway](https://flywaydb.org/getstarted/firststeps/maven);
5. Instale o [JPA/Hibernate](https://hibernate.org/orm/documentation/5.4/);
6. Instale o [Maven](https://maven.apache.org/install.html);
7. Instale o [Insomnia](https://insomnia.rest/download/).


## 🚀 Conclusão 🚀

Espero que este projeto possa trazer a você a experiência de desenvolver uma aplicação completa, com muitas funcionalidades e objetivos a serem alcançados.

Se você tiver alguma dúvida ou desejar contribuir com o projeto, fique à vontade.

Obrigado pela leitura 🤝
