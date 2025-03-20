/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alida
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCRUD {
    
    private Connection conexion;
    
    public UserCRUD(){
        conexion= ConexionMySQL.conectar();
    }
    
    public boolean crearUsuario(String nom, String correo,String contra){
        
        String sqlInsert="INSERT INTO Usuarios(nombre,correo,contraseña) VALUE(?,?,?)";
        
        try{/*validacion al momento de realizar una insercion*/
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1,nom);
            ps.setString(2,correo);
            ps.setString(3,contra);
            return ps.executeUpdate() > 0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar insertar: "+ e.getMessage());
            return false;
        }
    }
    
}
