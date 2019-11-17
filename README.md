# Bem vindo a API Portfólio de Transportadoras

Esta API possui as seguintes operações:

 - Consulta parametrizada ou padrão quando a página inicial é carregada
 - Atualização da transportadora
 - Exclusão de transportadora
 - Cadastramento de novas transportadoras.

Para inicializar a API é necessário que o usuário abra a pasta do projeto em sua IDE de preferência, e inicialize o arquivo `TransportadoraApp`

# Rota de consulta sem parâmetros
Rota => localhost:8080/api/transportadoras
Tipo => Get
Retorno => JSON
Campos: Não tem
Campos obrigatórios: Não tem.

# Rota de consulta parametrizada
Rota => localhost:8080/api/transportadora/pesquisar
Tipo => POST
Formato do Envio => JSON
Formato do Retorno => JSON
Campos:
 - String nome
 - String uf
 - String cidade
 - String modal
 
Campos obrigatórios: Não tem.

# Rota de Cadastro de Transportadora
Rota => localhost:8080/api/transportadora/cadastrar
Tipo => POST
Formato do Envio => JSON
Formato do Retorno => JSON

Campos:
 -  String Email
-   String Nome
-   String Empresa
-   String Telefone
-   String Modal
-   String Rua
-   String Número
-   String Bairro
-   String Cidade
-   String UF
 
Campos obrigatórios: Email, Nome, Empresa, Telefone, Modal, Rua, Número, Bairro, Cidade e UF.

# Rota Delete Transportadora
Rota => localhost:8080/api/transportadora/deletar/{id}
Tipo => Delete
Formato do Retorno => JSON
Campos:
 - Long id
 
Campos obrigatórios: id.

# Rota de Atualização de Transportadora
Rota => localhost:8080/api/transportadora/atualizar/{id}
Tipo => POST
Formato do envio => JSON
Formato do Retorno => JSON
Campos:
 -  Email
-   Nome
-   Empresa
-   Telefone
-   Modal
-   Rua
-   Número
-   Bairro
-   Cidade
-   UF
- Long id
 
Campos obrigatórios: Email, Nome, Empresa, Telefone, Modal, Rua, Número, Bairro, Cidade e UF.
