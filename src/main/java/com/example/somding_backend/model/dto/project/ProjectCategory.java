package com.example.somding_backend.model.dto.project;


public enum ProjectCategory {
    doll("DOLL", "인형"),
    goods("GOODS", "잡화"),
    wear("WEAR", "의류");

    private final String value;
    private final String name;
    ProjectCategory(String value, String name){
        this.value = value;
        this.name = name;
    }

    // TODO 주석 후 @Getter
    public String getValue(){return value;}
    public String getName(){return name;}
}
