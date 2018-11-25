<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Question 5</title>
    </head>
    <body>
        <c:set var="word" value="${param.word}"/>
        <c:set var="len" value="${fn:length(wrd)}"/>
        <%
            String str = request.getParameter("word").toLowerCase();
            String sel = request.getParameter("select");
            
            Boolean flag = true;
            int l = (Integer)pageContext.getAttribute("len");
            
            if (sel.equals("odd")) {
            	for (int i = 1; i < l; i += 2) {
            		if (! ("aeiou".contains(str.substring(i, i+1)))) {
            			flag = false;
            			break;
            		}
            	}
            }
            
            if (sel.equals("even")) {
            	for (int i = 0; i < l; i += 2) {
            		if (! ("aeiou".contains(str.substring(i, i+1)))) {
            			flag = false;
            			break;
            		}
            	}
            }
            
            if (flag)
                out.println("You win");
            else
                out.println("You lose");
        %>
    </body>
</html>