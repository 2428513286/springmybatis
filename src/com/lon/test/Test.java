package com.lon.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lon.dao.StudentDao;
import com.lon.entity.Student;
import com.lon.service.StudentService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		StudentDao dao = (StudentDao)ac.getBean("studentDao");
		StudentService dao = (StudentService)ac.getBean("studentService");
		
		/*
		Student s = new Student();
		s.setName("老");
		s.setUsername("laozi");
		s.setPassword("123456");
		s.setSex(1);
		s.setAge(25);
		s.setBirthday(new Date());
		s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		dao.add(s);
		*/
		/*
		List<Student> list = new ArrayList<>();
		for(int i=1;i<20;i++) {
			Student s = new Student();
			s.setName("老"+i);
			s.setUsername("laozi"+i);
			s.setPassword("123456");
			s.setSex(1);
			s.setAge(25);
			s.setBirthday(new Date());
			s.setCreateTime(new Timestamp(System.currentTimeMillis()));
			list.add(s);
		}
		dao.addMore(list);
		*/
		
//		System.out.println(dao.queryById(2555));
		
		
		/*
		List<Student> list = dao.queryByPage(10, 20);
		for(Student s:list) {
			System.out.println(s);
		}
		*/
		
//		System.out.println(dao.getTotals());
		
//		System.out.println(dao.queryByPage(25, 30));
		
		
		
		
		
		
		
	}
}
