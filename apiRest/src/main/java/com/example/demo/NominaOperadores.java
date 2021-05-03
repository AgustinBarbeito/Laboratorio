package com.example.demo;

public class NominaOperadores {
    private String rnpspnro;
    private String titulo;
    private String nombreComercial;
    private String direccion;
    private String codigoPostal;
    private String telefono;
    private String fax;


    public NominaOperadores(String rnpspnro, String titulo, String nombreComercial, String direccion, String codigoPostal, String telefono, String fax) {
        this.rnpspnro = rnpspnro;
        this.titulo = titulo;
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.fax = fax;
    }

    public String getRnpspnro() {

        return rnpspnro;
    }

    public void setrnpspnro(String rnpspnro) {

        this.rnpspnro = rnpspnro;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getnombreComercial() {

        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {

        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public String getCodigoPostal() {

        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {

        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {

        return telefono;
    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }

    public String getFax() {

        return fax;
    }

    public void setFaxs(String fax) {

        this.fax = fax;
    }

}
