package pe.edu.upc.aaw.proyecto_diluma.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_diluma.dtos.TiposUsuarioDTO;
import pe.edu.upc.aaw.proyecto_diluma.entities.TiposUsuario;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.ITipoUsuarioService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/tiposusuarios")
public class TiposUsuarioController {
    @Autowired
    private ITipoUsuarioService tR;

    @PostMapping
    public void registrar(@RequestBody TiposUsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        TiposUsuario d = m.map(dto, TiposUsuario.class);
        tR.insert(d);
    }

    @GetMapping
    public List<TiposUsuarioDTO> listar(){
        return tR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TiposUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TiposUsuarioDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        TiposUsuarioDTO dto=m.map(tR.listarId(id),TiposUsuarioDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        tR.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody TiposUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        TiposUsuario d=m.map(dto, TiposUsuario.class);
        tR.insert(d);
    }
}
