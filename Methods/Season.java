/*wjp that determines season of the year based on given month number method name getseason parameter must be integer range 1-12 return season use switch case 
 * winter = dec,jan , feb
 * spring = mar,april,may
 * summer = june,july,aug
 * fall=sep,octo,nov
 * 
 * if input is not in range return invalid month 
 */
class Season {

    public static void main(String[] args) {

        System.out.println(getseason(14));

    }

    static String getseason(int month) {

        String result;

        switch (month) {

            case 12, 1, 2:

                result = "winter";
                break;

            case 3, 4, 5:
                result = "spring";
                break;

            case 6, 7, 8:
                result = "summer";
                break;

            case 9, 10, 11:
                result = "fall";
                break;

            default:
                result = "invalid month";

        }
        return result;

    }

}
