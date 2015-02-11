<%--
  Created by IntelliJ IDEA.
  User: Madalin.Colezea
  Date: 7/14/2014
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="theBean" scope="page" class="CalculatorBean" />
<%
    int i = 4;
    int j = theBean.doubleIt(i);
    out.println("2*4=" + j);
%>