package service.searchapi;

import model.dto.NaverAPIResult;

import java.util.List;

public interface SearchAPI<T> {
    List<T> searchByKeyword(String keyword);
}
