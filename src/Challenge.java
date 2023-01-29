public class Challenge {
    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100;
        double fourthDouble = thirdDouble % 40.00d;
        boolean myBool = (fourthDouble == 0) ? true : false;

        System.out.println(myBool);

        if (!myBool){
            System.out.println("got some remainder");
        }

    }
}
