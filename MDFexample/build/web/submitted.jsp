<%-- 
    Document   : index
    Created on : Apr 1, 2015, 12:08:09 PM
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta http-equiv="refresh" content="10;url=index.jsp" />  Redirections within 10 seconds-->
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        
        <title>Request successful</title>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="css/mdf.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container">
            <h2>Your request has been sent</h2>
            <p>We will review your request and you will get a response within 1-3 working days</p>
            <br/>
            <p>You will be redirected to dashboard within <span id="counter">20</span> seconds - or <a href="http://localhost:8080/MDFexample/loginServletPartner">click here</a> to go to front page</p>
        </div>


        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
