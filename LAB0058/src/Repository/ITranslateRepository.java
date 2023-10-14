package Repository;

import java.util.HashMap;

public interface ITranslateRepository {
    void addNewWord(HashMap<String, String> hm);
    void deleteWord(HashMap<String, String> hm);
    void translateWord(HashMap<String, String> hm);
}
