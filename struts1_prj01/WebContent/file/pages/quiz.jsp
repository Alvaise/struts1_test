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
	 
		<h1><bean:message key="quiz.title"/></h1>
		
		<logic:iterate id="questionsId" property="questions" name="quizForm">
		    	
			 <html:text name="questionsId" property="question"/>
			 		
		</logic:iterate>
		
		
	</body>
</html:html>