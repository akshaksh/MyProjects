package manytomany_uni.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
@Id
@Column(name="id")
private int id;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastName;
@Column(name="email")
private String email;

/*@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinTable(name="course_student",
joinColumns=@JoinColumn(name="student_id"),
inverseJoinColumns=@JoinColumn(name="course_id"))
Required in case of Bidirection	
*/private List<Course> courses;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String toString() {
	return "[ id="+id+", name="+firstName+lastName+", email="+email+"]";
}
}
