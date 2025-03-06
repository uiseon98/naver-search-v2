package service.searchapi;

import model.dto.SearchResult;

import java.util.List;

public class NaverSearchAPI implements SearchAPI {
    @Override
    public List<SearchResult> searchByKeyword(String keyword) {
        return List.of();
    }
}
