package com.example.myprecious.scenes;

import com.example.myprecious.R;
import com.example.myprecious.actors.*;

import java.util.ArrayList;

public class EpisodeOnePrologue extends Scene {

    public EpisodeOnePrologue() {
        super(new Galadriel(), new ArrayList<String>() {{
            add("The world is changed.\n" +
                    "I feel it in the water.\n" +
                    "I feel it in the Earth.\n" +
                    "I smell it in the air.\n" +
                    "Much that once was is lost.\n" +
                    "For none now live who remember it.\n" +
                    "It began with the forging of the great rings...");
            add("Three were given to the Elves, immortal, wisest\n" +
                    "and fairest of all beings.\n");
            add("Seven to the Dwarf lords, great miners and craftsmen" +
                    "of the mountain halls.\n");
            add("And nine, nine rings were gifted to the race of Men,\n" +
                    "who above all else, desire power.\n" +
                    "For within these rings was bound the strength\n" +
                    "and will to govern each race.\n");
            add("But they were all of them deceived,\n" +
                    "for another ring was made.\n" +
                    "In the land of Mordor, in the fires of Mount Doom, \n" +
                    "the Dark Lord Sauron forged in secret a master ring,\n" +
                    " to control all others.\n");
            add("And into this Ring, he poured his cruelty,\n" +
                    "his malice, and his will to dominate all life.\n" +
                    "One Ring to rule them all. One by one,\n" +
                    "the free lands of Middle-Earth fell to the power of the Ring.\n");
            add("But there were some who resisted.\n" +
                    "A last alliance of Men and Elves marched against the armies of Mordor,\n" +
                    "and on the slopes of Mount Doom they fought for the freedom of Middle-Earth.");
            add("Victory was near. But the power of the Ring could not be undone.\n" +
                    "It was in this moment, when all hope had faded, that Isildur,\n" +
                    "son of the King, took up his father's sword and strikes Sauron's \n" +
                    "hand with the shard of the sword, slicing the finger that bears the One Ring.\n");
            add("Sauron, the enemy of the free peoples of Middle-Earth,\n" +
                    "was defeated. The Ring passed to Isildur,\n" +
                    "who had this one chance to destroy evil forever.\n" +
                    "But the hearts of Men are easily corrupted.\n" +
                    "And the Ring of Power has a will of its own.\n");
            add("It betrayed Isildur……to his death.\n" +
                    "And some things that should not have been forgotten were lost.\n" +
                    "History became legend, legend became myth,\n" +
                    "and for two and a half thousand years,\n" +
                    "the Ring passed out of all knowledge.\n" +
                    "Until, when chance came, it ensnared a new bearer.\n");
            add("The Ring came to the creature Gollum,\n" +
                    "who took it deep into the tunnels of the Misty Mountains.\n" +
                    "And there, it consumed him. The Ring brought to Gollum unnatural long life.\n" +
                    "For five hundred years it poisoned his mind. And in the gloom of\n" +
                    "Gollum's cave, it waited.\n");
            add("Rumor grew of a shadow in the east, whispers of a nameless fear,\n" +
                    "and the Ring of Power perceived its time had now come. It abandoned Gollum.\n" +
                    "But something happened then the Ring did not intend.\n");
            add("It was picked up by the most unlikely creature imaginable.\n" +
                    "A Hobbit, Bilbo Baggins of the Shire.\n" +
                    "For the time will soon come when Hobbits will shape the fortunes of all.");
        }}, new ArrayList<Integer>() {{
            add(R.drawable.galadriel);
            add(R.drawable.elvekings);
            add(R.drawable.dawrfkings);
            add(R.drawable.menkings);
            add(R.drawable.doom);
            add(R.drawable.ringinhand);
            add(R.drawable.alliance);
            add(R.drawable.isildur);
            add(R.drawable.ringtoisildur);
            add(R.drawable.isildurend);
            add(R.drawable.gollum);
            add(R.drawable.ringloss);
            add(R.drawable.ringfindbilbo);
        }});
    }
}
