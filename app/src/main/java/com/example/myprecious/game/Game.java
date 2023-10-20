package com.example.myprecious.game;

import com.example.myprecious.GameActivity;
import com.example.myprecious.actors.FrodoBaggins;
import com.example.myprecious.actors.Hero;
import com.example.myprecious.command.Command;
import com.example.myprecious.command.GO;
import com.example.myprecious.command.ParsedCommand;
import com.example.myprecious.episodes.Episode;
import com.example.myprecious.map.areas.hobittons.Hobbiton;
import com.example.myprecious.map.regions.Shire;
import com.example.myprecious.parser.Parser;

import java.util.Map;

public class Game {
    private Episode episode;
    private Map map;
    private Hero hero;

    public Game() {
        Parser.initDictionary();
        initGame();
    }

    private void initGame() {
        hero = new Hero(new Shire(),new Hobbiton(), new FrodoBaggins());
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Command findCommand(ParsedCommand parsedCommand)  {
        switch (parsedCommand.getCategory()){
            case GO:

        }
        return null;
    }
}
