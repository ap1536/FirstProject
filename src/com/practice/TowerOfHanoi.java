package com.practice;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(5, 'A', 'C', 'B');
    }

    private void move(int i, char from, char to, char use) {
        if(i == 1){
            System.out.println("Move Disk "+i+" From "+from+" to "+to);
        }
        else{
            move(i-1,from,use,to);
            System.out.println("Move disk "+i+" From "+from+" To"+to);
            move(i-1, use, to, from);
        }
    }

}
