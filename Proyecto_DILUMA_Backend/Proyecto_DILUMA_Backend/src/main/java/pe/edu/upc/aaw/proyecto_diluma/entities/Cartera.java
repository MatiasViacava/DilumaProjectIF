package pe.edu.upc.aaw.proyecto_diluma.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cartera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fechaDescuento",nullable = false)
    private LocalDate fechaDescuento;

    @Column(name = "diasXAnio",nullable = false)
    private int diasXAnio;

    @Column(name = "comisionActivacion",nullable = false)
    private double comisionActivacion;

    @Column(name = "comisionActivacionTipo",nullable = false)
    private int comisionActivacionTipo;

    @Column(name = "fotocopias",nullable = false)
    private double fotocopias;

    @Column(name = "fotocopiasTipo",nullable = false)
    private int fotocopiasTipo;

    @Column(name = "estudioDeTitulos",nullable = false)
    private double estudioDeTitulos;

    @Column(name = "estudioDeTitulosTipo",nullable = false)
    private int estudioDeTitulosTipo;

    @Column(name = "gastosAdministrativos",nullable = false)
    private double gastosAdministrativos;

    @Column(name = "gastosAdministrativosTipo",nullable = false)
    private int gastosAdministrativosTipo;

    @Column(name = "portes",nullable = false)
    private double portes;

    @Column(name = "portesTipo",nullable = false)
    private int portesTipo;

    @Column(name = "seguro",nullable = false)
    private double seguro;

    @Column(name = "seguroTipo",nullable = false)
    private int seguroTipo;

    @Column(name = "retencion",nullable = false)
    private double retencion;

    @Column(name = "retencionTipo",nullable = false)
    private int retencionTipo;

    @Column(name = "teaCompensatoria",nullable = false)
    private double teaCompensatoria;

    @Column(name = "nDeInstr",nullable = false)
    private int nDeInstr;

    @Column(name = "totalARecibir",nullable = false)
    private double totalARecibir;

    @Column(name = "tceaCartera",nullable = false)
    private double tceaCartera;

    public Cartera() {}

    public Cartera(int id, LocalDate fechaDescuento, int diasXAnio, double comisionActivacion, int comisionActivacionTipo, double fotocopias, int fotocopiasTipo, double estudioDeTitulos, int estudioDeTitulosTipo, double gastosAdministrativos, int gastosAdministrativosTipo, double portes, int portesTipo, double seguro, int seguroTipo, double retencion, int retencionTipo, double teaCompensatoria, int nDeInstr, double totalARecibir, double tceaCartera) {
        this.id = id;
        this.fechaDescuento = fechaDescuento;
        this.diasXAnio = diasXAnio;
        this.comisionActivacion = comisionActivacion;
        this.comisionActivacionTipo = comisionActivacionTipo;
        this.fotocopias = fotocopias;
        this.fotocopiasTipo = fotocopiasTipo;
        this.estudioDeTitulos = estudioDeTitulos;
        this.estudioDeTitulosTipo = estudioDeTitulosTipo;
        this.gastosAdministrativos = gastosAdministrativos;
        this.gastosAdministrativosTipo = gastosAdministrativosTipo;
        this.portes = portes;
        this.portesTipo = portesTipo;
        this.seguro = seguro;
        this.seguroTipo = seguroTipo;
        this.retencion = retencion;
        this.retencionTipo = retencionTipo;
        this.teaCompensatoria = teaCompensatoria;
        this.nDeInstr = nDeInstr;
        this.totalARecibir = totalARecibir;
        this.tceaCartera = tceaCartera;
    }

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


}
