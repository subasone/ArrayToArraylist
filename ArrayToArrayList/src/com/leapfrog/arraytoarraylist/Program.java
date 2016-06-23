/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraytoarraylist;

import com.leapfrog.arraytoarraylist.controller.Controller;

/**
 *
 * @author subas
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addAll();
        controller.showAll();

    }

}
