package PracticeThree;

public class TriangleCheck {
    public static String triangleCheck(int a, int b ,int c){
        //String result = "null";
        if(a <= 0 || b <=0 || c <= 0) return "0";
        if (a == b && a==c && b==c) return  "Triangle is equilateral";
        else if(a  == b || a == c || b==c )return "Triangle is isosceles";
        else return "Triangle is versatile";
    }

}
