# Projeto de Segurança - Melhorado

Este é um projeto de segurança aprimorado baseado no projeto original apresentado no [vídeo no YouTube](https://youtu.be/KxqlJblhzfI?si=IvkV6Hh2ba3bwf-4).

## Descrição

Este projeto tem como objetivo fornecer um sistema de autenticação e autorização seguro, utilizando tecnologias modernas e boas práticas de desenvolvimento. Foi atualizado e aprimorado por Francisco Lourenço para incluir novas funcionalidades e melhorias de segurança.

## Funcionalidades

- Registro de usuários
- Autenticação de usuários
- Gerenciamento de tokens JWT
- Controle de acesso baseado em funções
- Endpoints protegidos por autenticação

## Instalação

Para instalar e rodar este projeto localmente, siga os passos abaixo:

1. Clone o repositório:
    ```bash
    git clone https://github.com/franciscoslour/security.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd security
    ```
3. Instale as dependências usando Maven:
    ```bash
    ./mvnw install
    ```
4. Configure o banco de dados no arquivo `application.yml`.
5. Execute o aplicativo:
    ```bash
    ./mvnw spring-boot:run
    ```

## Uso

Após iniciar o servidor, você pode acessar os seguintes endpoints:

- `POST /api/v1/auth/register` - Registro de novos usuários
- `POST /api/v1/auth/authenticate` - Login de usuários
- `GET /api/v1/demo-controller` - Obter detalhes do usuário autenticado (necessário token JWT)

Certifique-se de incluir o token JWT no cabeçalho de autorização para acessar os endpoints protegidos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Maven

## Contribuição

Contribuições são bem-vindas! Para contribuir com este projeto, siga as etapas abaixo:

1. Fork o repositório
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas alterações (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Referências

- [Projeto Original](https://youtu.be/KxqlJblhzfI?si=IvkV6Hh2ba3bwf-4)
- [Documentação do Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação do Spring Security](https://spring.io/projects/spring-security)
- [Documentação do JWT](https://jwt.io/introduction/)

## Informações do Desenvolvedor

Desenvolvido por Francisco Lourenço.

- [LinkedIn](https://www.linkedin.com/in/franciscoslour)
