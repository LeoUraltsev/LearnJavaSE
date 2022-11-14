package variables.referenceDataType;

import java.util.Arrays;
import java.util.Locale;

/**
 * Изучение основ работы со строками в Java
 */

public class Strings {
    public static void main(String[] args) {
        //Создание строк
        String hello = "Hello World";
        String name = "Leo";
        String space = " ";
        //Конкотенация строк
        String helloUser = hello + space + name;
        //Создание новой строки из масива сиволов
        String stringOfChar = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        //Вывод строк
        System.out.println(helloUser);
        System.out.println(stringOfChar);
        //Вывод длины строки. Используем метод length из класса String
        System.out.println(helloUser.length());
        System.out.println(stringOfChar.length());

        String password = "Admin12345";
        String passwordConfirmationCaseCorrect = "Admin12345";
        String passwordConfirmationCaseIncorrect = "admin12345";
        String passwordIncorrect = "qwerty";

        // Сравнение строк с учетом регистра. Для этого используем метод equals()
        System.out.println("Correct password = " + password.equals(passwordConfirmationCaseCorrect));
        System.out.println("Correct password = " + password.equals(passwordConfirmationCaseIncorrect));
        System.out.println("Correct password = " + password.equals(passwordIncorrect));

        //Сравнение строк без учета регистра. Для этого используем метод equalsIgnoreCase()
        System.out.println("Correct password = " + password.equalsIgnoreCase(passwordConfirmationCaseCorrect));
        System.out.println("Correct password = " + password.equalsIgnoreCase(passwordConfirmationCaseIncorrect));
        System.out.println("Correct password = " + password.equalsIgnoreCase(passwordIncorrect));

        //Объединение строк с помощью методов concat() и join()
        String concatString = password.concat(passwordIncorrect); //Без разделителя
        String joinString = String.join(
                "()",
                password,
                passwordIncorrect,
                passwordConfirmationCaseCorrect
        ); //Можно добавить разделитель
        System.out.println("Concat String = " + concatString);
        System.out.println("Join String = " + joinString);

        //Получение символа из строки по индексу
        System.out.println("3 символ в строке = " + password.charAt(2));
        //Получение масива символов из строки
        int start = 0;
        int end = 4;
        char[] arrChar = new char[end - start];
        password.getChars(start, end, arrChar, 0);
        System.out.println(arrChar);

        //Нахождение индекса символа в строке
        System.out.println(password.indexOf('n')); // 4 - нашел
        System.out.println(password.indexOf('y')); // -1 - не нашел

        //Начинается ли строка с подстроки
        System.out.println("Строка начинается с - Admin? - " + password.startsWith("Admin"));
        System.out.println("Строка начинается с - Min? - " + password.startsWith("Min"));

        //Замена символов в строке
        System.out.println("Замена символов в строке " + password.replace('A', 'a'));

        //Удаление начальных и конечных пробелов
        String trimString = "  Trim String ";
        System.out.println(trimString.trim());

        //Вывести подстроку
        System.out.println(password.substring(5));
        System.out.println(password.substring(0, 5));

        //Все символы с маленькой буквы
        System.out.println(password.toLowerCase(Locale.ROOT));

        //Все символы большими буквами
        System.out.println(password.toUpperCase(Locale.ROOT));


    }
}
