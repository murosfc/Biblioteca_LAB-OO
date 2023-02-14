package library;

public class Book extends Publication{
	private String isbn;
	
	public Book(long id, String title, int availableQuantity, int lendedQuantity, Area area, String isbn) {
		super(id, title, availableQuantity, lendedQuantity, area);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
