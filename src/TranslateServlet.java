import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", urlPatterns = "/translate")
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("book","sach");
        dictionary.put("money","tien");
        dictionary.put("hand","tay");

        String search = request.getParameter("txtSearch");
        String result = dictionary.get(search);

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");

        if (result != null){
            printWriter.println("Word: " + search + "<br>");
            printWriter.println("Result: " + result);
        }else {
            printWriter.println("Not found !");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
