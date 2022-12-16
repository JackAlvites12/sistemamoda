package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Cliente;


public interface ClienteService {
    //Muestra todas las categorias
    public List<Cliente> findAll();
    //Muestra sólo los habilitados 
    public List<Cliente> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Cliente> findById(long id);
    //Para Agregar 
    public Cliente add(Cliente c);
    //Para Actualizar
    public Cliente update(Cliente c);
    //Para Eliminar
    public Cliente delete(Cliente c);
}
