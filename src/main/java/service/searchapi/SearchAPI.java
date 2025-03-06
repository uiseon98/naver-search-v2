package service.searchapi;

import model.dto.SearchResult;

import java.util.List;

public interface SearchAPI {
    List<SearchResult> searchByKeyword(String keyword);
}
