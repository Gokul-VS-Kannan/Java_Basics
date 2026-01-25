public class Lower {
    public static void main(String[] args) {
        byte num1;
        num1 = 120;
        System.out.println(num1);
        // byte can store values upto 127 (1byte) //

        // short can store values from -32,768 to 32,767 (2 bytes) //
        short num2;
        num2 = 3567;
        System.out.println(num2);

        // int numbers from -2,147,483,648 to 2,147,483,647 (4 bytes) //
        int num3 = 125698;
        System.out.println(num3);

        // long number from -9,233,372,036,854,775,808 to 9,233,372,036,854,807 (8 bytes) //
        long num4;
        num4 = 74545448743133L;
        System.out.println(num4);

        // float decimal numbers with 6 decimal digits (4 bytes) //
        float num5 = 7.906767f;
        System.out.println(num5);

        // double decimal numbers with 15 decimal digits (8 bytes) //
        double num6;
        num6 = 9.0046445632542d;
        System.out.println(num6);
    }
}