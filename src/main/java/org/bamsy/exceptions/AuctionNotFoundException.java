package org.bamsy.exceptions;

public class AuctionNotFoundException extends RuntimeException{
    public AuctionNotFoundException(String message){
        super(message);
    }
}
