
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Carrito;


public interface CarritoService {
    //Muestra todas las categorias
    public List<Carrito> findAll();
    //Muestra sólo los habilitados 
    public List<Carrito> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Carrito> findById(long id);
    //Para Agregar 
    public Carrito add(Carrito ca);
    //Para Actualizar
    public Carrito update(Carrito ca);
    //Para Eliminar
    public Carrito delete(Carrito ca);
}
