# Projeto TCC: Sistema de Compra, Venda e Troca de Games

Este projeto é uma aplicação desenvolvida para o Trabalho de Conclusão de Curso (TCC) do Técnico em Informática. O sistema consiste em uma plataforma web e uma aplicação móvel para a compra, venda e troca de games, com funcionalidades completas de CRUD (Create, Read, Update, Delete).

## Descrição do Projeto

### Web

A aplicação web permite aos usuários:
- Comprar, vender e trocar games.
- Gerenciar o estoque e visualizar pedidos.

A interface foi desenvolvida utilizando:
- **HTML**: Para a estruturação das páginas.
- **CSS**: Para estilização e design.
- **JavaScript**: Para interatividade e funcionalidades dinâmicas.

### Mobile

A aplicação móvel fornece funcionalidades semelhantes à versão web, além de permitir:
- Verificar o andamento dos pedidos.

Foi desenvolvida em **Java**.

### Backend

O backend foi construído usando **Java com Spring Boot**, oferecendo uma API robusta para interação com o frontend web e móvel. O banco de dados utilizado é **SQL**, mas para fins de teste, o projeto está configurado para usar o **H2**.

## Instruções para Início

### Configuração do Backend

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

# Guia de Configuração

## Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio

## Importação e Execução do Projeto

### Importe o projeto no Spring Boot

1. Abra o Spring Tool Suite (STS) ou sua IDE favorita.
2. Selecione "Import" > "Existing Maven Projects".
3. Navegue até o diretório do projeto e selecione-o.
4. Conclua a importação.

### Inicie o projeto

1. No STS ou na sua IDE, clique com o botão direito no projeto e selecione "Run As" > "Spring Boot App".
2. A aplicação será iniciada no localhost na porta 8282.

### Acesse a aplicação

Abra seu navegador e vá para [http://localhost:8282](http://localhost:8282).

## Configuração do Banco de Dados

- **H2**: O projeto está configurado para usar o banco de dados H2 para testes. As configurações podem ser ajustadas no arquivo `application.properties` localizado em `src/main/resources`.

- **SQL**: Para utilizar um banco de dados SQL real, modifique as configurações de banco de dados no `application.properties` conforme necessário.

## Tecnologias Utilizadas

- **Frontend Web**: HTML, CSS, JavaScript
- **Backend**: Java, Spring Boot
- **Mobile**: Java
- **Banco de Dados**: H2 (para testes), SQL (produção)
