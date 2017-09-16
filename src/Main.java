public class Main {

    public static void main(String[] args) {
       int[] aList = {10, 20, 100, 40, 30};
       int[] bList = {35, 65, 87, 12, 23};

       int aListLargest = getLargest(aList);
       int bListLargest = getLargest(bList);

        System.out.println("aList largest: " + aListLargest);
        System.out.println("bList largest: " + bListLargest);

        System.out.println("****************");

        boolean divis5 = areFactors(10, aList);
        boolean divisYes = areFactors(2, bList);

        System.out.println("alist is divisible by 10? " + divis5);
        System.out.println("blist is divisible by 2? " + divisYes);

    }

    public static int getLargest(int[] numList) {
        int largest = 0;
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] > largest) {
                largest = numList[i];
            }
        }
        return largest;
    }

    public static boolean areFactors(int n, int[] listing) {
       int isTrue = 0;
       for (int i = 0; i < listing.length; i++) {
           if (listing[i] % n == 0) {
               isTrue++;
           }
       }
       if (isTrue == listing.length) {
           return true;
       } else {
           return false;
       }
    }
}
