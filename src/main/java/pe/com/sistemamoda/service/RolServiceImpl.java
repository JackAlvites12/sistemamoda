
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Rol;
import pe.com.sistemamoda.repository.RolRepository;



@Service
public class RolServiceImpl implements RolService{
    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public List<Rol> findAllCustom() {
        return rolRepository.findAllCustom();
    }

    @Override
    public Optional<Rol> findById(long id) {
        return rolRepository.findById(id);
    }

    @Override
    public Rol add(Rol r) {
        return rolRepository.save(r);
    }

    @Override
    public Rol update(Rol r) {
        Rol objrol=rolRepository.getById(r.getCodigo());
        BeanUtils.copyProperties(r, objrol);
        return rolRepository.save(objrol);
    }

    @Override
    public Rol delete(Rol r) {
        Rol objrol=rolRepository.getById(r.getCodigo());
        objrol.setEstado(false);
        return rolRepository.save(objrol);
    }
}
