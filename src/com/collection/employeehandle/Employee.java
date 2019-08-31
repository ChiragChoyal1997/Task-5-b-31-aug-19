package com.collection.employeehandle;
/**
 *
 * @author Chirag
 */
public class Employee implements Comparable<Employee>{
    private int eno;
    private String ename;
    private int salary;
    private String desg;
    private String dept;

    @Override
    public int hashCode() {
        return eno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.eno != other.eno) {
            return false;
        }
        return true;
    }
   
    public Employee(){
        
    }
    public Employee(int eno, String ename, int salary, String desg, String dept) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.desg = desg;
        this.dept = dept;
    }

    public int getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesg() {
        return desg;
    }

    public String getDept() {
        return dept;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", desg=" + desg + ", dept=" + dept + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.eno - o.eno;
    }
}
