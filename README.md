# 📝 Sistema de Gestão de Tarefas com Kanban

Este projeto foi desenvolvido por mim, Micaela, com o objetivo de praticar e evoluir minhas habilidades em **Java com Spring Boot**. Ele simula um sistema de gestão de tarefas no estilo **Kanban**, como no Trello, com funcionalidades básicas como criar, listar e atualizar tarefas.

É um dos meus **primeiros projetos completos em Java + Spring**, e faz parte da minha preparação para entrar no mercado de trabalho como **dev back-end**.

---

## ✨ Por que criei esse projeto?

- Para consolidar meus estudos de **Spring Boot e Java**
- Praticar a **estruturação de camadas (model, controller, repository)**
- Entender como criar **APIs REST**
- Usar um **banco de dados relacional** com JPA
- Ter um projeto real no meu portfólio, que possa ser mostrado para recrutadores

---

## 🚀 Tecnologias Utilizadas

- 💻 **Java 21**
- 🔧 **Spring Boot 3**
- 🌐 **Spring Web** (para APIs REST)
- 📦 **Spring Data JPA** (para persistência no banco de dados)
- 🧪 **H2 Database** (banco de dados em memória usado para testes)
- 📦 **Gradle** (gerenciador de dependências/build)
- 🗂️ **Git e GitHub** (controle de versão e hospedagem)

---

## 🧠 O que eu aprendi com esse projeto

- Criar projetos com **Spring Initializr**
- Rodar o projeto com **Gradle e o terminal**
- Organizar o código em **camadas (MVC)**
- Conectar e persistir dados com **JPA**
- Lidar com erros de build, terminal, estrutura de pastas e push para o GitHub
- Fazer um commit com responsabilidade e montar um repositório mais apresentável

---

## ✅ Funcionalidades Implementadas

- [x] Criar tarefa
- [x] Listar tarefas
- [x] Atualizar status da tarefa
- [x] Excluir tarefa
- [ ] (em breve) Integração com banco PostgreSQL
- [ ] (em breve) Autenticação com Spring Security
- [ ] (em breve) Documentação com Swagger

---

## 🧱 Estrutura do Projeto

src/
├── main/
│ ├── java/com/micaela/kanban/
│ │ ├── controller/ # Onde ficam os endpoints REST
│ │ ├── model/ # Representação das entidades do sistema
│ │ ├── repository/ # Acesso ao banco de dados com JPA
│ │ └── KanbanApplication # Classe principal que inicia o projeto
│
└── resources/
└── application.properties # Configurações da aplicação

