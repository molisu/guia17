package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.excepcion.SinConexionExcepcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String driver, host, database, user, password;
    private int puerto;

    public Conexion(String driver, String host, String database, String user, String password, int puerto) {
        this.driver = driver;
        this.host = host;
        this.database = database;
        this.user = user;
        this.password = password;
        this.puerto = puerto;
    }

    public Connection getConexion() throws SinConexionExcepcion{
        Connection conexion = null;
        try {
            Class.forName(this.driver);
            System.out.println("Miau");

            conexion =
                    DriverManager.getConnection(
                            "jdbc:mysql://"+this.host+":"+this.puerto+"/"+this.database,
                            this.user,
                            this.password);

            System.out.println("WE DID IT!");
        } catch (ClassNotFoundException e) {
            System.out.println("El driver requerido no esta cargado.");
        } catch (SQLException e) {
            throw new SinConexionExcepcion("NELL PRRO");
        }
        return conexion;
    }
}

