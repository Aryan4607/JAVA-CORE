/* write a java program that determines the names of the week based on a given number  implement method get day of week parameter must be integer from 1-7 use switch statement if input is outside the range from 1-7 it must return in valid */

class Week {

    public static void main(String[] args) {

        System.out.println(getweek(5));

    }

    static String getweek(int date) {

        String result;

        switch (date) {
            case 1:
                result = "monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:

                result = "Invalid date";

        }
        return result;

    }

}
