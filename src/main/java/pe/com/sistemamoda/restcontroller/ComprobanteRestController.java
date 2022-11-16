
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
import pe.com.sistemamoda.entity.Comprobante;
import pe.com.sistemamoda.service.ComprobanteService;

@RestController
@RequestMapping("/comprobante")
public class ComprobanteRestController {
    @Autowired
    private ComprobanteService comprobanteService;
    
    @GetMapping
    public List<Comprobante> findAll(){
        return comprobanteService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Comprobante> findAllCustom(){
        return comprobanteService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Comprobante> findById(@PathVariable Long id){
        return comprobanteService.findById(id);
    }
    
    @PostMapping
    public Comprobante add(@RequestBody Comprobante c){
        return comprobanteService.add(c);
    }
    
    @PutMapping("/{id}")
    public Comprobante update(@PathVariable long id, @RequestBody Comprobante c){
        c.setCodigo(id);
        return comprobanteService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public Comprobante delete(@PathVariable long id){
        Comprobante objcomprobante=new Comprobante();
        objcomprobante.setEstado(false);
        return comprobanteService.delete(Comprobante.builder().codigo(id).build());
    }
}
