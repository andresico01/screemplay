package com.practica.screemplay.metodopago;

import com.practica.screemplay.actores.cliente.Usuario;

public class TarjetaCredito extends PagoAbstrapto implements Pago{

    private String NumeroTarjetaCredito;
    private String codigoBerificacion;

    private TarjetaCredito(Integer horasEnParqueadero, Usuario cliente) {
        super(horasEnParqueadero, cliente);
    }

    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        NumeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void setCodigoBerificacion(String codigoBerificacion) {
        this.codigoBerificacion = codigoBerificacion;
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

    public static  TarjetaCredito inplementacionPago(Integer horasEnParqueadero, Usuario cliente){
        return new TarjetaCredito(horasEnParqueadero,cliente);
    }
}
