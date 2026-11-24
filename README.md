# API-Produtos

API REST de gerenciamento de produtos, desenvolvida com Java e Spring Boot. Projeto de estudo em andamento.

## Tecnologias

- Java
- Spring Boot
- [SEU BANCO DE DADOS]

## Como rodar

```bash
git clone https://github.com/YasminFerrariDias/API-Produtos.git
cd API-Produtos
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.

Requer o banco [SEU BANCO DE DADOS] configurado em `application.properties`.

## Rotas

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/produtos` | Lista os produtos |

## Próximos passos

- POST, PUT e DELETE de produtos
