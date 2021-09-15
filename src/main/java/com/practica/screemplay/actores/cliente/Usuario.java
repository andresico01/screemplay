package com.practica.screemplay.actores.cliente;

import com.practica.screemplay.metodopago.utilitis.Vehiculo;
import com.practica.screemplay.personas.Persona;

public class Usuario {

    private Persona cliente;
    private String matriculaAuto;
    private Vehiculo vehiculo;

    protected Usuario(Persona cliente,String matriculaAuto) {
        this.cliente = cliente;
        this.matriculaAuto = matriculaAuto;
    }

    private Vehiculo tipoVehiculo(String auto){
        return auto.equals(Vehiculo.AUTOMOVIL.getTipoVehiculo()) ? Vehiculo.AUTOMOVIL : Vehiculo.MOTOCICLETA;
    }

    public void seleccionarVehiculo(String auto) {
        this.vehiculo = tipoVehiculo(auto);
    }

    public Vehiculo obtenerVeiculo(){
        return vehiculo;
    }

    public String obtenerMatriculaAuto() {
        return matriculaAuto;
    }

    public void setMatriculaAuto(String matriculaAuto) {
        this.matriculaAuto = matriculaAuto;
    }

    public String obtenerNombre(){
        return cliente.toString();
    }



}
