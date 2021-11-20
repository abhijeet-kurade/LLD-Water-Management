import Commads.CommandExecutor;

import java.io.BufferedReader;
import java.io.File;
import java.io.*;

public class Geektrust {
    public static void main(String[] args)  throws IOException  {
        CommandExecutor commandExecutor = new CommandExecutor();
        String fileName = args[0];//"C:\\Users\\Abhijeet\\Desktop\\file.txt";//
        final File file = new File(fileName);
        final BufferedReader reader = new BufferedReader(new FileReader(file));
        String input = reader.readLine();
        while (input != null) {
            //System.out.println(input);
            commandExecutor.runCommand(input);
            input = reader.readLine();
        }
    }
}
