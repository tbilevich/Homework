package home_work_6.search;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.TextUtils;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine search;

    public SearchEnginePunctuationNormalizer(ISearchEngine search) {
        this.search = search;
    }
    @Override
    public long search(String text, String word) {
        text = TextUtils.replaceSpecSymbols(text);
        return this.search.search(text, word);
    }
}
