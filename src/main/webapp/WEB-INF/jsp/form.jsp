<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="cp" value="<%= request.getContextPath() %>" />

<script src="//cdn.ckeditor.com/4.5.8/standard/ckeditor.js"></script>

<form:form commandName="formData">
	<div class="form-group">
		<label for="title">제목</label>
		<form:input path="title" class="form-control" required="required"/>
	</div>
	
	<div class="form-group">
		<label for="content">내용</label>
		<form:textarea path="content" class="form-control" required="required"/>
	</div>
	
	<div class="col-xs-12">
		<p class="text-right">
			<button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-send" aria-hidden="true"></span> 글 작성</button>
		</p>
	</div>
</form:form>

<script>
	CKEDITOR.replace('content');
</script>