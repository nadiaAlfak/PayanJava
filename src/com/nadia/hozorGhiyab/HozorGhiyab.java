package com.nadia.hozorGhiyab;

import com.nadia.esmotedad.EasmVaTedad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HozorGhiyab {
    private int jalasat(){
        System.out.println("tedad jalasat ra vared konid");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
    public List<String> hazfGhayebha(){
        EasmVaTedad easmVaTedad=new EasmVaTedad();
        List<String> hazerha=easmVaTedad.nafarat();
        List<Integer> hazfha=new ArrayList<>();
        int classha=jalasat();
        for (int index=0;index<hazerha.size();index++){
            System.out.println(hazerha.get(index)+"chand jalase hozor dashte");
            Scanner scanner=new Scanner(System.in);
            int hozoor= scanner.nextInt();
            if(hozoor<=classha/2){
                hazfha.add(index);
            }
        }
        for (int index:hazfha){
            hazerha.remove(index);
        }
       return hazerha;
    }
}
