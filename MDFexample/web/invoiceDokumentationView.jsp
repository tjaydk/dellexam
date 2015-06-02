<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        <title>Point of Execution</title>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="css/mdf.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <form action="employeeViewCompleted.jsp" method="GET">

            <div class="col-md-12">
                <!--FORWARDED mdf ID-->
                <input type="hidden" name="id_invoice" value="<%
                    String b = request.getParameter("Approve_Invoice");
                    out.print(b);
                       %>">

                </input>
            </div>
            <div class="container">
                <header>
                    <h1>Invoice</h1>
                    <img src="img/Dell_Logo.png" alt="Dell-logo" class="img-responsive logo visible-lg"/>
                </header>
                <div class="row">
                    <div class="col-md-12">
                        <a href="img/${invoiceViewer.filepath}" target="_blank">${invoiceViewer.filepath}</a>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <p>Additional information:</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <p>${invoiceViewer.additional_information}</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <button class="btn btn-primary pull-right" onClick="history.go(-1);
                                return true;"  style="text-decoration: none; color: white;">Back</button>
                    </div>
                </div>
            </div>
        </form>


        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
