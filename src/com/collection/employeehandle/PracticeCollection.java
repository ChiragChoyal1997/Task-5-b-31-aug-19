package com.collection.employeehandle;
import java.util.*;
/**
 *
 * @author Chirag
 */
public class PracticeCollection {
    public static void main(String[] args) {
        
        ArrayList<Employee> emplist = new ArrayList<>();
        HashMap<Integer,Integer> empindexmapping = new HashMap<>();
        ManageCollection mng = new ManageCollection();
        int optionno = 0;
        int i=0;
        Scanner sc = new Scanner(System.in);
        
        while(optionno != 9){
        System.out.println("-----------------------------");
        System.out.println("Welcome To Dashboard");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Clear Data");
        System.out.println("5. Change Salary");
        System.out.println("6. Search Employee");
        System.out.println("7. View dept-wise-list");
        System.out.println("8. View Sorted Employees");
        System.out.println("9. Exit");
        System.out.println("-----------------------------");
        System.out.print("Enter Your Choice :- ");
        
        optionno = sc.nextInt();
        
        switch(optionno){
            case 1:
            {
                emplist = mng.addEmployee(emplist);
                break;
            }
            case 2:
            {
                mng.showAllEmployee(emplist);
                break;
            }
            case 3:
            {
                emplist = mng.removeEmployee(emplist,empindexmapping);
                break;
            }
            case 4:
            {
                mng.clearList(emplist);
                break;
            }
            case 5:
            {
                emplist = mng.updateSalary(emplist,empindexmapping);
                break;
            }
            case 6:
            {
                mng.searchEmployee(emplist,empindexmapping);
                break;
            }
            case 7:
            {
                for(Employee e:mng.departmentWiseList(emplist)){
                    System.out.println(e);
                }
                break;
            }
            case 8:
            {
                mng.sortEmployee(emplist);
                break;
            }
            default:
            {
                break;
                            
            }
        }
        } 
    }
}
