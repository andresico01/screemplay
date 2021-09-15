package com.practica.screemplay.metodopago;

public enum EstadoPago {
    PAGO_EXITOSO("El pago fue registrado", true),
    PAGO_SIN_REALIZAR("El pago no se registra aun", false);

    private String notaDePago;
    private boolean estadoPago;

    EstadoPago(String notaDePago,boolean estadoPago ) {
        this.notaDePago = notaDePago;
        this.estadoPago = estadoPago;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoPago() {
        return notaDePago;
    }

    public void setEstadoPago(String notaDePago) {
        this.notaDePago = notaDePago;
    }
}
