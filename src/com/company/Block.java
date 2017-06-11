package com.company;

public class Block {
    private int blockNumber;
    private String hash;
    //private String prevLink;
    private String nextLink;
    private String timeStamp;

    public Block(int blockNumber, String hash, String timeStamp){
        this.blockNumber = blockNumber;
        this.hash = hash;
        this.nextLink = "null";
        this.timeStamp = timeStamp;
    }
}
