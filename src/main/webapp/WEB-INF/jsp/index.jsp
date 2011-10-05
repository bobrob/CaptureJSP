<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<style>
		a {text-decoration: none};
	</style>
</head>
<body>
This is the outer JSP that was served for the request.
<br>
It can be found at /src/main/webapp/WEB-INF/jsp/index.jsp
<br>
Value of the model attribute "message" : ${message}
<br>
Note that the outer and inner jsp pages can have different models
<br>
The capture JSP page follows:
<hr>
${jspoutput}
<hr>
Now we are back to the outer jsp page (index.jsp)
<hr>
<a href="?locale=en_US"><button>Use Locale en_US</button></a>&nbsp;<a href="?locale=es_MX"><button>Use Locale es_MX</button></a>&nbsp;<a href="?locale=fr_FR"><button>Use Locale fr_FR</button></a>&nbsp;<a href="?locale=de_DE"><button>Use Locale de_DE</button></a>
</body>
</html>
