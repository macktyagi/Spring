<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">	
		<title>EMPLOYEE DETAILS</title>
		
		
			
 
	</head>
	<body>
		
		<form:form action="getEmployeeDetails"  modelAttribute="employee" method="post">
			
			<div>
				
				<c:if test="${not empty empdata}">
	
					<ul>
					<c:forEach var="empValue" items="${empdata}">
						<li>${empValue}</li>
					</c:forEach>
					</ul>
		
				</c:if>
			
			</div>
			
			
			
			
			
		
		</form:form>
	
	</body>
	

</html>