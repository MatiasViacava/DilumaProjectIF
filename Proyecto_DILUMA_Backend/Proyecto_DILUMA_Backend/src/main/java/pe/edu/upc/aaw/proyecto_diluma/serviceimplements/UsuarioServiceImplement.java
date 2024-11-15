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
}
