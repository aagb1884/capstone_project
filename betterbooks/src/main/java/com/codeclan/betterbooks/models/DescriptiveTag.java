package com.codeclan.betterbooks.models;

public enum DescriptiveTag {
    PICTUREBOOK("Picture Book"),
    FICTION("Fiction"),
    FANTASY("Fantasy"),
    HORROR("Horror"),
    SCIENCEFICTION("Science Fiction"),
    TVCHARACTERS("TV Characters"),
    FILMCHARACTERS("Film Characters"),

    GAMECHARACTERS("Game Characters"),
    ADVENTURE("Adventure"),
    LIGHTHEARTED("Lighthearted"),
    SLOWPACED("Slow paced"),
    MEDIUMPACED("Medium paced"),
    FASTPACED("Fast paced"),
    MYSTERY("Mystery"),
    SCARY("Scary"),
    CLASSIC("Classic"),
    CHOOSEYOUROWNADVENTURE("Choose Your Own Adventure"),
    BEDTIME("Bedtime"),
    INFORMATIVE("Informative"),
    NONFICTION("Non-fiction"),
    SAD("Sad"),
    DARK("Dark"),
    EMOTIONAL("Emotional"),
    MIDDLEGRADE("Middle Grade"),
    YA("YA"),
    FUNNY("Funny"),
    SILLY("Silly"),
    CHALLENGING("Challenging"),
    BOARDBOOK("Board Book"),
    TEXTURES("Textures"),
    SENSORY("Sensory"),
    BABYBOOK("Baby Book"),
    BUGGYBOOK("Buggy Book"),
    LIFTTHEFLAPSBOOK("Lift-the-flaps Book"),
    POPUPBOOK("Pop-up Book"),
    EDUCATIONAL("Educational"),
    ANIMALS("Animals"),
    CONTAINSFARTS("Contains Farts"),
    HOWTOBOOK("How-to Book"),
    FIRSTEXPERIENCES("First Experiences");

    private final String value;

    DescriptiveTag(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
