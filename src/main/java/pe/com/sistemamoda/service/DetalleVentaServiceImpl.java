
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.DetalleVenta;
import pe.com.sistemamoda.repository.DetalleVentaRepository;



@Service
public class DetalleVentaServiceImpl implements DetalleVentaService{
    @Autowired
    private DetalleVentaRepository detalleventaRepository;

    @Override
    public List<DetalleVenta> findAll() {
        return detalleventaRepository.findAll();
    }

    @Override
    public List<DetalleVenta> findAllCustom() {
        return detalleventaRepository.findAllCustom();
    }

    @Override
    public Optional<DetalleVenta> findById(long id) {
        return detalleventaRepository.findById(id);
    }

    @Override
    public DetalleVenta add(DetalleVenta dv) {
        return detalleventaRepository.save(dv);
    }

    @Override
    public DetalleVenta update(DetalleVenta dv) {
        DetalleVenta objdetalle=detalleventaRepository.getById(dv.getCodigo());
        BeanUtils.copyProperties(dv, objdetalle);
        return detalleventaRepository.save(objdetalle);
    }

    @Override
    public DetalleVenta delete(DetalleVenta dv) {
        DetalleVenta objdetalle=detalleventaRepository.getById(dv.getCodigo());
        objdetalle.setEstado(false);
        return detalleventaRepository.save(objdetalle);
    }
}
