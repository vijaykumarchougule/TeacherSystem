/**
 * 
 */
package com.teachersystem.services;

import java.util.List;

import com.teachersystem.entities.Teacher;

/**
 * @author vijay
 *
 */
public interface TeacherService {

	Teacher createTeacher(Teacher teacher);
	
	List<Teacher> getAllTeachers();
	
	Teacher getTeacher(String id);
}
