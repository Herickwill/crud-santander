package com.santander.desafio.repository;

import com.santander.desafio.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
