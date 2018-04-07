package onetomany_uni.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {
@Id
@Column(name="id")
int id;

@Column(name="name")
String name;

@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinColumn(name="course_id")
List<Review> reviews;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Review> getReviews() {
	return reviews;
}
public void setReviews(List<Review> reviews) {
	this.reviews = reviews;
}

public String toString() {
	return "[id="+id+", "+"name="+name+","+"reviews="+reviews+"]";
}

}
