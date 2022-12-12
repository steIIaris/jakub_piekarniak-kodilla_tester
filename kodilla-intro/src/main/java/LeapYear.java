public class LeapYear {
    public static void main(String[] args) {

        int year = 2021;
        boolean LeapYear = true;
        boolean notLeapYear = false;
        String text1="Tested year is leap year";


        if(year % 4 == 0||year% 100==0||year%400==0){
            System.out.println(text1);
            System.out.println(LeapYear);
            }
        else{
            System.out.println(text1);
            System.out.println(notLeapYear);
        }
    }
}
