package cn.edu.zjut.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.dao.AddressDAO;
import cn.edu.zjut.dao.CustomerDAO;
import cn.edu.zjut.po.Address;
import cn.edu.zjut.po.Customer;

public class UserService {
	private Map<String, Object> request, session; 
	public boolean login(Customer loginUser) { 
		ActionContext ctx= ActionContext.getContext(); 
		session=(Map) ctx.getSession(); 
		request=(Map) ctx.get("request"); 
		String account = loginUser.getAccount(); 
		String password = loginUser.getPassword(); 
		String hql = "from Customer as user where account='" + account + "' and password='" + password + "'"; 
		CustomerDAO dao = new CustomerDAO(); 
		List list = dao.findByHql(hql); 
		dao.getSession().close(); 
		if (list.isEmpty()) 
			return false; 
		else{
			session.put("user", account); 
			request.put("tip", "登录成功！"); 
			loginUser=(Customer)list.get(0);
			request.put("loginUser", loginUser);
			request.put("address",loginUser.getAddress());
			return true; 
			} 
		}
	public boolean addAddr(Customer loginUser, Address address) { 
		ActionContext ctx= ActionContext.getContext();
		request=(Map) ctx.get("request"); 
		CustomerDAO c_dao = new CustomerDAO(); 
		loginUser = (Customer)c_dao 
				.findById(loginUser.getCustomerId()); 
		address.setCustomer(loginUser); //注释 1 
		loginUser.setAddress(address);
		Transaction tran = null; 
		try {
			tran = c_dao.getSession().beginTransaction(); 
			c_dao.update(loginUser); 
			tran.commit(); 
			request.put("loginUser", loginUser); 
			request.put("tip", "添加地址成功！"); 
			return true; 
			} catch (Exception e) { 
				if(tran != null) tran.rollback();
				request.put("tip", "添加地址失败！");
				return false; 
				} finally { 
					c_dao.getSession().close(); 
					} 
		}
	public boolean delete(Customer loginUser,Address address) {
		ActionContext ctx= ActionContext.getContext();
		request=(Map) ctx.get("request");
		AddressDAO a_dao = new AddressDAO();
		CustomerDAO c_dao = new CustomerDAO();
		loginUser = (Customer)c_dao 
				.findById(loginUser.getCustomerId());
		address = loginUser.getAddress();
		loginUser.setAddress(null);
		Transaction tran = null; 
		try {
			tran = c_dao.getSession().beginTransaction(); 
			c_dao.update(loginUser);
			a_dao.delete(address);
			tran.commit(); 
			request.put("loginUser", loginUser); 
			request.put("tip", "删除地址成功！"); 
			return true; 
			} catch (Exception e) { 
				if(tran != null) tran.rollback();
				request.put("tip", "删除地址失败！");
				return false; 
				} finally { 
					a_dao.getSession().close(); 
					c_dao.getSession().close();
					}
	}
	/*public boolean deletecust_addr(Customer loginUser, Address address) { 
		ActionContext ctx= ActionContext.getContext();
		request=(Map) ctx.get("request");
		CustomerDAO c_dao = new CustomerDAO();
		loginUser = (Customer)c_dao 
				.findById(loginUser.getCustomerId());
		address=(Address)a_dao 
				.findById(address.getAddressId());
		loginUser.setAddress(null);
		Transaction tran = null; 
		try {
			tran = c_dao.getSession().beginTransaction(); 
			c_dao.update(loginUser);
			tran.commit(); 
			request.put("loginUser", loginUser); 
			request.put("tip", "删除地址成功！"); 
			return true; 
			} catch (Exception e) { 
				if(tran != null) tran.rollback();
				request.put("tip", "删除地址失败！");
				return false; 
				} finally { 
					c_dao.getSession().close(); 
					} 
	}*/
}
