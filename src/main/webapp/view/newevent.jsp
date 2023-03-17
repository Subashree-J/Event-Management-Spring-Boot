<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add event Form</title>
 
<style>
 
    .error {
        color: #ff0000;
    }
</style>
 
</head>
 
<body>
 
    <h2>Add new event</h2>
  
    <form:form method="POST" modelAttribute="event" action="new">
	    <label for="eventName">Event Name: </label><br/>
	    <input type="text" name="eventName"/><br/><br/>
	    
	    <label for="organiserName">Organiser Name: </label><br/>
	    <input type="text" name="organiserName"/><br/><br/>
	    
	    <label for="eventDate">Event Date: </label><br/>
	    <input type="text" name="eventDate"/><br/><br/>
	    
	    <label for="location">Location: </label><br/>
	    <input type="text" name="location"/><br/><br/>
	    
	    <label for="organiserEmail">Organiser Email: </label><br/>
	    <input type="text" name="organiserEmail"/><br/><br/>
	    
	    <input type="submit" value="Add Event"/>
    </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/' />">Home</a>
</body>
</html>