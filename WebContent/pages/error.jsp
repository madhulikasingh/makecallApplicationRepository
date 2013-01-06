<%@ page isErrorPage="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Application Error</title>
		<style>
			h1 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 24px; font-weight:800; color:#666666}
			p {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; }
		</style>
	</head>
	<body>
		<table width="85%" border="1" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td>
					<table width="100%" border="0" align="center" cellpadding="4"  cellspacing="0" bordercolor="#CCCCCC">
						<tr bgcolor="#C2DCEB" valign="middle">
							<td width="90%" valign="middle">
								<h1>Resource Not Found</h1>
							</td>
						</tr>
						<tr>
							<td colspan="2" bgcolor="#FFFFFF">
								<p>The following System exception occurred: <%= new java.util.Date() %></p>
								<pre>Resource that you are looking is not available.</pre>
							</td>
						</tr>
						<tr>
							<td colspan="2" bgcolor="#C2DCEB">&nbsp;</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>

