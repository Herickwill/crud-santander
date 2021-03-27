# CRUD de criação de usuário básica 

Esse CRUD tem como objetivo criar um usuário com nome e email, persistindo no banco de dados e podendo editar ou deletar os registros diretamente pelo navegador, com um formulário em html básico, sem estilização. 

Para a criação da API, foi utilizado o Spring MVC, Thymeleaf e Java 11, para persistência dos dados, o banco escolhido foi o MySQL. Para subir o backend, foi utilizado o XAMPP. Favor, caso seja usado um outro app invés do xampp, ficar atento ao "app.properties" do projeto, modificando-o de acordo com sua necessidade.

Para funcionamento correto do CRUD, adequar o projeto ao banco utilizado e verificar o "app.properties" do projeto, para especificar senha do banco e etc. 

A API permite a inserção de usuário, atualização e também é possível deletar usuário. Além de permitir a visualização de todos os usuários na tela inicial. 


A tela inicial se dá pelo endpoint "http://localhost:8080/", onde é possível visualizar todos os usuários criados, além de opções de criação de novo usuário, editar usuário e deletar:

![image](https://user-images.githubusercontent.com/71675909/112737083-9114d680-8f36-11eb-8698-339a9177e0f3.png)

Ao clicar em "criar novo usuário", o usuário será redirecionado a uma nova tela onde poderá incluir um registro novo: 
![image](https://user-images.githubusercontent.com/71675909/112737197-58c1c800-8f37-11eb-9f83-c22470fc0099.png)

Ao inserir um registro, voltamos a tela inicial com o registro incluido: 
![image](https://user-images.githubusercontent.com/71675909/112737228-8dce1a80-8f37-11eb-843c-3b43f9cf052f.png)


Ao clicar no botão "editar", somos redirecionados a tela de edição, onde podemos modificar os dados já existentes:
![image](https://user-images.githubusercontent.com/71675909/112737276-0b922600-8f38-11eb-81d8-80576758ec39.png)


Quando concluir a edição, somos direcionados a tela inicial com os dados atualizados.

Ao clicar no botão "deletar", o registro é deletado do banco de dados a pagina atualizada. 
