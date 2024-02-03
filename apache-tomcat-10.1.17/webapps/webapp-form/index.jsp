<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%
Map<String, String> errores = (Map<String,String>) request.getAttribute("errores");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulario de usuarios</title>
</head>
<body>
<h3>Formulario de usuarios</h3>
<!--sCRIBLET PARA JAVA -->
<%
    if (errores!=null && errores.size()>0){
%>
<ul>
    <%for (String error :errores.values() ) { %>
    <li><%=error%></li>
    <%}%>
</ul>
<%}%>
<form action="/webapp-form/registro" method="post">
    <div>
        <label for="username">Usuario</label>
        <div><input type="text" name="username" id="username"></div>
        <%
        if (errores != null && errores.containsKey("username"))
        {
            System.out.println("<small style='color: red;'>" + errores.get("username")+ "</small>");
        }
        %>
    </div>
    <div>
        <label for="password">Password</label>
        <div><input type="password" name="password" id="password"></div>
        <%
            if (errores != null && errores.containsKey("password"))
            {
                System.out.println("<small style='color: red;'>" + errores.get("password")+ "</small>");
            }
        %>
    </div>
    <div>
        <label for="email">email</label>
        <div><input type="email" name="email" id="email"></div>
        <%
            if (errores != null && errores.containsKey("email"))
            {
                System.out.println("<small style='color: red;'>" + errores.get("email")+ "</small>");
            }
        %>
    </div>
    <div>
        <label for="pais">pais</label>
        <%
            if (errores != null && errores.containsKey("pais"))
            {
                System.out.println("<small style='color: red;'>" + errores.get("pais")+ "</small>");
            }
        %>
        <div>
            <select name="pais" id="pais">
                <option value="">-- seleccionar --</option>
                <option value="ES">España</option>
                <option value="MX">Mexico</option>
                <option value="CL">Chile</option>
                <option value="AR">Argentina</option>
                <option value="PE">Peru</option>
                <option value="CO">Colombia</option>
                <option value="VE">Venezuela</option>
            </select>
        </div>
    </div>
    <div>
        <lab for="lenguajes">Lenguajes de programacion</lab>
        <%
            if (errores != null && errores.containsKey("lenguajes"))
            {
                System.out.println("<small style='color: red;'>" + errores.get("lenguajes")+ "</small>");
            }
        %>
        <div>
            <select name="lenguajes" id="lenguajes" multiple>
                <option value="java">Java</option>
                <option value="jakartaee">Jakarta EE9</option>
                <option value="spring">Spring Boot</option>
                <option value="js">JavaScript</option>
                <option value="angular">Angular</option>
                <option value="react">React</option>
            </select>
        </div>
    </div>
    <div>
        <label>Roles</label>
        <%
            if (errores != null && errores.containsKey("roles"))
            {
                System.out.println("<small style='color: red;'>" + errores.get("roles")+ "</small>");
            }
        %>
        <div>
            <input type="checkbox" name="roles" value="ROLE_ADMIN">
            <label>Administrador</label>
        </div>
        <div>
            <input type="checkbox" name="roles" value="ROLE_USER">
            <label>Usuario</label>
        </div>
        <div>
            <input type="checkbox" name="roles" value="ROLE_MODERATOR">
            <label>Moderador</label>
        </div>
    </div>
    <div>
        <label>Idiomas</label>
        <%
            if (errores != null && errores.containsKey("idioma"))
            {
                System.out.println("<small style='color: red;'>" + errores.get("idioma")+ "</small>");
            }
        %>
        <div><input type="radio" name="idioma" value="es">Español</div>
    </div>
    <div>
        <div><input type="radio" name="idioma" value="en">Ingles</div>
    </div>
    <div>
        <div>
            <input type="radio" name="idioma" value="fr">Frances
        </div>
    </div>
    <div>
        <label for="habilitar">Habilitar</label>
        <div>
            <input type="checkbox" name="habilitar" id="habilitar" checked>
        </div>
    </div>
    <div>
        <div><input type="submit" value="enviar"></div>
    </div>
    <input type="hidden" name="secreto" value="12345">
</form>
</body>
</html>