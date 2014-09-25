package com.summer.taobao.domain;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6066482918505817307L;

	private Integer id;

    private String sellerId;

    private String sellerName;

    private String sellerPhone;

    private String sellerSell;

    private String sellerRealname;

    private String sellerCredit;

    private String sellerSex;

    private String sellerBirthdate;

    private String sellerCard;

    private String remark1;

    private String remark2;

    private String remark3;

    private Date updateTime;

    private Date createTime;

    private String sellerDate;

    private String sellerTrust;

    private String buyerTrust;

    private String sellerRateurl;

    private String sellerDescrate;

    private String sellerServicerate;

    private String sellerShiprate;
    
    private String sellerZone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getSellerSell() {
        return sellerSell;
    }

    public void setSellerSell(String sellerSell) {
        this.sellerSell = sellerSell == null ? null : sellerSell.trim();
    }

    public String getSellerRealname() {
        return sellerRealname;
    }

    public void setSellerRealname(String sellerRealname) {
        this.sellerRealname = sellerRealname == null ? null : sellerRealname.trim();
    }

    public String getSellerCredit() {
        return sellerCredit;
    }

    public void setSellerCredit(String sellerCredit) {
        this.sellerCredit = sellerCredit == null ? null : sellerCredit.trim();
    }

    public String getSellerSex() {
        return sellerSex;
    }

    public void setSellerSex(String sellerSex) {
        this.sellerSex = sellerSex == null ? null : sellerSex.trim();
    }

    public String getSellerBirthdate() {
        return sellerBirthdate;
    }

    public void setSellerBirthdate(String sellerBirthdate) {
        this.sellerBirthdate = sellerBirthdate == null ? null : sellerBirthdate.trim();
    }

    public String getSellerCard() {
        return sellerCard;
    }

    public void setSellerCard(String sellerCard) {
        this.sellerCard = sellerCard == null ? null : sellerCard.trim();
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

    public String getSellerDate() {
        return sellerDate;
    }

    public void setSellerDate(String sellerDate) {
        this.sellerDate = sellerDate == null ? null : sellerDate.trim();
    }

    public String getSellerTrust() {
        return sellerTrust;
    }

    public void setSellerTrust(String sellerTrust) {
        this.sellerTrust = sellerTrust == null ? null : sellerTrust.trim();
    }

    public String getBuyerTrust() {
        return buyerTrust;
    }

    public void setBuyerTrust(String buyerTrust) {
        this.buyerTrust = buyerTrust == null ? null : buyerTrust.trim();
    }

    public String getSellerRateurl() {
        return sellerRateurl;
    }

    public void setSellerRateurl(String sellerRateurl) {
        this.sellerRateurl = sellerRateurl == null ? null : sellerRateurl.trim();
    }

    public String getSellerDescrate() {
        return sellerDescrate;
    }

    public void setSellerDescrate(String sellerDescrate) {
        this.sellerDescrate = sellerDescrate == null ? null : sellerDescrate.trim();
    }

    public String getSellerServicerate() {
        return sellerServicerate;
    }

    public void setSellerServicerate(String sellerServicerate) {
        this.sellerServicerate = sellerServicerate == null ? null : sellerServicerate.trim();
    }

    public String getSellerShiprate() {
        return sellerShiprate;
    }

    public void setSellerShiprate(String sellerShiprate) {
        this.sellerShiprate = sellerShiprate == null ? null : sellerShiprate.trim();
    }

	public String getSellerZone() {
		return sellerZone;
	}

	public void setSellerZone(String sellerZone) {
		this.sellerZone = sellerZone;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerPhone=" + sellerPhone + ", sellerSell=" + sellerSell + ", sellerRealname=" + sellerRealname
				+ ", sellerCredit=" + sellerCredit + ", sellerSex=" + sellerSex + ", sellerBirthdate=" + sellerBirthdate + ", sellerCard=" + sellerCard + ", remark1=" + remark1 + ", remark2="
				+ remark2 + ", remark3=" + remark3 + ", updateTime=" + updateTime + ", createTime=" + createTime + ", sellerDate=" + sellerDate + ", sellerTrust=" + sellerTrust + ", buyerTrust="
				+ buyerTrust + ", sellerRateurl=" + sellerRateurl + ", sellerDescrate=" + sellerDescrate + ", sellerServicerate=" + sellerServicerate + ", sellerShiprate=" + sellerShiprate
				+ ", sellerZone=" + sellerZone + "]";
	}
	
}