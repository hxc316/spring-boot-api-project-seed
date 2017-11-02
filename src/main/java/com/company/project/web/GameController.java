package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Game;
import com.company.project.service.GameService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/11/01.
*/
@RestController
@RequestMapping("/game")
public class GameController {
    @Resource
    private GameService gameService;

    @PostMapping("/add")
    public Result add(Game game) {
        gameService.save(game);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        gameService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Game game) {
        gameService.update(game);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Game game = gameService.findById(id);
        return ResultGenerator.genSuccessResult(game);
    }

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Game> list = gameService.findAll();
        PageInfo pageInfo = new PageInfo(list);
//        List<Game> li = gameService.testXml();
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @RequestMapping("/listall")
    public Result listAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Game> list = gameService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        List<Game> li = gameService.testXml();
        return ResultGenerator.genSuccessResult(li);
    }
}
