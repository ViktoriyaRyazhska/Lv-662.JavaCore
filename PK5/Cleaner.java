package java23;

public class Cleaner extends Staff{

     String c = "Уборщик";

   public Cleaner(String name) {
       super(name);
   }


   @Override
   void print() {
       System.out.println(c + ", его имя: " + name);
   }

   @Override
   void salary() {
       System.out.println(" Зарплата: 7654 "  );
   }
}