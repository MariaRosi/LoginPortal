<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script>
function validateform(){
	var userid=document.forms["loginform"]["userid"].value;
	var username=document.forms["loginform"]["userid"].value;
	var password1=document.forms["loginform"]["password1"].value;
	var password2=document.forms["loginform"]["password2"].value;
	
    if (userid == "") {
        alert("UserId must be filled out");
        return false;
    }
    if (username == "") {
        alert("Username must be filled out");
        return false;
    }
    if (password1 == "") {
        alert("Password must be filled out");
        return false;
    }
    if (password2 == "") {
        alert("Re-Type Password must be filled out");
        return false;
    }
    if (password1 != password2) {
    	alert("Password and Re-Type Password must be same");
        return false;
    }
}
</script>

<title>Register Page</title>
</head>
<body>
	<form action="LoginRegister" action="LoginRegister" onsubmit="return validateform()" method="post">
		<table
			style="background-color: skyblue; margin-left: 20px; margin-right: 20px">
			<tr>
				<td><h3 style="color: red;">Registration Page !!!!</h3></td>
				<td></td>
			</tr>
			<tr>
				<td>UserId :</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password1"></td>
			</tr>
			<tr>
				<td>Re-Type Password :</td>
				<td><input type="password" name="password2"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>