<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="<%= request.getContextPath() %>" />


<div class="page-header">
	<h1><c:out value="${postData.title }"/></h1>
</div>
<div class="row">
	<div class="col-xs-12">
		${postData.content }
	</div>
	${commentList }
</div>