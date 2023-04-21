/**
 * 
 */
package com.teachersystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teachersystem.entities.Teacher;
import com.teachersystem.services.TeacherService;

/**
 * @author vijay
 *
 */

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping
	public ResponseEntity<Teacher> crateTeacher(@RequestBody Teacher teacher){
		return ResponseEntity.status(HttpStatus.CREATED).body(teacherService.createTeacher(teacher));
	}
	
	@GetMapping("/{teacherId}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable String teacherId){
		return ResponseEntity.status(HttpStatus.OK).body(teacherService.getTeacher(teacherId));
	}
	
	@GetMapping
	public ResponseEntity<List<Teacher>> getAllTeacher(){
		
		return ResponseEntity.ok(teacherService.getAllTeachers());
	}
	
}
