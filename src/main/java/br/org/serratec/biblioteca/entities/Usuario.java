package br.org.serratec.biblioteca.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "user_nome")
	private String userNome;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@ManyToOne
	@JoinColumn(name = "perfil_id")
	private Perfil perfil;
	
	public Usuario() {
	}

	public Usuario(Integer userId, String userNome, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userNome = userNome;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserNome() {
		return userNome;
	}

	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	
	
}