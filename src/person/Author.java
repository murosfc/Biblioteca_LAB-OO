package person;

public class Author extends Person{
	private String biography;

	public Author(long id, String name, String biography) {
		super(id, name);
		this.biography = biography;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

}
