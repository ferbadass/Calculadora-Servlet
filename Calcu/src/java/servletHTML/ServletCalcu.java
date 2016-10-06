package servletHTML;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;
import static jdk.nashorn.internal.objects.NativeFunction.function;

public class ServletCalcu extends HttpServlet {

    int num1, num2, res;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        num1 = Integer.parseInt(peticion.getParameter("num1"));
        num2 = Integer.parseInt(peticion.getParameter("num2"));
        String opcion = peticion.getParameter("Ope");

        PrintWriter out = new PrintWriter(respuesta.getOutputStream());

        out.println("<html>");
        out.println("<head><title>Respuesta a Calculadora del Servlet</title><style>\n"
                + "            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n"
                + "        </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%; background-color:#708573; font-family: Roboto Condensed;\">");

        if (opcion.equals("Suma")) {
            res = num1 + num2;
        } else if (opcion.equals("Resta")) {
            res = num1 - num2;
        } else if (opcion.equals("Multi")) {
            res = num1 * num2;
        } else if (opcion.equals("Divi")) {

            res = num1 / num2;
        }
        
        out.print("<br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<center><Font color=\"white\" size=\"12\">El Resultado a la operación es: " + res + "</Font> </center>");
        out.println("</div></body></html>");
        out.close();
    }
}
