
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Rol;


public interface RolService {
    //Muestra todas las categorias
    public List<Rol> findAll();
    //Muestra sólo los habilitados 
    public List<Rol> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Rol> findById(long id);
    //Para Agregar 
    public Rol add(Rol r);
    //Para Actualizar
    public Rol update(Rol r);
    //Para Eliminar
    public Rol delete(Rol r);
}
