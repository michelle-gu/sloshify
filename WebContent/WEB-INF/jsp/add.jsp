<!-- <!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
<head>
    <title>Add Song</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>

	<h1>Form</h1>
    <form action="#" th:action="@{/add}" th:object="${song}" method="post">
    	<p>Name:<input type="text" th:field="*{name}"/></p>
        <p>Duration: <input type="number" th:field="*{BPM}" /></p>
        <p>BPM: <input type="number" th:field="*{duration}" /></p> 
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p> 
    </form>
</body>
</html> -->
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form action="add" method="post">
	<table>
		<tr>
			<td colspan="2" align="center"><h2>Add Song</h2></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>BPM :</td>
			<td><form:input path="BPM" /></td>
		</tr>
		<tr>
			<td>Duration :</td>
			<td><form:input path="duration" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>

<form:form action="viewsongs">
	<table>
		<tr>
			<td colspan="2"><input type="submit" value="View Songs" /></td>
		</tr>
	</table>
</form:form>
