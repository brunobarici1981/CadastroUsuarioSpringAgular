package services;

import models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioService {
    @Autowired
    private UsuarioService  usuarioService;

    public List<Usuario> findAll() {
        return usuarioService.findAll();
    };
    public Usuario findById(Integer id) {
        return usuarioService.findById(id);
    };
    public Usuario save(Usuario usuario) {
        return usuarioService.save(usuario);
    }
    public Usuario update(Usuario usuario) {
        return usuarioService.save(usuario);
    }
    public void delete(int id) {
        usuarioService.delete(id);
    }


}
