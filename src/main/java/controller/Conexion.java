/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author alann
 */
public class Conexion {
    private String URL = "jdbc:mysql://localhost:3306/dwp?useSSL=false";
    private String USER = "root";
    private String PWD = "8246951753l";
    private String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private Connection conn;
    
    public Conexion(){
    try{
        Class.forName(CLASSNAME);
        conn = DriverManager.getConnection(URL, USER, PWD);
        } catch(ClassNotFoundException e){
            System.err.println("Error"+e);
        }catch(SQLException e){
            System.err.println("Error"+e);
        }
    }
    public Connection getConexion(){
        return conn;
    }
    
    public static void main(String[] args){
        Conexion conn = new Conexion();
    }
    
    
    
}
