package lesson9;

public class MyArraySizeException extends Throwable {

    public static void checkArray(String[][] myArray) throws MyArraySizeException {
        int arrLenght = 4;

        if (myArray.length != arrLenght) {
            System.out.println("Размер некорректен в массиве");
            throw new MyArraySizeException();
        }

        for (String[] insideArr : myArray) {
            if (insideArr.length != arrLenght) {
                System.out.println("Размер некорректен в массиве массива");
                throw new MyArraySizeException();
            }
        }
    }
}
