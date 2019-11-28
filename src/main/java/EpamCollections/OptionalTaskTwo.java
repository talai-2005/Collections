package EpamCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 6. Ввести строки из файла, записать в список ArrayList.
 * Выполнить сортировку строк, используя метод sort() из класса Collections.
 */

public class OptionalTaskTwo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        File myfile = new File("Sourcefile.txt");
        FileReader fr = new FileReader(myfile);
        BufferedReader reader = new BufferedReader(fr);
        String line = null;

        while (reader.ready()) {
            list.add(reader.readLine());
        }

        Collections.sort(list);
        for (String element : list) {
            System.out.println(element);
        }
    }
}