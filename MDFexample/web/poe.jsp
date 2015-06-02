<%-- 
    Document   : index
    Created on : Apr 1, 2015, 12:08:09 PM
    Author     : Dennis
--%>

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
        <form action="poeServlet" method="GET">
            <div class="container">
                <header>
                    <h1>Proof of Execution:</h1>
                    <img src="img/Dell_Logo.png" alt="Dell-logo" class="img-responsive logo visible-lg"/>
                </header>
                <div class="row">
                    <div class="col-md-12">
                        <!--FORWARDED POE NO-->
                        <input type="hidden" name="poe_ID" value="<%
                            String b = request.getParameter("upload_poe");
                            out.print(b);
                               %>">

                        </input>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Campaign type:</p>
                        <input type="text" name="Campaign_type" placeholder="Enter campaign type" required>
                        <br/>
                        <br/>
                        <p>Activity:</p>
                        <input type="text" name="Activity:" placeholder="Enter activity" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Date:</p>
                        <input type="date" name="Date" placeholder="Enter date" required>
                        <br/>
                        <br/>
                        <p>Recipients:</p>
                        <input type="number" name="Recipients" placeholder="Enter number of recipients" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Unique opens/Hits:</p>
                        <input type="number" name="Unique_opens_hits" placeholder="Number of unique opens/hits" required>
                        <br/>
                        <br/>
                        <p>Unique clicks:</p>
                        <input type="number" name="Unique_clicks" placeholder="Number of unique clicks" required>
                    </div>
                </div>
                <hr>
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
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <input type="file" name="dataFile" id="fileChooser"/><br/><br/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <button class="btn btn-primary" type="submit">Submit</button>
                    </div>
                </div>
                <hr>
            </div>
        </form>
    
                   <!--BACK BUTTON-->            
        <form><img src="img/backbtn.png" class="btn-back" Type="button" value="" onClick="history.go(-1);
                return true;"></form>


        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
