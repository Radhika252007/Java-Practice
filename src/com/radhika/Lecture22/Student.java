package com.radhika.Lecture22;

public class Student {
    String name;
    int rollNo;
    double marks;
    static int totalStudents = 0;
    public Student(){
        this("Unknown",0,0);
    }
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        totalStudents++;
    }
    char calculateGrade(){
        if(this.marks>=90){
            return 'A';
        }
        else if (this.marks<90 && this.marks>=75) {
            return 'B';
        }
        else if (this.marks<75 && this.marks>=50) {
            return 'C';
        }
        return 'F';
    }
    void displayDetails(){
        System.out.println(this.name+"("+this.rollNo+") Marks: "+this.marks+" Grade: "+calculateGrade());
    }

    public static void main(String[] args) {
        Student[] arr = new Student[3];

        arr[0]= new Student("Radhika",12,95);
        arr[1]= new Student("Ayaan",45,45);
        arr[2]= new Student("Bob",14,78);
        System.out.println("Total Students: "+ totalStudents);
        for(int i=0;i<3;i++){
            arr[i].displayDetails();
        }

    }


}
