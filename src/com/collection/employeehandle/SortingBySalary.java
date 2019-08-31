package com.collection.employeehandle;

import java.util.Comparator;

/**
 *
 * @author Chirag
 */
public class SortingBySalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()-o2.getSalary();
    }
    
}
