package com.nadia.hozorGhiyab;

import com.nadia.moadel.Moadel;
import com.nadia.model.Daneshjo;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;

public class Failing {
    private Formatter khoroji;
    public  void bazkardanFile() {
        try {
            khoroji = new Formatter("MoshakhasatDaneshjoo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void add(){
        Moadel moadel=new Moadel();
        List<Daneshjo> daneshjos = moadel.mohasebe();
        for (Daneshjo nafar:daneshjos) {
            khoroji.format("%s %d \n",nafar.getEsm(),nafar.getMoadel());

        }
    }
    public void close(){
        khoroji.close();
    }
}
