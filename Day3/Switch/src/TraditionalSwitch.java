public class TraditionalSwitch {
    public static void main(String[] args) {

    char switchValue = 'X';
   switch (switchValue){
       case 'A':
           System.out.println("Able");
           break;

       case 'B':
           System.out.println("Baker");
           break;
       case 'C':
           System.out.println("Charlie");
           break;

       case 'D':
           System.out.println("Dog");
           break;

       case 'E':
           System.out.println("Easy");
           break;

       case 'F':
           System.out.println("Fox");
           break;

       case 'G':
           System.out.println("George");
           break;
       case 'H':
           System.out.println("How");
           break;


       case 'I':
           System.out.println("Isolated");
           break;

       case 'J':
           System.out.println("Json");
           break;
       case 'K':
           System.out.println("Knockout");
           break;
       case 'L':
           System.out.println("Lambda");
           break;


       default:
           System.out.println("Unexpected value: " + switchValue);
   }
    }
    }