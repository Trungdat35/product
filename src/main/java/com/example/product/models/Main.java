package com.example.product.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Person{
    private String name;
    private String address;

}
class Teacher extends Person{
    private int id;
    private String salary;
    public Teacher( int  id,String salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
class Student extends Person{
    private int credits = 0;

    @Override
    public boolean equals(Object object){
        if(object instanceof Student){
            return true ;
        }
        return false;
    }

}
public class Main {
    public static void main(String[] args) {
//Equals
//        Teacher ada = new Teacher();
//        Person person  = new Person();
//        Student student = new Student();
//        System.out.println(student.equals(person));

//Hashcode phải ghi đè cả equals mới dùng được hashcode
//        Teacher teacher1 = new Teacher(1,"a");
//        Teacher teacher2 = new Teacher(1,"a");
//        System.out.println(teacher1.hashCode());
//        System.out.println(teacher2.hashCode());
//        Set<Teacher> teacherSet = new HashSet<>();
//        teacherSet.add(teacher1);
//        teacherSet.add(teacher2);
//        for (Teacher element:teacherSet
//             ) {
//            System.out.println(element);
//        }
//  Wrapper class và unboxing
//        int x1 = 10;
//        Integer x2 = 10;
//        System.out.println(x1==x2);
 // Trong bộ nhớ Ram phân thành 2 phân vùng chính là Stack và Heap
// Bộ nhớ stack có bộ nhớ nhỏ hơn dùng để lưu biến cục bộ, các hàm, hoặc các biến tham chiếu
// Bộ nhớ heap chỉ dùng để lưu đối tượng, khi ta dùng từ khóa new đối tượng sẽ đc lưu vào bộ nhớ heap
        // khi các đối tượng k được sử dụng java sẽ tự động xóa các đối tượng đó trong heap.
    }
}