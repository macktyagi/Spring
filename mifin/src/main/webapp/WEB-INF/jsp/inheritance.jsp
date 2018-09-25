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
	
		<form:form action="getEmpData" method="get" modelAttribute="empData"  >
		
		
		<button  name="getData" onclick="javascript:getData('getEmployeeDetails')" >Get Data </button>
		<div>
				
				<table>
					<thead><tr>
						<th>Id</th><th>Name</th><th>Salary</th><th>Working Hours</th><th>Contract</th><th>Type</th>
					</tr></thead>
				<c:if test="${not empty empData}">
					
					<ul>
					<c:forEach var="empValue" items="${empData}">					
						<tr>
						<td>${empValue.id}</td>
						<td>${empValue.name}</td>
						<td>${empValue.workingHours}</td>
						<td>${empValue.contract}</td>
						<td>${empValue.type}</td>
						
					</tr>	
					</c:forEach>
					</ul>
		
				</c:if>
			</table>
			</div>
			
			
		
		</form:form>
		
		<form:form action="saveEmpData" method="post" modelAttribute="empData">
			
			<br>
			<div><b>New Employee Data</b></div>
			
			<table>
				<tr><td>Id: </td><td>         <form:input path="id" /></td></tr>
				<tr><td>Name:</td><td>        <form:input path="name" /></td></tr>
				<tr><td>Salary:</td><td>      <form:input path="salary" /></td></tr>
				<tr><td>Working Hours: </td><td>        <form:input path="workingHour" /></td></tr>
				<tr><td>Contract:</td><td>     <form:input path="contract" /></td></tr>
				<tr><td>Type:</td><td>     <form:input path="type" /></td></tr>
				
				<tr><td><button  name="saveData" onclick="javascript:getData('saveEmployeeDetails')" >Save </button></td></tr>
			</table>
			
			
		
		</form:form>
	
	</body>
	

</html>