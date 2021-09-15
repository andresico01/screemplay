package com.practica.screemplay.metodopago;

public interface Pago {

    void generarPago();
    default String entregaRecibo() {
        return "No hay Pago Registrado";
    }
}
