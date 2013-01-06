<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Project</title>
		<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/application.js"></script>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resource/css/application.css"> 
		<script type="text/javascript">
			var contextPath = "<%=request.getContextPath() %>";
		</script>
		<style type="text/css">
			html, body {
				background: #EBEBEB;
			}
		</style>
	</head>
	<body>
		<br/><br/><br/>
		<center>
			<form action="getMakeCallServlet.action" method="POST" onsubmit="return validate();">
				<table>
					<thead>
						<tr>
							<th colspan="2"><label class="headerLabel">PLIVO MAKE CALL SYSTEM</label></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label class="label">From(Caller ID) : </label></td>
							<td><input type= "text" name="from" id="from" width="360px" style="width:360px"></td>
						</tr>
						<tr>
							<td><label class="label">To(Number you want to Call To) : </label></td>
							<td><input type= "text" name="to" id="to" width="360px" style="width:360px"></td>
						</tr>
						<tr>
							<td><label class="label">Your Number : </label></td>
							<td><input type= "text" name="yourNumber" id="yourNumber" width="360px" style="width:360px"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" value="Submit"><input type="reset" value="Reset"></td>
						</tr>
					</tbody>
				</table>
			</form>
		</center>
	</body>
</html>