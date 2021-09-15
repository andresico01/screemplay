package com.practica.screemplay.metodopago;

import com.practica.screemplay.actores.cliente.Usuario;

public abstract class PagoAbstrapto {

    protected Integer horasEnParqueadero;
    protected Usuario cliente;

    public PagoAbstrapto(Integer horasEnParqueadero, Usuario cliente) {
        this.horasEnParqueadero = horasEnParqueadero;
        this.cliente = cliente;
    }

    public void setHorasEnParqueadero(Integer horasEnParqueadero) {
        this.horasEnParqueadero = horasEnParqueadero;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Integer getHorasEnParqueadero() {
        return horasEnParqueadero;
    }

    protected Integer pagoPorTipoVehiculo(){
        return cliente.obtenerVeiculo().getValorHora() * horasEnParqueadero;
    }

    protected void visualizacionPago(){
        System.out.println("Numero\t"+cliente.obtenerMatriculaAuto());
        System.out.println("Cliente\t"+cliente.obtenerNombre());
        System.out.println("El pago total por Parking es :\t"+ pagoPorTipoVehiculo());
    }

}
