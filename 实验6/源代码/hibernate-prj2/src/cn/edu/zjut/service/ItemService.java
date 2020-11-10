package cn.edu.zjut.service;
import java.util.List; 
import java.util.ArrayList; 
import cn.edu.zjut.dao.ItemDAO;
public class ItemService {
	private List items = new ArrayList(); 
	public List findByHql() { 
		ItemDAO dao = new ItemDAO(); 
		//String hql = "from cn.edu.zjut.po.Item"; 
		//String hql = "from Item";
		//String hql = "from Item as item";
		//String hql = "select item.title from Item as item";
		//String hql = "select item.title, item.cost from Item as item";
		//String hql = "select count(*) from Item as count";//聚集函数
		//String hql = "from Item where cost<20";//where查询
		//String hql = "from Item order by cost DESC"; //order by降序排序
		String hql = "From Item i where i.cost<20";//子查询
		List list = dao.findByHql(hql); 
		dao.getSession().close();
		return list; 
		}
}
