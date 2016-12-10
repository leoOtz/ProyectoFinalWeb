package ec.edu.epn.adminusr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.adminusr.modelo.entity.RopaCamiseta;
import ec.edu.epn.adminusr.modelo.entity.TablaProducto;

import ec.edu.epn.adminusr.modelo.service.*;

/**
 * Servlet implementation class consulta
 */
@WebServlet("/consulta")
public class consulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public consulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String txtUsuarioBusqueda = request.getParameter("txtUsuarioBusqueda");
		SevicioImagen su= new SevicioImagen();
		//List<RopaCamiseta> u = su.consultarProductos(txtUsuarioBusqueda);
		//request.setAttribute("pruebaProducto", u);
		
		
			// Invocacion Modelo
		RequestDispatcher rd = request.getRequestDispatcher("RopaCamisetas.jsp");
		rd.forward(request, response);
		

		
		
	}

	

}
