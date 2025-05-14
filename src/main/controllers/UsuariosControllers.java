package controllers;

import models.Usuario;
import services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios") // Base da rota
public class UsuariosControllers {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/salvar")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable int id) {
        return usuarioService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuarioPorId(@PathVariable int id) {
        usuarioService.delete(id);
    }

    @PutMapping("/atualizar")
    public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }
}
