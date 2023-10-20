package com.example.myprecious.parser;

import com.example.myprecious.command.ParsedCommand;
import com.example.myprecious.dictionary.Category;
import com.example.myprecious.dictionary.Wordtype;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parser {
    static Wordtype error;

    static HashMap<String, Category> dictionary = new HashMap<>();

    public static void initDictionary() {
        dictionary.put( "the", Category.ARTICLE );
        dictionary.put( "them", Category.ARTICLE );
        dictionary.put( "to", Category.ARTICLE );
        dictionary.put( "a", Category.ARTICLE);
        dictionary.put( "an", Category.ARTICLE);
        dictionary.put( "my", Category.DETERMINER);
        dictionary.put( "this", Category.DETERMINER);
        dictionary.put( "some", Category.DETERMINER);
        dictionary.put( "all", Category.DETERMINER);
        dictionary.put( "tothe", Category.PREPOSITION );
        dictionary.put( "allthe", Category.PREPOSITION);
        dictionary.put( "of", Category.PREPOSITION);
        dictionary.put( "allof", Category.PREPOSITION);
        dictionary.put( "for", Category.PREPOSITION);
        dictionary.put( "forthe", Category.PREPOSITION);
        dictionary.put( "from", Category.PREPOSITION);
        dictionary.put( "fromthe", Category.PREPOSITION);
        dictionary.put( "atthe", Category.PREPOSITION);
        dictionary.put( "go", Category.GO);

    }
    public static ParsedCommand parseCommand(List<String> wordlist) {
        List<Wordtype> command = new ArrayList<>();
        Category word;
        ParsedCommand parse;

        for (String str : wordlist) {
            if (dictionary.containsKey(str)) {
                word = dictionary.get(str);
                if (!word.equals( Category.ARTICLE ) || !word.equals( Category.PREPOSITION )) {       // ignore articles
                    command.add(new Wordtype(str, word));
                }
            }
            else {
                command.add(new Wordtype(str, Category.ERROR));
            }
        }
        parse = (ParsedCommand) processCommand( command );

        return parse;
    }
    private static Object processCommand(List<Wordtype> command) {
        ParsedCommand parsedCommand;
        switch (command.size()){
            case 1:
                parsedCommand = proccesOneWord(command);
                break;
            case 2:
                parsedCommand = proccesTwoWords(command);
                break;
            case 3:
                parsedCommand = proccesThreeWords(command);
                break;
            case 4:
                parsedCommand = proccesFourWords(command);
                break;
            default:
                parsedCommand = proccesError(command);
                break;
        }
        return parsedCommand;
    }
    private static ParsedCommand proccesError(List<Wordtype> command) {

        return new ParsedCommand(Category.ERROR, checkForError(command, 0));
    }
    private static Wordtype checkForError(List<Wordtype> command, int start) {
        if(start < command.size()){
            if(!dictionary.containsKey(command.get(start).getString())){
                error =  command.get(start);
            }
            else{
                checkForError(command, start+1);
            }
        }
        return error;
    }
    private static ParsedCommand proccesFourWords(List<Wordtype> command) {
        switch (command.get(1).getCategory()){
            case ARTICLE:
            case DETERMINER:
            case PREPOSITION:
                switch (command.get(2).getCategory()){
                    case DETERMINER:
                    case ARTICLE:
                    case PREPOSITION:
                        if(dictionary.containsKey(command.get(1).getString().concat(command.get(2).getString())));{
                            return proccesTwoWords(new ArrayList<Wordtype>(){{
                                add(command.get(0));
                                add(command.get(3));
                            }});
                    }
                    default:
                        return proccesError(command);
                }
            default:
                return proccesError(command);
        }
    }
    private static ParsedCommand proccesThreeWords(List<Wordtype> command) {
        switch (command.get(1).getCategory()){
            case ARTICLE:
                return proccesTwoWords(new ArrayList<Wordtype>(){{
                    add(command.get(0));
                    add(command.get(2));
                }});
            default:
                return proccesError(command);
        }
    }
    private static ParsedCommand proccesTwoWords(List<Wordtype> command) {
        switch (command.get(0).getCategory()){
            case GO:
                return new ParsedCommand(Category.GO, command.get(1));
            case EAT:
                return new ParsedCommand(Category.EAT, command.get(1));
            case USE:
                return new ParsedCommand(Category.USE, command.get(1));
            case TAKE:
                return new ParsedCommand(Category.TAKE, command.get(1));
            case DROP:
                return new ParsedCommand(Category.DROP, command.get(1));
            case OPEN:
                return new ParsedCommand(Category.OPEN, command.get(1));
            case SHOW:
                return new ParsedCommand(Category.SHOW, command.get(1));
            case TALK:
                return new ParsedCommand(Category.TALK, command.get(1));
            case CLOSE:
                return new ParsedCommand(Category.CLOSE, command.get(1));
            case FIGHT:
                return new ParsedCommand(Category.FIGHT, command.get(1));
            default:
                return proccesError(command);
        }
    }
    private static ParsedCommand proccesOneWord(List<Wordtype> command) {

        switch(command.get(0).getCategory()){
            case DIRECTION:
                return new ParsedCommand(Category.GO, command.get(0));
            case SHOWING_ITEM:
                return new ParsedCommand(Category.SHOW, command.get(0));
            default:
                return  new ParsedCommand(Category.ERROR, command.get(0));
        }

    }


}
