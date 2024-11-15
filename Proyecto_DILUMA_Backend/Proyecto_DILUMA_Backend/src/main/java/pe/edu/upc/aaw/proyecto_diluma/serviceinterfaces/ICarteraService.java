package pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_diluma.entities.Cartera;
import pe.edu.upc.aaw.proyecto_diluma.repositories.ICarteraRepository;

import java.util.List;

public interface ICarteraService {

    public void insert(Cartera cartera);
    public List<Cartera> list();
    public void delete(int idcartera);
}
