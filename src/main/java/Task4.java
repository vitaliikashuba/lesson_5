public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        int evenCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            if (myArray[i] % 2 == 0) {
                evenCount++;
            }
            System.out.println(myArray[i]);
        }
        System.out.println("Total Even:" + evenCount);
    }
}
