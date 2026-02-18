package assignment_operators;

public class xorassign {
    public static void main(String[] args){
        int x = 7;
        System.out.println(x);

        x ^= 9;
        System.out.println(x);
    }
}

/* in this program we first initialize an value for x
    the ^(xor) operation will convert the value of x to its bit value 
    then perform xor gate operation.

    Simply it is bitwise differ (if inputs are same then output is 0 if the inputs are different then output is 1)

    |__A__|__B___|__C___|
    |  0  |  0   |   0  |
    |  0  |  1   |   1  |   this is and opreation
    |  1  |  0   |   1  |
    |  1  |  1   |   0  |
*/