package assignment_operators;

public class orassaign {
    public static void main(String[] args){
        int x = 9;
        System.out.println(x);

        x |= 3;
        System.out.println(x);
    }
}

/* in this program we first initialize an value for x
    the |(or) operation will convert the value of x to its bit value 
    then perform or gate operation.

    Simply it is bitwise additon

    |__A__|__B___|__C___|
    |  0  |  0   |   0  |
    |  0  |  1   |   1  |   this is and opreation
    |  1  |  0   |   1  |
    |  1  |  1   |   1  |
*/