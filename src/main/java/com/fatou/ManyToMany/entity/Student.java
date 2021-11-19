package com.fatou.ManyToMany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@ManyToMany
	@JoinTable(name ="Student_COURSE",
	joinColumns = @JoinColumn(name="STUDENT_ID"),
	inverseJoinColumns = @JoinColumn(name="Course_ID"))
	private List<Course> courses = new ArrayList<>();

	public Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourses(Course courses) {
		this.courses.add(courses);
	}
	
	public void removeCourses(Course courses) {
		this.courses.remove (courses);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}

	
	
	
	
	
	
	
	}
