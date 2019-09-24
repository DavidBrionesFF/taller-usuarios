package com.bytepl.usuarios.service;

import com.bytepl.usuarios.entity.Usuario;
import com.bytepl.usuarios.model.MUsuario;

import java.util.List;

public interface IUsuarioService {
    public MUsuario save(Usuario usuario);
    public List<Usuario> findAll();
    public Usuario findById(long id);
    public void deleteById(long id);
    public List<Usuario> findByNombre(String nombre);
}
