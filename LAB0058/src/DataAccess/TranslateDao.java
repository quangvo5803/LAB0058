package DataAccess;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Common.Validation;

public class TranslateDao {
    private static TranslateDao instance = null;

    public static TranslateDao Instance() {
        if (instance == null) {
            synchronized (TranslateDao.class) {
                if (instance == null) {
                    instance = new TranslateDao();
                }
            }
        }
        return instance;
    }

    public void addNewWord(HashMap<String, String> hm) {
        while (true) {
            System.out.println("========== Add Word ==========");
            String english = Validation.getString("Enter English word: ");
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry entry : entries) {
                while (entry.getKey().equals(english)) {
                    System.out.println("This word has been exist !!!");
                    english = Validation.getString("Enter English word again: ");
                }
            }
            String vietnamese = Validation.getString("Enter Vietnamese: ");
            hm.put(english, vietnamese);
            System.out.println("Successful");
            System.out.println();
            if (Validation.getYesNo("Do you want to continue (Y/N): ").equalsIgnoreCase("n")) {
                System.out.println();
                return;
            }
        }
    }

    public void deleteWord(HashMap<String, String> hm) {
        while (true) {
            System.out.println("========== Delete Word ==========");
            String english = Validation.getString("Enter English word: ");
            hm.remove(english);
            System.out.println("Delete successful");
            System.out.println();
            if (Validation.getYesNo("Do you want to continue (Y/N): ").equalsIgnoreCase("n")) {
                System.out.println();
                return;
            }
        }
    }

    public void translateWord(HashMap<String, String> hm) {
        while (true) {
            String english = Validation.getString("Entrer English Word: ");
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            int count = 0;
            for (Map.Entry entry : entries) {
                if (((String) entry.getKey()).equalsIgnoreCase(english)) {
                    System.out.println("Vietnamese: " + entry.getValue());
                    System.out.println();
                    count++;
                }
            }
            if (count == 0) {
                System.err.println("Not found in data");
                System.out.println();
            }
            if (Validation.getYesNo("Do you want to continue (Y/N): ").equalsIgnoreCase("n")) {
                System.out.println();
                return;
            }
        }
    }
}
