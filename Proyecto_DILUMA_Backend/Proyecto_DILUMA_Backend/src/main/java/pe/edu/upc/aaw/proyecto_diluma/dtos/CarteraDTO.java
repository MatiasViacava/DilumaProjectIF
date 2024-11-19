package pe.edu.upc.aaw.proyecto_diluma.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class CarteraDTO {
    private int id;

    private LocalDate fechaDescuento;

    private int diasXAnio;

    private double comisionActivacion;

    private int comisionActivacionTipo;

    private double fotocopias;

    private int fotocopiasTipo;

    private double estudioDeTitulos;

    private int estudioDeTitulosTipo;

    private double gastosAdministrativos;

    private int gastosAdministrativosTipo;

    private double portes;

    private int portesTipo;

    private double seguro;

    private int seguroTipo;

    private double retencion;

    private int retencionTipo;

    private double teaCompensatoria;

    private int nDeInstr;

    private double totalARecibir;

    private double tceaCartera;

    private int tipoMoneda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaDescuento() {
        return fechaDescuento;
    }

    public void setFechaDescuento(LocalDate fechaDescuento) {
        this.fechaDescuento = fechaDescuento;
    }

    public int getDiasXAnio() {
        return diasXAnio;
    }

    public void setDiasXAnio(int diasXAnio) {
        this.diasXAnio = diasXAnio;
    }

    public double getComisionActivacion() {
        return comisionActivacion;
    }

    public void setComisionActivacion(double comisionActivacion) {
        this.comisionActivacion = comisionActivacion;
    }

    public int getComisionActivacionTipo() {
        return comisionActivacionTipo;
    }

    public void setComisionActivacionTipo(int comisionActivacionTipo) {
        this.comisionActivacionTipo = comisionActivacionTipo;
    }

    public double getFotocopias() {
        return fotocopias;
    }

    public void setFotocopias(double fotocopias) {
        this.fotocopias = fotocopias;
    }

    public int getFotocopiasTipo() {
        return fotocopiasTipo;
    }

    public void setFotocopiasTipo(int fotocopiasTipo) {
        this.fotocopiasTipo = fotocopiasTipo;
    }

    public double getEstudioDeTitulos() {
        return estudioDeTitulos;
    }

    public void setEstudioDeTitulos(double estudioDeTitulos) {
        this.estudioDeTitulos = estudioDeTitulos;
    }

    public int getEstudioDeTitulosTipo() {
        return estudioDeTitulosTipo;
    }

    public void setEstudioDeTitulosTipo(int estudioDeTitulosTipo) {
        this.estudioDeTitulosTipo = estudioDeTitulosTipo;
    }

    public double getGastosAdministrativos() {
        return gastosAdministrativos;
    }

    public void setGastosAdministrativos(double gastosAdministrativos) {
        this.gastosAdministrativos = gastosAdministrativos;
    }

    public int getGastosAdministrativosTipo() {
        return gastosAdministrativosTipo;
    }

    public void setGastosAdministrativosTipo(int gastosAdministrativosTipo) {
        this.gastosAdministrativosTipo = gastosAdministrativosTipo;
    }

    public double getPortes() {
        return portes;
    }

    public void setPortes(double portes) {
        this.portes = portes;
    }

    public int getPortesTipo() {
        return portesTipo;
    }

    public void setPortesTipo(int portesTipo) {
        this.portesTipo = portesTipo;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public int getSeguroTipo() {
        return seguroTipo;
    }

    public void setSeguroTipo(int seguroTipo) {
        this.seguroTipo = seguroTipo;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getRetencionTipo() {
        return retencionTipo;
    }

    public void setRetencionTipo(int retencionTipo) {
        this.retencionTipo = retencionTipo;
    }

    public double getTeaCompensatoria() {
        return teaCompensatoria;
    }

    public void setTeaCompensatoria(double teaCompensatoria) {
        this.teaCompensatoria = teaCompensatoria;
    }

    public int getnDeInstr() {
        return nDeInstr;
    }

    public void setnDeInstr(int nDeInstr) {
        this.nDeInstr = nDeInstr;
    }

    public double getTotalARecibir() {
        return totalARecibir;
    }

    public void setTotalARecibir(double totalARecibir) {
        this.totalARecibir = totalARecibir;
    }

    public double getTceaCartera() {
        return tceaCartera;
    }

    public void setTceaCartera(double tceaCartera) {
        this.tceaCartera = tceaCartera;
    }

    public int getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(int tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
}
