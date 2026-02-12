// type casting is when you assign a value of primitive data type to another type.//

// Widening cating(automatically) converty a smaller type to a larger type size //
// byte > short > char > int > long > float > double //

// Narrowing casting(manually) converting a large type to a smaller size type //
// double > float > long > int > char > short > byte //

// widening casting //
public class casting {
    public static void main(String[] args){
        int myint = 7;
        double mydouble = myint;
        
        System.out.println(myint);
        System.out.println(mydouble);
    }
}
