package lesson9;

public class MyArrayDataException extends NumberFormatException  {

    MyArrayDataException(int i, int j) {
        System.out.println("Символ по адресу i[" + i + "] j[" + j + "] не является INTом");
    }
}

