package pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_diluma.entities.Usuarios;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuarios datosUsuario);
    public List<Usuarios> list();
    public void delete(long IDUsuario);
}
