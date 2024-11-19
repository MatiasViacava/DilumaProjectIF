package pe.edu.upc.aaw.proyecto_diluma.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_diluma.dtos.UsuarioDTO;
import pe.edu.upc.aaw.proyecto_diluma.entities.Usuarios;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.IUsuarioService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uR;

    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuarios i = m.map(dto, Usuarios.class);
        uR.insert(i);
    }

    @GetMapping
    public List<UsuarioDTO> listar(){
        return uR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        uR.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuarios d=m.map(dto, Usuarios.class);
        uR.insert(d);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Long  id) {
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uR.listarId(id),UsuarioDTO.class);
        return dto;
    }

    @GetMapping("/actualizar/{id2}/{username}/{password}/{enabled}/{nombres}/{apellidos}/{correo}/{dni}/{telefono}")
    public void actualizardatos(@PathVariable("id2") Long id2, @PathVariable("username") String username,
                                @PathVariable("password") String password, @PathVariable("enabled") Boolean enabled, @PathVariable("nombres") String nombres,
                                @PathVariable("apellidos") String apellidos, @PathVariable("correo") String correo, @PathVariable("dni") String dni,
                                @PathVariable("telefono") String telefono)
    {
        uR.actualizarUsuario(id2,username,password,enabled,nombres,apellidos,correo,dni,telefono);
    }

    @GetMapping("/ultimousuariocreado")
    public int ultimoUsuarioCreado()
    {
        return uR.ultimoUsuarioCreado();
    }
}
