import java.util.*;
class Zoo_Animal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();//200
        int leg=sc.nextInt();//540
        int four_leg= (leg/2)-(total);
        int two_leg=total-four_leg;
        System.out.println("Four_leg: "+four_leg);
        System.out.println("Two_leg: "+two_leg);
    }
}