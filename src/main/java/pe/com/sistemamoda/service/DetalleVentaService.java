
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.DetalleVenta;


public interface DetalleVentaService {
    //Muestra todas las categorias
    public List<DetalleVenta> findAll();
    //Muestra sólo los habilitados 
    public List<DetalleVenta> findAllCustom();
    //Este permite buscar por codigo
    public Optional<DetalleVenta> findById(long id);
    //Para Agregar 
    public DetalleVenta add(DetalleVenta dv);
    //Para Actualizar
    public DetalleVenta update(DetalleVenta dv);
    //Para Eliminar
    public DetalleVenta delete(DetalleVenta dv);
}
