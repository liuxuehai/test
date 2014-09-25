package com.summer.taobao.domain;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6085650144140282823L;

	private Integer id;

    private String itemId;

    private Integer shopId;

    private String itemName;

    private String itemDesc;

    private String itemPrice;

    private String itemSize;

    private String itemColor;

    private String itemUrl;

    private String itemRate;

    private String itemDeal;

    private String itemPic;

    private String remark1;

    private String remark2;

    private String remark3;

    private Date updateTime;

    private Date createTime;

    private String itemPromoprice;

    private String itemIdnum;

    private String itemPay;

    private String itemShip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice == null ? null : itemPrice.trim();
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize == null ? null : itemSize.trim();
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor == null ? null : itemColor.trim();
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public String getItemRate() {
        return itemRate;
    }

    public void setItemRate(String itemRate) {
        this.itemRate = itemRate == null ? null : itemRate.trim();
    }

    public String getItemDeal() {
        return itemDeal;
    }

    public void setItemDeal(String itemDeal) {
        this.itemDeal = itemDeal == null ? null : itemDeal.trim();
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic == null ? null : itemPic.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getItemPromoprice() {
        return itemPromoprice;
    }

    public void setItemPromoprice(String itemPromoprice) {
        this.itemPromoprice = itemPromoprice == null ? null : itemPromoprice.trim();
    }

    public String getItemIdnum() {
        return itemIdnum;
    }

    public void setItemIdnum(String itemIdnum) {
        this.itemIdnum = itemIdnum == null ? null : itemIdnum.trim();
    }

    public String getItemPay() {
        return itemPay;
    }

    public void setItemPay(String itemPay) {
        this.itemPay = itemPay == null ? null : itemPay.trim();
    }

    public String getItemShip() {
        return itemShip;
    }

    public void setItemShip(String itemShip) {
        this.itemShip = itemShip == null ? null : itemShip.trim();
    }

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemId=" + itemId + ", shopId=" + shopId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice=" + itemPrice + ", itemSize=" + itemSize
				+ ", itemColor=" + itemColor + ", itemUrl=" + itemUrl + ", itemRate=" + itemRate + ", itemDeal=" + itemDeal + ", itemPic=" + itemPic + ", remark1=" + remark1 + ", remark2=" + remark2
				+ ", remark3=" + remark3 + ", updateTime=" + updateTime + ", createTime=" + createTime + ", itemPromoprice=" + itemPromoprice + ", itemIdnum=" + itemIdnum + ", itemPay=" + itemPay
				+ ", itemShip=" + itemShip + "]";
	}
}