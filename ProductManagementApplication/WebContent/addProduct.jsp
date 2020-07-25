<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div align="center">
		<h2>Add New Product</h2>
		<s:form action="addAction" class="formTable">
			<s:textfield name="productId" key="global.productId" class="formTextField"/>
			<s:textfield name="productName" key="global.productName" class="formTextField"/>
			<s:textfield name="productCategory" key="global.productCategory" class="formTextField"/>
			<s:textfield name="productPrice" key="global.productPrice" class="formTextField"/>
			<s:submit key="global.addProduct" class="actionBtn"/>
		</s:form>
	</div>
	
	<s:url action="changeLocaleAction" var="urlEn">
		<s:param name="request_locale">pt_BR</s:param>
	</s:url>
	<a href="${urlEn}">Português</a>
	<s:url action="changeLocaleAction" var="urlEn">
		<s:param name="request_locale">en_US</s:param>
	</s:url>
	<a href="${urlEn}">English</a>

</body>
</html>