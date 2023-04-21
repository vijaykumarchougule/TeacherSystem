/**
 * 
 */
package com.teachersystem.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachersystem.entities.Teacher;
import com.teachersystem.exceptions.ResourceNotFoundException;
import com.teachersystem.repositories.TeacherRepository;
import com.teachersystem.services.TeacherService;

/**
 * @author vijay
 *
 */

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
	
		String teacherId = UUID.randomUUID().toString();
		teacher.setTeacherId(teacherId);
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
	
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacher(String id) {
		
		return teacherRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Given Id not Found"));
	}

}
