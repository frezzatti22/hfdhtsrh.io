import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

public class RegisterServlet extends HttpServlet {
    private static ArrayList<ServiceProvider> providers = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String service = request.getParameter("service");
        String contact = request.getParameter("contact");

        ServiceProvider provider = new ServiceProvider(name, service, contact);
        providers.add(provider);

        response.sendRedirect("list");
    }

    public static ArrayList<ServiceProvider> getProviders() {
        return providers;
    }
}
