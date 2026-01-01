
class Pen{
  String color;
  String type; // gel , baul
  public static void write(){
    System.out.println("write something");
  }

  public  void getInfo(){
    System.out.println(this.color);
    System.out.println(this.type);
  }
}

public class PenExample {
    
    public static void main(String[] args) {
        
        Pen pen1 = new Pen();  // her Pen() is a consttructor which is a special type of function 
        pen1.color ="red";
        pen1.type ="gel";
        
        Pen pen2 = new Pen();

        pen2.color = "black";
        pen2.type ="baul";

        pen2.getInfo();

    }

}
