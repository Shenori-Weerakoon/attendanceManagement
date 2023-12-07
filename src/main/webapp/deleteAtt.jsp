<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Record Attendance</title>

<style>
    body {
        background-color: #f5f5f5; 
        font-family: Arial, sans-serif; 
        margin: 0;
        padding: 0;
        background-image: url('https://www.employmenthelp.org/wp-content/uploads/Job-Board-Header-Background.png');
    }

    h1 {
    	text-align: center;
        color: #0036; 
    }

    form {
        background-color: #fff; 
        border: 1px solid #ccc; 
        padding: 20px;
        max-width: 400px;
        margin: 0 auto;
    }

    label {
        color: #333; 
    }

    input[type="text"] {
        width: 100%; 
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        background-color: #0036; 
        color: #fff; 
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3; 
    }
</style>
</head>

<body>

	<h1>Delete Employee Attendance</h1>
	
	<form action="deleteServlet" method="post">
	
        
        
        <label for="attendanceID">Enter Attendance ID:</label>
        <input type="text" name="attendanceID" id="attendanceID">
        <br>

        
        
        <input type="submit" value="Delete Attendance">
    </form>
    


</body>

</html>