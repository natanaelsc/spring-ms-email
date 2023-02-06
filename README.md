# Micro-serviço de Email

Este é um microservice de envio de email por SMTP, com uso de RabbitMQ e armazenamento em banco de dados em memoria com H2.

## Requisitos

- JDK 17+.

- Email e senha.

## Execução

1. Renomeie o arquivo [.env.exemple](/src/main/resources/.env.exemple) para `.env` e altere os campos com seus dados de email.

2. Dentro da pasta do projeto execute:

    ```sh
    docker compose up -d
    ```

    ```sh
    ./mvnw spring-boot:run
    ```

3. Este deve ser o corpo da requisição HTTP, o endpoint e header:

    ```http
    POST http://127.0.0.1:8080/api/v1/emails HTTP/1.1
    Content-Type: application/json

    {
        "ownerRef": "Test",
        "emailFrom": "your@email.com",
        "emailTo": "your@email.com",
        "subject": "Test",
        "text": "Test Test Test Test Test"
    }
    ```

    Utilize o Postman ou qualquer outra ferramenta. Caso utilize a extensão do VSCode, [REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) veja o schema no arquivo [api.http](/api.http).

### Envio com RabbitQM

1. Acesse a interface web: <http://127.0.0.1:15672>.

2. Siga para ***Queues*** -> ***ms.email*** -> ***Publish message***.

3. Copie o corpo da mensagem abaixo alterando as informações, cole em ***Payload*** e ***Publish Message***:

    ```json
    {
        "ownerRef": "Test",
        "emailFrom": "your@email.com",
        "emailTo": "your@email.com",
        "subject": "Test",
        "text": "Test Test Test Test Test"
    }
    ```

4. Veja no console as informações.
