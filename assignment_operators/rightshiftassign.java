package assignment_operators;

public class rightshiftassign {
    public static void main(String[] args){
        int x = 7;
        System.out.println(x);

        x >>= 2;

        System.out.println(x);
    }
}

/* in this program we shift the bits positon

 >>= 
 
 basically  its like  num/2^n*/

 /* x store value 7 now bit value of seven is 00000111
 
 the rightshit will shift bitposition as how many we need
 
 here we shift 2 bit and new bit representation si like 00000001
 
 now the decimal value is 1*/