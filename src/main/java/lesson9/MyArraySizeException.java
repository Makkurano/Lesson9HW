package lesson9;

public class MyArraySizeException extends Throwable {

    public static void checkArray(String[][] myArray) throws MyArraySizeException {

        if (myArray.length != 4) {
            System.out.println("Размер некорректен в массиве");
            throw new MyArraySizeException();
        }

        for (String[] insideArr : myArray) {
            if (insideArr.length != 4) {
                System.out.println("Размер некорректен в массиве массива");
                throw new MyArraySizeException();
            }
        }
    }
}
