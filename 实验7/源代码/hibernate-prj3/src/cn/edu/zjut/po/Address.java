package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

/*基础实验
public class Address {
	private int addressId; 
	private String detail; 
	private String zipcode; 
	private String phone; 
	private String type; 
	private Customer customer;
	public Address(int addressId, String detail, String zipcode, String phone, String type, Customer customer) {
		super();
		this.addressId = addressId;
		this.detail = detail;
		this.zipcode = zipcode;
		this.phone = phone;
		this.type = type;
		this.customer = customer;
	}
	public Address() {
		super();
	}
	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}*/
/*提高实验
 * public class Address {
	private int addressId; 
	private String detail; 
	private String zipcode; 
	private String phone; 
	private String type; 
	private Set customers = new HashSet(0);

	public Address(int addressId, String detail, String zipcode, String phone, String type, Set customers) {
		super();
		this.addressId = addressId;
		this.detail = detail;
		this.zipcode = zipcode;
		this.phone = phone;
		this.type = type;
		this.customers = customers;
	}
	public Address() {
		super();
	}
	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set getCustomers() {
		return customers;
	}
	public void setCustomers(Set customers) {
		this.customers = customers;
	}
} 
 */
/*拓展实验*/
public class Address {
	private int addressId; 
	private String detail; 
	private String zipcode; 
	private String phone; 
	private String type; 
	private Customer customer;

	
	public Address(int addressId, String detail, String zipcode, String phone, String type, Customer customer) {
		super();
		this.addressId = addressId;
		this.detail = detail;
		this.zipcode = zipcode;
		this.phone = phone;
		this.type = type;
		this.customer = customer;
	}
	public Address() {
		super();
	}
	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
} 

