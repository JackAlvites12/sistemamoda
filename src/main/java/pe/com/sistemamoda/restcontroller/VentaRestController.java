
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
import pe.com.sistemamoda.entity.Venta;
import pe.com.sistemamoda.service.VentaService;


@RestController
@RequestMapping("/venta")
public class VentaRestController {
    @Autowired
    private VentaService ventaService;
    
    @GetMapping
    public List<Venta> findAll(){
        return ventaService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Venta> findAllCustom(){
        return ventaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Venta> findById(@PathVariable Long id){
        return ventaService.findById(id);
    }
    
    @PostMapping
    public Venta add(@RequestBody Venta v){
        return ventaService.add(v);
    }
    
    @PutMapping("/{id}")
    public Venta update(@PathVariable long id, @RequestBody Venta v){
        v.setCodigo(id);
        return ventaService.update(v);
    }
    
    @DeleteMapping("/{id}")
    public Venta delete(@PathVariable long id){
        Venta objventa=new Venta();
        objventa.setEstado(false);
        return ventaService.delete(Venta.builder().codigo(id).build());
    }
}
