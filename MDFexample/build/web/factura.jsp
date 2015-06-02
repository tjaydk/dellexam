<%-- 
    Document   : invoice
    Created on : Apr 23, 2015, 10:51:15 AM
    Author     : Ebbe
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        <title>Receipt</title>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="css/mdf.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <form action="facturaUploadServlet" method="GET">
            <div class="container">
                <header>
                    <h1>Receipt</h1>
                    <img src="img/Dell_Logo.png" alt="Dell-logo" class="img-responsive logo visible-lg"/>
                </header>
                <div class="row">
                    <div class="col-md-12">
                        <!--FORWARDED FACTURA ID-->
                        <input type="hidden" name="id_factura" value="<%
                            String b = request.getParameter("id_factura");
                            out.print(b);
                               %>">
                        </input>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <input type="file" name="dataFile" id="fileChooser"/><br/><br/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <p>Type any additional information in the textbox below:</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <textarea name="additional_information" cols="40" rows="5" style="width:100%; resize:none"></textarea>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <button class="btn btn-primary" type="submit">Submit</button>
                    </div>
                </div>
            </div>
        </form>


        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
