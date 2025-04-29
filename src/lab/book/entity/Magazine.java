package lab.book.entity;

import java.text.DecimalFormat;

public class Magazine extends Publication {
	private String publishPeriod;

	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	public Magazine(String title, String publishDate, int page, int price, String publishPeriod) {
		super(title, publishDate, page, price);
		this.publishPeriod = publishPeriod;
	}
	
	public String getPublishPeriod() {
		return publishPeriod;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("###,###");
		return "제목=" + getTitle() + ", 출판일=" + getPublishDate() + ", 페이지=" + getPage() + ", 가격=" + formatter.format(getPrice())+", 발행주기: "+publishPeriod; 
	}

}
