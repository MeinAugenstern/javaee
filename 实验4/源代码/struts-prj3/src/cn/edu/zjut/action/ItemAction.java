package cn.edu.zjut.action;
import cn.edu.zjut.bean.*;
import java.util.*;
import cn.edu.zjut.service.*;
public class ItemAction {
	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getAllItems() { 
		ItemService itemServ = new ItemService(); 
		items=itemServ.getAllItems(); 
		System.out.println("ItemAction excuted!"); 
		return "success"; 
		}
}
