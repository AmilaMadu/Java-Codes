public class Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("b--   = " +  (a--) );
        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }
}

/*public class Operators1{
    public static void main(String [] args){
        int a = 5;
        int b = 4;
        int c = a + b;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++ + ++a);
    }
} */