<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Comentários para <%= request.getAttribute("name") %></h2>
    <ul>
        <%
            ArrayList<String> comments = (ArrayList<String>) request.getAttribute("comments");
            if(comments != null){
                for(String c : comments){
        %>
            <li><%= c %></li>
        <%
                }
            }
        %>
    </ul>
    <a href="list">Voltar</a>
</body>
</html>
