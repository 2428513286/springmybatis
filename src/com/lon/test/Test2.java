package com.lon.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lon.entity.Classes;
import com.lon.entity.Student;
import com.lon.service.BaseService;
import com.lon.service.ClassesService;
import com.lon.service.StudentService;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ClassesService cs = (ClassesService)ac.getBean("classesService");
		StudentService studentService = (StudentService)ac.getBean("studentService");
		
		/*
		Classes c = new Classes();
		c.setName("前端的开发");
		cs.add(c);*/
		
		/*Student s = new Student();
		s.setName("王");
		s.setUsername("laozi");
		s.setPassword("123456");
		s.setSex(1);
		s.setAge(25);
		s.setBirthday(new Date());
		s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		studentService.add(s);
		*/
		
		/*
		List<Classes> list = new ArrayList<>();
		for(int i=1;i<6;i++) {
			Classes c = new Classes();
			c.setName("前端"+i);
			list.add(c);
		}
		cs.addMore(list);*/
		/*
		List<Student> list = new ArrayList<>();
		for(int i=1;i<20;i++) {
			Student s = new Student();
			s.setName("王"+i);
			s.setUsername("laozi");
			s.setPassword("123456");
			s.setSex(1);
			s.setAge(25);
			s.setBirthday(new Date());
			s.setCreateTime(new Timestamp(System.currentTimeMillis()));
			list.add(s);
		}
		studentService.addMore(list);
		*/
		/*
		Classes c = new Classes();
		c.setId(9);
		c.setName("后台");
		cs.update(c);*/
		
		/*Student s = new Student();
		s.setId(3670);
		s.setName("林青霞");
		s.setUsername("linqingxia");
		s.setPassword("123456");
		s.setSex(1);
		s.setAge(25);
		s.setBirthday(new Date());
		s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		studentService.update(s);
		*/
		
		/*List<Classes> list = cs.queryAll(Classes.class);
		for(Classes c:list) {
			System.out.println(c);
		}*/
		/*List<Student> list = studentService.queryAll(Student.class);
		for(Student s:list) {
			System.out.println(s);
		}*/
		
		
//		System.out.println(cs.queryById(Classes.class,5));
		
		System.out.println(studentService.queryById(Student.class, 3670));
		
		/*String[] ids = {};
		cs.deleteMore(Classes.class, ids);*/
		
		
		
		System.out.println(studentService.getTotals(Student.class));
//		System.out.println(cs.getTotals(Classes.class));
		
		
		
		List<Student> list =studentService.queryByPage(Student.class, 10, 20);
		for(Student s:list) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}
