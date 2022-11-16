
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Almacen;


public interface AlmacenService {
    //Muestra todas las categorias
    public List<Almacen> findAll();
    //Muestra sólo los habilitados 
    public List<Almacen> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Almacen> findById(long id);
    //Para Agregar 
    public Almacen add(Almacen a);
    //Para Actualizar
    public Almacen update(Almacen a);
    //Para Eliminar
    public Almacen delete(Almacen a);
}
