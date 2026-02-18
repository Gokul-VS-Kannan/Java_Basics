package assignment_operators;

public class andassign {
    public static void main(String[] args){
        int x = 7;
        System.out.println(x);

        x &= 9;
        System.out.println(x);
    }   
}

/* in this program we first initialize an value for x
    the &(and) operation will convert the value of x to its bit value 
    then perform and gate operation.

    Simply it is bitwise dot

    |__A__|__B___|__C___|
    |  0  |  0   |   0  |
    |  0  |  1   |   0  |   this is and opreation
    |  1  |  0   |   0  |
    |  1  |  1   |   1  |
*/