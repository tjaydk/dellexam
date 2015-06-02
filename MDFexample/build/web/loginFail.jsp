<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta http-equiv="refresh" content="10;url=index.jsp" />  Redirections within 10 seconds-->
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        
        <title>Login Fail</title>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="css/mdf.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container">
            <h2>Login failed</h2>
            <br/>
            <p>You will be redirected Login page again in <span id="counter">20</span> seconds - or <a href="index.jsp">click here</a> to go to the Login page</p>
        </div>


        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
