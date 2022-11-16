
package pe.com.sistemamoda.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sistemamoda.entity.Almacen;
import pe.com.sistemamoda.service.AlmacenService;


@RestController
@RequestMapping("/almacen")
public class AlmacenRestController {
    @Autowired
    private AlmacenService almacenService;
    
    @GetMapping
    public List<Almacen> findAll(){
        return almacenService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Almacen> findAllCustom(){
        return almacenService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Almacen> findById(@PathVariable Long id){
        return almacenService.findById(id);
    }
    
    @PostMapping
    public Almacen add(@RequestBody Almacen a){
        return almacenService.add(a);
    }
    
    @PutMapping("/{id}")
    public Almacen update(@PathVariable long id, @RequestBody Almacen a){
        a.setCodigo(id);
        return almacenService.update(a);
    }
    
    @DeleteMapping("/{id}")
    public Almacen delete(@PathVariable long id){
        Almacen objalmacen=new Almacen();
        objalmacen.setEstado(false);
        return almacenService.delete(Almacen.builder().codigo(id).build());
    }
}
