import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	// many courses to one student
	// do not choose CascadeType.REMOVE and CascadeType.ALL
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH })
	// f_key
	@JoinColumn(name = "studentId") // studentDetailId from student table
	private Student student;

	// course is the attribute in review class
	// delete course will delete all relevant reviews -> cascade = CascadeType.ALL
	// no f_key -> cannot use @JoinColumn, need to use mappedBy, mappedBy = "course"
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="COURSEID")
	private List<Review> reviews;

	public Course() {

	}

	public Course(String title) {
		super();
		this.title = title;
	}

	public void add(Review temReview) {
		if (this.reviews == null) {
			this.reviews = new ArrayList<>();

		} else {
			this.reviews.add(temReview);
			temReview.setCourse(this);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", student=" + student + "]";
	}

}
