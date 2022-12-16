package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Marca;


public interface MarcaService {
    //Muestra todas las categorias
    public List<Marca> findAll();
    //Muestra sólo los habilitados 
    public List<Marca> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Marca> findById(long id);
    //Para Agregar 
    public Marca add(Marca m);
    //Para Actualizar
    public Marca update(Marca m);
    //Para Eliminar
    public Marca delete(Marca m);
}
