🏥 Sistema de Clínica Médica em Java (Spring Boot)

Este projeto é um sistema simples de clínica médica desenvolvido em Java utilizando o framework Spring Boot.  
Ele permite cadastrar e gerenciar dados de pacientes e médicos, realizando operações básicas de um sistema real, com persistência em banco de dados MySQL.

---

🚀 Funcionalidades

- Cadastrar pacientes  
- Listar pacientes cadastrados  
- Atualizar dados de pacientes  
- Remover pacientes  
- Persistir dados no banco de dados MySQL  
- Criação automática das tabelas com JPA/Hibernate  

---

🛠️ Tecnologias utilizadas

- Java 25  
- Spring Boot 4.0.1  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- MySQL  
- Maven  
- Programação Orientada a Objetos (POO)  

---

📂 Estrutura do projeto

```text
controller → Responsável pelos endpoints REST  
entity     → Entidades JPA (Paciente, Médico, etc.)  
repository → Interfaces JpaRepository  
service    → Regras de negócio  
