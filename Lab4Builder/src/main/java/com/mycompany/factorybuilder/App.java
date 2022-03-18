package com.mycompany.factorybuilder;

public class App {

  public static void main(String[] args) {
    var knight = CharacterFactory.createCharacter(CharacterTypes.KNIGHT, "Aragorn");
    System.out.println(knight.toString());

    var archer = CharacterFactory.createCharacter(CharacterTypes.ARCHER, "Legolas");
    System.out.println(archer.toString());
    
    var flagBearer = CharacterFactory.createCharacter(CharacterTypes.FLAG_BEARER, "Frodo");
    System.out.println(flagBearer.toString());

  }
}
