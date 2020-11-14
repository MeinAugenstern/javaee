package cn.edu.zjut.dao;
import java.util.Iterator;
import java.util.List; 
import org.hibernate.query.Query;
import org.hibernate.Transaction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.edu.zjut.po.Address;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.dao.AddressDAO;
public class CustomerDAO extends BaseHibernateDAO{
	private Log log = LogFactory.getLog(CustomerDAO.class); 
	public List findByHql(String hql) { 
		log.debug("finding Customer instance by hql"); 
		try { 
			String queryString = hql; 
			Query queryObject = getSession().createQuery(queryString); 
			return queryObject.list(); 
			} catch (RuntimeException re) { 
				log.error("find by hql failed", re); 
				throw re; 
				} 
		}
	/*基础实验*/
	public void update(Customer instance) { 
		log.debug("updating Customer instance");
		AddressDAO a = new AddressDAO();
		try {
			getSession().update(instance);
			/*Iterator<Address> it = instance.getAddresses().iterator();
			while(it.hasNext()) {
				a.save(it.next());
			}*/
			log.debug("update successful"); 
			} catch (RuntimeException re) { 
				log.error("update failed", re); 
				throw re; 
				} 
	}
	public Customer findById(int customerId) {
		log.debug("finding instance by id"); 
		try { 
			String queryString ="from Customer where customerId='"+ customerId+ "'"; 
			
			org.hibernate.query.Query queryObject = getSession().createQuery(queryString); 
			return (Customer) queryObject.list().get(0); 
			} catch (RuntimeException re) { 
				log.error("find by hql failed", re); 
				throw re; 
				} 
	}
}
