
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
import pe.com.sistemamoda.entity.Marca;
import pe.com.sistemamoda.entity.Prenda;
import pe.com.sistemamoda.service.MarcaService;


@RestController
@RequestMapping("/marca")
public class MarcaRestController {
    @Autowired
    private MarcaService marcaService;
    
    @GetMapping
    public List<Marca> findAll(){
        return marcaService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Marca> findAllCustom(){
        return marcaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Marca> findById(@PathVariable Long id){
        return marcaService.findById(id);
    }
    
    @PostMapping
    public Marca add(@RequestBody Marca m){
        return marcaService.add(m);
    }
    
    @PutMapping("/{id}")
    public Marca update(@PathVariable long id, @RequestBody Marca m){
        m.setCodigo(id);
        return marcaService.update(m);
    }
    
    @DeleteMapping("/{id}")
    public Marca delete(@PathVariable long id){
        Marca objmarca=new Marca();
        objmarca.setEstado(false);
        return marcaService.delete(Marca.builder().codigo(id).build());
    } 
}
