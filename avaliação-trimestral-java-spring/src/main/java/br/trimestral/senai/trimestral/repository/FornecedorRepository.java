package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Forncedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository extends JpaRepository<Forncedor, Long> {

    public Forncedor findByNomeAndEmail(String nome, String email);
    public List<Forncedor> findByTelefoneLike(String telefone);
}

