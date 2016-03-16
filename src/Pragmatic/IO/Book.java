package Pragmatic.IO;

import java.io.Serializable;

public class Book implements Serializable {

	private String title;
	private String author;
	private int year;

	public Book(String title, String author, String year) {

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

}
