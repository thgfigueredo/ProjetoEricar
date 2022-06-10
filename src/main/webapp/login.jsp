<!--<%@ page contentType="text/html; charset=UTF-8"%> -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body{
            font-family: "Roboto", sans-serif;
            background: linear-gradient(to bottom, rgba(0,0,0,.8), rgba(0,0,0,.5)), url(./images/fundosite.jpg) center no-repeat;
            width: 100%;
            height: 100vh;
            background-size: cover;
            position: relative;
            overflow: hidden;
        }
        div{
            background-color: #00285f;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            padding: 80px;
            border-radius: 15px;
            color: #f78b00
        }
        input{
            padding: 15px;
            border: none;
            outline: none;
            font-size: 15px;
        }
        button{
            background-color: rgb(255, 109, 30);
            border: none;
            padding: 15px;
            width: 100%;
            border-radius: 10px;
            color: white;
            font-size: 15px;
            margin-bottom: 15px;
            
        }
        button:hover{
            background-color: deepskyblue;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div>
    	<form method="post" action="user-login"> 
    	
        <h1>Login</h1>
        <input type="text" placeholder="E-mail" name="EMAIL" required>
        <br><br>
        <input type="password" placeholder="Senha" name="SENHA" required >
        <br><br>
        <button type="submit">Entrar</button>
        
        
    	
    	</form>
       	<a href="Cadastro.jsp"><button>Cadastre-se</button></a><br><br>
       
       
    </div>
    
</body>
</html>