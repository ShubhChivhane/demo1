<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>


<form:form action="http://localhost:8080/Login/addemp/" method="post">

<table>

	<tr>
		
		<td>
			<form:label path="empId">
				<spring:message text="empId"/>
			</form:label>
		</td>
		<td>
			<form:input path="empId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="empId" />
		</td> 
	</tr>

	<tr>
		<td>
			<form:label path="empName">
				<spring:message text="empName"/>
			</form:label>
		</td>
		<td>
			<form:input path="empName" />
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="empEmailId">
				<spring:message text="empEmailId"/>
			</form:label>
		</td>
		<td>
			<form:input path="empEmailId" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="mobNo">
				<spring:message text="mobNo"/>
			</form:label>
		</td>
		<td>
			<form:input path="mobNo" />
		</td>
	</tr>
	
	<input type="submit"	value="<spring:message text="Register"/>" />
</table>	
</form:form>


</body>
</html>