package org.generation.blogPessoal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O atributo nome é obrigatório e não pode ser vazio")
	@Size(min = 2, max = 100, message = "O atributo nome deve conter no mínimo 02 e no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O atributo usuario é obrigatório e não pode ser vazio")
	@Size(min = 5, max = 100, message = "O atributo usuario deve conter no mínimo 05 e no máximo 100 caracteres")
	private String usuario;

	@NotBlank@NotBlank(message = "O atributo senha é obrigatório e não pode ser vazio")
	@Size(min = 5, max = 100, message = "O atributo senha deve conter no mínimo 05 e no máximo 100 caracteres")
	private String senha;
	
	private String foto;
	
	private String tipo;
	
	@OneToMany (mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List <Postagem> postagem;
	
	public Usuario(long id, String nome, String usuario, String senha) {
			this.id = id;
			this.nome = nome;
			this.usuario = usuario;
			this.senha = senha;
			}
	
	public Usuario() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
