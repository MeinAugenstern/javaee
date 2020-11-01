package cn.edu.zjut.bean;
import cn.edu.zjut.bean.*;
/*版本1
public class UserBean {
	private String account="";
	private String password=""; 
	public String getAccount() { 
		return account; 
	}
	public void setAccount(String account) { 
		this.account = account; 
	}
	public String getPassword() { 
		return password; 
	}
	public void setPassword(String password) { 
		this.password = password;
	} 
}*/
/*版本3
public class UserBean {
	private login login;

	public login getLogin() {
		return login;
	}

	public void setLogin(login login) {
		this.login = login;
	}
	
}*/

//提高实验
public class UserBean {
	private String account=""; 
	private String password=""; 
	private String repassword=""; 
	private String name=""; 
	private String sex=""; 
	private String birthday=""; 
	private String address=""; 
	private String phone=""; 
	private String email="";
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}