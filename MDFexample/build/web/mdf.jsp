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
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        <title>Marketing Development Fund - Request</title>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="css/mdf.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
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
                        <li><a href="dashboard.jsp">Back</a></li>
                        <li><a href='index.jsp'>Sign out!</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <!--BEGINNING OF MAIN CONTENT-->
        <form action="mdfServlets" method="GET" autocomplete="on">
            <div class="container">
                <header>
                    <h1>Enterprise Field Marketing:</h1>
                    <h2>Marketing Development Fund (MDF) Request</h2>
                    <img src="img/Dell_Logo.png" alt="Dell-logo" class="img-responsive logo visible-lg"/>
                </header>
                <div class="row">
                    <div class="col-md-12">
                        <br/>
                        <p>Campaign name:</p>
                        <input type="text" name="Campaign_name" placeholder="Enter campaign name" class="inputfield" required>
                        <br/>
                        <hr>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <br/>
                        <p>Submission date:</p>
                        <input type="date" name="Submission_date" placeholder="MM/DD/YYYY" class="inputfield" required>
                        <br/>
                        <br/>
                        <p>Company address (city, state and zip):</p>
                        <input type="text" name="Company_address" placeholder="Enter company address" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Contact name:</p>
                        <input type="text" name="Contact_name" placeholder="Enter contact name" required>
                        <br/>
                        <br/>
                        <p>Contact email:</p>
                        <input type="email" name="Contact_email" placeholder="Enter contact email" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Company name:</p>
                        <input type="text" name="Company_name" placeholder="Enter company name" required>
                        <br/>
                        <br/>
                        <p>Contact phone:</p>
                        <input type="tel" name="Contact_phone" placeholder="Enter contact phone" required>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <p>To best support your marketing needs, Dell recommends a 6+ week lead time (from the actual start date of the
                            activity) to allow sufficient time for campaign development and promotion. The MDF request form allows you to fully detail your proposal for your marketing manager’s review.</p>
                        <p><strong>Please note, each field within the form must be completed for your request to be reviewed and/or approved.
                                Any submissions containing incomplete forms will be returned.</strong></p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Program overview</strong></h3>
                    <div class="col-md-4">
                        <br/>
                        <p>Program date:</p>
                        <input type="date" name="Program_date" placeholder="MM/DD/YYYY" required>
                        <br/>
                        <br/>
                        <p>Estimated # of attendees:</p>
                        <input type="number" name="Estimated_attendees" placeholder="Enter Estimated attendees" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Start time:</p>
                        <input type="date" name="Start_time" placeholder="MM/DD/YYYY" required>
                        <br/>
                        <br/>
                        <p>Venue name:</p>
                        <input type="text" name="Venue_name" placeholder="Enter venue name" required>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>End time:</p>
                        <input type="date" name="End_time" placeholder="MM/DD/YYYY" required>
                        <br/>
                        <br/>
                        <p>Venue address (city, state and zip):</p>
                        <input type="text" name="Venue_address" placeholder="Enter Address(city, state and zip)" required>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Type of lead generating program</strong></h3>
                    <br/>
                    <div class="col-md-4">
                        <input type="checkbox" name="face_to_face"><span> Face-to-face event</span>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Tradeshows"><span> Tradeshows</span>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Multi_touch_campaign"><span> Multi-touch campaign</span><br>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Door_opener_campaign"><span> Door opener campaign</span><br>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Third_party_campaign"><span> Third party campaign</span><br>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Direct_mail"><span> Direct mail</span><br>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Blitz_campaign"><span> Blitz campaign (appt-setting or opportunity blitz)</span><br/>
                    </div>
                    <div class="col-md-12">
                        <br/>
                        <p>Program description and/or agenda:<p>
                            <textarea name="description_agenda" cols="40" rows="5" style="width:100%; resize:none"></textarea>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Dell enterprise products to be discussed</strong></h3>
                    <div class="col-md-3">
                        <br/>
                        <p><strong>Storage</strong></p>
                        <input type="checkbox" name="Diss_Storage_1"><span> Dell storage SC4000 series</span><br/>
                        <input type="checkbox" name="Diss_Storage_2"><span> Dell storage PS4210 series</span><br/>
                        <input type="checkbox" name="Diss_Storage_3"><span> Dell storage solutions</span><br/>
                        <input type="checkbox" name="Diss_Storage_4"><span> Flash at the price of disk</span><br/>
                        <input type="checkbox" name="Diss_Storage_5"><span> Fluid cache for SAN</span><br/>
                        <input type="checkbox" name="Diss_Storage_6"><span> Data protection</span><br/>
                    </div>
                    <div class="col-md-3">
                        <br/>
                        <p><strong>Server</strong></p>
                        <input type="checkbox" name="Diss_Server_1"><span> The latest generation of Dell PowerEdge servers</span><br/>
                        <input type="checkbox" name="Diss_Server_2"><span> Windows Server 2003 migration</span><br/>
                        <input type="checkbox" name="Diss_Server_3"><span> x86 server transition</span><br/>
                        <input type="checkbox" name="Diss_Server_4"><span> PowerEdge VRTX</span><br/>
                    </div>
                    <div class="col-md-3">
                        <br/>
                        <p><strong>Networking</strong></p>
                        <input type="checkbox" name="Diss_Network_1"><span> Software-defined networking (SDN): data center networking</span><br/>
                        <input type="checkbox" name="Diss_Network_2"><span> User-centric networking</span><br/>
                    </div>
                    <div class="col-md-3">
                        <br/>
                        <p><strong>Solutions</strong></p>
                        <input type="checkbox" name="Diss_Solutions_1"><span> Cloud client-computing</span><br/>
                        <input type="checkbox" name="Diss_Solutions_2"><span> Converged infrastructure hardware</span><br/>
                        <input type="checkbox" name="Diss_Solutions_3"><span> Dell converged blade data center</span><br/>
                        <input type="checkbox" name="Diss_Solutions_4"><span> Optimized enterprise (Future-ready IT)</span><br/>
                        <input type="checkbox" name="Diss_Solutions_5"><span> PowerEdge FX architecture</span><br/>
                        <input type="checkbox" name="Diss_Solutions_6"><span> Software-defined storage (SDS)</span><br/>
                    </div>
                    <div class="col-md-12">
                        <br/>
                        <p><strong>Is there a software component to your campaign?</strong></p>
                        <p>If so, please detail the specific software component(s) in the space below.</p>
                    </div>
                    <div class="col-md-12">
                        <textarea name="Diss_text" cols="40" rows="5" style="width: 100%; resize: none"></textarea>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <br/>
                    <p><strong style="padding-left: 12px">Target audience</strong> (Please check all that apply):</p>
                    <div class="col-md-4">
                        <input type="checkbox" name="Target_1"><span> SMB (Small & Medium Business)</span><br/>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Target_2"><span> LE (Large Enterprise, LEA & G500)</span><br/>
                    </div>
                    <div class="col-md-4">
                        <input type="checkbox" name="Target_3"><span> PUB (Public, Federal, Education and Healthcare)*</span><br/>
                    </div>
                    <div class="col-md-12">
                        <br/>
                        <p>*Partners need to comply with PUB restrictions and limitations within any programs. See additional information within the <i>*See <a href="toa.jsp" target="_blank"> terms and conditions</a> (T&C) below.</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <h3><strong>Additional program information</strong></h3>
                    <br/>
                    <div class="col-md-12">
                        <span>Total projected cost of program: </span><input type="number" name="Additional_totalcost" placeholder="Enter total projected cost of program" required>
                    </div>
                    <div class="col-md-12">
                        <span>Total MDF requesting from Dell: </span><input type="number" name="Additional_totalmdf" placeholder="Enter total MDF requesting from Dell" required>
                    </div>
                    <div class="col-md-12">
                        <br/>
                        <p><strong>Note: Dell will fund up to fifty percent (50%)* of the projected total cost, based on actual costs incurred for the activity.</strong></p>
                        <p><i>*See <a href="toa.jsp" target="_blank"> terms and conditions</a> for rules and restrictions.</i></p>
                        <br/>
                    </div>
                    <div class="col-md-12">
                        <span>Preferred method of reimbursement (AMEX or check/EFT): </span><input type="text" name="Additional_reimbursement" placeholder="Enter preferred method of reimbursement" required>
                    </div>
                    <div class="col-md-12">
                        <span>Participating Technology Partner(s) (VMware, Microsoft, etc.): </span><input type="text" name="Additional_participating" placeholder="Enter participating Technology Partner(s)" required>
                    </div>
                    <div class="col-md-12">
                        <span>Total Technology Partner(s) MDF contribution: </span><input type="number" name="Additional_contribution" placeholder="Enter total technology partner(s) MDF contribution" required>
                    </div>
                    <div class="col-md-12">
                        <span>Estimated # of opportunities (deals registered through Dell Deal Registration): </span><input type="number" name="Additional_opportunities" placeholder="Enter estimated # of opportunities" required>
                    </div>
                    <div class="col-md-12">
                        <span>Estimated revenue from program: </span><input type="number" name="Additional_revenue" placeholder="Enter estimated revenue from program" required>
                    </div>
                    <div class="col-md-12"
                         <br/>
                        <br/>
                        <p><strong>Following the completion of this form, please submit your full MDF request to your Enterprise Field
                                Marketing Manager for consideration and review. You may expect a response within 48 - 72 hours, provided all necessary details have been supplied.</strong></p>
                    </div>
                </div>
                <div class="col-md-12">
                    <button class="btn btn-primary pull-right" id="Accept" type="submit"  style="text-decoration: none; color: white;" disabled>Submit</button>
                </div>
                <div class="col-md-12 pull-right" style="text-align: right">
                    <input type="checkbox" name="read-licens" onClick="EnableSubmit(this)"> <span>I have read and agree with the </span><a href="toa.jsp" target="_blank">terms and conditions</a>
                </div>
                <br>
                <hr>
            </div>
        </form>

        <!--BACK BUTTON--> 
        <div class="hidden-xs">
            <form><img src="img/backbtn.png" class="btn-back" Type="button" value="" onClick="history.go(-1);
                    return true;"></form>
        </div>


        <!--Javascript-->
        <script src="js/custom.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/js/npm.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
