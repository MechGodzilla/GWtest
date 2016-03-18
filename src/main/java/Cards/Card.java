package Cards;

public class Card {
    private String name;
    private String description;
    private int score;
    private int type; // weather, ranged, sieged, melee
    private int effect; //spy, multiplier
    private int hero;


//    //constructor
    public Card(String cardName, String cardDescription, int cardScore, int cardType, int cardEffect){
        name = cardName;
        description = cardDescription;
//        setScore = cardScore;
//        setType = cardType;
//        setEffect = cardEffect;
    }

    //add the rest
//    public Card(String cardName, String cardDescription){//, int cardScore, int cardType, int cardEffect, int cardHero){
//        setName(cardName);
//        setDescription(cardDescription);
//        score = cardScore;
//        type = cardType;
//        effect = cardEffect;
//        hero = cardHero;
//    }
//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public String selectedCard(){
        return String.format("%s - %s\n", name, description);
    }



}
