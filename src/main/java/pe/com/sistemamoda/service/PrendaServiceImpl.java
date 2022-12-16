package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Prenda;
import pe.com.sistemamoda.repository.PrendaRepository;

@Service
public class PrendaServiceImpl implements PrendaService{
    @Autowired
    private PrendaRepository prendaRepository;

    @Override
    public List<Prenda> findAll() {
        return prendaRepository.findAll();
    }

    @Override
    public List<Prenda> findAllCustom() {
        return prendaRepository.findAllCustom();
    }

    @Override
    public Optional<Prenda> findById(long id) {
        return prendaRepository.findById(id);
    }

    @Override
    public Prenda add(Prenda p) {
        return prendaRepository.save(p);
    }

    @Override
    public Prenda update(Prenda p) {
        Prenda objprenda=prendaRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objprenda);
        return prendaRepository.save(objprenda);
    }

    @Override
    public Prenda delete(Prenda p) {
        Prenda objprenda=prendaRepository.getById(p.getCodigo());
        objprenda.setEstado(false);
        return prendaRepository.save(objprenda);
    }
}
