package com.resultportal.resultservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @RequestMapping(method = RequestMethod.POST, value = "/i/result")
    public Result addResult(@RequestBody Result result){
        return resultService.add(result);
    }

    @RequestMapping("/s/result/{rollNum}")
    public ResultListDto getByRollNum(@PathVariable int rollNum){
        return resultService.getByRollNum(rollNum);
    }
}
