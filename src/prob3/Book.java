package prob3;

public class Book {
	private int bookNo; // 번호
	private String title; // 제목
	private String author; // 작가
	private int stateCode; // 상태코드

	public Book() {
	}

	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}

	public void print() {

		System.out.print("책 제목:" + title + ", 작가:" + author + ", 대여 유무:");

		if (stateCode == 1) {
			System.out.println("재고 있음");
		} else {
			System.out.println("대여중");
		}

	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]";
	}

}
