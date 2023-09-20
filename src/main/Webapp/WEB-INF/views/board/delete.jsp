<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
            		</div>
            	
            	</div>

    		  
    		  <c:import url="/WEB-INF/views/layout/footer.jsp"></c:import>
    		  
    		  	</div>
    		  
    		  
    		  </div>
   
    
 <c:import url="./layout/footjs.jsp"></c:import>   
</body>
</html> --%>