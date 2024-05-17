package br.org.serratec.biblioteca.dtos;

public class RestApiDto {
	private AddressDto address;
	private Integer id;
	private String email;
	private String username;
	private String password;
	private NameDto name;
	private String phone;
	private String __v;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public NameDto getName() {
		return name;
	}

	public AddressDto getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String get__v() {
		return __v;
	}

	public void set__v(String __v) {
		this.__v = __v;
	}
	
	
	
	

}
