package com.santander.desafio.service;

import com.santander.desafio.model.UsuarioModel;
import com.santander.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<UsuarioModel> listAll() {
        return repo.findAll();
    }

    public void save(UsuarioModel usuario) {
        repo.save(usuario);
    }

    public UsuarioModel get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
