<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Form</h2>

	<s:form action="registerStudent">
		<s:textfield key="student.key" label="key"></s:textfield>
		<s:textfield key="student.city" label="City"></s:textfield>
		<s:textfield key="student.age" label="Age"></s:textfield>
		<s:textfield key="student.allowance" label="Allowance"></s:textfield>
		<s:select key="student.course" list="{'java','spring','angular'}"
			label="Course"></s:select>
		<s:radio key="student.gender" label="Gender" list="{'male','female'}"></s:radio>
		<s:textfield key="student.email" label="Email"></s:textfield>
		<s:checkboxlist key="student.hobby" list="hobbies" label="Hobbies"></s:checkboxlist>
		<s:submit value="Submit"></s:submit>
</s:form>
</body>
</html>