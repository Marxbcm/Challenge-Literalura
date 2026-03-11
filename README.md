📚 Challenge Literalura
Projeto desenvolvido como parte do Challenge Literalura da Alura.
A aplicação consome uma API de livros e armazena as informações em um banco de dados para consulta.
🚀 Tecnologias utilizadas
-Java
-Spring Boot
-Spring Data JPA
-Hibernate
-PostgreSQL
-Maven
📦 Estrutura do projeto
src
 └ main
    └ java
       └ com.alura.literalura
          ├ model
          ├ repository
          ├ service
          └ LiteraluraApplication
Descrição das camadas
Camada  Função
Model - Representa as entidades do banco
Repository - Comunicação com o banco de dados
Service - Regras de negócio
Application - Classe principal que inicia o projeto

Funcionalidades
-Buscar livros através de uma API
-Salvar livros no banco de dados
-Listar livros cadastrados
-Listar autores
-Consultar estatísticas de livros

🗄 Banco de dados
O banco utilizado é o PostgreSQL.
Ferramentas recomendadas para gerenciamento:
-pgAdmin
-DBeaver

📖 Aprendizados
Este projeto explora conceitos importantes como:
-Consumo de API REST
-Persistência de dados com JPA
-Mapeamento objeto-relacional (ORM)
-Arquitetura em camadas
-Integração com banco de dados
