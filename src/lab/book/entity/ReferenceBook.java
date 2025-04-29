package lab.book.entity;

import java.text.DecimalFormat;

public class ReferenceBook extends Publication {
	private String field;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String title, String publishDate, int page, int price, String field) {
		super(title, publishDate, page, price);
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("###,###");
		return "����=" + getTitle() + ", ������=" + getPublishDate() + ", ������=" + getPage() + ", ����=" + formatter.format(getPrice())+", �о�: "+field;
	}

}
