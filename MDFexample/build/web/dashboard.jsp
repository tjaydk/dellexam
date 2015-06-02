

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
        <script src="js/bootstrap.js" type="text/javascript"></script>

    </head>
    <body>
        <div class='menu-left hidden-xs'>
            <div class='menu-content'>
                <ul>
                    <li><a href="mdf.jsp"><span class="glyphicon glyphicon-folder-open"></span><p>New campaign</p></a></li>
                    <br>
                    <li><a href="http://localhost:8080/MDFexample/partnerInfoServlet"><span class="glyphicon glyphicon-cog"></span><p>Edit information</p></a></li>
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
                        <li><a href="mdf.jsp">Create campaign</a></li>
                        <li><a href="http://localhost:8080/MDFexample/partnerInfoServlet">Edit information</a></li>
                        <li><a href='index.jsp'>Sign out!</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <!--TABLE DATA-->


        <div class="container">
            <br>
            <br>

            <!--PENDING CAMPAIGNS-->
            <div class="method active-table">
                <p><strong>Pending campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                    <div class="col-md-5"><div class="header">Status No.</div></div>
                    <div class="col-md-2"><div class="header">Status</div></div>
                </div>

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '0'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${camp.c_Status eq '2'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${camp.c_Status eq '4'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${camp.c_Status eq '5'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                            </form>
                        </div>
                    </c:if>
                </c:forEach>
            </div>

            <br>
            <br>

            <!--ACTIVE CAMPAIGNS-->
            <div class="method active-table">
                <p><strong>Active campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                    <div class="col-md-5"><div class="header">Status No.</div></div>
                    <div class="col-md-2"><div class="header">Upload POE</div></div>
                </div>

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '1'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><button class="upload-btn" name="upload_poe" value="${camp.id_POE}"><p><i class="glyphicon glyphicon-open"></i> Upload POE</p></button></div></div>
                            </form>
                        </div>
                    </c:if>
                </c:forEach>
            </div>

            <br>
            <br>

            <!-- UPLOAD INVOICE -->
            <div class="method active-table">
                <p><strong>Completed Campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                    <div class="col-md-5"><div class="header">Status No.</div></div>
                    <div class="col-md-2"><div class="header">Invoice</div></div>
                </div>

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '3'}">
                        <div class="row margin-0">
                            <form action="invoice.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><button class="upload-btn" name="id_invoice" value="${camp.id_invoice}"><p><i class="glyphicon glyphicon-open"></i> Upload Invoice</p></button></div></div>
                            </form>
                        </div>
                    </c:if>
                </c:forEach>
            </div>

            <br>
            <br>

            <!--OLD CAMPAIGNS-->
            <div class="method old-table">
                <p><strong>Old campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-2"><div class="header">Campaign Name</div></div>
                    <div class="col-md-2"><div class="header">MDF</div></div>
                    <div class="col-md-2"><div class="header">POE</div></div>
                    <div class="col-md-2"><div class="header">Invoice</div></div>
                    <div class="col-md-2"><div class="header">Factura</div></div>
                    <div class="col-md-1"><div class="header">Status No.</div></div>
                    <div class="col-md-1"><div class="header">Status</div></div>
                </div>

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '6'}">
                        <div class="row margin-0">
                            <div class="col-md-2"><div class="cell">${camp.campaign_Name}</div></div>
                            <form name="activeMdfForm" action="mdfDokumentationViewServlet" type="post">
                                <div class="col-md-2"><div class="cell"><button class="view-btn" name="Approve_Mdf" value="${camp.id_MDF}" type="submit"><p><i class="glyphicon glyphicon-eye-open"></i> View MDF</p></button></div></div>
                            </form>
                            <form name="activePoeForm" action="poeDokumentationViewServlet" type="post">
                                <div class="col-md-2"><div class="cell"><button class="view-btn" name="Approve_Poe" value="${camp.id_POE}" type="submit"><p><i class="glyphicon glyphicon-eye-open"></i> View POE</p></p></button></div></div>
                            </form>
                            <form name="activeInvoiceForm" action="invoiceDokumentationViewServlet" type="post">
                                <div class="col-md-2"><div class="cell"><button class="view-btn" name="Approve_Invoice" value="${camp.id_invoice}" type="submit"><p><i class="glyphicon glyphicon-eye-open"></i> View Invoice</p></p></button></div></div>
                            </form>
                            <form name="activeFacturaForm" action="facturaDokumentationViewServlet" type="post">
                                <div class="col-md-2"><div class="cell"><button class="view-btn" name="Approve_Factura" value="${camp.id_factura}" type="submit"><p><i class="glyphicon glyphicon-eye-open"></i> View Reciept</p></p></button></div></div>
                            </form>
                            <div class="col-md-1"><div class="cell">${camp.c_Status}</div></div>
                            <div class="col-md-1"><div class="cell"><p style="color: black">Completed</p></div></div>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
        </div>


        <!--END OF TABLE DATA-->

        <!--Javascript-->

        <script src="js/custom.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/js/npm.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
