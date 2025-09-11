package com.senac.aulaFull.repository;

import com.senac.aulaFull.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository <Transacao,Long> {
}
