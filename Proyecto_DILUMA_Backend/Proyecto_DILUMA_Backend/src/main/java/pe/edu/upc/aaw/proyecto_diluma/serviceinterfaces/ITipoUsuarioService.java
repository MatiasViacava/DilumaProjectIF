package pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_diluma.entities.TiposUsuario;

import java.util.List;
public interface ITipoUsuarioService {
    public void insert(TiposUsuario tiposUsuario);
    public List<TiposUsuario> list();
    public void delete(int IDTipoUsuario);
    public TiposUsuario listarId(int id);
  
}
