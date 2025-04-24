package lab.library.entity;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int publishYear;
	private boolean isAvailable;

	public Book() {

	}

	public Book(String title, String author, String isbn, int publishYear) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishYear = publishYear;
		this.setAvailable(true);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean checkOut() {
		if (this.isAvailable()) {
			this.setAvailable(false);
		} else {

		}
		return true;
	}

	public void returnBook() {
		this.setAvailable(true);
	}

	@Override
	public String toString() {
		if(this.isAvailable) {
			return "[책 제목: " + title + ", 작가: " + author + ", ISBN: " + isbn + ", 출판년도: " + publishYear
					+ "대출가능 여부: 가능]";
		} else {
			return "[책 제목: " + title + ", 작가: " + author + ", ISBN: " + isbn + ", 출판년도: " + publishYear
					+ ", 대출가능 여부: 대출 중]";
		}
		

	}

}
