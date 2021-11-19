package com.fatou.ManyToMany;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fatou.ManyToMany.entity.Course;
import com.fatou.ManyToMany.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	private Logger friday = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	public Student findById(Long id) {
		return em.find(Student.class, id);
	
	}
	
	public Student save(Student student) {
		if(student == null) {
			em.persist(student);
			}else {
				em.merge(student);
			}
		return student;
	}
	
	
	public void deletedById(Long id) {
		Student student = findById(id);
				em.remove(student);
	}
	
	public void inserHardcodeStudentANDCourse() {
		Student student = new Student("Ahmad");
		em.persist(student);
		
		Course course = new Course("Learn how to deploy");
		em.persist(course);
		
		
		student.addCourses(course);
		course.addStudents(student);
		
		
		
		
		
	}
	
}

	
	
	
	
	
	
	


