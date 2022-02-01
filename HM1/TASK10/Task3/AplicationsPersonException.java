package Task_10HM.Task3;

public class AplicationsPersonException {
    public static void main(String[] args) {
      try {
          //person1
          PersonException person1 = new PersonException("Nikola", "Tesla");
          person1.setBirthYear(1856);

          //person2
          PersonException person2 = new PersonException("Anton", "Shcherbei");
          person2.setBirthYear(2001);

          //person3
          PersonException person3 = new PersonException("Vlad", "Drakula");
          person3.setBirthYear(1400);

          //person4
          PersonException person4 = new PersonException("Ted", "Lorenson");
          person4.setBirthYear(1991);

          //person5
          PersonException person5 = new PersonException("Artur", "Doil");
          person5.setBirthYear(1893);

          //output information about all persons
          System.out.println(person1.output());
          System.out.println(person2.output());
          System.out.println(person3.output());
          System.out.println(person4.output());
          System.out.println(person5.output());

          //age all persons
          System.out.println(person1.getFirstName() + " = " + person1.getAge(person1.getBirthYear()));
          System.out.println(person2.getFirstName() + " = " + person2.getAge(person2.getBirthYear()));
          System.out.println(person3.getFirstName() + " = " + person3.getAge(person3.getBirthYear()));
          System.out.println(person4.getFirstName() + " = " + person4.getAge(person4.getBirthYear()));
          System.out.println(person5.getFirstName() + " = " + person5.getAge(person5.getBirthYear()));
      }catch (Exception e){
          System.err.println(" Something is wrong , pleas try again later ");
      }

    }
}
