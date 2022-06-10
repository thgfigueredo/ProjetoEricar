<!--<%@ page contentType="text/html; charset=UTF-8"%> -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CadastroRealizado</title>
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
            padding: 10px;
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
        <h1 style="text-align: center ;">CADASTRO REALIZADO COM SUCESSO</h1>
       <a href="index.jsp"><button>Retornar ao site</button></a><br><br>
        
    </div>
</body>
</html>