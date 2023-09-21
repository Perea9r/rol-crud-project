package com.rol.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Clases {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Long nivel;

    @Column(nullable = false)
    private Long vitalidad;

    @Column(nullable = false)
    private Long fuerza;

    @Column(nullable = false)
    private Long destreza;

    @Column(nullable = false)
    private Long percepcion;

    @Column(nullable = false)
    private Long inteligencia;

    @Column(nullable = false)
    private Long carisma;

    @Column(nullable = false)
    private Long suerte;

    @Column(nullable = false)
    private String raza;

    @Column
    private String armas;

    @Column
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
