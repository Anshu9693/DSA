public class Main {

    public class Humans {
        int age;
        String name;
        int salary;
        boolean isMarried;
        static int noOfHumans = 0;

        public Humans(int age, String name, int salary, boolean isMarried) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.isMarried = isMarried;
            Humans.noOfHumans++;
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Humans a = mainObj.new Humans(22, "anshu kumar", 100000, false);
        System.out.println(a.noOfHumans);
    }
}
