package pe.edu.upc.aaw.proyecto_diluma.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_diluma.dtos.LetraDTO;
import pe.edu.upc.aaw.proyecto_diluma.entities.Letra;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.ILetraService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/letras")
public class LetraController {
    @Autowired
    private ILetraService lS;

    @PostMapping
    public void registrar(@RequestBody LetraDTO dto){
        ModelMapper m=new ModelMapper();
        Letra c=m.map(dto,Letra.class);
        lS.insert(c);
    }

    @GetMapping
    public List<LetraDTO> listar(){
        return lS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LetraDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public LetraDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        LetraDTO dto=m.map(lS.listarId(id),LetraDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        lS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody LetraDTO dto){
        ModelMapper m=new ModelMapper();
        Letra c=m.map(dto,Letra.class);
        lS.insert(c);
    }
}
