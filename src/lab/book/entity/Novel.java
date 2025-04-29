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
		return "����=" + getTitle() + ", ������=" + getPublishDate() + ", ������=" + getPage() + ", ����=" + formatter.format(getPrice())+", �۰�: "+author+", �帣: "+genre;
	}

}
