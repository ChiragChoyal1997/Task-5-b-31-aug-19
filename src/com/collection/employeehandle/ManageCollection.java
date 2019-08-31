package com.collection.employeehandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ManageCollection{
        Scanner sc = new Scanner(System.in);
    public ArrayList<Employee> addEmployee(ArrayList<Employee> emplist){
                Employee e = new Employee();
                System.out.print("Enter EmpNo :- ");
                e.setEno(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter EmpName :- ");
                String name = sc.nextLine();
                e.setEname(name);
                System.out.print("Enter Salary :- ");
                e.setSalary(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter Designation :- ");
                e.setDesg(sc.next());
                sc.nextLine();
                System.out.print("Enter Department :- ");
                e.setDept(sc.next());
                sc.nextLine();
                
                emplist.add(e);
                Collections.sort(emplist);
                return emplist;
    }
    public void showAllEmployee(ArrayList<Employee> emplist){
        for(Employee emp:emplist){
                    System.out.println(emp.toString());
                }
    }
    public void clearList(ArrayList<Employee> emplist){
        emplist.clear();
    }
    
    public ArrayList<Employee>  removeEmployee(ArrayList<Employee> emplist,HashMap<Integer,Integer> hm){
        System.out.println("Enter Employee Id :- ");
        int empno = sc.nextInt();
        boolean employeefound = false;
        if( hm.get(empno) != null){
            emplist.remove((int)hm.get(empno));
            employeefound = true;
        }
        
        if(employeefound){
            System.out.println("Employee removed from record");
        } 
        else{
            System.out.println("Employee not found in record");
        }
        return emplist;
    }
    
    public ArrayList<Employee> updateSalary(ArrayList<Employee> emplist,HashMap<Integer,Integer> hm){
        System.out.print("Enter Employee Id :- ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new salary :-");
        int sal = sc.nextInt();
        sc.nextLine();
        boolean employeefound = false;
        if(hm.get(empid) != null){
            emplist.get((int)hm.get(empid)).setSalary(sal);
            employeefound = true;
        }

        if (employeefound) {
            System.out.println("Salary Updated !");
        } else {
            System.out.println("Employee not found !");
        }
        return  emplist;
    }
    
    public void searchEmployee(ArrayList<Employee> emplist,HashMap<Integer,Integer> hm){
        System.out.println("Enter employee id");
        int empid = sc.nextInt();
        if(hm.get(empid) != null){
             System.out.println(emplist.get((int)hm.get(empid)));
        }
        else{
            System.out.println("Employee not found in record!");
        }
    }
    
    public ArrayList<Employee> departmentWiseList(ArrayList<Employee> emplist){
        System.out.println("Which department?");
        String deptname = sc.next();
        sc.nextLine();
        ArrayList<Employee> deptWiseList = new ArrayList<>();
        Iterator<Employee> it = emplist.iterator();
        
        while (it.hasNext()) {
            Employee next = it.next();
            if(next.getDept().equals(deptname)){
                deptWiseList.add(next);
            }
        }
        return deptWiseList;
    }
    
    public void sortEmployee(ArrayList<Employee> emplist){
        System.out.println("Sort on which field -> ");
        System.out.println("1. Employee Id");
        System.out.println("2. Employee Name");
        System.out.println("3. Employee Salary");
        System.out.println("4. Exit from sorting menu");
        System.out.println("-------------------------------");
        System.out.print("Enter field -> ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice){
            case 1:
                for (Employee next : emplist) {
                    System.out.println(next);
                }
                break;
           case 2:
                emplist.sort(new SortingByName());
                for (Employee employee : emplist) {
                    System.out.println(employee);
               }
                break;
            case 3:
                emplist.sort(new SortingBySalary());
                for (Employee employee : emplist) {
                    System.out.println(employee);
                }
                break;
            default:
                break;
        }
    }
}