/* WJP to get ouput as the maximum and minimum number from an array */

class ArraysProblem1 {

    public static void main(String[] args){
        int[] arr=new int[]{2,33,55,77,3,90};
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){

            if(min>arr[i]){
                min=arr[i];
            }

            if(max<arr[i]){
                max=arr[i];

            }


        }
        System.out.println("maximum:"+max);
        System.out.println("Minimum:"+min);
        

    }
    

}
