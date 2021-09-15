package com.practica.screemplay.metodopago.utilitis;

public enum Vehiculo {

    AUTOMOVIL(2500, "Auto"),
    MOTOCICLETA(1000,"Moto");

    private Integer valorHora;
    private String tipoVehiculo;

    Vehiculo(Integer valorHora, String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        this.valorHora = valorHora;
    }

    public Integer getValorHora() {
        return valorHora;
    }

    public void setValorHora(Integer valorHora) {
        this.valorHora = valorHora;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


}
