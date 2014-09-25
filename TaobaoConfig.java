package us.codecraft.webmagic.taobao;

import us.codecraft.webmagic.Site;

public class TaobaoConfig extends Site{

	public static String DOMAIN="taobao.com";
	public static int sleepTime=30000;
	public static String USERAGENT="Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31";
	private String url;
	private String urlRegex;
	private int thread;
	
	
	public TaobaoConfig(){
		setUserAgent(USERAGENT);
		setSleepTime(sleepTime);
		setDomain(DOMAIN);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlRegex() {
		return urlRegex;
	}

	public void setUrlRegex(String urlRegex) {
		this.urlRegex = urlRegex;
	}

	public int getThread() {
		return thread;
	}

	public void setThread(int thread) {
		this.thread = thread;
	}
	
}
