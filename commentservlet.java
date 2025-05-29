import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.HashMap;

public class CommentServlet extends HttpServlet {
    private static HashMap<String, ArrayList<String>> comments = new HashMap<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String comment = request.getParameter("comment");

        comments.computeIfAbsent(name, k -> new ArrayList<>()).add(comment);

        request.setAttribute("name", name);
        request.setAttribute("comments", comments.get(name));
        RequestDispatcher dispatcher = request.getRequestDispatcher("comments.jsp");
        dispatcher.forward(request, response);
    }
}
