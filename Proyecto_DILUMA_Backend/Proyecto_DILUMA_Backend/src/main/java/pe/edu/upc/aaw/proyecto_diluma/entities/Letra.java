package pe.edu.upc.aaw.proyecto_diluma.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Letra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idCartera")
    private Cartera idCartera;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios idUsuario;

    @Column(name = "fechaDeGiro",nullable = false)
    private LocalDate fechaDeGiro;

    @Column(name = "valorNominal",nullable = false)
    private double valorNominal;

    @Column(name = "fechaDeDscto",nullable = false)
    private LocalDate fechaDeDscto;

    @Column(name = "nDias",nullable = false)
    private int nDias;

    @Column(name = "tep",nullable = false)
    private double tep;

    @Column(name = "d",nullable = false)
    private double d;

    @Column(name = "descuento",nullable = false)
    private double descuento;

    @Column(name = "costesIniciales",nullable = false)
    private double costesIniciales;

    @Column(name = "costesFinales",nullable = false)
    private double costesFinales;

    @Column(name = "seguro",nullable = false)
    private double seguro;

    @Column(name = "retencion",nullable = false)
    private double retencion;

    @Column(name = "valorNeto",nullable = false)
    private double valorNeto;

    @Column(name = "valorARecibir",nullable = false)
    private double valorARecibir;

    @Column(name = "flujo",nullable = false)
    private double flujo;

    @Column(name = "tcea",nullable = false)
    private double tcea;

    public Letra(){}

    public Letra(int id, Cartera idCartera, Usuarios idUsuario, LocalDate fechaDeGiro, double valorNominal, LocalDate fechaDeDscto, int nDias, double tep, double d, double descuento, double costesIniciales, double costesFinales, double seguro, double retencion, double valorNeto, double valorARecibir, double flujo, double tcea) {
        this.id = id;
        this.idCartera = idCartera;
        this.idUsuario = idUsuario;
        this.fechaDeGiro = fechaDeGiro;
        this.valorNominal = valorNominal;
        this.fechaDeDscto = fechaDeDscto;
        this.nDias = nDias;
        this.tep = tep;
        this.d = d;
        this.descuento = descuento;
        this.costesIniciales = costesIniciales;
        this.costesFinales = costesFinales;
        this.seguro = seguro;
        this.retencion = retencion;
        this.valorNeto = valorNeto;
        this.valorARecibir = valorARecibir;
        this.flujo = flujo;
        this.tcea = tcea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cartera getIdCartera() {
        return idCartera;
    }

    public void setIdCartera(Cartera idCartera) {
        this.idCartera = idCartera;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
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
