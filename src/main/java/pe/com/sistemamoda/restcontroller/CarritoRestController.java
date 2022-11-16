
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
import pe.com.sistemamoda.entity.Carrito;
import pe.com.sistemamoda.service.CarritoService;

@RestController
@RequestMapping("/carrito")
public class CarritoRestController {
    @Autowired
    private CarritoService carritoService;
    
    @GetMapping
    public List<Carrito> findAll(){
        return carritoService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Carrito> findAllCustom(){
        return carritoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Carrito> findById(@PathVariable Long id){
        return carritoService.findById(id);
    }
    
    @PostMapping
    public Carrito add(@RequestBody Carrito ca){
        return carritoService.add(ca);
    }
    
    @PutMapping("/{id}")
    public Carrito update(@PathVariable long id, @RequestBody Carrito ca){
        ca.setCodigo(id);
        return carritoService.update(ca);
    }
    
    @DeleteMapping("/{id}")
    public Carrito delete(@PathVariable long id){
        Carrito objcarrito=new Carrito();
        objcarrito.setEstado(false);
        return carritoService.delete(Carrito.builder().codigo(id).build());
    }
}
