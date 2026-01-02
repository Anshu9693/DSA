class Student{
    String name; 
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        
    }
    Student(Student s2){
        this.name = s2.name;
        this.age  = s2.age;
    }
    
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "anshu";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
