package Library;

public class Book {

	private String title = "";
	private String author = "";
	private String company = "";
	private int price = 0;
	private String date = "";

	public Book() {
		super();
	}

	public Book(String title, String author, String company, int price, String date) {
		super();
		this.title = title;
		this.author = author;
		this.company = company;
		this.price = price;
		this.date = date;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", company=" + company + ", price=" + price + ", date="
				+ date + "]";
	}

}
