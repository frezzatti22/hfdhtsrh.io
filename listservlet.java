import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

public class ListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<ServiceProvider> providers = RegisterServlet.getProviders();
        request.setAttribute("providers", providers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }
}
