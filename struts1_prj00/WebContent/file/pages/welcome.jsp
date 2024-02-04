<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"  %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"  %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"  %>

<html:html>
	<head>
		<title><bean:write name="helloWorldForm" property="message"/></title>
	</head>
	<body bgcolor="white">
		<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
		  <font color="red">
			  ERROR:  Application resources not loaded -- check servlet container logs for error messages.
		  </font>
		</logic:notPresent>
	 
		<h1>
			<bean:message key="welcome.message"/>
		</h1>
		
		<a href="inputForm.jsp">Click here!</a>
		
	</body>
</html:html>