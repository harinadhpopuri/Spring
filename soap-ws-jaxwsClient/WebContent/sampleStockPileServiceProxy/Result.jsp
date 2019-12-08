<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleStockPileServiceProxyid" scope="session" class="com.hari.soapproj.service.StockPileServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleStockPileServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleStockPileServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleStockPileServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.hari.soapproj.service.StockPileService getStockPileService10mtemp = sampleStockPileServiceProxyid.getStockPileService();
if(getStockPileService10mtemp == null){
%>
<%=getStockPileService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String id_1id=  request.getParameter("id18");
        long id_1idTemp  = Long.parseLong(id_1id);
        java.lang.String remove15mtemp = sampleStockPileServiceProxyid.remove(id_1idTemp);
if(remove15mtemp == null){
%>
<%=remove15mtemp %>
<%
}else{
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(remove15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String stockId_2id=  request.getParameter("stockId23");
        long stockId_2idTemp  = Long.parseLong(stockId_2id);
        String stockName_3id=  request.getParameter("stockName25");
            java.lang.String stockName_3idTemp = null;
        if(!stockName_3id.equals("")){
         stockName_3idTemp  = stockName_3id;
        }
        String stockPrice_4id=  request.getParameter("stockPrice27");
        float stockPrice_4idTemp  = Float.parseFloat(stockPrice_4id);
        String quantity_5id=  request.getParameter("quantity29");
        int quantity_5idTemp  = Integer.parseInt(quantity_5id);
        String totalPrice_6id=  request.getParameter("totalPrice31");
        float totalPrice_6idTemp  = Float.parseFloat(totalPrice_6id);
        java.lang.String addStock20mtemp = sampleStockPileServiceProxyid.addStock(stockId_2idTemp,stockName_3idTemp,stockPrice_4idTemp,quantity_5idTemp,totalPrice_6idTemp);
if(addStock20mtemp == null){
%>
<%=addStock20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addStock20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
case 33:
        gotMethod = true;
        java.lang.String getCurrentHoldings33mtemp = sampleStockPileServiceProxyid.getCurrentHoldings();
if(getCurrentHoldings33mtemp == null){
%>
<%=getCurrentHoldings33mtemp %>
<%
}else{
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getCurrentHoldings33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>