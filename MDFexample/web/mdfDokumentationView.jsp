<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        <title>Marketing Development Fund - Request</title>

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
                <input type="hidden" name="mdf_ID" value="<%
                    String b = request.getParameter("Approve_Mdf");
                    out.print(b);
                       %>">

                </input>
            </div>
            <div class="container">
                <header>
                    <h1>Enterprise Field Marketing:</h1>
                    <h2>Marketing Development Fund (MDF) Request</h2>
                    <img src="img/Dell_Logo.png" alt="Dell-logo" class="img-responsive logo visible-lg"/>
                </header>
                <div class="row">
                    <div class="col-md-4">
                        <br/>
                        <p>Submission date:</p>
                        <p>${mdfViewer.submission_date}</p>
                        <br/>
                        <br/>
                        <p>Company address (city, state and zip):</p>
                        <p>${mdfViewer.company_address}</p>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Contact name:</p>
                        <p>${mdfViewer.contact_name}</p>
                        <br/>
                        <br/>
                        <p>Contact email:</p>
                        <p>${mdfViewer.contact_email}</p>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Company name:</p>
                        <p>${mdfViewer.company_name}</p>
                        <br/>
                        <br/>
                        <p>Contact phone:</p>
                        <p>${mdfViewer.contact_phone}</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Program overview</strong></h3>
                    <div class="col-md-4">
                        <br/>
                        <p>Program date:</p>
                        <p>${mdfViewer.program_date}</p>
                        <br/>
                        <br/>
                        <p>Estimated # of attendees:</p>
                        <p>${mdfViewer.estimated_attendees}</p>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Start time:</p>
                        <p>${mdfViewer.start_time}</p>
                        <br/>
                        <br/>
                        <p>Venue name:</p>
                        <p>${mdfViewer.venue_name}</p>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>End time:</p>
                        <p>${mdfViewer.end_time}</p>
                        <br/>
                        <br/>
                        <p>Venue address (city, state and zip):</p>
                        <p>${mdfViewer.venue_address}</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Type of lead generating program</strong></h3>
                    <br/>
                    <div class="col-md-4">
                        <input type="checkbox" name="face_to_face" <c:if test="${mdfViewer.face_to_face == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Face-to-face event</span>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Tradeshows" <c:if test="${mdfViewer.tradeshows == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Tradeshows</span>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Multi_touch_campaign" <c:if test="${mdfViewer.multi_touch_campaign == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Multi-touch campaign</span><br>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Door_opener_campaign" <c:if test="${mdfViewer.door_opener_campaign == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Door opener campaign</span><br>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Third_party_campaign" <c:if test="${mdfViewer.third_party_campaign == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Third party campaign</span><br>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Direct_mail" <c:if test="${mdfViewer.direct_mail == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Direct mail</span><br>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Blitz_campaign" <c:if test="${mdfViewer.blitz_campaign == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Blitz campaign (appt-setting or opportunity blitz)</span><br/>
                        </div>
                        <div class="col-md-12">
                            <br/>
                            <p>Program description and/or agenda:<p>
                            <p>${mdfViewer.description_agenda}</p>    
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Dell enterprise products to be discussed</strong></h3>
                    <div class="col-md-3">
                        <br/>
                        <p><strong>Storage</strong></p>
                        <input type="checkbox" name="Diss_Storage_1" <c:if test="${mdfViewer.diss_Storage_1 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Dell storage SC4000 series</span><br/>
                        <input type="checkbox" name="Diss_Storage_2" <c:if test="${mdfViewer.diss_Storage_2 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Dell storage PS4210 series</span><br/>
                        <input type="checkbox" name="Diss_Storage_3" <c:if test="${mdfViewer.diss_Storage_3 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Dell storage solutions</span><br/>
                        <input type="checkbox" name="Diss_Storage_4" <c:if test="${mdfViewer.diss_Storage_4 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Flash at the price of disk</span><br/>
                        <input type="checkbox" name="Diss_Storage_5" <c:if test="${mdfViewer.diss_Storage_5 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Fluid cache for SAN</span><br/>
                        <input type="checkbox" name="Diss_Storage_6" <c:if test="${mdfViewer.diss_Storage_6 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Data protection</span><br/>
                        </div>
                        <div class="col-md-3">
                            <br/>
                            <p><strong>Server</strong></p>
                            <input type="checkbox" name="Diss_Server_1" <c:if test="${mdfViewer.diss_Server_1 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> The latest generation of Dell PowerEdge servers</span><br/>
                        <input type="checkbox" name="Diss_Server_2" <c:if test="${mdfViewer.diss_Server_2 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Windows Server 2003 migration</span><br/>
                        <input type="checkbox" name="Diss_Server_3" <c:if test="${mdfViewer.diss_Server_3 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> x86 server transition</span><br/>
                        <input type="checkbox" name="Diss_Server_4" <c:if test="${mdfViewer.diss_Server_4 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> PowerEdge VRTX</span><br/>
                        </div>
                        <div class="col-md-3">
                            <br/>
                            <p><strong>Networking</strong></p>
                            <input type="checkbox" name="Diss_Network_1" <c:if test="${mdfViewer.diss_Network_1 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Software-defined networking (SDN): data center networking</span><br/>
                        <input type="checkbox" name="Diss_Network_2" <c:if test="${mdfViewer.diss_Network_2 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> User-centric networking</span><br/>
                        </div>
                        <div class="col-md-3">
                            <br/>
                            <p><strong>Solutions</strong></p>
                            <input type="checkbox" name="Diss_Solutions_1" <c:if test="${mdfViewer.diss_Solutions_1 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Cloud client-computing</span><br/>
                        <input type="checkbox" name="Diss_Solutions_2" <c:if test="${mdfViewer.diss_Solutions_2 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Converged infrastructure hardware</span><br/>
                        <input type="checkbox" name="Diss_Solutions_3" <c:if test="${mdfViewer.diss_Solutions_3 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Dell converged blade data center</span><br/>
                        <input type="checkbox" name="Diss_Solutions_4" <c:if test="${mdfViewer.diss_Solutions_4 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Optimized enterprise (Future-ready IT)</span><br/>
                        <input type="checkbox" name="Diss_Solutions_5" <c:if test="${mdfViewer.diss_Solutions_5 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> PowerEdge FX architecture</span><br/>
                        <input type="checkbox" name="Diss_Solutions_6" <c:if test="${mdfViewer.diss_Solutions_6 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> Software-defined storage (SDS)</span><br/>
                        </div>
                        <div class="col-md-12">
                            <br/>
                            <p><strong>Software component to campaign</strong></p>
                        </div>
                        <div class="col-md-12">
                            <p>${mdfViewer.diss_text}</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <br/>
                    <p><strong style="padding-left: 12px">Target audience</strong> (Please check all that apply):</p>
                    <div class="col-md-4">
                        <input type="checkbox" name="Target_1" <c:if test="${mdfViewer.target_1 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> SMB (Small & Medium Business)</span><br/>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Target_2" <c:if test="${mdfViewer.target_2 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> LE (Large Enterprise, LEA & G500)</span><br/>
                        </div>
                        <div class="col-md-4">
                            <input type="checkbox" name="Target_3" <c:if test="${mdfViewer.target_3 == 'on'}"> checked="checked" </c:if> disabled="disabled"/><span> PUB (Public, Federal, Education and Healthcare)*</span><br/>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <h3><strong>Additional program information</strong></h3>
                        <br/>
                        <div class="col-md-12">
                            <p>Total projected cost of program: ${mdfViewer.additional_totalcost}</p>
                    </div>
                    <div class="col-md-12">
                        <p>Total MDF requesting from Dell: ${mdfViewer.additional_totalmdf}</p>
                    </div>
                    <div class="col-md-12">
                        <p>Preferred method of reimbursement (AMEX or check/EFT): ${mdfViewer.additional_reimbursement}</p>
                    </div>
                    <div class="col-md-12">
                        <p>Participating Technology Partner(s) (VMware, Microsoft, etc.): ${mdfViewer.additional_participating}</p>
                    </div>
                    <div class="col-md-12">
                        <p>Total Technology Partner(s) MDF contribution: ${mdfViewer.additional_contribution}</p>
                    </div>
                    <div class="col-md-12">
                        <p>Estimated # of opportunities (deals registered through Dell Deal Registration): ${mdfViewer.additional_opportunities}</p>
                    </div>
                    <div class="col-md-12">
                        <p>Estimated revenue from program: ${mdfViewer.additional_revenue}</p>
                    </div>
                </div>
                <hr>
                <div class="col-md-12">
                    <!--USE VALUES OF BUTTONS TO CHECK IN SERVLET!!-->
                    <button class="btn btn-primary pull-right" onClick="history.go(-1);
                                return true;"  style="text-decoration: none; color: white;">Back</button>
                </div>
            </div>
        </form>

        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
