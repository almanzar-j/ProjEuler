public class Prob_2 {
/// Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
// By considering the terms in the
// Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.
    public static void main(String[] args) {

        int START = 1;
        int END = 2;
        int FIBSUM = START + END;
        int EVENSUM = 2;
        while(FIBSUM < 4000000){
            if(FIBSUM % 2 == 0){
                EVENSUM += FIBSUM;
            }

            START = END;
            END = FIBSUM;
            FIBSUM = START + END;

        }
        System.out.println(EVENSUM);
    }

}
