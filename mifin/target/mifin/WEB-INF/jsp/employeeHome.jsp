<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">	
		<title>EMPLOYEE DETAILS</title>
		
		
			<script type="text/javascript">
	
	
	
function getData(actionName){
		
		document.forms[0].action = actionName;
		document.forms[0].method = "POST";
		document.forms[0].submit();
		
		
	}
	</script>
	</head>
	<body>
		
		<form:form action="getEmployeeDetails" method="post">
			<div>
				Search: <input type="text" name="search" />
				<button name="getData" onclick="javascript:getData('getEmployeeDetails')" >Search</button>
			</div>
			
			<div>
				
				<c:if test="${not empty empdata}">
	
					<ul>
					<c:forEach var="empValue" items="${empdata}">
						<li>${empValue}</li>
					</c:forEach>
					</ul>
		
				</c:if>
			
			</div>
			
			
			
			<br>
			<div><b>New Employee Data</b></div>
			
			<table>
				<tr><td>Name:</td><td>        <form:input path="name" /></td></tr>
				<tr><td>Age:</td><td>         <form:input path="age" /></td></tr>
				<tr><td>Sex: </td><td>        <form:input path="sex" /></td></tr>
				<tr><td>Address:</td><td>     <form:input path="address" /></td></tr>
				<tr><td>Mobile:  </td><td>    <form:input path="mobile" /></td></tr>
				<tr><td>Designation:</td><td> <form:input path="designation" /></td></tr>
				<tr><td><button  name="saveData" onclick="javascript:getData('saveEmployeeDetails')" >Save </button></td></tr>
			</table>
			
			
		
		</form:form>
	
	</body>
	

</html>