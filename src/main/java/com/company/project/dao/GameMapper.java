package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Game;

import java.util.List;

public interface GameMapper extends Mapper<Game> {

    public List<Game> testXml();
}