package us.codecraft.webmagic.taobao;

import java.io.Serializable;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2763544188591242886L;
	private String itemId;
	private String shopId;
	private String itemName;
	private String itemDesc;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", shopId=" + shopId + ", itemName="
				+ itemName + ", itemDesc=" + itemDesc + "]";
	}
	
}
