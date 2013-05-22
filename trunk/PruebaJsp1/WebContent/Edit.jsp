<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="GET" action='Controller' name="edit">
<table>
  <tr>
    <td>First name:</td>
    <td><input type="text" name="firstName"></td>
  </tr>
  <tr>
    <td>Last name:</td>
    <td><input type="text" name="lastName"></td>
  </tr>
  <tr>
    <td><input type="submit" value="save"> <input
      type="reset" value="reset"> <input type="submit" value="back">
    </td>
  </tr>
</table>
</form>

</body>
</html> 