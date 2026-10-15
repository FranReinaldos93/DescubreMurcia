/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.descubremurcia.modelo;

import java.util.Date;

/**
 *
 * @author Fran
 * 
 * Clase para almacenar los datos del formulario cuando aceptemos la actividad
 */
public class Actividad {
    String nombreCLiente;
    String telfCliente;
    String actividad;
    Date fecha;
    int particicpantes;
    boolean modalida;
    String serviciosAd;
    
    //Constructor

    public Actividad(String nombreCLiente, String telfCliente, String actividad, Date fecha, int particicpantes, boolean modalida, String serviciosAd) {
        this.nombreCLiente = nombreCLiente;
        this.telfCliente = telfCliente;
        this.actividad = actividad;
        this.fecha = fecha;
        this.particicpantes = particicpantes;
        this.modalida = modalida;
        this.serviciosAd = serviciosAd;
    }

    

    
    //Getters & Setters
    public String getNombreCLiente() {
        return nombreCLiente;
    }

    public String getTelfCliente() {
        return telfCliente;
    }

    public String getActividad() {
        return actividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getParticicpantes() {
        return particicpantes;
    }

    public boolean isModalida() {
        return modalida;
    }

    public String getServiciosAd() {
        return serviciosAd;
    }

    public void setNombreCLiente(String nombreCLiente) {
        this.nombreCLiente = nombreCLiente;
    }

    public void setTelfCliente(String telfCliente) {
        this.telfCliente = telfCliente;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setParticicpantes(int particicpantes) {
        this.particicpantes = particicpantes;
    }

    public void setModalida(boolean modalida) {
        this.modalida = modalida;
    }

    public void setServiciosAd(String serviciosAd) {
        this.serviciosAd = serviciosAd;
    }
    
    //Metodos
            //Metodo para imprimir el tipo de actividad dependiendo del tipo de actividad
    public String cambiarModalidad(){
        
        String nmodalidad;
    
        if (this.modalida==true) {nmodalidad="Individual";}
        else {nmodalidad="Grupo";}
        return nmodalidad;
    }

    @Override
    public String toString() {
        return "ACTIVIDAD REGISTRADA: "+ "\n" + 
                "Nombre del Cliente: " + nombreCLiente + "\n"+
                "Teléfono: " + telfCliente + "\n"+
                "Actividad a realizar: " + actividad + "\n"+
                "Fecha: " + fecha + "\n"+
                "Nº de Participantes: " 
                + particicpantes + "\n"+
                "En la modalidad: " + cambiarModalidad() + "\n"+
                "Con los siguientes servicios adicionales: " 
                + serviciosAd ;
    }
    
    
    
    
    
}
