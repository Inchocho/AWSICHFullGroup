package test;

import Library.Book;

public class BookTest {

	public static void main(String[] args) {

		Book lib = new Book();
		
		lib.setTitle("톰소여");
		lib.setAuthor("톰소여작가");
		lib.setCompany("톰소여컴퍼니");
		lib.setPrice(50000);
		lib.setDate("2022년 7월 25일");

		String title = "";
		String author = "";
		String company = "";
		int price = 0;
		String date = "";

		title = lib.getTitle();
		author = lib.getAuthor();
		company = lib.getCompany();
		price = lib.getPrice();
		date = lib.getDate();

		System.out.println(title);
		System.out.println(author);
		System.out.println(company);
		System.out.println(price);
		System.out.println(date);
		
		System.out.println(lib);

	}
}
