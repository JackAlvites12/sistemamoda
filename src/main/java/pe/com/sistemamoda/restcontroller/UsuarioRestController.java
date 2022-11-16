
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
import pe.com.sistemamoda.entity.Usuario;
import pe.com.sistemamoda.service.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Usuario> findAllCustom(){
        return usuarioService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    
    @PostMapping
    public Usuario add(@RequestBody Usuario u){
        return usuarioService.add(u);
    }
    
    @PutMapping("/{id}")
    public Usuario update(@PathVariable long id, @RequestBody Usuario u){
        u.setCodigo(id);
        return usuarioService.update(u);
    }
    
    @DeleteMapping("/{id}")
    public Usuario delete(@PathVariable long id){
        Usuario objusuario=new Usuario();
        objusuario.setEstado(false);
        return usuarioService.delete(Usuario.builder().codigo(id).build());
    }
}
