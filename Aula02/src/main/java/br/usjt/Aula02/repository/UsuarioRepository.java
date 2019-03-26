package br.usjt.Aula02.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.usjt.Aula02.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);

}