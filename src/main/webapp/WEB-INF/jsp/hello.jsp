<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="<%= request.getContextPath() %>" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Hello JSP!</title>
	<link rel="stylesheet" href="/webjars/bootstrap/3.3.6/dist/css/bootstrap.min.css">
	<script src="/webjars/jquery/2.2.0/dist/jquery.min.js" type="text/javascript"></script>
	<script src="/webjars/bootstrap/3.3.6/dist/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
	<h1>Hello JSP!</h1>
	<p>${text }</p>
</body>
</html>