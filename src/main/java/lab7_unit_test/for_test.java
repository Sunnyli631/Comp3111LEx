package lab7_unit_test;

import java.util.Arrays;

public class for_test {
    public static void main(String arg[]) {
        System.out.println("Test!");
    }
    public static int plus(int num1,int num2){
        int num=num2+num1;
        return num;
    }
    public static float calculate(char a,int num1,int num2){
        switch (a){
            case '+':
                return num2+num1;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            default:
                return -1;
        }

    }
}
