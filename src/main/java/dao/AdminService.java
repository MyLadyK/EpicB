package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Characters;

public class AdminService {
	
	// Método para añadir un nuevo personaje
	public void addCharacter(Characters character) throws SQLException {
	    try (Connection conn = DBConnection.getConnection()) {
	        String sql = "INSERT INTO characters (name_character, category_character, univers_character, health_character, attack_character, defense_character, speed_character, stamina_character, intelligence_character, special_character, image_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try (PreparedStatement statement = conn.prepareStatement(sql)) {
	            statement.setString(1, character.getNameCharacter());
	            statement.setString(2, character.getCategoryCharacter());
	            statement.setString(3, character.getUniversCharacter());
	            statement.setDouble(4, character.getHealthCharacter());
	            statement.setDouble(5, character.getAttackCharacter());
	            statement.setDouble(6, character.getDefenseCharacter());
	            statement.setDouble(7, character.getSpeedCharacter());
	            statement.setDouble(8, character.getStaminaCharacter());
	            statement.setDouble(9, character.getIntelligenceCharacter());
	            statement.setDouble(10, character.getSpecialCharacter());
	            statement.setString(11, character.getImageUrl());

	            statement.executeUpdate();
	        }
	    }
	}

    // Método para listar todos los personajes
    public List<Characters> listCharacters() throws SQLException {
        List<Characters> charactersList = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM characters";

            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                try (ResultSet rs = statement.executeQuery()) {
                    while (rs.next()) {
                        Characters character = new Characters();
                        character.setIdCharacter(rs.getInt("id_character"));
                        character.setNameCharacter(rs.getString("name_character"));
                        character.setCategoryCharacter(rs.getString("category_character"));
                        character.setUniversCharacter(rs.getString("univers_character"));
                        character.setHealthCharacter(rs.getDouble("health_character"));
                        character.setAttackCharacter(rs.getDouble("attack_character"));
                        character.setDefenseCharacter(rs.getDouble("defense_character"));
                        character.setSpeedCharacter(rs.getDouble("speed_character"));
                        character.setStaminaCharacter(rs.getDouble("stamina_character"));
                        character.setIntelligenceCharacter(rs.getDouble("intelligence_character"));
                        character.setSpecialCharacter(rs.getDouble("special_character"));

                        charactersList.add(character);
                    }
                }
            }
        }
        return charactersList;
    }
    

    // Método para actualizar un personaje
    public void updateCharacter(Characters character) throws SQLException {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE characters SET name_character = ?, category_character = ?, univers_character = ?, health_character = ?, attack_character = ?, defense_character = ?, speed_character = ?, stamina_character = ?, intelligence_character = ?, special_character = ?, image_url = ? WHERE id_character = ?";

            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setString(1, character.getNameCharacter());
                statement.setString(2, character.getCategoryCharacter());
                statement.setString(3, character.getUniversCharacter());
                statement.setDouble(4, character.getHealthCharacter());
                statement.setDouble(5, character.getAttackCharacter());
                statement.setDouble(6, character.getDefenseCharacter());
                statement.setDouble(7, character.getSpeedCharacter());
                statement.setDouble(8, character.getStaminaCharacter());
                statement.setDouble(9, character.getIntelligenceCharacter());
                statement.setDouble(10, character.getSpecialCharacter());
                statement.setString(11, character.getImageUrl());
                statement.setInt(12, character.getIdCharacter());

                statement.executeUpdate();
            }
        }
    }

    // Método para eliminar un personaje
    public void deleteCharacter(int idCharacter) throws SQLException {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM characters WHERE id_character = ?";

            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, idCharacter);
                statement.executeUpdate();
            }
        }
    }

    //Método para referenciar al personaje a través de la id
    public Characters getCharacterById(int id) throws SQLException {
        Characters character = null;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM characters WHERE id_character = ?";

            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, id);

                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        character = new Characters();
                        character.setIdCharacter(rs.getInt("id_character"));
                        character.setNameCharacter(rs.getString("name_character"));
                        character.setCategoryCharacter(rs.getString("category_character"));
                        character.setUniversCharacter(rs.getString("univers_character"));
                        character.setHealthCharacter(rs.getDouble("health_character"));
                        character.setAttackCharacter(rs.getDouble("attack_character"));
                        character.setDefenseCharacter(rs.getDouble("defense_character"));
                        character.setSpeedCharacter(rs.getDouble("speed_character"));
                        character.setStaminaCharacter(rs.getDouble("stamina_character"));
                        character.setIntelligenceCharacter(rs.getDouble("intelligence_character"));
                        character.setSpecialCharacter(rs.getDouble("special_character"));
                        character.setImageUrl(rs.getString(("image_url")));
                    }
                }
            }
        }
        return character;
    }

}
