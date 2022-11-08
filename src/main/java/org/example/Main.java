package org.example;

public class Main {
        static byte a_Prim;
        static short b_Prim;
        static char c_Prim;
        static int d_Prim;
        static float e_Prim;
        static double f_Prim;
        static String g_Prim;
        static boolean h_Prim;

        public static void main(String[] args)
        {
            displayMessage();
            displayDefaultValues();
            checkStringEqual();

        }
        // display any message
        public static void displayMessage()
        {
            System.out.println("Hello Bridgelabz");
        }
        //display the default value of all primitive data types
        public static void displayDefaultValues()
        {
            System.out.println("Default value of byte Type = " +a_Prim);
            System.out.println("Default value of short Type = " +b_Prim);
            System.out.println("Default value of char Type = " +c_Prim);
            System.out.println("Default value of int Type = " +d_Prim);
            System.out.println("Default value of float type = " +e_Prim);
            System.out.println("Default value of double Type = " +f_Prim);
            System.out.println("Default value of string Type = " +g_Prim);
            System.out.println("Default value of boolean Type = " +h_Prim);
        }
        public static void checkStringEqual()
        {
            String s1 = "Waseem";
            String s2 = "Waseem";
            if (s1.equals(s2))
                System.out.println("String are equals");
            else
                System.out.println("String are not equals");
        }
    }