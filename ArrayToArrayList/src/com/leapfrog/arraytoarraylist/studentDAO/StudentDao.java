/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraytoarraylist.studentDAO;

import com.leapfrog.arraytoarraylist.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author subas
 */
public interface StudentDao {
    boolean add(Student std);
    ArrayList<Student> showAll();
    boolean checkEmail(Student std);
    boolean checkID(Student std);
    
}
