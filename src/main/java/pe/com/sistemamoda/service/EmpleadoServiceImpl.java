package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Empleado;
import pe.com.sistemamoda.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return empleadoRepository.findAllCustom();
    }

    @Override
    public Optional<Empleado> findById(long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return empleadoRepository.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
        Empleado objempleado=empleadoRepository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objempleado);
        return empleadoRepository.save(objempleado);
    }

    @Override
    public Empleado delete(Empleado e) {
        Empleado objempleado=empleadoRepository.getById(e.getCodigo());
        objempleado.setEstado(false);
        return empleadoRepository.save(objempleado);
    }
}