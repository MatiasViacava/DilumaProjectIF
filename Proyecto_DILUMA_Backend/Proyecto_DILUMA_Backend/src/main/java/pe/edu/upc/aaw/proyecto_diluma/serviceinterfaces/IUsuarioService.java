package pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_diluma.entities.Usuarios;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuarios datosUsuario);
    public List<Usuarios> list();
    public void delete(long IDUsuario);
    public int ultimoUsuarioCreado();
    public Usuarios listarId(Long id);
    public void actualizarUsuario(long id,
                                  String username,
                                  String password,
                                  Boolean enabled,
                                  String nombres,
                                  String apellidos,
                                  String correo,
                                  String dni,
                                  String telefono);
}