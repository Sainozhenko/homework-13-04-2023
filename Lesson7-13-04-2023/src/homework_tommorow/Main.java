package homework_tommorow;


public class Main {
    public static void main(String[] args) {
String abc ="abc";
String abc1 ="abca";
        StringConcate sc = (a, b) -> String.valueOf(a) + (b);
        System.out.println(sc.concat(5, 5));


        Checkable check11 = in -> in.length() == 3;
        System.out.println(check11.check(abc));
        System.out.println(check11.check(abc1));


        Printable pr = in -> System.out.println("!" + in + "!");
        pr.print(abc);
    }

    }
