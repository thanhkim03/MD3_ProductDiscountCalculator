import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", urlPatterns = "/display-discount")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ListPrice= Integer.parseInt(request.getParameter("ListPrice"));
        int DiscountPercent = Integer.parseInt(request.getParameter("DiscountPercent"));
        double DiscountAmount = ListPrice*DiscountPercent*0.01;
        double DiscountPrice = ListPrice-DiscountAmount;
        PrintWriter printWriter =response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<h3>Discount Amount = "+DiscountAmount+"</h3>");
        printWriter.write("<h3>Discount Price = "+DiscountPrice+"</h3>");
        printWriter.write("</html>");
    }
}
