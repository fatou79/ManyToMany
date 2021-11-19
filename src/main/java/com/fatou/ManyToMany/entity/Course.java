package com.fatou.ManyToMany.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Course {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	
	@ManyToMany(mappedBy="courses")
	private List<Student> students = new ArrayList<>();
	

	public Course() {
		super();
	}

	public Course(String name) {
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

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	
	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student students) {
		this.students.add(students);
	}
	
	public void removeStudents(Student students) {
		this.students.remove(students);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", lastUpdatedDate=" + lastUpdatedDate + ", createdDate="
				+ createdDate + "]";
	}
	
	
	
	
	
	
	
				

	
	
	
	

}
