<%-- 
    Document   : admin
    Created on : 3-Dec-2013, 1:48:37 PM
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
    </head>
    <body>
    <html:form action="/mainMenu">
        <table>
            <tr>
                <th>Menu</th>
            </tr>
            <tr>
                <td><input type="submit" name="action" value="Check In" /></td>
            </tr>
            <tr>
                <td><input type="submit" name="action" value="Check Out" /></td>
            </tr>
            <tr>
                <td><input type="submit" name="action" value="Annual Report" /></td>
            </tr>
            <tr>
                <td><input type="submit" name="action" value="Individual Report" /></td>
            </tr>
            <tr>
                <td><input type="submit" name="action" value="Logout" /></td>
            </tr>
        </table>
    </html:form>
    </body>
</html>
