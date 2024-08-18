package com.belval.avaliacaogames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belval.avaliacaogames.entities.Carrinho;
import com.belval.avaliacaogames.entities.Usuario;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

	Carrinho findByUsuario(Usuario usuario);

}
