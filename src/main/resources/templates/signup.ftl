<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login Page </title>
    <style>
        Body {
            font-family: Calibri, Helvetica, sans-serif;
            background-color: #ee002a;
        }
        button {
            background-color: #009eff;
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
        input[type=email],input[type=text], input[type=password] {
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



        .container {
            padding: 25px;
            background-color: lightblue;
        }
    </style>
</head>
<body>
<center> <h1> User SingUp Form </h1> </center>
<form name="signup" action="/users/signup" method="get" >
    <div class="container">
        <label>Email : </label>
        <input type="email" placeholder="Enter Email" name="email">
        <label>Nickname : </label>
        <input type="text" placeholder="Enter Nickname" name="nickname">
        <label>Password : </label>
        <input type="password" placeholder="Enter Password" name="password">
        <button type="submit" formaction="/users/signin" formmethod="post">Sign in</button>
    </div>
</form>
</body>
</html>