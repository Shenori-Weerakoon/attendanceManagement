<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
        background-image: url('https://www.employmenthelp.org/wp-content/uploads/Job-Board-Header-Background.png');
    }

    table {
        width: 50%;
        margin: 0 auto;
        border-collapse: collapse;
        background-color: #fff;
        border: 1px solid #ccc;
    }

    td {
        padding: 10px;
        text-align: left;
    }

    input[type="text"],
    input[type="time"],
    input[type="date"] {
        width: 100%;
        padding: 5px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    input[type="text"][readonly] {
        background-color: #eee;
    }

    input[type="submit"] {
        background-color: #0074D9;
        color: #0036;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>

</head>

<body>

	<%
	
		String attendanceID = request.getParameter("attendanceID");
		String eid = request.getParameter("eid");
		String date = request.getParameter("date");
		String loginTime = request.getParameter("loginTime");
		String logoutTime = request.getParameter("logoutTime");
	
	%>

	<form action="updateServlet" method="post">
	<table>
	
		<tr>
		<td>Attendance ID</td>
		<td><input type="text" name="attendanceID" value="<%= attendanceID %>" readonly><br></td>
		</tr>
		
		<tr>
		<td>employee id</td>
		<td><input type="text" name="eid" value="<%= eid %>"><br></td>
		</tr>
		
		<tr>
		<td>Date</td>
		<td><input type="date" name="date" value="<%= date %>"><br></td>
		</tr>
		
		<tr>
		<td>Login Time</td>
		<td><input type="time" name="loginTime" value="<%= loginTime %>"><br></td>
		</tr>
		
		<tr>
		<td>Logout Time</td>
		<td><input type="time" name="logoutTime" value="<%= logoutTime %>"><br></td>
		</tr>

		
	</table>	
	
		<input type="submit" name="submit" value="Edit info"><br> 
		
	</form>

</body>
</html>