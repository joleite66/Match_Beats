package org.academiadecodigo.bootcamp.manager;

import java.io.*;

public class UserManager {

    private static final String FILEPATH = "src/main/resources/users.txt";

    public static String readFile() {

        String result = "";
        BufferedReader reader = null;

        try {

            String line;
            reader = new BufferedReader(new FileReader(FILEPATH));
            while ((line = reader.readLine()) != null) {
                result += line + "\n";

            }

        } catch (IOException ex) {
            System.err.println("Something went wrong");
        } finally {

            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static void writeToFile(String string) {

        BufferedWriter writer;

        try {

            writer = new BufferedWriter(new FileWriter(FILEPATH));
            writer.write(string);
            writer.close();

        } catch (IOException ex) {
            System.err.println("Something went wrong " + ex.getMessage());
        }
    }

}
