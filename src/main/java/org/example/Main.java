package org.example;

public class Main {
   public static  int bossHP =800;
    public static  int bossDAMAGE =50;
    public static  String bossDefense;
    public static  String[] heroesAttackTypes = {"Kinetic","Magical","Physical"};
    public static  int[] heroesHP = {300, 200,350};
    public static  int[] heroesDamage = {30,40,20};
    public static  int round = 0;
    public static void main(String[] args) {
        state();
        while (!finish()){
            playRound();


}

boolean allHeroesDead = true;
        for (int i = 0; i < heroesHP.length; i++) {
            if (heroesHP[i] > 0){
                allHeroesDead = false;
                break;
            }
        }
       if (allHeroesDead) {
           System.out.println("BossWon");
       } }


         public static void state(){
        System.out.println("round is " + round);
        System.out.println("BossHP  " + bossHP);
        System.out.println("BossDamage  " + bossDAMAGE);
        System.out.println("BossDefense  " + bossDefense);
        for (int i = 0; i < heroesAttackTypes.length; i++) {
            System.out.println(heroesAttackTypes[i] + " Health - "+ heroesHP[i] + " Damage - " + heroesDamage[i]);
        }


    }
    public static void playRound(){
        round++;
        bossHit();
        heroesHit();
        state();
    }
    public static void  bossHit(){
        for (int i = 0; i < heroesAttackTypes.length; i++) {
             {heroesHP[i]= heroesHP[i] - bossDAMAGE;}
        }
    }
    public static void defenseType(){}
    public static void  heroesHit(){
        for (int i = 0; i < heroesDamage.length; i++) {
            bossHP=bossHP-heroesDamage[i];
        }

    }



    public static boolean finish() {
        if (bossHP <= 0) System.out.println("HeroesWon");
        return true;
    }

    }