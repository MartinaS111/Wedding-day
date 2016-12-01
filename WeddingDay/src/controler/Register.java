package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegisterService;
import model.Login;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 Login korisnik= new Login(request.getParameter("ime"), request.getParameter("prezime"),
				    request.getParameter("telefon"), request.getParameter("adresa"), request.getParameter("email"), request.getParameter("password"));
				  
				  RegisterService registerService = new RegisterService(korisnik);
				  
				  if(registerService.uspesno()){
				   response.sendRedirect("Korisnik.jsp");
				  }else{
				   request.setAttribute("error", "Couldn't register!\nTry again");
				   request.getRequestDispatcher("Register.jsp").forward(request, response);
				  }
	
	}

}
