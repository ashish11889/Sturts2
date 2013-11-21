<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
	</head>
	<body>
		<center>
			<s:form action="Marksheet">
				<table>
					<tr>
						<td>
							<s:textfield label="id" name="id" />
						</td>
					</tr>
					<tr>
						<td>
							<s:textfield label="name" name="name" />
						</td>
					</tr>

					<tr>
						<td>
							<s:textfield label="physics" name="physics" />
						</td>
					</tr>
					<tr>
						<td>
							<s:textfield label="chemistry" name="chemistry" />
						</td>
					</tr>
					<tr>
						<td>
							<s:textfield label="maths" name="maths" />
						</td>
					</tr>
				</table>
				<s:submit name="operation" value="Add" theme="simple"></s:submit>
			</s:form>
		</center>
	</body>
</html>