package com.smartframework.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.smartframework.annotation.Service;
import com.smartframework.practice.entity.Student;
import com.smartframework.practice.util.JDBCUtil;

/**
 * 学生信息接口实现类
* <p>Title: StudentDaoImpl.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-10-01_09:56:37
* @version 1.0
 */
@Service
public class StudentDaoImpl implements StudentDao {

	/**
	 * 向student表中添加学生信息
	* <p>Title: addStudentInfo<／p>
	* <p>Description: <／p>
	* @param student 存有学生信息的实体类
	* @return	int型数据，0代表插入失败，大于0代表插入成功
	 */
	public int addStudentInfo(Student student) {
		int count = 0;
		//和数据库建立连接
		Connection connection ;
		try {
			connection = JDBCUtil.getConnection();
			//编写sql语句
			String sql = "insert into student values(null,'"+student.getName()+"','"+student.getSex()+"',"+student.getYear()+")";
			//获取Statement 对象
			Statement statement = (Statement) connection.createStatement();
			//调用executeUpdate 方法，执行sql语句
			count = statement.executeUpdate(sql);
			//关流
			JDBCUtil.closeJDBC(statement, connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * 根据学生id 删除学生信息
	* <p>Title: deleteStudentInfoById<／p>
	* <p>Description: <／p>
	* @param id 学生id
	* @return int型数据，0代表删除失败，大于0代表删除成功
	 */
	public int deleteStudentInfoById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据学生id 更新指定学生的信息
	* <p>Title: updateStudentInfoById<／p>
	* <p>Description: <／p>
	* @param student
	* @return int型数据，0代表更新失败，大于0代表更新成功
	 */
	public int updateStudentInfoById(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据学生id查询学生信息
	* <p>Title: findStudentById<／p>
	* <p>Description: <／p>
	* @param id
	* @return 存有学生信息的实体类
	 */
	public Student findStudentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据学生姓名查询学生信息
	* <p>Title: findStudentByName<／p>
	* <p>Description: <／p>
	* @param studentName
	* @return 存有 所有name 是 studentName 的学生的信息
	 */
	public List<Student> findStudentByName(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 分页查询数据
	* <p>Title: findStudentByPageIndexAndPageSize<／p>
	* <p>Description: <／p>
	* @param pageIndex 想要查询的页码
	* @param pageSize 每页的容量
	* @return List 存有指定页的学生的信息
	 */
	public List<Student> findStudentByPageIndexAndPageSize(Long pageIndex, Long pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 获取所有学生的信息
	* <p>Title: findAllStudent<／p>
	* <p>Description: <／p>
	* @return 存所有学生信息的List集合
	 */
	public List<Student> findAllStudent() {
		ResultSet set ;
		List<Student>list = new ArrayList<Student>();
		//和数据库建立连接
		Connection connection;
		try {
			connection = JDBCUtil.getConnection();
			//编写sql语句
			String sql = "select * from student ";
			//获取Statement 对象
			Statement statement = (Statement) connection.createStatement();
			Student student1 ;
			list = new ArrayList<Student>();
			//调用executeUpdate 方法，执行sql语句
			set = statement.executeQuery(sql);
			while (set.next()) {
				student1 = new Student();
				//索引从1开始
				student1.setId(set.getLong(1));
				student1.setName(set.getString(2));
				student1.setSex(set.getString(3));
				student1.setYear(set.getLong(4));
				list.add(student1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
