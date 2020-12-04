package cn.edu.zjut.dao;
import cn.edu.zjut.po.*;
public interface ICustomerDAO {
	//public void save();
	public void save(Customer transientInstance);
}
