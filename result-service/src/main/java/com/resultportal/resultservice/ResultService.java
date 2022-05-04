package com.resultportal.resultservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRespository resultRespository;

    public Result add(Result result){
        return resultRespository.save(result);
    }

    public ResultListDto getByRollNum(int rollNum){
        return new ResultListDto(resultRespository.findAllByRollNum(rollNum));
    }
}
