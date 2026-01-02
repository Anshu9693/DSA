class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        
    }

}

public class NonparaMeteriseConstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "anshu";
        s1.age = 22;
        s1.printInfo();
    }

}
