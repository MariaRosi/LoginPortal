<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script>
function validateform(){
	var userid=document.forms["loginform"]["userid"].value;
	var password=document.forms["loginform"]["password"].value;
	
    if (userid == "") {
        alert("UserId must be filled out");
        return false;
    }
    if (password == "") {
        alert("Password must be filled out");
        return false;
    }
}
</script>

<title>Login Page</title>
</head>
<body>
	<form name="loginform" action="LoginRegister" onsubmit="return validateform()" method="post">
		<table
			style="background-color: skyblue; margin-left: 20px; margin-right: 20px">
			<tr>
				<td><h3 style="color: red;">Login Page !!!!</h3></td>
				<td></td>
			</tr>
			<tr>
				<td>UserId :</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><a href="Register.jsp">Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>