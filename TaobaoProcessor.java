package us.codecraft.webmagic.taobao;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

public class TaobaoProcessor implements PageProcessor{
	
	private  TaobaoConfig config;
	
	public TaobaoProcessor(TaobaoConfig config){
		 this.config=config;
	}
	public TaobaoConfig getConfig() {
		return config;
	}
	public void setConfig(TaobaoConfig config) {
		this.config = config;
	}
	@Override
	public void process(Page page) {
		if(page.getUrl().regex(config.getUrl()).match()){
			page.addTargetRequests(page.getHtml().xpath("//div[@class='pagination']").links().regex(config.getUrlRegex()).all());
			page.addTargetRequests(page.getHtml().links().regex(Config.ITEM_URL).all());
		}else if (page.getUrl().regex(config.getUrlRegex()).match()) {
        	//page.getHtml().xpath("//script/html()").regex("\"http://detailskip.taobao.com/json/ifq.htm.*\"")
        	Selectable links=page.getHtml().links();
            page.addTargetRequests(links.regex(Config.ITEM_URL).all());
            page.addTargetRequests(links.regex(config.getUrlRegex()).all());
        } else if(page.getUrl().regex(Config.ITEM_URL).match()){
        	Item item=new Item();
        	item.setItemId(page.getHtml().xpath("//input[@name='item_id']/@value").toString());
        	item.setItemName(page.getHtml().xpath("//div[@id='J_Title']/h3/text()").toString());
        	item.setShopId(page.getHtml().xpath("//meta[@name='microscope-data']/@content").toString());
            page.putField("item", item);
            
            if(page.getHtml().xpath("//div[@class='tb-shop-rank']//a/@href").toString().matches(Config.RATE_URL)) {
           	   page.addTargetRequest(page.getHtml().xpath("//div[@class='tb-shop-rank']//a/@href").toString());
           }
        }else if(page.getUrl().regex(Config.RATE_URL).match()){
        	System.out.println("eee");
        	String sellerId=page.getHtml().xpath("//input[@id='dsr-userid']/@value").toString();
        	String sellerRateUrl=page.getHtml().xpath("//input[@id='dsr-ratelink']/@value").toString();
        	String sellerName=page.getHtml().xpath("//div[@class='col-sub']//div[@class='title']/a/text()").toString();
        	String sellerSell=page.getHtml().xpath("//div[@class='col-sub']//div[@class='bd']//ul/li[1]/a/text()").toString().trim();
        	String sellerZone=page.getHtml().xpath("//div[@class='col-sub']//div[@class='bd']//ul/li[2]/text()").toString();
        	String sellerDate=page.getHtml().xpath("//input[@id='J_showShopStartDate']/@value").toString();
        	String sellerTrust=page.getHtml().xpath("//div[@class='col-sub']//div[@class='bd']//ul[@class='sep']/li[1]/text()").toString();
        	String buyerTrust=page.getHtml().xpath("//div[@class='col-sub']//div[@class='bd']//ul[@class='sep']/li[2]/text()").toString();
        	
        	String sellerDrscRate=page.getHtml().xpath("//ul[@id='dsr']/li[1]/div/em[1]/@title").toString();
        	String sellerServiceRate=page.getHtml().xpath("//ul[@id='dsr']/li[2]/div/em[1]/@title").toString();
        	String sellerShipRate=page.getHtml().xpath("//ul[@id='dsr']/li[3]/div/em[1]/@title").toString();
        	
        	
        	String shopId=page.getHtml().xpath("//input[@id='J_ShopIdHidden']/@value").toString();
        	String shopDate=page.getHtml().xpath("//input[@id='J_showShopStartDate']/@value").toString();
        	String shopName=page.getHtml().xpath("//a[@class='shop-name']/text()").toString();
        	String shopUrl=page.getHtml().xpath("//a[@class='shop-name']/@href").toString();
        	String shopSellerId=page.getHtml().xpath("//input[@id='dsr-userid']/@value").toString();
        	String shopVitual=page.getHtml().xpath("//div[@class='rank-popup']//em[@class='virtual']/text()").toString();
        	String shopNoVitual=page.getHtml().xpath("//div[@class='rank-popup']//em[@class='non-virtual']/text()").toString();
        	String shopZone=page.getHtml().xpath("//div[@class='popup-content']//div[@class='shop-intro']//dl[2]//span/text()").toString();
        	String shopNum=page.getHtml().xpath("//div[@class='popup-content']//div[@class='shop-intro']//dl[3]//span/text()").toString();
        	
        	String shopDescRate=page.getHtml().xpath("div[@class='shop-credit']//tbody/tr//td[1]//em/@title").toString();
        	String shopDescInfo=page.getHtml().xpath("div[@class='shop-credit']//tbody/tr//td[2]/a/b/text()").toString()+
        	page.getHtml().xpath("div[@class='shop-credit']//tbody/tr//td[2]/a/em/text()").toString();
        	String shopServiceRate=page.getHtml().xpath("div[@class='shop-credit']//tbody/tr[2]//td[1]//em/@title").toString();
        	String shopServiceInfo=page.getHtml().xpath("div[@class='shop-credit']//tbody/tr[2]//td[2]/a/b/text()").toString()+
                	page.getHtml().xpath("div[@class='shop-credit']//tbody/tr[2]//td[2]/a/em/text()").toString();
        	String shopShipRate=page.getHtml().xpath("div[@class='shop-credit']//tbody/tr[3]//td[1]//em/@title").toString();
        	String shopShipInfo=page.getHtml().xpath("div[@class='shop-credit']//tbody/tr[3]//td[2]/a/b/text()").toString()+
                	page.getHtml().xpath("div[@class='shop-credit']//tbody/tr[3]//td[2]/a/em/text()").toString();
        	
        	String shopGoodRate=page.getHtml().xpath("//div[@class='good-rating']//dd/text()").toString();
        }
        
	}

	@Override
	public Site getSite() {
		return config;
	}
	public static void main(String[] args) {
		
		TaobaoConfig config=new TaobaoConfig();
		config.setUrl("http://pipiguo.taobao.com/category.htm");
		config.setUrlRegex("http://pipiguo\\.taobao\\.com/category\\.htm\\?mid=\\w+-\\d+-\\d+&pageNo=\\d+");
		config.setThread(5);
		TaobaoProcessor process=new TaobaoProcessor(config);
	    Spider.create(process).addUrl(config.getUrl()).thread(config.getThread()).addPipeline(new TaobaoPipeline())
	                .start();
	    
//	    "http://pipiguo.taobao.com/category.htm?mid=w-4747105506-0&pageNo=2".
//	    matches("http://pipiguo\\.taobao\\.com/category\\.htm\\?mid=\\w+-\\d+-\\d+&pageNo=\\d+")
	}
}
