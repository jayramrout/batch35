<%--
  Created by IntelliJ IDEA.
  User: jrout
  Date: 3/12/2021
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jrout.tutorial.batch35.servlet.controller.domain.Actor" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<%
    List<Actor> actors = (List)request.getAttribute("actors");
%>
<div class="container">
    <h2>Striped Rows</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <%
            for(Actor actor : actors) {
         %>
        <tr>
            <td><%=actor.getFname()%></td>
            <td><%=actor.getLname()%></td>
            <td><%=actor.getId()%></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>

