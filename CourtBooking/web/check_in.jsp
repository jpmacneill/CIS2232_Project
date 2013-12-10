<%-- 
    Document   : check_in
    Created on : 3-Dec-2013, 2:09:42 PM
    Author     : Joel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="/checkIn">
            <table>
                <tr>
                    <td>Member ID:</td>
                    <td><html:text name="MemberLookupForm" property="memberID" /></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><html:text name="MemberLookupForm" property="firstName" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><html:text name="MemberLookupForm" property="lastName" /></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><html:text name="MemberLookupForm" property="status" /></td>
                </tr>
                <tr>
                    <td>Towel checked out:</td>
                    <td><html:checkbox name="CheckInForm" property="towel" /></td>
                </tr>
                <tr>
                    <td colspan="2"><a href="memberReport.jsp"></a></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="action" value="Check In" /></td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
