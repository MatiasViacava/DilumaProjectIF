package pe.edu.upc.aaw.proyecto_diluma.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_diluma.entities.Letra;
import pe.edu.upc.aaw.proyecto_diluma.entities.TiposUsuario;
import pe.edu.upc.aaw.proyecto_diluma.repositories.ILetraRepository;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.ILetraService;

import java.util.List;
@Service
public class LetraServiceImplement implements ILetraService {
    @Autowired
    private ILetraRepository lU;
    @Override
    public void insert(Letra letra){lU.save(letra);}
    @Override
    public List<Letra> list(){return lU.findAll();}
    @Override
    public void delete(int idletra) {
        lU.deleteById(idletra);
    }
    @Override
    public Letra listarId(int id) {
        return lU.findById(id).orElse(new Letra());
    }

}
