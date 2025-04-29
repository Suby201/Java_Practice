package lab.book.entity;

import java.text.DecimalFormat;

public class Novel extends Publication {
	private String author;
	private String genre;
	
	public Novel() {
		// TODO Auto-generated constructor stub
	}

	public Novel(String title, String publishDate, int page, int price, String author, String genre) {
		super(title, publishDate, page, price);
		this.author = author;
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("###,###");
		return "제목=" + getTitle() + ", 출판일=" + getPublishDate() + ", 페이지=" + getPage() + ", 가격=" + formatter.format(getPrice())+", 작가: "+author+", 장르: "+genre;
	}

}
