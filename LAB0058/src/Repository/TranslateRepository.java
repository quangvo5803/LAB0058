package Repository;

import java.util.HashMap;

import DataAccess.TranslateDao;

public class TranslateRepository implements ITranslateRepository {
    public TranslateRepository() {

    }

    @Override
    public void addNewWord(HashMap<String, String> hm) {
        TranslateDao.Instance().addNewWord(hm);
    }

    @Override
    public void deleteWord(HashMap<String, String> hm) {
        TranslateDao.Instance().deleteWord(hm);
    }

    @Override
    public void translateWord(HashMap<String, String> hm) {
        TranslateDao.Instance().translateWord(hm);
    }
}
