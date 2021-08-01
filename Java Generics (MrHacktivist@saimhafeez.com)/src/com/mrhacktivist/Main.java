package com.mrhacktivist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Students students = new Students();
        Employees employees = new Employees();

        GenericRead_Write generic_Std = new GenericRead_Write(students);
        GenericRead_Write generic_Emp = new GenericRead_Write(employees);

        ArrayList<Students> list_std;
        ArrayList<Employees> list_emp;
        list_std = generic_Std.read();
        list_emp = generic_Emp.read();

        for (Students std: list_std) {
            std.showData();
        }

        for (Employees std: list_emp) {
            std.showData();
        }
    }
}
