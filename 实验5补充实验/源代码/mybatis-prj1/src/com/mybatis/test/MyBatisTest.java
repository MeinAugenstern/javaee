package com.mybatis.test;
import java.io.*;
import java.util.*;
import java.sql.*;
import com.mybatis.po.MyUser;
import com.mybatis.po.Person;
import com.pojo.MapUser;
import com.pojo.SelectPersonById;
import com.pojo.SelectUserParam;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisTest {

	public static void main(String[] args){
		try {
			InputStream config=Resources. 
				getResourceAsStream("mybatis-config.xml"); 
		SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
		SqlSession ss=ssf.openSession(); 
		
		//查询一个用户 
		/*MyUser mu = ss.selectOne("com.mybatis.ma	pper.UserMapper.selectUserById", 1) ;
				System.out.println("用户姓名为："+mu.getUname());
				System.out.println("用户性别为："+mu.getUsex());
				*/
		//添加一个用户
		/*MyUser addmu=new MyUser(); 
		addmu.setUname("张三"); 
		addmu.setUsex("男"); 
		ss.insert("com.mybatis.mapper.UserMapper.addUser",addmu); 
		System.out.println("已添加一条数据");*/
		/*MapUser addmu=new MapUser(); 
		addmu.setM_uname("张三"); 
		addmu.setM_usex("男"); 
		int i =ss.insert("com.mybatis.mapper.UserMapper.addUser",addmu); 
		System.out.println("已添加"+i+"数据");*/
		
		//修改一个用户 
		/*MyUser updatemu=new MyUser();
		updatemu.setUid(5);
		updatemu.setUname("李四");
		updatemu.setUsex("男");
		ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
		System.out.println("已更新一条数据");*/
		/*MapUser updatemu=new MapUser(); 
		updatemu.setM_uid(5);
		updatemu.setM_uname("李四");
		updatemu.setM_usex("男");
		int i =ss.update("com.mybatis.mapper.UserMapper.updateUser",updatemu); 
		System.out.println("已更新编号为"+updatemu.getM_uid()+"数据");*/
		//删除一个用户 ……
		/*MyUser deletemu=new MyUser();
		deletemu.setUid(5);
		ss.delete("com.mybatis.mapper.UserMapper.deleteUser", deletemu);
		System.out.println("已删除Uid为"+deletemu.getUid()+"的用户");*/
		/*MapUser deletemu=new MapUser(); 
		deletemu.setM_uid(5);
		int i =ss.update("com.mybatis.mapper.UserMapper.deleteUser",deletemu); 
		System.out.println("已删除编号为"+deletemu.getM_uid()+"数据");*/
		
		//查询所有用户 ……
		/*
		List list=ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
		Iterator<MyUser> iterator=list.iterator();
		while(iterator.hasNext()) {
			MyUser a=iterator.next();
			System.out.println("编号为:"+a.getUid()+"姓名为:"+a.getUname()+"性别为:"+a.getUsex());
		}
		*/
		/*Map<String, Object> map=new HashMap<>(); 
		map.put("u_name", "陈"); 
		map.put("u_sex", "男"); 
		List<MyUser> list=ss.selectList ("com.mybatis.mapper.UserMapper.selectAllUser",map); 
		for(MyUser myUser : list){ 
			System.out.println("编号为:"+myUser.getUid()+"姓名为:"+myUser.getUname()+"性别为:"+myUser.getUsex()); 
			}*/
		/*SelectUserParam su = new SelectUserParam(); 
		su.setU_name("陈"); 
		su.setU_sex("男"); 
		List<MyUser> list=ss.selectList ("com.mybatis.mapper.UserMapper.selectAllUser",su); 
		for(MyUser myUser : list){ 
			System.out.println("编号为:"+myUser.getUid()+"姓名为:"+myUser.getUname()+"性别为:"+myUser.getUsex()); 
			}*/
		/*
		List<Map<String, Object>> lmp=ss.selectList ("com.mybatis.mapper.UserMapper.selectAllUser"); 
		for(Map<String, Object> myUser : lmp){ 
			System.out.println("编号为:"+myUser.get("uid")+"姓名为:"+myUser.get("uname")+"性别为:"+myUser.get("usex")); 
			}
		*/
		/*List<MapUser> list=ss.selectList("com.mybatis.mapper.UserMapper.selectResultMap");
		for(MapUser mapuser : list) {
			System.out.println(mapuser);
		}*/
		
		/*Person p1=ss.selectOne("com.dao.PersonDao.selectPersonById1",1);
        System.out.println(p1);
        Person p2=ss.selectOne("com.dao.PersonDao.selectPersonById2",1);
        System.out.println(p2);
        SelectPersonById p3=ss.selectOne("com.dao.PersonDao.selectPersonById3",1);
        System.out.println(p3);*/
		MyUser auser1=ss.selectOne("com.mybatis.mapper.UserMapper.selectUserOrdersById1",1);
        System.out.println(auser1);
        MyUser auser2=ss.selectOne("com.mybatis.mapper.UserMapper.selectUserOrdersById2",1);
        System.out.println(auser1);
        List<SelectPersonById> auser3=ss.selectList("com.mybatis.mapper.UserMapper.selectUserOrdersById3",1);
        System.out.println(auser3);
		ss.commit(); 
		ss.close(); 
		} catch (IOException e) { 
		e.printStackTrace(); 
		} 
	}
}
