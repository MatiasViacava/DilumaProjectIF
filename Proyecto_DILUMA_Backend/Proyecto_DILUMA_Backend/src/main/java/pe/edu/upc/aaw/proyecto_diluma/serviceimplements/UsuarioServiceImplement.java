package pe.edu.upc.aaw.proyecto_diluma.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_diluma.entities.Usuarios;
import pe.edu.upc.aaw.proyecto_diluma.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository iU;
    @Override
    public void insert(Usuarios datosUsuario) {
        iU.save(datosUsuario);
    }

    @Override
    public List<Usuarios> list() {
        return iU.findAll();
    }

    @Override
    public void delete(long IDUsuario) {
        iU.deleteById(IDUsuario);
    }

    @Override
    public int ultimoUsuarioCreado() {return iU.ultimoUsuarioCreado();}

    @Override
    public Usuarios listarId(Long id) {
        return iU.findById(id).orElse(new Usuarios());
    }

    @Override
    public void actualizarUsuario(long id,
                                  String username,
                                  String password,
                                  Boolean enabled,
                                  String nombres,
                                  String apellidos,
                                  String correo,
                                  String dni,
                                  String telefono) { iU.actualizarUsuario(id,username,password,enabled,nombres,apellidos,correo,dni,telefono);};

}
