package onetomany_uni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {

@Id
@Column(name="id")
int id;

@Column(name="course_comment")
String comments;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String toString() {
	return "[id="+id+", "+"comment="+comments+"]";
}

}
