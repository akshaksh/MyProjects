package hql;

import javax.persistence.*;
@Entity
@Table(name="employeerecord")
@NamedQueries({
	@NamedQuery(name="allrecords",query="from Employeerecords"),
	@NamedQuery(name="count",query="select count(*) from Employeerecords")
	})
public class Employeerecords {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
int id;
@Column(name="name")
String name;
@Column(name="email")
String email;
@Column(name="phonenumber")
Long phonenumber;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Long phonenumber) {
	this.phonenumber = phonenumber;
}
}
