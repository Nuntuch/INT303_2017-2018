<%-- 
    Document   : index
    Created on : Jul 24, 2018, 2:41:11 PM
    Author     : Nuntuch  Thongyoo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><% out.println(request.getAttribute("title")); %></h1>
        <h2><% out.print("555");%></h2>

        Register Form
        <form action="/WebApplication1/register" method="post">
            First name:<br>
            <input type="text" name="firstname" value="Mickey">
            <br>
            <input type="submit" value="Submit">
        </form> 
        Member Name: <% out.print(request.getAttribute("firstname"));%>
    </body>
</html>
