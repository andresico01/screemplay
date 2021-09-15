package com.practica.screemplay.metodopago;

import com.practica.screemplay.actores.cliente.Usuario;

public class Efectivo extends PagoAbstrapto implements Pago {

    private Integer pagoParking;


    private Efectivo(Integer horasEnParqueadero, Usuario cliente) {
        super(horasEnParqueadero, cliente);
    }


    public void setPagoParking(Integer pagoParking) {
        this.pagoParking = pagoParking;
    }

    private EstadoPago parkingPagado(){
        return pagoParking < pagoPorTipoVehiculo()? EstadoPago.PAGO_SIN_REALIZAR: EstadoPago.PAGO_EXITOSO;

    }

    private Integer vueltoParking(){
        return parkingPagado().isEstadoPago()? pagoParking - pagoPorTipoVehiculo() : null;
    }

    private String recibo() {
        return  "El recibo esta a nombre de\t:"
                + cliente.obtenerNombre() + '\n'+
                "El efectivo recibido es\t:" + pagoParking + '\n'+
                "Costo del parking fue de\t:"+ pagoPorTipoVehiculo()+'\n'+
                "Cambio es\t:" + vueltoParking();
    }

    @Override
    public void generarPago() {
        visualizacionPago();
    }

    @Override
    public String entregaRecibo() {
        return recibo();
    }

    public static Efectivo inplementacionPago(Integer horasEnParqueadero, Usuario cliente){
        return new Efectivo(horasEnParqueadero,cliente);
    }


}
