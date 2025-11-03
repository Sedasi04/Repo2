class Cat{
   public static void main(String args []) {
      System.out.println("Meow");
   }
}

class Dog{
  void run(){
      System.out.println("run");
  }
   public static void main(String args []) {
      run r = new run();
      r.run();
      System.out.println("Dog");

   }
}

class Rabbit extends class Dog{
   void run(){
   }
}
