import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int counter = 0;
        for (int i=0; i < list.size(); i++){
            if ((list.get(i)+100) % 2 == 1){
                counter++;
            }
        }
        return counter;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        boolean torf = false;
        for (int i=0; i < list1.size(); i++){
            for (int y=0; y < list2.size(); y++){
                if(list1.get(i)==list2.get(y)){
                    torf = true;
                }
            }
        }
        return torf;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i <= arr.length; i++){
            list.add(i);
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> main1 = new ArrayList<Integer>();
        ArrayList<Integer> main2 = new ArrayList<Integer>();
        main1.add(1);
        main1.add(3);
        main1.add(4);
        main2.add(1);
        main2.add(7);
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        convertToArrayList(intArray);
        checkDuplicates(main1, main2);
        countOdd(main1);


    }
}
