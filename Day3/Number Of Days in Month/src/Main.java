public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2019));
        System.out.println(getDaysInMonth(4, 2021));
        System.out.println(getDaysInMonth(12, 9999));


    }
        public static boolean isLeapYear ( int year){
            if (year > 0 && year < 9999) {
                return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
            } else {
                return false;
            }
        }
        public static int getDaysInMonth ( int month, int year){
            if ((month < 1 || month > 12) || (year < 0 || year > 9999)) {
                return -1;
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    case 2: {
                        if (isLeapYear(year)) {
                            return 29;
                        } else {
                            return 28;
                        }
                    }
                    default:
                        return -1;
                }
            }
        }
    }
