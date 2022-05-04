package com.resultportal.resultservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ResultRespository extends MongoRepository<Result, String> {

    public Result findById(int id);
    public List<Result> findAllByRollNum(int rollNum);
}
