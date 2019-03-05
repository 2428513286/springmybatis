package com.lon.dao.impl;

import org.springframework.stereotype.Repository;

import com.lon.dao.ClassesDao;
import com.lon.entity.Classes;

@Repository("classesDao")
public class ClassesDaoImpl extends BaseDaoImpl<Classes> implements ClassesDao{

}
