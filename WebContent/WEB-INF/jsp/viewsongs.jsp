   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
 
  
  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>BPM</th><th>Duration</th></tr>  
   <c:forEach var="song" items="${list}">   
   <tr>  
   <td>${song.name}</td>  
   <td>${song.BPM}</td>  
   <td>${song.duration}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <a href="add.html">Submit another song</a>