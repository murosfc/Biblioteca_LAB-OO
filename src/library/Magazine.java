package library;

public class Magazine extends Publication{
	private int frequencyInDays;
	
	public Magazine(long id, String title, int availableQuantity, int lendedQuantity, Area area, int frequencyInDays) {
		super(id, title, availableQuantity, lendedQuantity, area);
		this.frequencyInDays = frequencyInDays;
	}

	public int getFrequencyInDays() {
		return frequencyInDays;
	}

	public void setFrequencyInDays(int frequencyInDays) {
		if (frequencyInDays <0)
			throw new IllegalArgumentException("Frequency can't be less than 0");
		this.frequencyInDays = frequencyInDays;
	}
}
