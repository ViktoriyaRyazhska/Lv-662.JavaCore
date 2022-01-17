package Task_5HM.Part2;

public class Developer extends Emploee {

    private String pos;
    public Developer(String name,int age,double salary,String pos){
        super(name,age,salary);
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
        @Override
        public String report(){
            return String.format("Name: %s, Age: %s,Salary: \u20b4 %.2f", getName(),getAge(),getSalary(),getPos());
        }
}
