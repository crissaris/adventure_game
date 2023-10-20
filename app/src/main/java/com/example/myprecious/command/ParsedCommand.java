package com.example.myprecious.command;

import com.example.myprecious.dictionary.Category;
import com.example.myprecious.dictionary.Wordtype;

public class ParsedCommand {
    Category category;
    Wordtype wordtype;

    public ParsedCommand(Category category, Wordtype wordtype) {
        this.category = category;
        this.wordtype = wordtype;
    }

    public ParsedCommand() {

    }



    public Category getCategory() {
        return category;
    }

    public Wordtype getWordtype() {
        return wordtype;
    }
}
