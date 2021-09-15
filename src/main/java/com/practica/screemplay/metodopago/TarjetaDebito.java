package com.practica.screemplay.metodopago;

import com.practica.screemplay.actores.cliente.Usuario;

public class TarjetaDebito extends PagoAbstrapto implements Pago{

    private String NumeroTarjetaDebito;



    private TarjetaDebito(Integer horasEnParqueadero, Usuario cliente) {
        super(horasEnParqueadero, cliente);
    }

    public void setNumeroTarjetaDebito(String numeroTarjetaDebito) {
        NumeroTarjetaDebito = numeroTarjetaDebito;
    }

    private String recibo() {
        return  "El recibo esta a nombre de\t:"
                + cliente.obtenerNombre() + '\n'+
                "Pago con Tarjeta de credito \t:" +'\n'+
                "Costo del parking fue de\t:"+ pagoPorTipoVehiculo()+'\n';
    }

    @Override
    public void generarPago() {
        visualizacionPago();
    }

    @Override
    public String entregaRecibo() {
        return recibo();
    }

    public static  TarjetaDebito inplementacionPago(Integer horasEnParqueadero, Usuario cliente){
        return new TarjetaDebito(horasEnParqueadero,cliente);
    }
}
