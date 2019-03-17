# Desafio realizado para seleção na Stefanini

# Instalação
## Passo 1: Rodar os seguintes comandos `./mvnw clean`, `./mvnw compile`, `./mvnw install`

## Passo 2: Rodar aplicação `.mvnw`, o banco utilizado foi em memória sql H2.

## Passo 3: Testes unitrios. `./mvnw clean test`

# API Documentation for challenge.

## `GET /pessoas/`

Retorna todas as pessoas, no precisa de autenticação

## `POST /pessoas/`

Cria uma nova pessoa

##### PARAMS:

*  **`Nome`** nome da pessoa

*  **`Sobrenome`** Sobrenome da pessoa.

*  **`Cpf`** CPf da pessoa, deve conter 11 caracteres.

*  **`Email`** Email da pessoa.


## `PUT /pessoas/{id}`

Atualiza uma nova pessoa

##### PARAMS:

*  **`Nome`** nome da pessoa

*  **`Sobrenome`** Sobrenome da pessoa.

*  **`Cpf`** CPf da pessoa, deve conter 11 caracteres.

*  **`Email`** Email da pessoa.


## `DELETE /pessoas/{id}`

DELETA uma nova pessoa

## `GET /enderecos/`

Retorna todos os endereços, não precisa de autenticação

## `DELETE /enderecos/{1}`

DELETA um endereço

## `PUT /enderecos/{1}`

ATUALIZA um endereço

##### PARAMS:

*  **`Logradouro`** 

*  **`Bairro`** 

*  **`Cidade`** 

*  **`Estado`** 

* **`Pessoa`** - Objeto pessoa


## `POST /enderecos/`

CRIA um novo endereço

##### PARAMS:

*  **`Logradouro`** 

*  **`Bairro`** 

*  **`Cidade`** 

*  **`Estado`** 

* **`Pessoa`** - Objeto pessoa


# IMAGENS

#### - Endpoints pessoas.

![imagem1](https://i.ibb.co/DpsqVN7/image-3.png)

#### - Exemplo resultado.

![imagem1](https://i.ibb.co/mRB92WM/image-5.png)


#### - Endpoints de enderecos

![imagem1](https://i.ibb.co/Pt5cH1T/image-6.png)

#### - Exemplo de enderecos

![imagem1](https://i.ibb.co/Pt5cH1T/image-4.png)


# swagger

This application was generated using JHipster 5.8.2, you can find documentation and help at [https://www.jhipster.tech/documentation-archive/v5.8.2](https://www.jhipster.tech/documentation-archive/v5.8.2).



