package cl.accenture.programatufuturo.guia17.model;

public class CuentaBancaria {

    private String idCuenta, tipoCuenta;
    private int saldoDisponible;

    public CuentaBancaria(String idCuenta, String tipoCuenta, int saldoDisponible) {
        this.idCuenta = idCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoDisponible = saldoDisponible;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
