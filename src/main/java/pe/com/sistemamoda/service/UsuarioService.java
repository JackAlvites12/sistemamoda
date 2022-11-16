
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Usuario;


public interface UsuarioService {
    //Muestra todas las categorias
    public List<Usuario> findAll();
    //Muestra sólo los habilitados 
    public List<Usuario> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Usuario> findById(long id);
    //Para Agregar 
    public Usuario add(Usuario u);
    //Para Actualizar
    public Usuario update(Usuario u);
    //Para Eliminar
    public Usuario delete(Usuario u);
}
