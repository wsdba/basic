package com.ladeal.basic.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ladeal.basic.dao.UserDao;
import com.ladeal.basic.model.User;


@Repository("userDao")
public class UserDaoImpl implements UserDao {

	 private SessionFactory sessionFactory;
     @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }

    public Session getCurrentSession(){
        return this.sessionFactory.getCurrentSession();
    }
	public Serializable saveDao(User user) {
		return sessionFactory.getCurrentSession().save(user);
	}
	public List<User> findAll(){
		Query query = sessionFactory.getCurrentSession().createQuery(" from User");
		List<User> list = query.list();
		if(list==null) {
			return null;
		}
		if(list.size()==0) {
			return null;
	//	 throw new RuntimeException("查询失败"); 
		}
         return list;
	}
	
	public void addUser(User user) {
		
		getCurrentSession().save(user);
	}
	

	public void delete(String id) {
		Query query = sessionFactory.getCurrentSession().createQuery(" from User  u where u.id=:id");
		query.setParameter("id",id);
		List<User> list = query.list();
		getCurrentSession().delete(list.get(0));
    }
	
}
