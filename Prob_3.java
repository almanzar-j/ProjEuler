public class Prob_3 {
    ///The prime factors of 13195 are 5, 7, 13 and 29.
    //
    //What is the largest prime factor of the number 600851475143 ?

    // pnum_check : int -> boolean
    // checks if the given int is a prime number
    public static boolean pnum_check(double n){
        boolean check = true;
        for(double i = 2.0; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        double PFACTOR = 0.0;
        double MAINNUM = 600851475143.0;
        for(double i = 1.0; i <= Math.sqrt(MAINNUM); i++){
            double MIRRORFACTOR = MAINNUM / i;
            if(MAINNUM % i == 0){
                if(pnum_check(MIRRORFACTOR)) {
                    PFACTOR = MIRRORFACTOR;
                }else if (pnum_check(i)){
                    PFACTOR = i;
                }
            }
        }
        System.out.println(PFACTOR);

    }
}
