package pe.edu.upc.aaw.proyecto_diluma.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_diluma.dtos.CarteraDTO;
import pe.edu.upc.aaw.proyecto_diluma.entities.Cartera;
import pe.edu.upc.aaw.proyecto_diluma.serviceinterfaces.ICarteraService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carteras")
public class CarteraController {
    @Autowired
    private ICarteraService cC;

    @PostMapping
    public void registrar(@RequestBody CarteraDTO dto){
        ModelMapper m=new ModelMapper();
        Cartera c=m.map(dto,Cartera.class);
        cC.insert(c);
    }

    @GetMapping
    public List<CarteraDTO> listar(){
        return cC.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CarteraDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        cC.delete(id);
    }

    @GetMapping("/{id}")
    public CarteraDTO listarId(@PathVariable("id") int  id) {
        ModelMapper m=new ModelMapper();
        CarteraDTO dto=m.map(cC.listarId(id),CarteraDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CarteraDTO dto){
        ModelMapper m=new ModelMapper();
        Cartera c=m.map(dto,Cartera.class);
        cC.insert(c);
    }
}
