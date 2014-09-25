package us.codecraft.webmagic.taobao;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class TaobaoPipeline implements Pipeline {

	@Override
	public void process(ResultItems resultItems, Task task) {
		if(resultItems.getRequest().getUrl().matches(Config.ITEM_URL)){
			Item item=resultItems.get("item");
			System.out.println(item.getItemId());
		}
	}

}
