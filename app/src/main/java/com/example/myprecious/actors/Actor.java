package com.example.myprecious.actors;

import com.example.myprecious.R;
import com.example.myprecious.containers.Container;
import com.example.myprecious.items.Item;
import com.example.myprecious.items.MagicalItem;

public class Actor {
    private String name;
    private String lastname;
    private String alias;
    private String race;
    private Item ring;
    private Item right_hand;
    private Item left_hand;
    private Container container;
    private int bust_image;
    private int full_body_image;
    private int power;
    private int health;

    public Actor() {
    }

    public Actor(String name, String lastname, String alias, String race,
                 Item ring, Item right_hand, Item left_hand, Container container,
                 int bust_image, int full_body_image, int power, int health) {
        this.name = name;
        this.lastname = lastname;
        this.alias = alias;
        this.race = race;
        this.ring = ring;
        this.right_hand = right_hand;
        this.left_hand = left_hand;
        this.container = container;
        this.bust_image = bust_image;
        this.full_body_image = full_body_image;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Item getRing() {
        return ring;
    }

    public void setRing(Item ring) {
        this.ring = ring;
    }

    public Item getRight_hand() {
        return right_hand;
    }

    public void setRight_hand(Item right_hand) {
        this.right_hand = right_hand;
    }

    public Item getLeft_hand() {
        return left_hand;
    }

    public void setLeft_hand(Item left_hand) {
        this.left_hand = left_hand;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public int getBust_image() {
        return bust_image;
    }

    public void setBust_image(int bust_image) {
        this.bust_image = bust_image;
    }

    public int getFull_body_image() {
        return full_body_image;
    }

    public void setFull_body_image(int full_body_image) {
        this.full_body_image = full_body_image;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    // actors...
    public static class FrodoBaggins extends Actor {
        public FrodoBaggins() {
            super("Frodo", "Baggins", "ringbearer",
                    "Hobbit", new Item(), new Item(), new Item(),
                    new Container(), R.drawable.frodo_face,
                    R.drawable.frodo_baggins, 100, 300);
        }
    }
    public static class GaladrielAlatariel extends Actor {
        public GaladrielAlatariel() {
            super("Galadriel", "Alatariel", "Lady of Lórien",
                    "Elves",new MagicalItem.Nenya(), new Item(), new Item(), new Container(),
                    R.drawable.galadriel_face,R.drawable.galadriel,500, 800);
        }
    }
    public static class GandalfOlórin extends Actor {
        public GandalfOlórin() {
            super("Gandalf", "Olórin", "Mithrandir", "Maiar",
                    new MagicalItem.Narya(), new Item(), new Item(), new Container(),
                    R.drawable.gandalf_face, R.drawable.gandalf, 500, 1000);
        }
    }
    public static class AragornSonOfArathorn extends Actor {
        public AragornSonOfArathorn() {
            super("Aragorn", "Ranger of the North", "strider", "Men"
                    , new MagicalItem.RingOfBarahir(), new Item(), new Item(), new Container(),
                    R.drawable.aragorn_face, R.drawable.aragorn, 300, 500);
        }
    }
    public static class Legolas extends Actor {
        public Legolas() {
            super("Legolas", "Greenleaf", "Prince of the Woodland Realm",
                    "Sindar Elf", new MagicalItem.ArrowRing(), new Item(), new Item(),
                    new Container(), R.drawable.legolas_face, R.drawable.legolas, 500, 1000);
        }
    }
    public static class SamwizeGamgee extends  Actor {
        public SamwizeGamgee() {
            super("Samwise", "Gamgee", "Brave", "Hobbit", new Item(),
                    new Item(), new Item(), new Container(), R.drawable.samwize_face,
                    R.drawable.samwize, 200, 400);
        }
    }
    public static class BilboBaggins extends Actor {
        public BilboBaggins() {
            super("Bilbo", "Baggins", "Barrel rider", "Hobbit", new Item(), new Item(), new Item(),
                    new Container(), R.drawable.bilbo_face, R.drawable.bilbo_baggins, 50,400);
        }
    }
}
