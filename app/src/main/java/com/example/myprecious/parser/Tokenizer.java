package com.example.myprecious.parser;



import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.example.myprecious.command.ParsedCommand;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    public static ParsedCommand runCommand(Context context, String input){
        List<String> wordlist;
        ParsedCommand parsedCommand = new ParsedCommand();
        String lower = toLower(input);
        if (!lower.equals("quit")) {
            if (lower.equals("")) {
                Toast.makeText(context,"Can not translate the vacuum!!!", Toast.LENGTH_LONG).show();

            } else {
                wordlist = wordList(lower);
                parsedCommand = checkCommand(context, wordlist);
            }
        }
        return parsedCommand;

    }

    private static ParsedCommand checkCommand(Context context, List<String> wordlist) {
        ParsedCommand pars = new ParsedCommand();
        if (wordlist.size() == 0) {
            Toast.makeText(context,"REALLY!!! Empty command?", Toast.LENGTH_LONG).show();
        } else if (wordlist.size() > 4) {
            Toast.makeText(context, "Dud, i'm not google translate!!!", Toast.LENGTH_LONG).show();
        } else {
            pars = Parser.parseCommand(wordlist);
        }
        return pars;
    }

    private static String[] splitDelims (String lower){
        String delims = "[ \t,.:;?!\"']+";
        return lower.split(delims);
    }

    private static List<String> wordList(String lower) {
        String[] words = splitDelims(lower);
        List<String> strlist = new ArrayList<>();
        for (String word : words) {
            strlist.add(word);
        }
        return strlist;
    }

    private static String toLower(String input) {
        return input.trim().toLowerCase();
    }
}
