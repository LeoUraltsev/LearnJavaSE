package variables.primitiveDataTypes;

/**
 * Знакомства с примитивными типами данных в java
 */
public class PrimitiveVariables {

    public static void main(String[] args) {
        //Целочисленные типы данных
        int intNumber = 321_233; // 32 бит
        long longNumber = 1_123_456_678_890L; // 64 бит
        short shortNumber = 1_123; // 16 бит
        byte byteNumber = 13; // 8 бит

        //Вещественные типы данных
        double doubleNumber = 123456123123.12345678900000; //64 бит
        float floatNumber = 12345678.12234f;

        //Логичский тип данных
        boolean booleanVariable = true; // может хранить true/false или 0/1

        //Символьный тип данных
        char charVariable = 'a'; //Хранит символы UTF-16 буквы и цифры
        char charVariableUTF = 126; //Вывод символа '~'

        System.out.println("Типы данныв в java: \n\n"
                + "Int = "
                + intNumber
                + "\n\nLong = "
                + longNumber
                + "\n\nShort = "
                + shortNumber
                + "\n\nbyteNumber = "
                + byteNumber
                + "\n\nDouble = "
                + doubleNumber
                + "\n\nFloat = "
                + floatNumber
                + "\n\nBoolean = "
                + booleanVariable
                + "\n\nChar = "
                + charVariable
                + "\n\nChar = "
                + charVariableUTF
        );
    }

}
