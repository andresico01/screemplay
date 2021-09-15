package com.practica.screemplay.local;

import com.practica.screemplay.actores.empleados.Empleado;

import java.util.List;

public abstract class Local {



    protected List<Empleado> numeroEmpleados;
    protected Integer numeroDePuestos;

    public Local(Integer numeroDePuestos) {
        this.numeroDePuestos = numeroDePuestos;
    }

    public List<Empleado> getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(List<Empleado> numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public void agregarEmpleado(Empleado nuevoEmpleado){
        this.numeroEmpleados.add(nuevoEmpleado);
    }

    public Integer getNumeroDePuestos() {
        return numeroDePuestos;
    }

    public void setNumeroDePuestos(Integer numeroDePuestos) {
        this.numeroDePuestos = numeroDePuestos;
    }
}
