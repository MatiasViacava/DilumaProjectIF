package pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces;

import pe.edu.upc.aaw.proyecto_diluma.entities.Letra;

import java.util.List;

public interface ILetraService {
    public void insert(Letra letra);
    public List<Letra> list();
    public void delete(int idletra);
    public Letra listarId(int id);
}
