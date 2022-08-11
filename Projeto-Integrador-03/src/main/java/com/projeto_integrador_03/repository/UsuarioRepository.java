package com.projeto_integrador_03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_integrador_03.model.Usuario;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto_integrador_03.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);
}
