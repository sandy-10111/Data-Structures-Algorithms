

public class Main {
    public static void main(String[] args) {
        walk(5);

    }

    private static void walk(int steps) {
//        for(int i=0;i<steps;i++){   //iteration
//            System.out.println("you take a step");
//        }
        if (steps < 1) return;  // base case
        System.out.println("you take a step");
        walk(steps - 1);  //recurseve case

    }
}