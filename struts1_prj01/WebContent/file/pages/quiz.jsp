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
			    	
				 	
				 		<h3>
				 			<bean:write name="questionsId" property="questionText"/>
				 		</h3>
				 			
				 		
					<html:form action="/answer">	
				 		  <input type="radio" id="option1" name="fav_language" value=<bean:write name="questionsId" property="correctAnswer" />>
						  <label for="option1"><bean:write name="questionsId" property="correctAnswer"/></label><br>
						  <input type="radio" id="option2" name="fav_language" value=<bean:write name="questionsId" property="wrongAnswer"/>>
						  <label for="option2"><bean:write name="questionsId" property="wrongAnswer"/></label><br>				 		
				 		
						<html:submit value="Submit"/>			
					</html:form>

			</logic:iterate>
			
			 		
		
		
	</body>
</html:html>