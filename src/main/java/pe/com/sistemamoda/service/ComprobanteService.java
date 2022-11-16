
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Comprobante;


public interface ComprobanteService {
    //Muestra todas las categorias
    public List<Comprobante> findAll();
    //Muestra sólo los habilitados 
    public List<Comprobante> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Comprobante> findById(long id);
    //Para Agregar 
    public Comprobante add(Comprobante c);
    //Para Actualizar
    public Comprobante update(Comprobante c);
    //Para Eliminar
    public Comprobante delete(Comprobante c);
}
