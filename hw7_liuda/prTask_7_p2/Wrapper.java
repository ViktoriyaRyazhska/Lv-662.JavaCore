package prTask_7_p2;

public class Wrapper <T extends Shape>{

    private T shape;
    public Wrapper(T shape){
        this.shape = shape;
    }

    @Override
    public String toString(){
        return "WrapperShape " + shape;
    }

}
