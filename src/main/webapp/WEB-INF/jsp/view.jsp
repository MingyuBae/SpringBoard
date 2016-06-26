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
	
	<div class="col-xe-12">
		<ul class="list-group">
		  <c:forEach items="${commentList }" var="eachComment">		
			  <li class="list-group-item">${eachComment.content}</li>
		  </c:forEach>
		</ul>
		<form id="commentForm" action="${cp }/post/${postData.boardId}/comment/write" method="post">
			<div class="input-group">
				<span class="input-group-addon" id="user-name">사용자 이름</span>
				<input type="text" name="content" class="form-control" placeholder="댓글"/>
				<span class="input-group-btn">
					<button class="btn btn-default" type="submit">입력</button>
				</span>
			</div>
		</form>
	</div>
</div>

<script>
	$('#commentForm').submit(function (event){
		$.ajax({
			url: $(this).attr('action'),
			data: $(this).serialize(),
			method: $(this).attr('method'),
			success: function (data){
				if(data != null && data.commentId >= 0){
					alert("댓글이 성공적으로 작성됬습니다.");
					location.reload();
				} else {
					alert("댓글 작성중 오류가 발생하였습니다!");
				}
			},
			error: function (jqXHR, textStatus, errorThrown){
				alert('오류가 발생했습니다\n(' + textStatus + ')');
			}
		});
		
		event.preventDefault();
	});
</script>