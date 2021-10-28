package io.codekaffee.clients;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {
    private List<T> results = new ArrayList<>();

    
    public Result() {
    }

    public Result(List<T> results) {
        this.results = results;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    
}
