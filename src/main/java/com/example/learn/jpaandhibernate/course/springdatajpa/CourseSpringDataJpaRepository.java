package com.example.learn.jpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learn.jpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);
	List<Course> findByNameAndAuthor(String name,String author);
	List<Course> findByNameOrAuthor(String name,String author);
}
