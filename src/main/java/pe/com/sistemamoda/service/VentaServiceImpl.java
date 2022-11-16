
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Venta;
import pe.com.sistemamoda.repository.VentaRepository;


@Service
public class VentaServiceImpl implements VentaService{
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    @Override
    public List<Venta> findAllCustom() {
        return ventaRepository.findAllCustom();
    }

    @Override
    public Optional<Venta> findById(long id) {
        return ventaRepository.findById(id);
    }

    @Override
    public Venta add(Venta v) {
        return ventaRepository.save(v);
    }

    @Override
    public Venta update(Venta v) {
        Venta objventa=ventaRepository.getById(v.getCodigo());
        BeanUtils.copyProperties(v, objventa);
        return ventaRepository.save(objventa);
    }

    @Override
    public Venta delete(Venta v) {
        Venta objventa=ventaRepository.getById(v.getCodigo());
        objventa.setEstado(false);
        return ventaRepository.save(objventa);
    }
}
