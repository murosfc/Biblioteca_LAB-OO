package library;

import model.DomainObjectAbstract;

public abstract class Publication extends DomainObjectAbstract{
	private String title;
	private int ownedQuantity, lendedQuantity;
	public Area area;
	
	public Publication(long id, String title, int ownedQuantity, int lendedQuantity, Area area) {
		super(id);
		this.title = title;
		this.ownedQuantity = ownedQuantity;
		this.lendedQuantity = lendedQuantity;
		this.area = area;
	}
	public int getAvailableCopies() {
		return ownedQuantity - lendedQuantity;
	}

	public String getTitle() {
		return title;
	}
	
	void lend() {
		if (this.getAvailableCopies() <= 0) {
			throw new IllegalArgumentException("There is no available publication to lend");			
		}
		this.lendedQuantity ++;
	}
	
	void returnPublication() {
		if (this.getLendedQuantity()<= 0)
			throw new RuntimeException("There is no Publication lended to return");
		this.lendedQuantity --;
	}

	public void setTitle(String title) {
		if (title ==  null || title.trim().isEmpty())
			throw new IllegalArgumentException("The title must be provided");
		this.title = title;
	}

	public int getOwnedQuantity() {
		return ownedQuantity;
	}

	public void setOwnedQuantity(int ownedQuantity) {
		if (ownedQuantity < 0)
			throw new IllegalArgumentException("Available quantity must be a positive value");
		if (ownedQuantity < this.getLendedQuantity())
			throw new IllegalArgumentException("Quantity lended is greater the the informed owned quantity");
		this.ownedQuantity = ownedQuantity;
	}

	public int getLendedQuantity() {
		return lendedQuantity;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		if (area == null || area.getName().trim().isEmpty()) {
			throw new IllegalArgumentException("Area can't be null");
		}
		this.area = area;
	}
	
	
	
	
}
