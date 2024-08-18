package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;

import dao.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Characters;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private AdminService adminService;
    private Gson gson = new Gson();

    @Override
    public void init() throws ServletException {
        adminService = new AdminService(); // Inicializamos el servicio de administrador
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "list"; // Acción por defecto es listar personajes
        }

        try {
            switch (action) {
                case "list":
                    listCharacters(response);
                    break;
                case "get":
                    getCharacter(request, response);
                    break;
                default:
                    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    private void listCharacters(HttpServletResponse response) throws SQLException, IOException {
        List<Characters> characterList = adminService.listCharacters();
        String characterListJson = gson.toJson(characterList);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(characterListJson);
    }

    private void getCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Characters character = adminService.getCharacterById(id);
        String characterJson = gson.toJson(character);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(characterJson);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            insertCharacter(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            updateCharacter(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            deleteCharacter(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    private void insertCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        Characters character = gson.fromJson(request.getReader(), Characters.class);
        adminService.addCharacter(character);
        response.setStatus(HttpServletResponse.SC_CREATED);
    }

    private void updateCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        Characters character = gson.fromJson(request.getReader(), Characters.class);
        adminService.updateCharacter(character);
        response.setStatus(HttpServletResponse.SC_OK);
    }

    private void deleteCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        adminService.deleteCharacter(id);
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
