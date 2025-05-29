<%@ page import="java.util.ArrayList" %>
<%@ page import="ServiceProvider" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Prestadores de Serviço</h2>
    <ul>
        <%
            ArrayList<ServiceProvider> providers = (ArrayList<ServiceProvider>) request.getAttribute("providers");
            for(ServiceProvider p : providers){
        %>
            <li>
                <strong><%= p.getName() %></strong> - <%= p.getService() %> - <%= p.getContact() %>
                <form action="comment" method="post">
                    <input type="hidden" name="name" value="<%= p.getName() %>">
                    <input type="text" name="comment" placeholder="Deixe um comentário">
                    <input type="submit" value="Enviar">
                </form>
            </li>
        <%
            }
        %>
    </ul>
    <a href="index.html">Voltar</a>
</body>
</html>
