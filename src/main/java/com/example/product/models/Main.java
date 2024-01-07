package com.example.product.models;

import java.util.*;

class Person {
    private String name;
    private String address;

}

class Teacher extends Person {
    private int id;
    private String salary;

    public Teacher(int id, String salary) {
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

class Student extends Person {
    private int credits = 0;

    public Student(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object object) {
        return (object instanceof Student) ? (((Student) object).getCredits() == this.credits) : false;
    }

}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(11);
        Student s3 = new Student(121);
        List<Student> list = new ArrayList<>();
        list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s1);
        list.add(s3);
        list.forEach(x ->{
            System.out.println(x.getCredits());
        });
        list.remove(new Student(1112));
        System.out.println("--------------");
        list.forEach(x ->{
            System.out.println(x.getCredits());
        });
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

// LinkedList phù hợp trong th thêm sửa xóa còn lưu dữ liệu dùng  ArrayList
        // Nên dùng cách sử dụng interface để trỏ đến đối tượng con (List<> list = new ArrayList<()) thể hiện tính đa hình vì nó không chỉ rõ là dùng class nào;
        // Trong Vector mọi hàm đều là đồng bộ(chờ nhau để chạy), chươngtrinhfh sẽ bị chạy chậm nhưng bảo mật cao
    }
}