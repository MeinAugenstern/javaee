package cn.edu.zjut.dao;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;

import cn.edu.zjut.po.*;
public class AddressDAO extends BaseHibernateDAO{
	private Log log = LogFactory.getLog(AddressDAO.class); 
	public void save(Address instance) {
		log.debug("saving Address instance"); 
		try {
			getSession().saveOrUpdate(instance);
			log.debug("save address successful"); 
			} catch (RuntimeException re) { 
				log.error("save address failed", re); 
				throw re; 
				} 
	}
	public Address findById(int addressId) {
		log.debug("finding Address by id"); 
		try { 
			String queryString ="from Address where addressId='"+ addressId+ "'"; 
			
			org.hibernate.query.Query queryObject = getSession().createQuery(queryString); 
			return (Address) queryObject.list().get(0); 
			} catch (RuntimeException re) { 
				log.error("find by hql failed", re); 
				throw re; 
				} 
	}
	public void delete(Address instance) {
		log.debug("deleting Address instance"); 
		try {
			getSession().delete(instance);
			log.debug("save address successful"); 
			} catch (RuntimeException re) { 
				log.error("save address failed", re); 
				throw re; 
				} 
	}
}
