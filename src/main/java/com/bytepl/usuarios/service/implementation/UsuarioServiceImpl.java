package com.bytepl.usuarios.service.implementation;

import com.bytepl.usuarios.entity.Usuario;
import com.bytepl.usuarios.model.MUsuario;
import com.bytepl.usuarios.repository.UsuarioRepository;
import com.bytepl.usuarios.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public MUsuario save(Usuario usuario) {
        //Guardando usuario
        usuario = repository.save(usuario);
        //Conviertiendo a modelo
        MUsuario mUsuario = new MUsuario(usuario);
        //retornando
        return mUsuario;
    }

    //Obteniendo los datos
    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    //Obtener por id
    @Override
    public Usuario findById(long id) {
        return repository.findById((int)id).get();
    }

    //Borrar por id
    @Override
    public void deleteById(long id) {
        repository.deleteById(Integer.parseInt(id + ""));
    }

    @Override
    public List<Usuario> findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
}
