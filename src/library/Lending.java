package library;

import java.time.LocalDate;
import java.time.Period;

import model.DomainObjectAbstract;
import person.Student;

public class Lending extends DomainObjectAbstract{
	private LocalDate start, end, dueDate;
	private Student student;
	private Publication publication;
	
	public Lending(long id, Student student, Publication publication, LocalDate dueDate) {
		super(id);
		publication.lend();		
		this.start = LocalDate.now();
		this.end = null;
		this.dueDate = dueDate;
		this.student = student;			
	}
	
	public void returnPublication() {
		if (this.end != null)
			throw new IllegalArgumentException("Publication already returned");
		this.end = LocalDate.now();
		this.publication.returnPublication();
	}
	
	public int getDaysOverDue() {
		LocalDate tempDate = this.dueDate;
		if (tempDate == null)
			tempDate = LocalDate.now();
		if (this.dueDate.isBefore(tempDate)){
			return Period.between(dueDate, tempDate).getDays();
		}else return 0;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	
	

}
