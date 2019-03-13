<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
  <form method="POST" action="http://localhost:8080/Login/checklogin/" modelAttribute="empob" method="post">
        
        <h2>Log in</h2>
<input name="empEmailId" type="text" class="form-control" placeholder="Email Id" />
           
<button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
     </form>
     
 </h3>
</body>
</html>