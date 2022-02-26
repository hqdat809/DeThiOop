/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Dictionary {

    public static void main(String[] args) {
        List<Word> list = new ArrayList<>();
        list.add(new Word(1, "one", "một"));
        list.add(new Word(2, "two", "hai"));
        list.add(new Word(3, "three", "ba"));
        list.add(new Word(4, "four", "bốn"));
        list.add(new Word(5, "five", "năm"));
        list.add(new Word(6, "six", "sáu"));
        list.add(new Word(7, "seven", "bảy"));
        list.add(new Word(8, "eight", "tám"));
        list.add(new Word(9, "nine", "chín"));
        list.add(new Word(10, "ten", "mười"));
        list.add(new Word(11, "eleven", "mười một"));
        
        

    }
}
