# Micro-serviço de Email

Este é um microservice de envio de email por SMTP e armazenamento em base de dados em memoria com H2.

## Requisitos

- JDK 17+.

- Email e senha.

## Execução

1. Renomeie o arquivo [.env.exemple](/src/main/resources/.env.exemple) para `.env` e altere os campos com seus dados de email.

2. Dentro da raiz do projeto execute:

    ```sh
    ./mvnw spring-boot:run
    ```

3. Esta deve ser a requisição HTTP:

    ```http
    POST http://localhost:8080/api/v1/email HTTP/1.1
    Content-Type: application/json

    {
        "ownerRef": "Test",
        "emailFrom": "your@email.com",
        "emailTo": "your@email.com",
        "subject": "Test",
        "text": "Test Test Test Test Test"
    }
    ```

    Utilize o Postman ou qualquer outra ferramenta. Caso utilize a extensão do VSCode, [REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) você pode ver [este arquivo](/api.http).
