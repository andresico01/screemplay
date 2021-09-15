package com.practica.screemplay.local;

public class LocalMonteria extends Local{

    private static final Integer CUPO_TOPE_DE_PARKING = 18;


    public LocalMonteria(Integer numeroDePuestos) {
        super(numeroDePuestos);
    }

    private void entradaVehiculo(){
        if (this.numeroDePuestos > 1){
            this.numeroDePuestos --;
        }else if(this.numeroDePuestos == 1){
            this.numeroDePuestos --;
            System.out.println("Ultimo espacio en el parking");
        }else {
            System.out.println("Ya no hay cupo en le parking");
        }
    }

    private void salidaVehiculo(){
        if (this.numeroDePuestos <= CUPO_TOPE_DE_PARKING){
            this.numeroDePuestos++;
        }else {
            System.out.println("todos los cupos estan libres.");
        }
    }

    public void ocupacionParking(boolean controlIngresoSalida){
        if(controlIngresoSalida){
            entradaVehiculo();
        }else {
            salidaVehiculo();
        }

    }

}
