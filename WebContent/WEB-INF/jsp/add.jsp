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
