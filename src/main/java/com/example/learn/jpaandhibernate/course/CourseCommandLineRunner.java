package com.example.learn.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learn.jpaandhibernate.course.Course;
import com.example.learn.jpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.learn.jpaandhibernate.course.jpa.CourseJpaRepository;
import com.example.learn.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(1,"Learn AWS","Learn Amazon aws"));
//		repository.insert(new Course(2,"Learn azure","Learn Microsoft azure"));
//		repository.insert(new Course(3,"Learn GCP","Learn Google GCP"));
		
		repository.save(new Course(1,"Learn AWS","Learn Amazon aws"));
		repository.save(new Course(2,"Learn azure","Learn Microsoft azure"));
		repository.save(new Course(3,"Learn GCP","Learn Google GCP"));
		repository.deleteById(2l);
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Learn Amazon aws"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn AWS"));
		System.out.println(repository.findByName(""));
		
		System.out.println(repository.findByNameAndAuthor("Learn AWS","Learn Amazon aws"));
		System.out.println(repository.findByNameAndAuthor("Learn AWS", "fcgh"));

		System.out.println(repository.findByNameOrAuthor("Learn AWS","Learn Amazon aws"));
		System.out.println(repository.findByNameOrAuthor("Learn AWS", "fcgh"));
	}

}
