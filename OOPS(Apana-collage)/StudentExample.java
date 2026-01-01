class Student{
    String name;
    int age;
    int roll;
    String branch;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
        System.out.println(this.branch);
    }

    Student(String name, int age, int roll,String branch)   {
        this.name= name;
        this.age = age;
        this.roll = roll;
        this.branch=branch;
    }

}

public class StudentExample {
    public static void main(String[] args) {
       Student s1 = new Student("aman", 22,56,"AIML");
       s1.printInfo();
    }
}
