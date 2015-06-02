

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee View</title>
        <link rel="shortcut icon" href="img/Dell_Logo.png">

        <!--Fonts-->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/employeeView.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div class='menu-left hidden-xs'>
            <div class='menu-content'
                 <ul>
                    <li><a href="http://localhost:8080/MDFexample/newPartnerServlet">New Partner</a></li>
                    <li><a href="http://localhost:8080/MDFexample/employeePendingServlet">Pending Campaigns</a></li>
                    <li><a href="http://localhost:8080/MDFexample/employeeActiveServlet">Active Campaigns</a></li>
                    <li><a href="http://localhost:8080/MDFexample/employeeCompletedServlet">Completed Campaigns</a></li>
                    <li><a href="http://localhost:8080/MDFexample/quarterServlet">Quarters</a></li>
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
                        <li><a href="http://localhost:8080/MDFexample/newPartnerServlet">New Partner</a></li>
                        <li><a href="http://localhost:8080/MDFexample/employeePendingServlet">Pending Campaigns</a></li>
                        <li><a href="http://localhost:8080/MDFexample/employeeActiveServlet">Active Campaigns</a></li>
                        <li><a href="http://localhost:8080/MDFexample/employeeCompletedServlet">Completed Campaigns</a></li>
                        <li><a href="http://localhost:8080/MDFexample/quarterServlet">Quarters</a></li>
                        <li><a href='index.jsp'>Sign out!</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div class='container'>
            <br>
            <br>

            <!--START OF CREATE NEW PARTNER-->
            <form action="createPartnerServlet" method="GET">
                <div class="row">
                    <div class="col-md-4">
                        <br/>
                        <p>Username:</p>
                        <input type="text" name="Username" placeholder="Enter username" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Name</p>
                        <input type="text" name="Name" placeholder="Enter name" required>
                    </div>
                    <div class="col-md-3">
                        <br/>
                        <p>Password:</p>
                        <input type="text" name="Password" placeholder="Enter password" required>
                    </div>
                    <div class="col-md-1">
                        <br/>
                        <br/>
                        <button class="btn btn-primary pull-right"type="submit"  style="text-decoration: none; color: white;">Create new Partner</button>
                    </div>
                </div>
            </form>

            <br/>
            <br/>

            <!--END OF CREATE NEW PARTNER-->

            <!--CURRENT USERS-->

            <div class="method active-table">
                <p><strong>Current Users</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-6"><div class="header">User No</div></div>
                    <div class="col-md-6"><div class="header">Username</div></div>
                </div>



                <c:forEach var="users" items="${Users}">
                    <div class="row margin-0">
                        <div class="col-md-6"><div class="cell">${users.partner_No}</div></div>
                        <div class="col-md-6"><div class="cell">${users.username}</div></div>
                    </div>
                </c:forEach>

            </div>
        </div>

        <!--Javascript-->

        <script src="js/custom.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/js/npm.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
