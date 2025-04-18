package modules;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteDay_C8 {
  public static void writeDay(String data) {
    try {
        new File("./src/data/reports-day-C8.csv");
        FileWriter file = new FileWriter("./src/data/reports-day-C8.csv", true);
        file.write(data);
        file.close();
        System.out.println("SCRIPT_INFO: Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("SCRIPT_ERROR: An error occurred.");
        e.printStackTrace();
    }
  }

  public static void writeMonth(String data) {
    try {
        new File("./src/data/reports-month-C8.csv");
        FileWriter file = new FileWriter("./src/data/reports-month-C8.csv", true);
        file.write(data);         
        file.close();
        System.out.println("SCRIPT_INFO: Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("SCRIPT_ERROR: An error occurred.");
        e.printStackTrace();
    }
  }
}
