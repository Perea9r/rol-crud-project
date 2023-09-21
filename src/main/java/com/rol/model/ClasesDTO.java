package com.rol.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class ClasesDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String nombre;

    @NotNull
    private Long nivel;

    @NotNull
    private Long vitalidad;

    @NotNull
    private Long fuerza;

    @NotNull
    private Long destreza;

    @NotNull
    private Long percepcion;

    @NotNull
    private Long inteligencia;

    @NotNull
    private Long carisma;

    @NotNull
    private Long suerte;

    @NotNull
    @Size(max = 255)
    private String raza;

    @Size(max = 255)
    private String armas;

    @Size(max = 255)
    private String habilidades;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public Long getNivel() {
        return nivel;
    }

    public void setNivel(final Long nivel) {
        this.nivel = nivel;
    }

    public Long getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(final Long vitalidad) {
        this.vitalidad = vitalidad;
    }

    public Long getFuerza() {
        return fuerza;
    }

    public void setFuerza(final Long fuerza) {
        this.fuerza = fuerza;
    }

    public Long getDestreza() {
        return destreza;
    }

    public void setDestreza(final Long destreza) {
        this.destreza = destreza;
    }

    public Long getPercepcion() {
        return percepcion;
    }

    public void setPercepcion(final Long percepcion) {
        this.percepcion = percepcion;
    }

    public Long getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(final Long inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Long getCarisma() {
        return carisma;
    }

    public void setCarisma(final Long carisma) {
        this.carisma = carisma;
    }

    public Long getSuerte() {
        return suerte;
    }

    public void setSuerte(final Long suerte) {
        this.suerte = suerte;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(final String raza) {
        this.raza = raza;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(final String armas) {
        this.armas = armas;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(final String habilidades) {
        this.habilidades = habilidades;
    }

}
