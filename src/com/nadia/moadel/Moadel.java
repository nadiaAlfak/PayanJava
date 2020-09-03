package com.nadia.moadel;

import com.nadia.hozorGhiyab.HozorGhiyab;
import com.nadia.model.Daneshjo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Moadel {
    public List<Daneshjo> mohasebe(){
        List<Daneshjo> daneshjos = new ArrayList<>();
        HozorGhiyab hozorGhiyab=new HozorGhiyab();
        List<String> names=hozorGhiyab.hazfGhayebha();

        for (int index=0;index<names.size();index++){
            int lessonOne;
            int lessonTwo;
            int lessonThree;
            System.out.println("nomarat " + names.get(index)+ " ra vared konid");
            Scanner scanner=new Scanner(System.in);
            lessonOne=scanner.nextInt();
            lessonTwo=scanner.nextInt();
            lessonThree=scanner.nextInt();
            int moadel=(lessonOne+lessonTwo+lessonThree)/3;
            Daneshjo daneshjo=new Daneshjo();
            daneshjo.setEsm(names.get(index));
            daneshjo.setMoadel(moadel);
            daneshjos.add(daneshjo);

        }
        return daneshjos;
    }
}
