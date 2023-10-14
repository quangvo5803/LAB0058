package Common;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.HashMap;
import java.util.Scanner;

public class Validation {
    static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        while (s.isEmpty()) {
            System.out.print("Enter again(Can not blank): ");
            s = sc.nextLine();
        }
        return s;
    }

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(prompt);
            if (i < min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (i > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else
                isValid = true;
        }
        return i;
    }

    public static String getYesNo(String str) {
        String result = "";
        boolean check = true;
        do {
            System.out.print(str);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty() && (tmp.equalsIgnoreCase("Y") || tmp.equalsIgnoreCase("N"))) {
                result = tmp;
                check = false;
            } else {
                System.out.println("Enter the wrong type, please re-enter (Y/N)!");
            }

        } while (check);
        return result;
    }

    // public static void writeFile(String english,String vietnamese){
    //     try{
    //         String word = english + ";" + vietnamese + "\n";
    //         FileWriter writer = new FileWriter("src\\Model\\directory.txt",true);
    //         BufferedWriter bw = new BufferedWriter(writer);
    //         bw.write(word);
    //         bw.close();
    //     }catch(IOException e){
    //         e.printStackTrace();
    //     }
    // }

    // public static void readFile(HashMap<String,String> hm){
    //     try{
    //         FileReader reader = new FileReader("src\\Model\\directory.txt");
    //         BufferedReader bufferedReader = new BufferedReader(reader);

    //         String line;
    //         while((line = bufferedReader.readLine()) != null){
    //             String word[] = line.split(";");
    //             hm.put(word[0], word[1]);
    //         }
    //         bufferedReader.close();
    //         reader.close();
    //     }catch(IOException e){
    //         e.printStackTrace();
    //     }
    // }

    // public static void deleteWordInFile(String english,String vietnamese){
    //     try{
    //         FileReader reader = new FileReader("src\\Model\\directory.txt");
    //         FileWriter writer = new FileWriter("src\\Model\\directory.txt");
    //         BufferedReader bufferedReader = new BufferedReader(reader);
    //         BufferedWriter bw = new BufferedWriter(writer);

    //         String line;
    //         while((line = bufferedReader.readLine()) != null){
    //             if(line.equalsIgnoreCase(english + ";" + vietnamese)){
    //                line = "";
    //                bw.write(line);
    //             }
    //         }
    //         bufferedReader.close();
    //         reader.close();
    //         writer.close();
    //         bw.c
    //     }catch(IOException e){
    //         e.printStackTrace();
    //     }
    // }
}
