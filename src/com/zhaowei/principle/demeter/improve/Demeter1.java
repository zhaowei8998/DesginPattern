package com.zhaowei.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用迪米特法则改进");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//总部员工
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工管理
class CollegeManager{
    //返回所有学院员工列表
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            CollegeEmployee college = new CollegeEmployee();
            college.setId("学院员工ID："+i);
            list.add(college);
        }
        return list;
    }
    public void printAllEmployee(){
        List<CollegeEmployee> list = getAllEmployee();
        System.out.println("--------分公司员工--------");
        list.forEach(l->{
            System.out.println(l.getId());
        });
    }
}

//学校员工管理
//直接朋友 Employee，CollegeManager
//陌生朋友 CollegeEmployee，违背迪米特法则
class SchoolManager{
    //返回所有学校员工列表
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for(int i = 0;i<5;i++){
            Employee college = new Employee();
            college.setId("学校总部员工ID："+i);
            list.add(college);
        }
        return list;
    }
    void printAllEmployee(CollegeManager sub){
        sub.printAllEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("--------总部员工--------");
        list2.forEach(l->{
            System.out.println(l.getId());
        });
    }
}