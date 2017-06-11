package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Blockchain {
    private String name;
    private int difficulty;
    private int blockCount;
    private ArrayList blockArray = new ArrayList();

    Scanner scanner = new Scanner(System.in);

    public Blockchain(String name, int difficulty){
        this.name = name;
        this.difficulty = difficulty;
        this.blockCount = 1;
        System.out.println("Creating new blockchain: " + name);
        Origin origin = new Origin(getTime());
        blockArray.add(origin);
        System.out.println("Blockchain created. Press ENTER to start mining blocks!");
    }

    public void startMining(){
        System.out.println("Type 'mine' to mine blocks, 'stop' to exit.");
        String input;
        while(true){
            input = scanner.nextLine();
            if(input.equals("mine")){
                Block block = generateBlock();
                blockArray.add(block);
                this.blockCount++;
                System.out.println("Mined block number " + getBlockCount());
            }
            else if (input.equals("stop")){
                break;
            }
            else{
                System.out.println("Type 'mine' or 'stop'.");
            }
        }
        return;
    }

    public Block generateBlock(){
        Block block = new Block(this.getBlockCount()+1,generateHash(),getTime());
        return block;

    }

    public int getBlockCount(){
        return this.blockCount;
    }

    public String generateHash(){
        String newHash = Integer.toString(getBlockCount()) + getTime();
        return newHash;
    }

    public String getTime(){
        String time = "currentTime";
        return time;
    }
    public int getDifficulty(){
        return this.difficulty;
    }
}
