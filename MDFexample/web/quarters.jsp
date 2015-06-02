

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quarters</title>
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
                    <li><a href="newPartner.jsp">New Partner</a></li>
                    <li><a href="employeeViewPending.jsp">Pending Campaigns</a></li>
                    <li><a href="employeeViewActive.jsp">Active Campaigns</a></li>
                    <li><a href="employeeViewCompleted.jsp">Completed Campaigns</a></li>
                    <li><a href="quarters.jsp">Quarters</a></li>
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
                    <a class="navbar-brand" href="#">Brand</a>
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


        <!--TABLE DATA-->

        <div class='container'>
            <br>
            <br>

            <!--Quarters-->
            <div class="method active-table">
                <p><strong>Quarters</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Quarter Name</div></div>
                    <div class="col-md-5"><div class="header">Start Date</div></div>
                    <div class="col-md-2"><div class="header">End Date</div></div>
                </div>

                <c:forEach var="q" items="${Quarters}">
                    <div class="row margin-0">
                        <form>
                            <div class="col-md-5"><div class="cell">${q.quarter_Name}</div></div>
                            <div class="col-md-5"><div class="cell">${q.quarter_Startdate}</div></div>
                            <div class="col-md-2"><div class="cell">${q.quarter_Enddate}</div></div>
                        </form>
                    </div>
                </c:forEach>
            </div>
        </div>

        <br>
        <br>


        <!--Javascript-->

        <script src="js/custom.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/js/npm.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
