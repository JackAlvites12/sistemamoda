
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Prenda;

public interface PrendaService {
    //Muestra todas las categorias
    public List<Prenda> findAll();
    //Muestra sólo los habilitados 
    public List<Prenda> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Prenda> findById(long id);
    //Para Agregar 
    public Prenda add(Prenda p);
    //Para Actualizar
    public Prenda update(Prenda p);
    //Para Eliminar
    public Prenda delete(Prenda p);
}
