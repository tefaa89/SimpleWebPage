package com;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;

@WebServlet(urlPatterns = {"/test"}) 
public class Controller extends HttpServlet {

  public void doPost( HttpServletRequest request, 
                      HttpServletResponse response) 
                      throws IOException, ServletException {

    String numA = request.getParameter("numA");
    String numB = request.getParameter("numB");
    
    Model model = new Model();

    String res = model.printPattern(numA,numB);
    request.setAttribute("res", res);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response); 
  }
}