package com.bytepl.usuarios.model;

import com.bytepl.usuarios.entity.Usuario;

import java.util.Date;

public class MUsuario {
    private int id;

    private String nombre;

    private String apellido;

    private Date fechaIntegracion =  new Date();

    private String telefono;

    private String contrasena;

    public MUsuario() {
    }

    public MUsuario(Usuario usuario) {
        this.apellido  = usuario.getApellido();
        this.contrasena = usuario.getContrasena();
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.telefono = usuario.getTelefono();
        this.fechaIntegracion = usuario.getFechaIntegracion();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaIntegracion() {
        return fechaIntegracion;
    }

    public void setFechaIntegracion(Date fechaIntegracion) {
        this.fechaIntegracion = fechaIntegracion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
