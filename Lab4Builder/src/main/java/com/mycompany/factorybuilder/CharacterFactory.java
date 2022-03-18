
package com.mycompany.factorybuilder;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    private String name;
    private CharacterTypes type;
    private static CharacterFactory cf;
    public CharacterFactory (CharacterTypes type, String name){
        this.name = name;
        this.type = type;
    }
    public static Characters createCharacter(CharacterTypes type, String name){
        
     
            if(cf == null) {
                cf = new CharacterFactory(type, name);
            }
            return (Characters) cf;

    }
}
