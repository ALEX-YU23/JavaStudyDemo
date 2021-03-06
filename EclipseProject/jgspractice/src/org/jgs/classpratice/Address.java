package org.jgs.classpratice;

public class Address {
	private String country;
	private String province;
	private String city;
	private String street;
	private String postcode;
	public Address () {}  // 无参构造
	public Address (String country,String province,String city,String street,String postcode) {
		this.country = country;												// 有参构造
		this.province = province;
		this.city = city;
		this.street = street;
		this.postcode = postcode;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public String getProvince() {
		return province;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public String getPostcode() {
		return postcode;
	}
	public String getInfo() {
		
		return this.country + "" + this.province + "省" + this.city + "市" + this.street +
				"(街/道)" + this.postcode;

	}
	
}
