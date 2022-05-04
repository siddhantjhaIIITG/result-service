package com.resultportal.resultservice;
import java.util.List;

public class ResultListDto{

    private List<Result> results;

    ResultListDto() {}

    ResultListDto(List<Result> results){
        this.results = results;
    }

    public List<Result> getResults() {
        return results;
    }
}
