<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:url action="empform" var="empform"/>
<s:a href="%{empform}">Show Employee Form</s:a>
<br>
<s:a href="studeform"><s:url value="Show Student Form"/></s:a>
<br>

</body>
</html>