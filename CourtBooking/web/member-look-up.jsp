<%-- 
    Document   : member-look-up
    Created on : 6-Dec-2013, 9:20:02 AM
    Author     : Joel
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <html:form action="/lookup">
            <table>
                <tr>
                    <td>Member ID:</td><td><html:text property="memberID" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="action" value="Lookup" /></td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
