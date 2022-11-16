
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Comprobante;
import pe.com.sistemamoda.repository.ComprobanteRepository;



@Service
public class ComprobanteServiceImpl implements ComprobanteService{
    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @Override
    public List<Comprobante> findAll() {
        return comprobanteRepository.findAll();
    }

    @Override
    public List<Comprobante> findAllCustom() {
        return comprobanteRepository.findAllCustom();
    }

    @Override
    public Optional<Comprobante> findById(long id) {
        return comprobanteRepository.findById(id);
    }

    @Override
    public Comprobante add(Comprobante c) {
        return comprobanteRepository.save(c);
    }

    @Override
    public Comprobante update(Comprobante c) {
        Comprobante objcomprobante=comprobanteRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcomprobante);
        return comprobanteRepository.save(objcomprobante);
    }

    @Override
    public Comprobante delete(Comprobante c) {
        Comprobante objcomprobante=comprobanteRepository.getById(c.getCodigo());
        objcomprobante.setEstado(false);
        return comprobanteRepository.save(objcomprobante);
    }
}
