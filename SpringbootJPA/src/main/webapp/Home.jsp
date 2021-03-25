<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOG IN</title>
</head>
<body>
<form action="adduser" >
ID: <input type="text" name="id"><br>
<br>NAME:<input type="text" name="name"><br>
<br>FIRST NAME: <input type="text" name="first_name"><br>
<br>LAST NAME:<input type="text" name="last_name"><br>
<br>PASSWORD: <input type="password" name="password"><br>
<br><input type="submit" name="login"><br>
</form>

<form action="getuser" >
<br><br>ID: <input type="text" name="id"><br>

<br><input type="submit" name="login"><br>
</form>



</body>
</html>