package controlador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import dao.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import modelo.Characters;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10,       // 10MB
maxRequestSize = 1024 * 1024 * 50)    // 50MB

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
    }
    
    private static final String UPLOAD_DIR = "EpicB/src/main/webapp/EB_Images";	//Directorio raíz de imágenes de personajes

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
    
    private void deleteCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int idCharacter = Integer.parseInt(request.getParameter("id"));
        adminService.deleteCharacter(idCharacter);
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

    private void insertCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        // Obtener los parámetros de texto
        String nameCharacter = request.getParameter("name");
        String categoryCharacter = request.getParameter("category");
        String universCharacter = request.getParameter("univers");
        double healthCharacter = Double.parseDouble(request.getParameter("health"));
        double attackCharacter = Double.parseDouble(request.getParameter("attack"));
        double defenseCharacter = Double.parseDouble(request.getParameter("defense"));
        double speedCharacter = Double.parseDouble(request.getParameter("speed"));
        double staminaCharacter = Double.parseDouble(request.getParameter("stamina"));
        double intelligenceCharacter = Double.parseDouble(request.getParameter("intelligence"));
        double specialCharacter = Double.parseDouble(request.getParameter("special"));

        String relativePath = "";
        String category = "";

        // Mapa de subcategorías para cada categoría principal
        Map<String, Map<String, String>> categoryMap = new HashMap<>();

        // Map para "Comics"
        Map<String, String> comicsMap = new HashMap<>();
        comicsMap.put("dc", "Comics/DC");
        comicsMap.put("marvel", "Comics/Marvel");

        // Map para "Anime"
        Map<String, String> animeMap = new HashMap<>();
        animeMap.put("bleach", "Anime/Bleach");
        animeMap.put("naruto", "Anime/Naruto");
        animeMap.put("dragon ball", "Anime/DragonBall");
        animeMap.put("one piece", "Anime/OnePiece");
        animeMap.put("berserk", "Anime/Berserk");
        animeMap.put("one punch man", "Anime/OnePunchMan");
        // Puedes agregar más subcategorías aquí...

        // Map para "Movies"
        Map<String, String> moviesMap = new HashMap<>();
        moviesMap.put("star wars", "Movies/StarWars");

        // Map para "Books"
        Map<String, String> booksMap = new HashMap<>();
        booksMap.put("harry potter", "Books/HarryPotter");
        booksMap.put("lord of the rings", "Books/LOTR");
        booksMap.put("song of ice and fire", "Books/SongOfIceAndFire");

        // Map para "Videogames"
        Map<String, String> videogamesMap = new HashMap<>();
        videogamesMap.put("zelda", "Videogames/Zelda");
        videogamesMap.put("mario", "Videogames/Mario");
        videogamesMap.put("metroid", "Videogames/Metroid");
        videogamesMap.put("halo", "Videogames/Halo");
        videogamesMap.put("lara croft", "Videogames/LaraCroft");
        videogamesMap.put("dante", "Videogames/Dante");
        videogamesMap.put("bayonetta", "Videogames/Bayonetta");
        videogamesMap.put("metal gear solid", "Videogames/MetalGearSolid");
        videogamesMap.put("splinter cell", "Videogames/SplinterCell");
        videogamesMap.put("assassins creed", "Videogames/AssassinsCreed");
        videogamesMap.put("the witcher", "Videogames/TheWitcher");
        videogamesMap.put("god of war", "Videogames/GodOfWar");

        // Agrega todos los maps al map principal
        categoryMap.put("comics", comicsMap);
        categoryMap.put("anime", animeMap);
        categoryMap.put("movies", moviesMap);
        categoryMap.put("books", booksMap);
        categoryMap.put("videogames", videogamesMap);

        switch (universCharacter.toLowerCase()) {
            case "dc":
            case "marvel":
                category = "comics";
                relativePath = categoryMap.get(category).get(universCharacter.toLowerCase());
                break;
            case "bleach":
            case "naruto":
            case "dragon ball":
            case "one piece":
            case "berserk":
            case "one punch man":
                category = "anime";
                relativePath = categoryMap.get(category).get(universCharacter.toLowerCase());
                break;
            case "star wars":
                category = "movies";
                relativePath = categoryMap.get(category).get(universCharacter.toLowerCase());
                break;
            case "harry potter":
            case "lord of the rings":
            case "song of ice and fire":
                category = "books";
                relativePath = categoryMap.get(category).get(universCharacter.toLowerCase());
                break;
            case "zelda":
            case "mario":
            case "metroid":
            case "halo":
            case "lara croft":
            case "dante":
            case "bayonetta":
            case "metal gear solid":
            case "splinter cell":
            case "assassins creed":
            case "the witcher":
            case "god of war":
                category = "videogames";
                relativePath = categoryMap.get(category).get(universCharacter.toLowerCase());
                break;
            default:
                // Manejo de categoría o universo no definido
                throw new ServletException("Universe not recognized: " + universCharacter);
        }

        // Obtener la imagen del personaje
        Part imagePart = request.getPart("image");
        String fileName = Paths.get(imagePart.getSubmittedFileName()).getFileName().toString();
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR + File.separator + relativePath;

        // Crear el directorio si no existe
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdirs();

        // Guardar el archivo en el servidor
        imagePart.write(uploadPath + File.separator + fileName);

        // Construir la ruta relativa para la base de datos
        String imagePath = UPLOAD_DIR + "/" + relativePath + "/" + fileName;

        // Crear el nuevo personaje
        Characters newCharacter = new Characters(nameCharacter, categoryCharacter, universCharacter,
                healthCharacter, attackCharacter, defenseCharacter, speedCharacter,
                staminaCharacter, intelligenceCharacter, specialCharacter, imagePath);

        // Insertar en la base de datos usando el servicio
        adminService.addCharacter(newCharacter);

        // Responder al cliente
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().write("Character added successfully!");
    }

    private void updateCharacter(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int idCharacter = Integer.parseInt(request.getParameter("id"));

        String nameCharacter = request.getParameter("name");
        String categoryCharacter = request.getParameter("category");
        String universCharacter = request.getParameter("univers");
        double healthCharacter = Double.parseDouble(request.getParameter("health"));
        double attackCharacter = Double.parseDouble(request.getParameter("attack"));
        double defenseCharacter = Double.parseDouble(request.getParameter("defense"));
        double speedCharacter = Double.parseDouble(request.getParameter("speed"));
        double staminaCharacter = Double.parseDouble(request.getParameter("stamina"));
        double intelligenceCharacter = Double.parseDouble(request.getParameter("intelligence"));
        double specialCharacter = Double.parseDouble(request.getParameter("special"));

     // Determinar la ruta de la carpeta en función del universo del personaje
        String relativePath = "";
        switch (universCharacter.toLowerCase()) {
            case "dc":
                relativePath = "Comics/DC";
                break;
            case "bleach":
                relativePath = "Anime/Bleach";
                break;
            // Agrega más casos según los universos que tengas
            default:
                relativePath = "Others"; // Ruta por defecto si el universo no coincide con los anteriores
                break;
        }

        Part filePart = request.getPart("image");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR + File.separator + relativePath;

        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdirs();

        filePart.write(uploadPath + File.separator + fileName);

        String imageUrl = UPLOAD_DIR + File.separator + relativePath + File.separator + fileName;

        Characters character = new Characters(idCharacter, nameCharacter, categoryCharacter, universCharacter, healthCharacter, attackCharacter, defenseCharacter, speedCharacter, staminaCharacter, intelligenceCharacter, specialCharacter, imageUrl);
        adminService.updateCharacter(character);
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
