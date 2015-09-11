<%@page import="com.cookbook.ENGINE.EnginePersons"%>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 
<jsp:useBean id="personViewDAO" type="com.cookbook.DAO.PersonViewDAO" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>JPA Guestbook Web Application Tutorial</title>
    </head>
 
    <body>
        <form method="POST" action="guest.html">
            Name: <input type="text" name="name" />
            <input type="submit" value="Add" />
        </form>
 
        <ol> 
            test
        <% for (EnginePersons p : personViewDAO.findAll()) { %>
            <li> <%= p %> </li>
        <% } %>
            test
            
        </ol>
	</body>
</html>