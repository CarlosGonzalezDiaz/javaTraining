<%@page contentType="text/html" pageEncoding="UTF-8" import="Cabeceras.models.*" %>
<%
Carro carro = (Carro) session.getAttribute("carro");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Carro de Compras</title>
</head>
<body>
<h1>Carro de Compras</h1>
<%if (carro == null || carro.getItemCarros().isEmpty()) {%>
<p>lo sentimos no hay productos agregados</p>
<%} else {%>
<table>
    <tr>
        <th>id</th>
        <th>nombre</th>
        <th>precio</th>
        <th>cantidad</th>
        <th>total</th>
    </tr>
        <% for (ItemCarro itemCarro: carro.getItemCarros()){%>
    <tr>
        <td><%=itemCarro.getProducto().getId()%></td>
        <td><%=itemCarro.getProducto().getNombre()%></td>
        <td><%=itemCarro.getProducto().getPrecio()%></td>
        <%if (itemCarro.getCantidad()<=0){%>
                <p>lo sentimos no hay productos agregados</p>
        <%}%>
        <td><%=itemCarro.getCantidad()%></td>
        <td><%=itemCarro.getTotal()%></td>
    </tr>
        <%}%>
    <tr>
        <td colspan="4" style="text-align: right">Total</td>
        <td><%=carro.getTtotal()%></td>
    </tr>
</table>

<%}%>
<p><a href="<%=request.getContextPath()%>/productos.html">seguir comprando</a> </p>
<p><a href="<%=request.getContextPath()%>/index.html">volver</a> </p>
</body>
</html>