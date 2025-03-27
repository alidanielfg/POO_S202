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
import java.sql.ResultSet;

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
    }//fin de crearusuario
    
    public ResultSet obtenerUsuarioPorID(int id){
        String selectSql = "SELECT * FROM Usuarios WHERE id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSql);
            ps.setInt(1,id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al intentar consultar: "+ e.getMessage());
            return null;
        }
    }//fin result con id
    
    public ResultSet obtenerTodos(){
        String sqlTodos="select*from Usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException w){
            System.out.println("Error al consultar"+w.getMessage());
            return null;
        }
    }//fin obtenertodos
    
}
