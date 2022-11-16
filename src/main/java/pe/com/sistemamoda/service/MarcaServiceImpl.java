
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Marca;
import pe.com.sistemamoda.repository.MarcaRepository;


@Service
public class MarcaServiceImpl implements MarcaService{
    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public List<Marca> findAllCustom() {
        return marcaRepository.findAllCustom();
    }

    @Override
    public Optional<Marca> findById(long id) {
        return marcaRepository.findById(id);
    }

    @Override
    public Marca add(Marca m) {
        return marcaRepository.save(m);
    }

    @Override
    public Marca update(Marca m) {
        Marca objmarca=marcaRepository.getById(m.getCodigo());
        BeanUtils.copyProperties(m, objmarca);
        return marcaRepository.save(objmarca);
    }

    @Override
    public Marca delete(Marca m) {
        Marca objmarca=marcaRepository.getById(m.getCodigo());
        objmarca.setEstado(false);
        return marcaRepository.save(objmarca);
    }
}
