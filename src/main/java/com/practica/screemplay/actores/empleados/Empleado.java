package com.practica.screemplay.actores.empleados;

import com.practica.screemplay.personas.Persona;

public class Empleado {
    private Persona empleado;
    private String codigoEmpleado;
    private String cargo;

    public Empleado(String codigoEmpleado){
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Persona getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Persona administrador) {
        this.empleado = administrador;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}
