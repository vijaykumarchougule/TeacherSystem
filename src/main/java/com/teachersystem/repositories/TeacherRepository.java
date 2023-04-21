/**
 * 
 */
package com.teachersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teachersystem.entities.Teacher;

/**
 * @author vijay
 *
 */
public interface TeacherRepository extends JpaRepository<Teacher, String> {

}
