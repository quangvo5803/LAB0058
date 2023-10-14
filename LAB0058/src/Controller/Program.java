package Controller;

import java.util.HashMap;
import Repository.ITranslateRepository;
import Repository.TranslateRepository;
import View.Menu;

public class Program extends Menu<String> {
    private ITranslateRepository translateRepository;
    static String[] menuChoice = { "Add Word", "Delete Word", "Translate", "Exit" };
    HashMap<String, String> hm = new HashMap<>();

    public Program() {
        super("========== Dictionary program ==========", menuChoice);
        translateRepository = new TranslateRepository();
    }

    public void execute(int n) {
        switch (n) {
            case 1: {
                translateRepository.addNewWord(hm);
                break;
            }
            case 2:{
                translateRepository.deleteWord(hm);
                break;
            }
            case 3:{
                translateRepository.translateWord(hm);
                break;
            }
            case 4:{
                System.exit(0);
            }
        }
    }
}
