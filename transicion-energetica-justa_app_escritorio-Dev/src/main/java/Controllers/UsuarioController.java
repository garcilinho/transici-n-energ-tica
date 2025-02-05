package Controllers;

import Model.Rol;
import Model.Usuario;
import java.util.List;
import Services.UsuarioService;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Leydi
 */
public class UsuarioController {

    public UsuarioService usuarioService;

    public UsuarioController() {
    }

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;

    }

    public List<Usuario> obtenerUsuarios() {

        List<Usuario> usuarios = usuarioService.obtenerUsuarios();
        return usuarios;

    }

    public Usuario obtenerUsuarioByEmail(String email) {

        Usuario usuario = usuarioService.obtenerUsuarioByEmail(email);
        return usuario;

    }

    public Usuario eliminarUsuarioById(long id) {

        Usuario usuario = usuarioService.eliminarUsuarioById(id);
        return usuario;

    }

    public void agregarUsuario(Usuario usuario) {
        try {
            usuarioService.agregarUsuario(usuario);
        } catch (Exception ex) {
        }

    }

    public void actualizarUsuario(Usuario usuario) throws SQLException {
        usuarioService.actualizarUsuario(usuario);
    }

    // Metodo para iniciar sesión
    public boolean iniciarSesion(String email, String contrasenia) {

        boolean porcentajeConsumoElectricoTotalRegion = usuarioService.iniciarSesion(email, contrasenia);
        return porcentajeConsumoElectricoTotalRegion;
    }

    public List<Rol> obtenerListaRol() {

        List<Rol> rol = usuarioService.obtenerListaRol();
        return rol;
    }

}
