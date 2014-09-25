package us.codecraft.webmagic.taobao;

import com.summer.taobao.domain.Seller;
import com.summer.taobao.domain.Shop;
import com.summer.taobao.spider.Config;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class TaobaoPipeline implements Pipeline {

	@Override
	public void process(ResultItems resultItems, Task task) {
		if(resultItems.getRequest().getUrl().matches(Config.ITEM_URL)){
			Item item=resultItems.get("item");
			System.out.println(item.getItemId());
		}else if (resultItems.getRequest().getUrl().matches(Config.RATE_URL)) {
			Shop shop=resultItems.get("shop");
			System.out.println(shop);
			Seller seller=resultItems.get("seller");
			System.out.println(seller);
		}
	}

}
