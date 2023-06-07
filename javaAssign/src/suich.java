import java.util.Scanner;

public class suich {


        public static void main(String[] args) {

            Scanner scP=new Scanner(System.in);
            Scanner hp=new Scanner(System.in);

            System.out.println("Enter Your fName ");
            String fname=scP.next();


            System.out.println("Enter your lname");
            String lname=scP.next();


            System.out.println("Enter Year of KCPE: ");
            int  KCPE=hp.nextInt();


            System.out.println("Enter Your Age");
            int age=scP.nextInt();



            System.out.println("Please Enter Your English ");
            int English=scP.nextInt();

            System.out.println("Please Enter Your Math ");
            int Math=scP.nextInt();

            System.out.println("Please Enter Your kiswahili");
            int Kiswahili=scP.nextInt();

            System.out.println("Please Enter Your Science ");
            int Science=scP.nextInt();


            System.out.println(" Please Enter Your Social_Studies  ");
            int Social_Studies=scP.nextInt();

            int sum =English+Math+Kiswahili+Science+Social_Studies;



            String SCHOOL=null;
            switch(sum/100){
                case 1:

                    System.out.println(" National");
                    break;
                case 2:
                    System.out.println("Extra County");
                    break;
                case 3:
                    System.out.println("County");
                    break;
                default:
                    System.out.println("Sub County");


            }







            System.out.println("First Name: " +fname);
            System.out.println("Last Name: " +lname);
            System.out.println("Age:" +age);

            System.out.println("--------------------K.C.P.E_MARKS-----------------------------");
            System.out.println("English:" +English);
            System.out.println("Maths:" +Math);
            System.out.println("Kiswahili:" +Kiswahili);
            System.out.println("Science:" +Science);
            System.out.println("Social_Studies:" +Social_Studies);
            System.out.println( fname+" " + " "+lname +  " You are "+age+" years old,and your K.C.P.E marks is "
                    +sum+" Examination Year: "+KCPE);
            System.out.println("Your Status: "+" Your School Will Be: " +SCHOOL);





            scP.close();


        }
    }


