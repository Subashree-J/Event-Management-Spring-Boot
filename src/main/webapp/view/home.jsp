<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Blood Bank</title>
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
</head>
<body>
  
    <table>
        <tr>
            <td>Event Name</td><td>Organiser Name</td><td>Event Date</td><td>Location</td><td>Organiser Email</td>
        </tr>
        <c:forEach items="${events}" var="event">
            <tr>
            <td>${event.eventName}</td>
            <td>${event.organiserName}</td>
            <td>${event.eventDate}</td>
            <td>${event.location}</td>
            <td>${event.organiserEmail}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New Event</a>
</body>
</html>