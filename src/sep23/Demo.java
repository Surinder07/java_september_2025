package sep23;

public class Demo {
    public static void main(String[] args) {
        // break and continue

        // continue
        for (int i = 0; i <= 100 ; i++) {
            if(i % 5 ==0 )
                continue;  // it will skip the iteration
            System.out.println(i);

        }

        // break
        for (int i = 0; i < 100 ; i++) {

             if(i == 15){
                 break; // to break the iteration
             }
            System.out.println(i);
        }

        /*
        Lottery System
        range is 1- 100
        Lucky number : 59
        print the winner ,
        user can have 3 attempts



         */


    }
}
