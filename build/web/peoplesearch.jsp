<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<%
    HashMap userDetails = (HashMap) session.getAttribute("userDetails");
    if (userDetails != null) {
        HashMap address = (HashMap) session.getAttribute("address");
        ArrayList<java.util.HashMap> allUserDetails =(ArrayList<java.util.HashMap>)session.getAttribute("allUserDetails");
        if (allUserDetails != null) {

%>






<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>PeopleTalk</title>


        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/talk.css" rel="stylesheet">


    </head>

    <body data-spy="scroll" data-target="#my-navbar">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="profile.jsp">PeopleTalk</a>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><div class="navbar-text"><p>Welcome: <%=userDetails.get("name")%></p></div></li>
                        <li><a href="home.jsp">Home</a></li>
                        <li><a href="logout">Logout</a><li>
                    </ul>			
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="panel panel-default text center">
                <div class="panel-heading text-center">
                    <h3>Search Results for:<%=address.get("state")%>/<%=address.get("city")%>/<%=address.get("area")%></h3>
                </div>
            </div>
        </div>
        </br>
        </br>
        <div class="container">
            <section>
                <%
                    Iterator i = allUserDetails.iterator();
                    while (i.hasNext()) {

                        HashMap peopleDetails = (HashMap)i.next();


                %>






                <div class="row">
                    <div class="col-lg-3">
                        <img src="getPhoto?email=<%=peopleDetails.get("email")%>" width="120" height="150">
                    </div>
                    <div class="col-lg-7">
                        <div class="form-group">
                            <label for="name" class="control-label">Name: <font color="grey"><%=peopleDetails.get("name")%></font></label><br>
                            <label for="email" class="control-label">Email:<font color="grey"> <%=peopleDetails.get("email")%></font></label><br>
                            <label for="gender" class="control-label">Gender: <font color="grey"><%=peopleDetails.get("gender")%></font></label><br>
                            <label for="dob" class="control-label">Date of Birth: <font color="grey"><%=peopleDetails.get("dob")%></font></label><br>
                            <label for="phone" class="control-label">Phone: <font color="grey"><%=peopleDetails.get("phone")%></font></label><br>										

                        </div>
                    </div>
                    <form action="talk.jsp" class="form-horizontal">
                        <div class="col-lg-2">
                            <div class="form-group">
                                </br>
                                </br>
                                <input type="hidden" name="temail" value="<%=peopleDetails.get("email")%>"/>
                                <button type="search" class="btn btn-primary">Talk</button>
                            </div>
                        </div>
                    </form>
                </div>
                <hr>
                <% } %>
                
        </div>
    </section>
</div>
</br>
<!--footer-->
<div class="navbar navbar-inverse navbar-fixed-bottom">
    <div class="container">
        <div class="navbar-text pull-left">
            <p>Design and Develop by INCAPP</p>
        </div>

    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
<%       
        }else{
         session.setAttribute("msg", "Search Again!");
            response.sendRedirect("profile.jsp");
    }
        }else{
        session.setAttribute("msg", "Plz login First!");
        response.sendRedirect("home.jsp");
    }
%>