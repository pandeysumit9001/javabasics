/**
 * javabasics
 * 
 * public class javabasics {
 * public static void main(String[] args) {
 * System.out.print("hello world\n");// \n-used for line ka space
 * System.out.println("sumit pandey");// ln is used for next line
 * System.out.println("apna collage");
 * System.out.print(
 * "hello guys my name is sumit \n i belong to prayagraj \n as per my
 * qualification iam persuing my bachelor degree from united university");
 * }
 * // boilerplate
 */

// print pattern

// public class javabasics {
// public static void main(String[] args) {
// System.out.println("****");
// System.out.println("***");
// System.out.println("**");
// System.out.println("*");

// }

// }

// variables in java

// public class javabasics {
// public static void main(String[] args) {
// int a, b, c;
// a = 5;
// b = 6;
// c = a + b;
// System.out.println(c);

// }
// }

// datatypes in java

// public class javabasics {
// public static void main(String[] args) {
// byte b = 8;
// System.out.print(b);
// char ch = 'b';
// System.out.print(ch);
// boolean var = false;
// double price = 4.5;
// int num = 25;
// // long-agr bhot bade size ka number to hum long datatype use kerte hai.
// // double-agr bhot bada float or decimal number hai to hum double use kerte
// hai.
// short n = 240;
// System.out.println(var);
// System.out.println(price);
// System.out.println(num);
// System.out.println(n);
// System.out.println();

// }
// }

// sum of a&b

// public class javabasics {
//     public static void main(String[] args) {
//         int a = 6, b = 4, sum;
//         sum = a + b;
//         System.out.print("sum is=" + sum);
//     }
// }

// input in java

// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);
//         // String input = SC.next();
//         // System.out.print(input);.
//         // String name = SC.nextLine();
//         // System.out.print(name);
//         float price = SC.nextFloat();
//         System.out.print(price);
//         // int name = SC.nextInt();
//         // System.out.print(name);
//     }
// }

//sum of a&b by user

// import java.util.*;
// public class javabasics {
//     public static void main(String[] agrs) {
//         Scanner SC = new Scanner(System.in);
//         System.out.print("press no: ");
//         int a = SC.nextInt();
//         System.out.print("press no: ");
//         int b = SC.nextInt();
//         int sum = a + b;
//         System.out.print("sum is :" + sum);
//     }
// }

//product of a&b

// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);
//         System.out.print("press a:");
//         int a = SC.nextInt();
//         System.out.print("press b:");
//         int b = SC.nextInt();
//         int mul = a * b;
//         System.out.print("multiply is:" + mul);
//     }
// }

//area of circle

// import java.util.*;

// public class javabasics {

//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);
//         System.out.println("enter the radius: ");
//         double rad = SC.nextDouble();
//         double area = 3.14 * rad * rad;
//         System.out.println("area" + area);

//     }
// }

//area of rectangle

// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner("System.in");
//         System.out.print("enter the length");
//         int l = SC.nextInt();
//         System.out.print("enter the breadth");
//         final int b = SC.nextInt();
//         int rectangle = l * b;
//         System.out.print("area of rectangle is:" + rectangle);

//     }
// }

//type converion
// type conversion possible only no's to no's not no's to string
//it is also knowns as implicit or widening conversion

// import java.util.*;

// /**
//  * javabasics
//  */
// public class javabasics {

//     public static void main(String[] args) {
//         int a = 23;
//         long b = a;
//         System.out.println(b);
//     }
// }

// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);
//         System.out.println("enter the num");
//         float a = SC.nextInt();// called type con version
//         System.out.println(a);
//     }
// }

//type casting

// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner SC = new Scanner(System.in);
//         float a = 25.12f;
//         int b = (int) a;
//         System.out.println(b);
//     }
// }

// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         char ch = 'a';
//         char ch1 = 'b';
//         int num = ch;
//         int num1 = ch1;
//         System.out.println(num);
//         System.out.println(num1);

//     }
// }

//practice question
//1-find the avg of 3 numbers
// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int avg = (a + b + c) / 3;
//         System.out.println("avg is:" + avg);
//     }
// }

//2-area of square
// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the side");
//         float side = sc.nextFloat();
//         float area = side * side;
//         System.out.println("side od square is:" +area);
//     }
// }

//3-cost of the the 3 item
// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the pencil cost: ");
//         float pencil = sc.nextFloat();
//         System.out.println("enter the pen cost: ");
//         float pen = sc.nextFloat();
//         System.out.println("enter the eraser cost :");
//         float eraser = sc.nextFloat();
//         float totalcost = (pencil + pen + eraser);
//         System.out.println("total cost is: " + totalcost);
//         // add on -with 18% tax
//         float newtotalcost = totalcost + (0.18f * totalcost);
//         System.out.println("total cost with 18% gst tax is:" + newtotalcost);

//     }
// }

//4-result
/**
 * javabasics
 */
public class javabasics {

    public static void main(String[] args) {
        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        // double result = (f * b) + (i % c) - (d * s);
        int $ = 24;
        System.out.println($);

    }
}