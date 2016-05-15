<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="<%= request.getContextPath() %>" />

<div class="rpw">
	<div class="col-xs-12">
		<div class="page-header">
			<h1>게시판</h1>
		</div>
	</div>
	<div class="col-xs-12">
		<table class="table">
			<thead>
				<tr>
					<th>순번</th>
					<th>제목</th>
					<th>등록일</th>
					<th>작성자</th>
				</tr>
			</thead>
			<tbody>
			  <c:forEach var="postEach" items="${postList}">
				<tr>
					<td>${postEach.boardId }</td>
					<td><a href="${cp }/post/${postEach.boardId }">${postEach.title }</a></td>
					<td>${postEach.regDate }</td>
					<td>${postEach.userId }</td>
				</tr>
			  </c:forEach>
			</tbody>
		</table>
	</div>
	<div class="col-xs-12 text-right">	
		<a href="${cp }/write" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span> 글쓰기</a>
	</div>
</div>
