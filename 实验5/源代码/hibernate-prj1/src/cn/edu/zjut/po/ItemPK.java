package cn.edu.zjut.po;
import java.io.*;
public class ItemPK implements java.io.Serializable {
	private String itemID; 
	private String title;
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	} 
	
}