package cn.edu.zjut.dao;
import java.util.List;


import org.hibernate.Query; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session; 
import org.hibernate.cfg.Configuration; 
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory;
import cn.edu.zjut.po.*;
public class CustomerDAO {

	private Log log = LogFactory.getLog(CustomerDAO.class); 
	public List findByHql(String hql) { 
		log.debug("finding LoginUser instance by hql"); 
		SessionFactory sf= new Configuration() 
				.configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		try {
			String queryString = hql; 
			Query queryObject = session.createQuery(queryString); 
			return queryObject.list(); 
			} catch (RuntimeException re) { 
				log.error("find by hql failed", re); throw re; 
				} finally{ 
					session.close(); 
				} 
		}	
	
	public void save(Customer customer) { 
		log.debug("saving customer instance"); 
		SessionFactory sf= new Configuration(). 
				configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		Transaction tx = session.beginTransaction();
		try {
			session.save(customer); 
			session.flush();
			//tx.commit();
			log.debug("save successful"); 
			} catch (RuntimeException re) { 
				log.error("save failed", re); 
				throw re; 
				} finally{ 
					session.close(); 
					} 
		}
}
