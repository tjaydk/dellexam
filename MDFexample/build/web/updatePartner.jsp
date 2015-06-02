

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="shortcut icon" href="img/Dell_Logo.png">

        <!--Fonts-->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/dashboard.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div class='menu-left hidden-xs'>
            <div class='menu-content'>
                <ul>
                    <li><a href="dashboard.jsp"><span class="glyphicon glyphicon-level-up"></span><p>Back</p></a></li>
                </ul>
            </div>
        </div>
        <div class='signout hidden-xs'>
            <p>Your logged in as ${user}</p>
            <a href='index.jsp'><p>Sign out!</p></a>
        </div>
            
            <!--MENU FOR MOBILE-->
        <nav class="navbar navbar-inverse visible-xs">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="dashboard.jsp">Back</a></li>
                        <li><a href='index.jsp'>Sign out!</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <!--CURRENT PARTNER INFO-->

        <div class='container'>
            <header>
                <h1>Current Information:</h1>
            </header>

            <br>
            <br>

            <div class="row">
                <div class="col-md-3">
                    <br/>
                    <p>Contact Name:</p>
                    <p>${partnerInfo.partner_name}</p>
                </div>
                <div class="col-md-3">
                    <br/>
                    <p>Contact Phone:</p>
                    <p>${partnerInfo.partner_mail}</p>
                </div>
                <div class="col-md-3">
                    <br/>
                    <p>Contact Mail:</p>
                    <p>${partnerInfo.partner_phone}</p>
                </div>
                <div class="col-md-3">
                    <br/>
                    <p>Contact Address:</p>
                    <p>${partnerInfo.partner_address}</p>
                </div>
            </div>

            <br>
            <br>

            <!--UPDATE PARTNER-->
            <form action="updatePartnerServlet" method="GET">
                <div class="row">
                    <div class="col-md-3">
                        <br/>
                        <p>Contact Name</p>
                        <input type="text" name="Contact_Name" placeholder="Enter contact name" required>
                    </div>
                    <div class="col-md-3">
                        <br/>
                        <p>Contact Phone</p>
                        <input type="number" name="Partner_Phone" placeholder="Enter contact phone number" required>
                    </div>
                    <div class="col-md-3">
                        <br/>
                        <p>Contact Mail</p>
                        <input type="email" name="Partner_Mail" placeholder="Enter contact mail" required>
                    </div>
                    <div class="col-md-2">
                        <br/>
                        <p>Address</p>
                        <input type="text" name="Partner_Address" placeholder="Enter contact address" required>
                    </div>
                    <div class="col-md-1">
                        <br/>
                        <br/>
                        <button class="btn btn-primary pull-right"type="submit"  style="text-decoration: none; color: white;">Update</button>
                    </div>
                </div>
            </form>

        </div>
        <!--Javascript-->

        <script src="js/custom.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/js/npm.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
