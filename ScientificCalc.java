package oops;

//5. In a single program show multiple OOPS principles like inheritance,overloading,overriding,

class Calculator {

 public int add(int a, int b) {
     return a + b;
 }

 public double add(double a, double b) {
     return a + b;
 }

 public int add(int a, int b, int c) {
     return a + b + c;
 }

 public void showType() {
     System.out.println("I am a basic calculator.");
 }
}


class ScientificCalc extends Calculator {
 
 @Override
 public void showType() {
     System.out.println("I am a scientific calculator.");
 }

 public double power(double base, double exponent) {
     return Math.pow(base, exponent);
 }
 public static void main(String[] args) {
     ScientificCalc sciCalc = new ScientificCalc();

     
     System.out.println("Add (int, int): " + sciCalc.add(5, 3));
     System.out.println("Add (double, double): " + sciCalc.add(2.5, 3.5));
     System.out.println("Add (int, int, int): " + sciCalc.add(1, 2, 3));
     sciCalc.showType();
     System.out.println("Power: " + sciCalc.power(2, 3));
 }
}