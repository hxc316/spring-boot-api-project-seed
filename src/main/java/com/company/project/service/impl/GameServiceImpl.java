package com.company.project.service.impl;

import com.company.project.dao.GameMapper;
import com.company.project.model.Game;
import com.company.project.service.GameService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2017/11/01.
 */
@Service
@Transactional
public class GameServiceImpl extends AbstractService<Game> implements GameService {
    @Resource
    private GameMapper gameMapper;


    @Override
    public List<Game> testXml() {
        return gameMapper.testXml();
    }
}
