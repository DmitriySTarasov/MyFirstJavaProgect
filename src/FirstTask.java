import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args)
    {
        Choice();
    }
    public static void Writers ()
    {
        int choiceAuthor;
        System.out.println("Вы выбрали Писателей.");
        System.out.println("Вы хотите:\n" + "1 - Выбрать писателя?\n" + "2 - Добавить писателя?\n" + "3 - Удалить писателя?\n");

        choiceAuthor = new Scanner(System.in).nextInt();

        if (choiceAuthor == 1)
        {
            System.out.println("Вы хотите выбрать писателя.");
        } else if (choiceAuthor == 2)
        {
            AddingWriter();
            System.out.println("Писатель добавлен.");
        } else if(choiceAuthor == 3)
        {
            System.out.println("Вы хотите удалить писателя.");
        }else {
            System.out.println("Ошибка, Вы выбрали что-то другое.");
        }
    }
    public static void AddingWriter()
    {
        File myFile = new File("text.txt");
        try
        {
            PrintWriter writer =
                    new PrintWriter(new BufferedWriter (new FileWriter(myFile)));
            writer.write("Александр Сергеевич Пушкин");
            writer.flush();
            writer.close();
        }catch (IIOException ex)
        {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Magazine()
    {

    }

    public static void Heading()
    {

    }

    public  static void Choice()
    {
        System.out.println("Что Вы хотите выбрать?\n 1 - Писатели\n 2 - Журналы\n 3 - Заголовок ");
        int choiceMain;

        choiceMain = new Scanner(System.in).nextInt();

        if (choiceMain == 1)
        {
            Writers();
        }
        else if (choiceMain == 2) {
            System.out.println("Вы выбрали - Журналы.");
        } else if (choiceMain == 3) {
            System.out.println("Вы выбрали - Заголовок.");
        } else {
            System.out.println("Вы выбрали что-то другое.");
        }
    }

}

