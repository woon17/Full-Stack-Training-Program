import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
public class Review {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "COMMENT")
	private String comment;
	
	/* 1. foreign key 
	 * 		-> create the object reference for the foreign key (private Course course;)
	 * 		-> @JoinColumn
	 * */

	// course is the foreign key -> create Course reference (will also be used in course class)
	// that course is displayed as courseId in review table -> @JoinColumn(name = "COURSEID")
	// many reviews to one course -> @ManyToOne relationship
	// delete review will not delete course -> cascade = { CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH }
	// 		do not choose CascadeType.REMOVE and CascadeType.ALL
//	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH })
//	// f_key
//	@JoinColumn(name = "COURSEID") // courseId from course table
//	private Course course;

	public Review() {

	}

	public Review(String comment) {
		super();
		this.comment = comment;
	}

	public Review(String comment, Course course) {
		super();
		this.comment = comment;
//		this.course = course;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", comment=" + comment + "]";
	}

}
