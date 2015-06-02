<%-- 
    Document   : index
    Created on : Mar 25, 2015, 9:13:05 PM
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DELL MT - login</title>
        <link rel="shortcut icon" href="img/Dell_Logo.png">

        <!--Fonts-->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div class="container">

            <div class='brand visible-lg'>
                <img src="img/delllogo2white.png" alt=""/>
            </div>

            <!--LOGIN CONTENT-->


            <div class="login">
                <form class="navbar-form navbar-right" role="login" method="post" action="firstServlet">
                    <div class="form-group">
                        <input type="text" class="form-control" name="username" placeholder="Username">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-default"><i class="fa fa-sign-in" style='font-size: 22px!important; color: rgba(255,255,255,0.8);'></i></button>
                    <br/>
                    <p>- Forgot you password? <a href="#">click here.</a> </p>
                </form>
            </div>

            <!--MAIN PAGE CONTENT-->

            <div class="main">

                <div class="row">
                    <div class="col-md-4">
                        <i class="fa fa-pencil-square-o"></i>
                        <h3>Online MDF forms</h3>
                        <p>Fill out our marketing development funds request forms online for quick response.</p>
                    </div>
                    <div class="col-md-4">
                        <i class="fa fa-sitemap"></i>
                        <h3>Great overview</h3>
                        <p>It's now very easy to have complete control and overview of you campaigns.</p>
                    </div>
                    <div class="col-md-4">
                        <i class="fa fa-thumbs-o-up"></i>
                        <h3>Easy-to-use</h3>
                        <p>The new online marketing tool is very easy to use and gives you complete control and overview.</p>
                    </div>
                </div>
            </div>

            <!--FOOTER CONTENT-->

            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <footer class='footer'>
                <div class='row'>
                    <div class="col-lg-12">
                        <p style='color: rgba(255,255,255,0.1)'>Copyright of CPH Business 2. semester, group 5. 2015</p>
                    </div>
                </div>
            </footer>

        </div>

        <!--Javascript-->
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
