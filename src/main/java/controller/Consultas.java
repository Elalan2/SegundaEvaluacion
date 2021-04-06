/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alann
 */
public class Consultas extends Conexion{
    public boolean autenticacion (String mail, String contraseña) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from usuarios where mail_usu = ? and password_usu = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mail);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return true;
            }
        }catch(Exception e){
            System.err.println("Error"+e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close(); 
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            }catch(Exception e){
            System.err.println("Error"+e);
                    }
        }
        return false;
    }
    
    public boolean registrar(String mail, String contraseña, String nombre, String apellido){
        PreparedStatement pst = null;
        try{
            String consulta = "insert into usuarios (mail_usu, password_usu, name_usu, lastname_usu) values(?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, mail);
            pst.setString(2, contraseña);
            pst.setString(3, nombre);
            pst.setString(4, apellido);
          
            if(pst.executeUpdate() == 1){
                return true;
            }
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }finally{
                    try{
                        if(getConexion() != null)getConexion().close();
                        if(pst != null)pst.close();
                    }catch(Exception e){
                        System.err.println("Error "+e);
                    }
                }
        return false;
    }
    
    
    public boolean actualizar_contra(String pass, String mail){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            
            String consulta="";
            consulta = "UPDATE usuarios SET password_usu = ? WHERE mail_usu = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, pass);
            pst.setString(2, mail);
          
            if(pst.executeUpdate() == 1){
                return true;
            }
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }finally{
                    try{
                        if(getConexion() != null)getConexion().close();
                        if(pst != null)pst.close();
                    }catch(Exception e){
                        System.err.println("Error "+e);
                    }
                }
        return false;
    }
    
}
