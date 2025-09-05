package com.senac.aulaFull.repository;

import com.senac.aulaFull.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>  {

    Optional<Usuario> findByEmailAndNome(String email,String nome);

    boolean existsUsuarioByEmailContainingAndSenha(String email,String senha);

    Optional<Usuario> findByEmail(String email);
}
