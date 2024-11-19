package pe.edu.upc.aaw.proyecto_diluma.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.proyecto_diluma.entities.Cartera;
import pe.edu.upc.aaw.proyecto_diluma.entities.Letra;
import pe.edu.upc.aaw.proyecto_diluma.entities.TiposUsuario;
import pe.edu.upc.aaw.proyecto_diluma.repositories.ICarteraRepository;
import pe.edu.upc.aaw.proyecto_diluma.repositories.ILetraRepository;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.ICarteraService;

import java.util.List;

@Service

public class CarteraServiceImplement implements ICarteraService {
    @Autowired
    private ICarteraRepository cR;
    @Override
    public void insert(Cartera cartera){cR.save(cartera);}
    @Override
    public List<Cartera> list(){return cR.findAll();}
    @Override
    public void delete(int idcartera) {
        cR.deleteById(idcartera);
    }

    @Override
    public Cartera listarId(int id) {
        return cR.findById(id).orElse(new Cartera());
    }

}
