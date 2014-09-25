package com.summer.taobao.spider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.summer.taobao.domain.Item;
import com.summer.taobao.domain.Seller;
import com.summer.taobao.domain.Shop;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class TaobaoProcessor implements PageProcessor {
	private static Properties properties = new Properties();
	private TaobaoConfig config;

	public TaobaoProcessor(TaobaoConfig config) {
		this.config = config;
	}

	public TaobaoConfig getConfig() {
		return config;
	}

	public void setConfig(TaobaoConfig config) {
		this.config = config;
	}

	@Override
	public void process(Page page) {
		if (page.getUrl().regex(config.getUrl()).match()) {
			page.addTargetRequests(page.getHtml().xpath(getXPath("targeturl")).links().regex(config.getUrlRegex()).all());
			page.addTargetRequests(page.getHtml().links().regex(Config.ITEM_URL).all());
		}else if (page.getUrl().regex(Config.ITEM_URL).match()) {
			Item item = new Item();
			item.setItemId(page.getHtml().xpath(getXPath("item.id")).toString());
			item.setItemName(page.getHtml().xpath(getXPath("item.name")).toString());
			int shopId = Integer.valueOf(Util.getShopValue(page.getHtml().xpath(getXPath("item.shopid")).toString(), "shopId"));
			item.setShopId(shopId);
			item.setItemUrl(page.getUrl().toString());
			page.putField("item", item);
			
			page.addTargetRequests(page.getHtml().links().regex(Config.RATE_URL).all());
			
		} else if (page.getUrl().regex(Config.RATE_URL).match()) {
			Seller seller = new Seller();
			String sellerId = page.getHtml().xpath(getXPath("seller.id")).toString();
			seller.setSellerId(sellerId);
			String sellerRateUrl = page.getHtml().xpath(getXPath("seller.rateurl")).toString();
			seller.setSellerRateurl(sellerRateUrl);
			String sellerName = page.getHtml().xpath(getXPath("seller.name")).toString();
			seller.setSellerName(sellerName);
			String sellerSell = page.getHtml().xpath(getXPath("seller.sell")).toString().trim();
			seller.setSellerSell(sellerSell);
			String sellerZone = page.getHtml().xpath(getXPath("seller.zone")).toString();
			seller.setSellerZone(sellerZone);
			String sellerDate = page.getHtml().xpath(getXPath("seller.date")).toString();
			seller.setSellerDate(sellerDate);
			String sellerTrust = page.getHtml().xpath(getXPath("seller.trust")).toString();
			seller.setSellerTrust(sellerTrust);
			String buyerTrust = page.getHtml().xpath(getXPath("seller.buyertrust")).toString();
			seller.setBuyerTrust(buyerTrust);

			String sellerDescRate = page.getHtml().xpath(getXPath("seller.descrate")).toString();
			seller.setSellerDescrate(sellerDescRate);
			String sellerServiceRate = page.getHtml().xpath(getXPath("seller.servicerate")).toString();
			seller.setSellerServicerate(sellerServiceRate);
			String sellerShipRate = page.getHtml().xpath(getXPath("seller.shiprate")).toString();
			seller.setSellerShiprate(sellerShipRate);
			page.putField("seller", seller);
			Shop shop =new Shop();
			
			String shopId = page.getHtml().xpath(getXPath("shop.id")).toString();
			shop.setShopId(Integer.valueOf(shopId));
			String shopDate = page.getHtml().xpath(getXPath("shop.date")).toString();
			shop.setShopDate(shopDate);
			String shopName = page.getHtml().xpath(getXPath("shop.name")).toString();
			shop.setShopName(shopName);
			String shopUrl = page.getHtml().xpath(getXPath("shop.url")).toString();
			shop.setShopUrl(shopUrl);
			String shopSellerId = page.getHtml().xpath(getXPath("shop.sellerid")).toString();
			shop.setSellerId(Integer.valueOf(shopSellerId));
			String shopVitual = page.getHtml().xpath(getXPath("shop.vitual")).toString();
			shop.setShopVitual(shopVitual);
			
			String shopNoVitual = page.getHtml().xpath(getXPath("shop.novitual")).toString();
			shop.setShopNovitual(shopNoVitual);
			String shopZone = page.getHtml().xpath(getXPath("shop.zone")).toString();
			shop.setShopPro(shopZone);
			String shopNum = page.getHtml().xpath(getXPath("shop.num")).toString();
			shop.setShopNum(shopNum);
			
			String shopDescRate = page.getHtml().xpath(getXPath("shop.descrate")).toString();
			shop.setShopDescrate(shopDescRate);
			String shopDescInfo = page.getHtml().xpath(getXPath("shop.descinfo1")).toString() + page.getHtml().xpath(getXPath("shop.descinfo2")).toString();
			shop.setShopDescinfo(shopDescInfo);
			String shopServiceRate = page.getHtml().xpath(getXPath("shop.servicerate")).toString();
			shop.setShopServicerate(shopServiceRate);
			String shopServiceInfo = page.getHtml().xpath(getXPath("shop.serviceinfo1")).toString() + page.getHtml().xpath(getXPath("shop.serviceinfo2")).toString();
			shop.setShopServiceinfo(shopServiceInfo);
			String shopShipRate = page.getHtml().xpath(getXPath("shop.shiprate")).toString();
			shop.setShopShiprate(shopShipRate);
			String shopShipInfo = page.getHtml().xpath(getXPath("shop.shipinfo1")).toString() + page.getHtml().xpath(getXPath("shop.shipinfo2")).toString();
			shop.setShopShipinfo(shopShipInfo);
			String shopGoodRate = page.getHtml().xpath(getXPath("shop.goodrate")).toString();
			shop.setShopGoodrate(shopGoodRate);
			page.putField("shop", shop);
		}
	}

	@Override
	public Site getSite() {
		return config;
	}

	public String getXPath(String pro) {
		return properties.getProperty(pro).toString();
	}

	public static void main(String[] args) {
		InputStream inputStream = TaobaoProcessor.class.getClassLoader().getResourceAsStream("taobao.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		TaobaoConfig config = new TaobaoConfig();
		config.setUrl("http://pipiguo.taobao.com/category.htm");
		config.setUrlRegex("http://pipiguo\\.taobao\\.com/category\\.htm\\?mid=\\w+-\\d+-\\d+&pageNo=\\d+");
		config.setThread(10);
		TaobaoProcessor process = new TaobaoProcessor(config);
		Spider.create(process).addUrl(config.getUrl()).thread(config.getThread()).addPipeline(new TaobaoPipeline()).start();

		// "http://pipiguo.taobao.com/category.htm?mid=w-4747105506-0&pageNo=2".
		// matches("http://pipiguo\\.taobao\\.com/category\\.htm\\?mid=\\w+-\\d+-\\d+&pageNo=\\d+")
	}
}
