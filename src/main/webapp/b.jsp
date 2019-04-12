<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

<c:forEach var="u" items="${requestScope.list}">
姓名:${u.username} 密码：${u.password}
性别:<c:choose>
<c:when test="${u.sex==0}">女</c:when>
<c:otherwise>男</c:otherwise>
</c:choose>
<br/>
</c:forEach>

qqqqqqqqqqqq
</html>
</body>