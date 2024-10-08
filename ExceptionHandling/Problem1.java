class Problem1 {

    public static void main(String[] args) {

        try {
            int a = 2 / 0;

            System.out.println(a);

        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

        System.out.println("Done");

        try {
            int[] arr = new int[] { 2, 3, 4, 5, 5, 5, 6, 7, 8, 9 };

            int a = arr[10];
            System.out.println(a);

        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

        try {

            String name = "Aryan";

            System.out.println(name.charAt(0));

        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
