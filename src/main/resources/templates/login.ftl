<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login Page </title>
    <style>
        Body {
            font-family: Calibri, Helvetica, sans-serif;
            background-color: pink;
        }
        button {
            background-color: #75ea7a;
            width: 100%;
            color: orange;
            padding: 15px;
            margin: 10px 0px;
            border: none;
            cursor: pointer;
        }
        form {
            border: 3px solid #f1f1f1;
        }
        input[type=email], input[type=password] {
            width: 100%;
            margin: 8px 0;
            padding: 12px 20px;
            display: inline-block;
            border: 2px solid green;
            box-sizing: border-box;
        }
        button:hover {
            opacity: 0.7;
        }
        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            margin: 10px 5px;
        }


        .container {
            padding: 25px;
            background-color: lightblue;
        }
    </style>
</head>
<body>
<center> <h1> User Login Form </h1> </center>
<form name="login" action="/users/login" method="post" >
    <div class="container">
        <label>Email : </label>
        <input type="email" placeholder="Enter Email" name="email">
        <label>Password : </label>
        <input type="password" placeholder="Enter Password" name="password">
        <button type="submit" formmethod="post">Login</button>
        <input type="checkbox" checked="checked"> Remember me
        <button type="button" class="cancelbtn"> Cancel</button>
        <button type="submit" formaction="/users/signin" formmethod="get">SignIn</button>

    </div>
</form>
</body>
</html>  