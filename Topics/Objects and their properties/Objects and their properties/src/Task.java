// You can experiment here, it won't be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    String str = new String("Hello, ");
    System.out.print(str);
    Patient patient = new Patient("bob", 23);
    System.out.print(patient.name +"!");
    System.out.print(" Your are " + patient.age + " years old!");


  }
  static class Patient {
    String name;
    int age;
    Patient (String n, int a) {
      name = n;
      age = a;

    }
}


}