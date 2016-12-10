package ec.edu.epn.adminusr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.adminusr.modelo.entity.Imagen;
import ec.edu.epn.adminusr.modelo.entity.TablaProducto;
import ec.edu.epn.adminusr.modelo.service.ServicioImg;
import ec.edu.epn.adminusr.modelo.service.SevicioImagen;



/**
 * Servlet implementation class ConsultarImg
 */
@WebServlet("/ConsultarImg")
public class ConsultarImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarImg() {
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
				//TablaProducto u=su.consultarProductos(txtUsuarioBusqueda);
				List<TablaProducto> u = su.consultarProductos(txtUsuarioBusqueda);
				request.setAttribute("pruebaProducto", u);
				
				
					// Invocacion Modelo
				RequestDispatcher rd = request.getRequestDispatcher("RopaCamisetas.jsp");
				rd.forward(request, response);
		
	}



}
