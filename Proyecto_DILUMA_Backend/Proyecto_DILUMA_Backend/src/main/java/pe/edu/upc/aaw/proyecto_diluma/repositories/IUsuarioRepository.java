package pe.edu.upc.aaw.proyecto_diluma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.proyecto_diluma.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Long> {
	public Usuarios findByUsername(String username);
	
	//BUSCAR POR NOMBRE
	@Query("select count(u.username) from Usuarios u where u.username =:username")
	public int buscarUsername(@Param("username") String nombre);
	
	
	//INSERTAR ROLES
	@Transactional
	@Modifying
	@Query(value = "insert into tipos_usuario (tipo_usuario, usuario_id) VALUES (:tipo_usuario, :usuario_id)", nativeQuery = true)
	public void insRol(@Param("tipo_usuario") String authority, @Param("usuario_id") Long usuario_id);

	@Query(value = "select id from usuarios order by id desc limit 1", nativeQuery = true)
	public int ultimoUsuarioCreado();

	@Transactional
	@Modifying
	@Query(value= "UPDATE usuarios " +
			"SET username=:username, " +
			"password=:password, " +
			"enabled=:enabled, " +
			"nombres=:nombres, " +
			"apellidos=:apellidos, " +
			"correo=:correo, " +
			"dni=:dni, " +
			"telefono=:telefono\n" +
			"WHERE id=:id",nativeQuery = true)
	public void actualizarUsuario(long id,
								  String username,
								  String password,
								  Boolean enabled,
								  String nombres,
								  String apellidos,
								  String correo,
								  String dni,
								  String telefono);
}