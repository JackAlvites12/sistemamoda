
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Carrito;
import pe.com.sistemamoda.repository.CarritoRepository;



@Service
public class CarritoServiceImpl implements CarritoService{
    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> findAll() {
        return carritoRepository.findAll();
    }

    @Override
    public List<Carrito> findAllCustom() {
        return carritoRepository.findAllCustom();
    }

    @Override
    public Optional<Carrito> findById(long id) {
        return carritoRepository.findById(id);
    }

    @Override
    public Carrito add(Carrito ca) {
        return carritoRepository.save(ca);
    }

    @Override
    public Carrito update(Carrito ca) {
        Carrito objcarrito=carritoRepository.getById(ca.getCodigo());
        BeanUtils.copyProperties(ca, objcarrito);
        return carritoRepository.save(objcarrito);
    }

    @Override
    public Carrito delete(Carrito ca) {
        Carrito objcarrito=carritoRepository.getById(ca.getCodigo());
        objcarrito.setEstado(false);
        return carritoRepository.save(objcarrito);
    }
}
