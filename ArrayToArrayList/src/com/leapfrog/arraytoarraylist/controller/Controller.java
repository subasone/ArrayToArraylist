/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraytoarraylist.controller;

import com.leapfrog.arraytoarraylist.entity.Student;
import com.leapfrog.arraytoarraylist.rawdata.RawData;
import com.leapfrog.arraytoarraylist.studentDAO.Impl.StudentDaoImpl;
import com.leapfrog.arraytoarraylist.studentDAO.StudentDao;

/**
 *
 * @author subas
 */
public class Controller {
    StudentDao stdDao = new StudentDaoImpl();
    
    public void addAll(){
        String[] arrayRaw = RawData.data();
        
        for(int i =0; i<6; i++){
            String[] element = arrayRaw[i].split(",");
            
            if(element.length >= 5){
                Student student = new Student();
                student.setId(Integer.parseInt(element[0]));
                student.setFirstName(element[1]);
                student.setLastName(element[2]);
                student.setEmail(element[3]);
                if(Integer.parseInt(element[4]) == 1){
                    student.setStatus(true);
                } else if(Integer.parseInt(element[4])==0){
                    student.setStatus(false);
                }
                
                boolean isEmail = stdDao.checkEmail(student);
                boolean isId = stdDao.checkID(student);
                
                if(isEmail == false && isId == false){
                    stdDao.add(student);
                }
            }
        }
    }
    
        public void showAll(){
            for(Student std : stdDao.showAll()){
                System.out.println("ID : " + std.getId());
                System.out.println("First Name : " + std.getFirstName());
                System.out.println("Last Name : " + std.getLastName());
                System.out.println("Email : " + std.getEmail());
                System.out.println("Status : " + std.isStatus());
            }
        }
}
