<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Pagina inicial do Easy Life </title>
    </head>

    <body>
        <!-- formulario conectado a classe servlet de login utilizando o metodo post-->   
        <form action="Login" method="GET">
            <label >Bem vindo ao Easy Life </label><br><br><br>

            <label>Login</label>
            <!-- a função required serve para avizar que é obrigatório o preenchimento do campo -->
            <input type="text" required="true" name="login" value="" /><br>
            <br> 
            <label>Senha</label>
            <input type="password" required="true" name="senha " value="" />

            <br>
            <br>
            <input type="submit" value="Entrar" name="entrar" />

            <td colspan="2"> digite sua senha</td><br> 
        </form>
    </body>
</html>
