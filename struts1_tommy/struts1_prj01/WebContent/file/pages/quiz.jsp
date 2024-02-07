<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"  %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"  %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"  %>

<html:html>
	
	<head>
		<title> <bean:message key="welcome.title"/> </title>
	</head>
	<body bgcolor="white">
		
		<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
		  <font color="red">
			  ERROR:  Application resources not loaded -- check servlet container logs for error messages.
		  </font>
		</logic:notPresent>
	 
		<logic:iterate name="quizForm" id="email">
		  <li><bean:write name="question" property="question"/></li>
		</logic:iterate>
		
		
		
		
		
		
	</body>
</html:html>