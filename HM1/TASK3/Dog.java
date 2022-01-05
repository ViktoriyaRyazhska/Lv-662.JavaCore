package Task_3HM;

//(Section 4) Сreate class Dog with fields name, breed, age.

public class Dog {

    enum Breed {
        Afador ,
        Horgi ,
        Komondor
    }

    //fields

    public String Name;
    public int Age;
    Breed breed ;

    //constructors

    public Dog (String Name,int Age, Breed type ){
       this.Name = Name;
       this.Age = Age;
       breed = type;



    }
}
