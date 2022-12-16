package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Venta;


public interface VentaService {
    //Muestra todas las categorias
    public List<Venta> findAll();
    //Muestra sólo los habilitados 
    public List<Venta> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Venta> findById(long id);
    //Para Agregar 
    public Venta add(Venta v);
    //Para Actualizar
    public Venta update(Venta v);
    //Para Eliminar
    public Venta delete(Venta v); 
}
