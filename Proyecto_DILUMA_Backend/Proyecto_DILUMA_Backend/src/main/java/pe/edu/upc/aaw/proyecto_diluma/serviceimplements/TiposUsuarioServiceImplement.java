package pe.edu.upc.aaw.proyecto_diluma.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_diluma.entities.TiposUsuario;
import pe.edu.upc.aaw.proyecto_diluma.repositories.ITiposUsuarioRepository;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TiposUsuarioServiceImplement implements ITipoUsuarioService {
    @Autowired
    private ITiposUsuarioRepository tR;

    @Override
    public void insert(TiposUsuario tiposUsuario) {
        tR.save(tiposUsuario);
    }

    @Override
    public List<TiposUsuario> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTipoUsuario) {
        tR.deleteById(idTipoUsuario);
    }
}
