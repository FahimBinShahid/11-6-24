public class SumOddRange {

    public static boolean isOdd(int number) {
        return number % 2 != 0 && number >= 1;
    }


    public static int sumOdd(int start, int end) {
        if (start < 1 || end < 1 || end < start) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if(isOdd(i)){
                    sum = sum+i;
                }
            }
            return sum;
        }

    }

        public static void main (String[]args){
            System.out.println(isOdd(20));
            System.out.println(isOdd(65));

            System.out.println(sumOdd(1,10));
        }
    }



