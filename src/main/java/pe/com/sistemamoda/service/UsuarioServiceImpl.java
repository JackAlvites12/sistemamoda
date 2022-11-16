
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Usuario;
import pe.com.sistemamoda.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> findAllCustom() {
        return usuarioRepository.findAllCustom();
    }

    @Override
    public Optional<Usuario> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario add(Usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public Usuario update(Usuario u) {
        Usuario objusuario=usuarioRepository.getById(u.getCodigo());
        BeanUtils.copyProperties(u, objusuario);
        return usuarioRepository.save(objusuario);
    }

    @Override
    public Usuario delete(Usuario u) {
        Usuario objusuario=usuarioRepository.getById(u.getCodigo());
        objusuario.setEstado(false);
        return usuarioRepository.save(objusuario);
    }
}
