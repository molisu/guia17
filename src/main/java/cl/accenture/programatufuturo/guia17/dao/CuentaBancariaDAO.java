package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.excepcion.SinConexionExcepcion;
import cl.accenture.programatufuturo.guia17.model.CuentaBancaria;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CuentaBancariaDAO {

    private Conexion conexion;

    public CuentaBancariaDAO() {
        this.conexion = new Conexion("com.mysql.jdbc.Driver", "localhost", "banco", "root", "sextape0223", 3306);
    }

    public void guardarCuenta(CuentaBancaria cB) throws SinConexionExcepcion {
        try {
            final String SQL = "INSERT INTO CuentaBancaria(idCuenta, saldoDisponible, tipoCuenta) VALUES (?,?,?)";

            PreparedStatement ps = conexion.getConexion().prepareStatement(SQL);
            ps.setString(1, cB.getIdCuenta());
            ps.setInt(2, cB.getSaldoDisponible());
            ps.setString(3, cB.getTipoCuenta());
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
