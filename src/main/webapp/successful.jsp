<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Working Details</title>
<style>
    body {
        background-color: #f0f0f0;
        font-family: Arial, sans-serif;
        margin: 20px;
        background-image: url('https://www.employmenthelp.org/wp-content/uploads/Job-Board-Header-Background.png');
    }
    h1 {
        color: #0036;
        text-align: center;
    }
    table {
        border-collapse: collapse;
        width: 100%;
    }
    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: center;
    }
    th {
        background-color: #333;
        color: #fff;
    }
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
    a {
        text-decoration: none;
    }
    a:hover {
        color: #00f;
    }
    input[type="button"] {
        background-color: #0036;
        color: #fff;
        border: none;
        padding: 8px 16px;
        cursor: pointer;
        
    }
    input[type="button"]:hover {
        background-color: #0056a9;
    }
</style>
</head>
<body>

<h1>Working Details</h1>
<table>
    <c:forEach var="work" items="${workDetails}">
    
        <c:set var="attendanceID" value="${work.attendanceID}"/>
        <c:set var="eid" value="${work.eid}"/>
        <c:set var="date" value="${work.date}"/>
        <c:set var="loginTime" value="${work.loginTime}"/>
     	<c:set var="logoutTime" value="${work.logoutTime}"/>
        
        
        <tr>
            <td>Attendance id</td>
            <td>${work.attendanceID}</td> 
        </tr>
        
        <tr>
            <td>Employee id</td>
            <td>${work.eid}</td> 
        </tr>
        
        <tr>
            <td>Date</td>
            <td>${work.date}</td> 
        </tr>
        
        <tr>
            <td>Login Time</td>
            <td>${work.loginTime}</td> 
        </tr>
        
        <tr>
            <td>Logout time</td>
            <td>${work.logoutTime}</td> 
        </tr>
    </c:forEach>
</table>

	<c:url value="updateAtt.jsp" var="updateAtt">
		<c:param name="attendanceID" value="${attendanceID}"/>
		<c:param name="eid" value="${eid}"/>
		<c:param name="date" value="${date}"/>
		<c:param name="loginTime" value="${loginTime}"/>
		<c:param name="logoutTime" value="${logoutTime}"/>
		
	</c:url>
	
	<a href="${updateAtt}">
	<center><input type="button" name="update" value="edit info"></center>
	</a>
	<br>
	
	<p>
	
	<c:url value="deleteAtt.jsp" var="attdelete">
		<c:param name="aid" value="${aid}"/>
		<c:param name="eid" value="${eid}"/>
		<c:param name="date" value="${date}"/>
		<c:param name="login" value="${login}"/>
		<c:param name="logout" value="${logout}"/>
		
	</c:url>
	
	<a href="${attdelete}">
	<center><input type="button" name="delete" value="delete info"></center>
	</a>
	

</body>
</html>