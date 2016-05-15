<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>


<html>
	<head>
		<meta charset="UTF-8">
		<title><tiles:getAsString name="title"/></title>
		<tiles:insertAttribute name="header"/>
	</head>
	<body>
		<tiles:insertAttribute name="menu"/>
		<div class="container">
			<tiles:insertAttribute name="content"/>
		</div>
		<footer class="bs-docs-footer">
			<tiles:insertAttribute name="footer"/>
		</footer>
	</body>
</html>