package lab.book.entity;

import java.text.DecimalFormat;

public class Publication {
	private String title;
	private String publishDate;
	private int page;
	private int price;
	
	public Publication() {
		
	}
	public Publication(String title, String publishDate, int page, int price) {
		this.title = title;
		this.publishDate = publishDate;
		this.page = page;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public int getPage() {
		return page;
	}
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("###,###");
		return "제목=" + title + ", 출판일=" + publishDate + ", 페이지=" + page + ", 가격=" + formatter.format(price);
	}
}
