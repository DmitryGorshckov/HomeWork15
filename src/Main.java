import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Test.recorsive("",new File("C:\\dmitry")); //Написать рекурсивный обход всех файлов и
                                                         // подкаталогов внутри заданного каталога
        /*System.out.println();
        System.out.println("Введите имя файла, который хотите создать: "); //Написать программу, которая будет создавать,
                                                                           // переименовывать, копировать и удалять файл
        Scanner sc = new Scanner(System.in);
        String nameFile = sc.nextLine();
        File file = new File(nameFile);
        file.createNewFile();
        System.out.println("Вы создали файл с именем: " + file);
        System.out.println("Что вы хотите сделать дальше: выход(цифра 0), " +
                            "переименовать(цифра 1), копировать(цифра 2),удалить файл(цифра 3)");
        int number = sc.nextInt();
        switch (number)  {
            case 1:
            System.out.println("Введите новое имя файла");
            String newNameFile=sc.next();
            file.renameTo(new File(newNameFile));
            System.out.println("Ваш " + file + " переименован в " + newNameFile);
            break;
            case 2:
            Path path = file.toPath();
            System.out.println("Введите название файла куда хотите скопировать " +file);
            String copyNameFile=sc.next();
            Path realPath = Paths.get(copyNameFile);
            Files.copy(path,realPath);
            System.out.println("файл скопирован в "+copyNameFile);
            break;
            case 3:
                Files.delete(file.toPath());
            System.out.println("Файл " + file + " удален!");
            break;
            case 0:
                System.out.println("ВЫХОД");
                break;
                default:
                    System.out.println("нет такой команды");
                    break;*/
            }
    }


