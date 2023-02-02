import java.util.*;
public class area {
    public static void main(String args[]){
        double area;
        final double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r");
        double r=sc.nextDouble();
        area=pi*r*r;
        System.out.println("area -->");
        System.out.print(area);
    }
    
}
