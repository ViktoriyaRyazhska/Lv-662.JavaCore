
public class Dog {
	enum Breed {
        Labrador,
        Mastiff,
        Doberman
    }
        public String Name;
        public int Age;
        Breed breed;

        public Dog (String Name, int Age, Breed type) {
            this.Name = Name;
            this.Age = Age;
            breed = type;
        }
}
