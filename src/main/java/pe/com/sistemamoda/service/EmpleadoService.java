package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Empleado;


public interface EmpleadoService {
    //Muestra todas las categorias
    public List<Empleado> findAll();
    //Muestra sólo los habilitados 
    public List<Empleado> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Empleado> findById(long id);
    //Para Agregar 
    public Empleado add(Empleado e);
    //Para Actualizar
    public Empleado update(Empleado e);
    //Para Eliminar
    public Empleado delete(Empleado e);
}
