import java.util.Scanner;
import java.util.regex.*;

public class Regex
{
    public static void main (String[] args)
    {
        String Number;
        String Name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер автобуса");
            Number = sc.nextLine();
                    Pattern patternNumber = Pattern.compile("\\D[КМ]\\d{0,}||[Н]\\d{1,}||[Т]\\d{1,}||[М]\\d{1,}||[С]\\d{1,}||\\d{1,}");
                        Matcher matcherNumber = patternNumber.matcher(Number);
                            if (matcherNumber.matches()==false)
                            {
                                System.out.println("Вы ввели недопустимое");
                            }

                            if (matcherNumber.matches()==true)
                            {
                                System.out.println("отправляем в бд");
                            }

        System.out.println("Введите ФИО водителя");
            Name = sc.nextLine();
                    Pattern patternName = Pattern.compile("([А-Я]{1}[а-я]{1,45})\\s([A-Я]{1}\\W\\s[A-Я]{1}\\W)");
                        Matcher matcherName = patternName.matcher(Name);
                            if (matcherName.matches()==false)
                            {
                                    System.out.println("Вы ввели недопустимое");
                            }

                            if (matcherName.matches()==true)
                            {
                                System.out.println("отправляем в бд");
                            }
    }
}
