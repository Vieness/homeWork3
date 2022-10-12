public class Main {
    public static void main(String[] args) {
        // integer data types
        byte byteOut = 127;
        short shortOut = 32767;
        int integerOut = 2147483647;
        long longOut = 9223372036854775807L;
        // fractional data types
        float floatOut = 123456.023456767777f;
        double doubleOut = 12345676777.9;
        // boolean data types
        boolean booleanOutTrue = true;
        boolean booleanOutFalse = false;
        // character data type
        char charOut = 'a';
        System.out.println(byteOut + "\n" +
                shortOut + "\n" +
                integerOut + "\n" +
                longOut + "\n" +
                floatOut + "\n" +
                doubleOut + "\n" +
                booleanOutFalse + "\n" +
                booleanOutTrue + "\n" +
                charOut + "\n"
        );

        // TASK 2
        int firstNumber = 21474;
        byte secondNumber = 127;
        short thirdNumber = 32767;

        // 2.1 вывести их сумму на консоль.
        System.out.println("Sum: " + firstNumber + secondNumber);
        // 2.2 вывести их произведение на консоль.
        System.out.println("Multiplication: " + firstNumber * secondNumber);
        // 2.3 вывести true, если 1 переменная больше, чем 2, иначе false.
        String trueFalse = firstNumber > secondNumber ? "true" : "false";
        System.out.println(trueFalse);
        // 2.4 вывести true, если 1 переменная больше, чем сумма 2 и 3, иначе false.
        String trueFalse2 = firstNumber > secondNumber + thirdNumber ? "true" : "false";
        System.out.println(trueFalse2);
        //5.1 знать какой код стоит за символом 'ё'
        char charOutYo = 'ё';
        int charYo = charOutYo;
        System.out.println(charYo);
    }
}