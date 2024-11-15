package pe.edu.upc.aaw.proyecto_diluma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.proyecto_diluma.entities.TiposUsuario;
@Repository
public interface ITiposUsuarioRepository extends JpaRepository<TiposUsuario, Integer> {

}