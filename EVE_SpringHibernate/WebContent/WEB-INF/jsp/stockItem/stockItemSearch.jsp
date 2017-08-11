<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<style type="text/css">
.even {
	background-color: silver;
}
</style>
<title>Stock Item Search</title>
</head>
<body>
<form:form action="stockItemSearch.htm" commandName="stockItem">
	<table>
		<tr>
			<td>Stock Item Number:</td>
			<td><form:input path="stockItemNo" /></td>
		</tr>
		<tr>
			<td>Stock Item Name:</td>
			<td><form:input path="stockItemName" /></td>
		</tr>
		<tr>
			<td>Supplier Name  : </td>
			<td><form:input path="supplierName"/></td> 
        </tr>
		<tr>
			<td>Barcode :</td>
			<td><form:input path="barcode"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Search"/></td>
		</tr>
	</table>
</form:form>

<c:if test="${fn:length(stockItem) > 0}">
	<table cellpadding="5">
		<tr class="even">
			<th>Stock Item Name</th>
			<th>Stock Item No</th>
			<th>Supplier</th>
			<th>BarCode</th>
		</tr>
		<c:forEach items="${stockItemList}" var="stockItem" varStatus="status">
			<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
				<td>${stockItem.SlStockItemTx}</td>
				<td>${stockItem.SlStockNoTx}</td>
				<td>${stockItem.SuSupplier}</td>
				<td>${stockItem.SlBarcodeTX_N}</td>
				<td>${stockItem.ZlNoInStocklnX}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>