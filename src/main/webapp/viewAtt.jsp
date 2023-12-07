<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<style type="text/css">
    body {
        font-family: 'Hind SemiBold', sans-serif;
        background-image: url('https://www.employmenthelp.org/wp-content/uploads/Job-Board-Header-Background.png');
        margin: 0;
        padding: 0;
    }

    h1 {
        text-align: center;
        color: #333;
    }

    form {
        width: 300px;
        margin: 0 auto;
        background: #fff;
        padding: 20px;
        border: 1px solid #ccc;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        border-radius: 5px;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background: #007BFF;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background: #0056b3;
    }
</style>

	
</head>
<body>

	<h1>View Working Details</h1>
	<form action="viewAttServlet" method="post">
		Attendance ID <input type="text" name="attendanceID" placeholder="Enter your attendance id"><br>
		
		<input type="submit" name="submit" value="view my details">
	</form>

</body>
</html>