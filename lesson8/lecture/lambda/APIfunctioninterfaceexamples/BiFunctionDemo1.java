package lesson8.lecture.lambda.APIfunctioninterfaceexamples;
import java.util.function.BiFunction;

public class BiFunctionDemo1 {
    public static void main(String[] args) {
    	BiFunction<Integer,Integer,Integer>b=(x,y)->2*x-y;
    	System.out.println(b.apply(3,3));
    	
//      BiFunction<Float, Float, Float> area =
//      (width, length) -> width * length;
//float width = 7.0F;
//float length = 10.0F;
//float result = area.apply(width, length);
//System.out.println("Area of a Window : " + result);
    	
    	
    	
       
    }
    

}