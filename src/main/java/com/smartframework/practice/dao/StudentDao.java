package com.smartframework.practice.dao;

import java.util.List;

import com.smartframework.annotation.Service;
import com.smartframework.practice.entity.Student;

/**
 * 查询学生表接口
* <p>Title: StudentDao.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-10-01_09:38:15
* @version 1.0
 */
public interface StudentDao {

	/**
	 * 向student表中添加学生信息
	* <p>Title: addStudentInfo<／p>
	* <p>Description: <／p>
	* @param student 存有学生信息的实体类
	* @return	int型数据，0代表插入失败，大于0代表插入成功
	 */
	public int addStudentInfo(Student student);
	
	/**
	 * 根据学生id 删除学生信息
	* <p>Title: deleteStudentInfoById<／p>
	* <p>Description: <／p>
	* @param id 学生id
	* @return int型数据，0代表删除失败，大于0代表删除成功
	 */
	public int deleteStudentInfoById(Long id);
	
	/**
	 * 根据学生id 更新指定学生的信息
	* <p>Title: updateStudentInfoById<／p>
	* <p>Description: <／p>
	* @param student
	* @return int型数据，0代表更新失败，大于0代表更新成功
	 */
	public int updateStudentInfoById(Student student);
	
	/**
	 * 根据学生id查询学生信息
	* <p>Title: findStudentById<／p>
	* <p>Description: <／p>
	* @param id
	* @return 存有学生信息的实体类
	 */
	public Student findStudentById(Long id);
	
	/**
	 * 根据学生姓名查询学生信息
	* <p>Title: findStudentByName<／p>
	* <p>Description: <／p>
	* @param studentName
	* @return 存有 所有name 是 studentName 的学生的信息
	 */
	public List<Student> findStudentByName(String studentName);
	
	/**
	 * 分页查询数据
	* <p>Title: findStudentByPageIndexAndPageSize<／p>
	* <p>Description: <／p>
	* @param pageIndex 想要查询的页码
	* @param pageSize 每页的容量
	* @return List 存有指定页的学生的信息
	 */
	public List<Student> findStudentByPageIndexAndPageSize(Long pageIndex,Long pageSize);
	
	/**
	 * 获取所有学生的信息
	* <p>Title: findAllStudent<／p>
	* <p>Description: <／p>
	* @return 存所有学生信息的List集合
	 */
	public List<Student> findAllStudent();
	
}
