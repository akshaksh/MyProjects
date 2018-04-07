package com.luv2code.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//annotate the class as entity and map to db table

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="YOUTUBE_CHANNEL")
	private String youtubeChannel;
	@Column(name="HOBBY")
	private String hobby;
	//this tell us the instructor detail property name in the Instructor Class
	//e.g. private InstructorDetail instructor_detail_id;
	/*
	 * mappedBy tell hibernate 
	 * a)Look at the instructor detail property in the Instructor class
	 * b)Use Information from the Instructor class @JoinColumn
	 * c)To help find associated instructor 
	 * CascadeType.ALL 
	 * for cascading operation in Instructor
	 */
	//@OneToOne(mappedBy="instructor_detail_id",cascade=CascadeType.ALL)
	//Changing the cascade to delete only instructor_detail not the instructor
	//assign all value except remove
	@OneToOne(mappedBy="instructor_detail_id",cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Instructor instructor; 
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYoutubeChannel() {
		return youtubeChannel;
	}
	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString(){
		return "InstructorDetail:[id="+id+", youtube_channel="+youtubeChannel+",  hobby="+hobby+"]";
	}
}
