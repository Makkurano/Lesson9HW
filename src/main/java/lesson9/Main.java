package lesson9;

import java.util.Arrays;

import static lesson9.MyArraySizeException.checkArray;

public class Main {

    private static String[][] myArray = new String[][]{
            new String[]{"1", "2", "3", "4"},
            new String[]{"2", "3", "4", "5"},
            new String[]{"3", "4", "5", "6"},
            new String[]{"4", "5", "6", "7"}};


    public static void main(String[] args) {

        myArrayInfo(myArray);
        myArraySum(myArray);

    }

    public static void myArraySum(String[][] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(myArray[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Переведенный в INT суммированный массив равен " + sum);
    }


    private static void myArrayInfo(String[][] a) {
        for (String[] insideArr : a) {
            System.out.println(Arrays.toString(insideArr));
        }
        try {
            checkArray(myArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}


