# Gerenciador de Tarefas (Task Manager)


Aplicação Full-Stack de gerenciamento de tarefas desenvolvida como Projeto Final da disciplina de "Programação Orientada a Objetos com Java" na Fatec.

O projeto permite criar, visualizar, editar e excluir tarefas (CRUD), persistindo os dados em um banco relacional e rodando em container Docker na nuvem.

##  Deploy (Acesse o projeto online)

Clique abaixo para testar a aplicação rodando em produção no Render:

> (https://gerenciador-tarefas-t4au.onrender.com)
>
>  !!!Como o projeto está hospedado no plano gratuito do Render, o primeiro acesso pode levar cerca de **1 minuto** para carregar (Cold Start). Por favor, aguarde.!!!


## Tecnologias Utilizadas

* **Backend:** Java 17, Spring Boot 3 (Web, Data JPA).
* **Frontend:** Thymeleaf, HTML5, CSS3, JavaScript.
* **Banco de Dados:**
    * **H2 Database:** Para ambiente de desenvolvimento (em memória).
    * **PostgreSQL:** Para ambiente de produção (Render).
* **DevOps:** Docker (Dockerfile Multi-stage) e Git.
* **Ferramentas:** Maven, Lombok, IntelliJ/VS Code.

## Funcionalidades

Create: Cadastrar novas tarefas com título, descrição e status.
Read: Listar todas as tarefas cadastradas.
Update: Editar informações de uma tarefa existente.
Delete: Excluir tarefas (com confirmação via JavaScript).
Docker:** Aplicação containerizada pronta para deploy.

## Como rodar o projeto localmente

### Pré-requisitos
* Java 17 instalado.
* Maven instalado.
* Git instalado.

### Passo a passo

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/Figuinhas/gerenciador-tarefas-final.git](https://github.com/Figuinhas/gerenciador-tarefas-final.git)
    ```

2.  Acesse a pasta do projeto:
    ```bash
    cd gerenciador-tarefas-final
    ```

3.  Execute a aplicação:
    O projeto está configurado para usar o banco H2 localmente, então não é necessário instalar o Postgres na sua máquina.
    ```bash
    mvn spring-boot:run -Dspring-boot.run.profiles=local
    ```

4.  Acesse no navegador:
    Abra `http://localhost:8080`

## Como rodar com Docker (Localmente)

Com o Docker instalado, pode rodar sem precisar do Java/Maven na máquina:

1.  Construa a imagem:
    ```bash
    docker build -t tarefas-app .
    ```

2.  Rode o container:
    ```bash
    docker run -p 8080:8080 tarefas-app
    ```

