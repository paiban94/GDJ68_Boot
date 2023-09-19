<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!--  c태그 가져오기 -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/layout/headCSS.jsp"></c:import>

</head>
<body id="page-top">
 	 <!-- Page Wrapper -->
    <div id="wrapper">
    	<!-- sidebar -->
    	<!-- c:import는 jsp불러오기 가능 -->
    	<c:import url="/WEB-INF/views/layout/sidebar.jsp"></c:import>
    		
    		  <div id="content-wrapper" class="d-flex flex-column">
    		  
    		  	 <!-- Main Content -->
            	<div id="content">
            	<c:import url="/WEB-INF/views/layout/topbar.jsp"></c:import>
            	
            		<div class="container-fluid">
            			<!-- page실제내용 -->
            			<div class="row">
            				<form action="add" post="post">
            				<div class="mb-3">
							  <label for="boardTitle" class="form-label">제목</label>
							  <input type="text" class="form-control" name="boardTitle" id="boardTitle" placeholder="제목을 입력하세요.">
							</div>
							<div class="mb-3">
							  <label for="boardWriter" class="form-label">작성자</label>
							  <input type="text" class="form-control" name="boardWriter" id="boardWriter">
							</div>
							<div class="mb-3">
							  <label for="boardContents" class="form-label">내용</label>
							  <textarea class="form-control" id="boardContents" name="boardContents" rows="3"></textarea>
							</div>
							
            			</div>
            				<button class="btn btn-danger">Add</button>
            				
            			</form>
            		</div>
            	
            	</div>

    		  
    		  <c:import url="/WEB-INF/views/layout/footer.jsp"></c:import>
    		  
    		  	</div>
    		  
    		  
    		  </div>
   
    
 <c:import url="/WEB-INF/views/layout/footjs.jsp"></c:import>   
</body>
</html>