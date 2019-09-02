package com.collection.employeehandle;

import java.util.Comparator;
import com.collection.employeehandle.Employee;

/**
 *
 * @author Chirag
 */
public class SortingByName implements Comparator<Employee>{
    
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEname().compareToIgnoreCase(o2.getEname());
    }
}
