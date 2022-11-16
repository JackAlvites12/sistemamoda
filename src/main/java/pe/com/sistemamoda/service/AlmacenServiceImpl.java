
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Almacen;
import pe.com.sistemamoda.repository.AlmacenRepository;


@Service
public class AlmacenServiceImpl implements AlmacenService{
    @Autowired
    private AlmacenRepository almacenRepository;

    @Override
    public List<Almacen> findAll() {
        return almacenRepository.findAll();
    }

    @Override
    public List<Almacen> findAllCustom() {
        return almacenRepository.findAllCustom();
    }

    @Override
    public Optional<Almacen> findById(long id) {
        return almacenRepository.findById(id);
    }

    @Override
    public Almacen add(Almacen a) {
        return almacenRepository.save(a);
    }

    @Override
    public Almacen update(Almacen a) {
        Almacen objalmacen=almacenRepository.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objalmacen);
        return almacenRepository.save(objalmacen);
    }

    @Override
    public Almacen delete(Almacen a) {
        Almacen objalmacen=almacenRepository.getById(a.getCodigo());
        objalmacen.setEstado(false);
        return almacenRepository.save(objalmacen);
    }
}
