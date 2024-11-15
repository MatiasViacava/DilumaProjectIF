package pe.edu.upc.aaw.proyecto_diluma.dtos;

import pe.edu.upc.aaw.proyecto_diluma.entities.Cartera;
import pe.edu.upc.aaw.proyecto_diluma.entities.Usuarios;

import javax.persistence.*;
import java.time.LocalDate;

public class LetraDTO {
    private int id;

    private CarteraDTO idCartera;

    private UsuarioDTO idUsuario;

    private LocalDate fechaDeGiro;

    private double valorNominal;

    private LocalDate fechaDeDscto;

    private int nDias;

    private double tep;

    private double d;

    private double descuento;

    private double costesIniciales;

    private double costesFinales;

    private double seguro;

    private double retencion;

    private double valorNeto;

    private double valorARecibir;

    private double flujo;

    private double tcea;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarteraDTO getIdCartera() {
        return idCartera;
    }

    public void setIdCartera(CarteraDTO idCartera) {
        this.idCartera = idCartera;
    }

    public UsuarioDTO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioDTO idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDate getFechaDeGiro() {
        return fechaDeGiro;
    }

    public void setFechaDeGiro(LocalDate fechaDeGiro) {
        this.fechaDeGiro = fechaDeGiro;
    }

    public double getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(double valorNominal) {
        this.valorNominal = valorNominal;
    }

    public LocalDate getFechaDeDscto() {
        return fechaDeDscto;
    }

    public void setFechaDeDscto(LocalDate fechaDeDscto) {
        this.fechaDeDscto = fechaDeDscto;
    }

    public int getnDias() {
        return nDias;
    }

    public void setnDias(int nDias) {
        this.nDias = nDias;
    }

    public double getTep() {
        return tep;
    }

    public void setTep(double tep) {
        this.tep = tep;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getCostesIniciales() {
        return costesIniciales;
    }

    public void setCostesIniciales(double costesIniciales) {
        this.costesIniciales = costesIniciales;
    }

    public double getCostesFinales() {
        return costesFinales;
    }

    public void setCostesFinales(double costesFinales) {
        this.costesFinales = costesFinales;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public double getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(double valorNeto) {
        this.valorNeto = valorNeto;
    }

    public double getValorARecibir() {
        return valorARecibir;
    }

    public void setValorARecibir(double valorARecibir) {
        this.valorARecibir = valorARecibir;
    }

    public double getFlujo() {
        return flujo;
    }

    public void setFlujo(double flujo) {
        this.flujo = flujo;
    }

    public double getTcea() {
        return tcea;
    }

    public void setTcea(double tcea) {
        this.tcea = tcea;
    }
}
