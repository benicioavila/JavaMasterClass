package com.br.master.NestedClasses;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10001,"Ralph",2015));
        employees.add(new Employee(10001,"Ralph",2015));

        Comparator comparator = new EmployeeComparator<>();
        employees.sort(comparator);

        for (Object e :
                employees) {
            System.out.println(e);

        }
    }
}
;