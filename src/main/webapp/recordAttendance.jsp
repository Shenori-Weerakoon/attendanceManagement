<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Record Attendance</title>
<style type="text/css">

    body {
        font-family: Arial, sans-serif;
        background-image: url('https://www.employmenthelp.org/wp-content/uploads/Job-Board-Header-Background.png');
        background-size: cover;
    }

	h1 {
    	color: #0036;
    	text-align: center;
	}



form {
    max-width: 400px;
    margin: 0 auto;
    background-color: #1111;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
}


label {
    font-weight: bold;
}


input[type="text"] {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
}


input[type="submit"] {
    background-color: #0036;
    color: #fff;
    padding: 10px 20px;
    border: none;
    cursor: pointer;
}


input[type="button"] {
    background-color: #333;
    color: #fff;
    padding: 10px 20px;
    border: none;
    cursor: pointer;
}
    
</style>
</head>

<body>

	<h1>Record Employee Attendance</h1>
	
	<form action="attendanceCtrl" method="post">
	
        
      <p><label for="attendanceID">Attendance ID:</label>
        <input type="text" name="attendanceID" id="attendanceID">
        </p>
        
       <p> <label for="eid">Enter Employee ID:</label>
        <input type="text" name="eid" id="eid">
        <p>
        
                
      <p>  <label for="date">Enter date:</label>
        <input type="date" name="date" id="date">
        </p>

       <p> <label for="loginTime">Enter login time:</label>
        <input type="time" name="loginTime" id="loginTime">
        </p>
        
       <p> <label for="logoutTime">Enter logout time:</label>
        <input type="time" name="logoutTime" id="logoutTime">
        </p>

        
        <p><input type="submit" value="Submit Attendance"></p>
    </form>
    
    <form>
    	<a href="viewAtt.jsp">
    	<input type="button" value="View working Details">
    
    </form>

</body>

</html>