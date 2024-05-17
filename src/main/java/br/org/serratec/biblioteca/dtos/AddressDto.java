package br.org.serratec.biblioteca.dtos;

public class AddressDto {
	private GeoLocationDto geolocation;
	private String city;
	private String street;
	private Integer number;
	private String zipcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public GeoLocationDto getGeolocation() {
		return geolocation;
	}
	
	
}
