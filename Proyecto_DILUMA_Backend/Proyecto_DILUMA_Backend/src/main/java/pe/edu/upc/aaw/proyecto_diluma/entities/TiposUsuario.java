package pe.edu.upc.aaw.proyecto_diluma.entities;
import javax.persistence.*;

@Entity
@Table(name = "tipos_usuario", uniqueConstraints = { @UniqueConstraint(columnNames = { "usuario_id", "tipo_usuario" }) })
public class TiposUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name = "tipo_usuario",nullable = false, length = 45)
    private String nombreTipoUsuario;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
    private Usuarios usuarios;

    public TiposUsuario() {
    }

    public TiposUsuario(int idTipoUsuario, String nombreTipoUsuario, Usuarios usuarios) {
        this.idTipoUsuario = idTipoUsuario;
        nombreTipoUsuario = nombreTipoUsuario;
        this.usuarios = usuarios;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
