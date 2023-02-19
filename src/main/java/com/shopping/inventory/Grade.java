package com.shopping.inventory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;
import lombok.Data;
//Creating a new table named grades
@Data
@Entity
@Table(name="grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(name="grade_name", columnDefinition="TEXT")
    private String gradeName;
    @Column(name="student_count", columnDefinition="TEXT")
    private int studentCount;
    @Column(name="teacher_name", columnDefinition="TEXT")
    private String teacherName;   
}
