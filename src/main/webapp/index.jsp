<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/display-discount" method="post">
    <input type="text" name="ProductDescription" placeholder="Product Description">
    <input type="text" name="ListPrice" placeholder="List Price">
    <input type="text" name="DiscountPercent" placeholder="Discount Percent">
    <button>Calculate Discount</button>
</form>
</body>
</html>