<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
<h1><spring:message code="welcome.message"/></h1>
This is the rendered JSP page, found at /src/main/webapp/WEB-INF/jsp/captureme.jsp
<br>
The welcome message above was rendered using locale ${localeUsed}
<br>
Here is the value of the model attribute "jspMessage": ${jspMessage}
<c:if test="${!empty costMessage}">
<br>
Here is the value of the model attribute "costMessage" in US Dollars, formatted for the given locale: <fmt:formatNumber type="currency" currencyCode="USD" value="${costMessage}"/>
<br>
Here is the value of the model attribute "costMessage" in Euros, formatted for the given locale: <fmt:formatNumber type="currency" currencyCode="EUR" value="${costMessage}"/>
<br>
Here is the value of the model attribute "costMessage" in Pesos, formatted for the given locale: <fmt:formatNumber type="currency" currencyCode="MXN" value="${costMessage}"/>
</c:if>
<br>
<jsp:include page="/WEB-INF/jsp/capture/captureinclude.jsp"/>
</body>
</html>