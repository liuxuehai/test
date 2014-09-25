package com.summer.taobao.domain;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3735052543591064633L;

	private Integer id;

    private String shopName;

    private Integer sellerId;

    private String shopSell;

    private String shopUrl;

    private String shopDate;

    private String shopTel;

    private String shopPro;

    private String shopDesc;

    private String shopService;

    private String remark1;

    private String remark2;

    private String remark3;

    private Date createTime;

    private Date updateTime;

    private Integer shopId;

    private String shopCity;

    private String shopVitual;

    private String shopNovitual;

    private String shopNum;

    private String shopDescrate;

    private String shopDescinfo;

    private String shopServicerate;

    private String shopServiceinfo;

    private String shopGoodrate;

    private String shopShiprate;

    private String shopShipinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopSell() {
        return shopSell;
    }

    public void setShopSell(String shopSell) {
        this.shopSell = shopSell == null ? null : shopSell.trim();
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl == null ? null : shopUrl.trim();
    }

    public String getShopDate() {
        return shopDate;
    }

    public void setShopDate(String shopDate) {
        this.shopDate = shopDate == null ? null : shopDate.trim();
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel == null ? null : shopTel.trim();
    }

    public String getShopPro() {
        return shopPro;
    }

    public void setShopPro(String shopPro) {
        this.shopPro = shopPro == null ? null : shopPro.trim();
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc == null ? null : shopDesc.trim();
    }

    public String getShopService() {
        return shopService;
    }

    public void setShopService(String shopService) {
        this.shopService = shopService == null ? null : shopService.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity == null ? null : shopCity.trim();
    }

    public String getShopVitual() {
        return shopVitual;
    }

    public void setShopVitual(String shopVitual) {
        this.shopVitual = shopVitual == null ? null : shopVitual.trim();
    }

    public String getShopNovitual() {
        return shopNovitual;
    }

    public void setShopNovitual(String shopNovitual) {
        this.shopNovitual = shopNovitual == null ? null : shopNovitual.trim();
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum == null ? null : shopNum.trim();
    }

    public String getShopDescrate() {
        return shopDescrate;
    }

    public void setShopDescrate(String shopDescrate) {
        this.shopDescrate = shopDescrate == null ? null : shopDescrate.trim();
    }

    public String getShopDescinfo() {
        return shopDescinfo;
    }

    public void setShopDescinfo(String shopDescinfo) {
        this.shopDescinfo = shopDescinfo == null ? null : shopDescinfo.trim();
    }

    public String getShopServicerate() {
        return shopServicerate;
    }

    public void setShopServicerate(String shopServicerate) {
        this.shopServicerate = shopServicerate == null ? null : shopServicerate.trim();
    }

    public String getShopServiceinfo() {
        return shopServiceinfo;
    }

    public void setShopServiceinfo(String shopServiceinfo) {
        this.shopServiceinfo = shopServiceinfo == null ? null : shopServiceinfo.trim();
    }

    public String getShopGoodrate() {
        return shopGoodrate;
    }

    public void setShopGoodrate(String shopGoodrate) {
        this.shopGoodrate = shopGoodrate == null ? null : shopGoodrate.trim();
    }

    public String getShopShiprate() {
        return shopShiprate;
    }

    public void setShopShiprate(String shopShiprate) {
        this.shopShiprate = shopShiprate == null ? null : shopShiprate.trim();
    }

	public String getShopShipinfo() {
		return shopShipinfo;
	}

	public void setShopShipinfo(String shopShipinfo) {
		this.shopShipinfo = shopShipinfo;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", shopName=" + shopName + ", sellerId=" + sellerId + ", shopSell=" + shopSell + ", shopUrl=" + shopUrl + ", shopDate=" + shopDate + ", shopTel=" + shopTel
				+ ", shopPro=" + shopPro + ", shopDesc=" + shopDesc + ", shopService=" + shopService + ", remark1=" + remark1 + ", remark2=" + remark2 + ", remark3=" + remark3 + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", shopId=" + shopId + ", shopCity=" + shopCity + ", shopVitual=" + shopVitual + ", shopNovitual=" + shopNovitual + ", shopNum="
				+ shopNum + ", shopDescrate=" + shopDescrate + ", shopDescinfo=" + shopDescinfo + ", shopServicerate=" + shopServicerate + ", shopServiceinfo=" + shopServiceinfo + ", shopGoodrate="
				+ shopGoodrate + ", shopShiprate=" + shopShiprate + ", shopShipinfo=" + shopShipinfo + "]";
	}

}