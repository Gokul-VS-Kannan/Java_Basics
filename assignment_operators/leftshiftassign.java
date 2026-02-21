package assignment_operators;

public class leftshiftassign {
    public static void main(String[] args){
        int x = 7;
        System.out.println(x);

        x <<= 3;
        System.out.println(x);
    }
}
/* in this program we shift the bits positon

 <<= 
 
 basically  its like  num x (2^n)*/

 /* x store value 7 now bit value of seven is 00000111
 
 the leftshit will shift bitposition as how many we need
 
 here we shift 3 bit and new bit representation is like 00111000
 
 now the decimal value is 56 */