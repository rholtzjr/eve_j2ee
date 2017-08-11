<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.even {
	background-color: silver;
}
table, th, td {
    border: 1px solid black;
}

th, td {
    padding: 5px;
}
</style>
<title>Stock Item List</title>
</head>
<body>

<c:if test="${fn:length(storeStockItemList) > 0}">
	<table>
		<tr class="even">
			<th>Stock Item ID  : </th>
			<th>Stock Item Name: </th>
			<th>Supplier Name  : </th>
			<th>Barcode        : </th>
		</tr>
		<c:forEach items="${storeStockItemList}" var="stockItem" varStatus="status">
			<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
				<c:if test="${not empty stockItem.id.sistockItemId}">
				<td>${stockItem.id.sistockItemId}</td>
				<td>${stockItem.id.sistockItemTx}</td>
				<td>${stockItem.id.suSupplierTx}</td>
				<td>${stockItem.id.sibarcodeNoTxN}</td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>