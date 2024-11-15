package pe.edu.upc.aaw.proyecto_diluma.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    //Parte de la actualización security
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 200)
    private String password;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<TiposUsuario> tipos_usuario;
    //

    //Datos generales
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;
    @Column(name = "apellidos", length = 50, nullable = false)
    private String apellidos;
    @Column(name = "correo", length = 50, nullable = false)
    private String correo;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "dni", nullable = false)
    private String dni;

    //

    public Usuarios(){}

    public Usuarios(Long id, String username, String password, Boolean enabled, List<TiposUsuario> tipos_usuario, String nombres, String apellidos, String correo, String telefono, String dni) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.tipos_usuario = tipos_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<TiposUsuario> getTipos_usuario() {
        return tipos_usuario;
    }

    public void setTipos_usuario(List<TiposUsuario> tipos_usuario) {
        this.tipos_usuario = tipos_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}