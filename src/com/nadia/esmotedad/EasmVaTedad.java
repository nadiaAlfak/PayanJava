package com.nadia.esmotedad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasmVaTedad {
    public List<String> nafarat(){
        List<String> names=new ArrayList<>();
        System.out.println("Tedad nafarat ra vared konid");
        Scanner scanner=new Scanner(System.in);
        int tedad=scanner.nextInt();

        // پرسیدن اسم
        for (int index=0;index<tedad;index++){
            System.out.println("asami ra vared konid");
            String esm=scanner.next();
            names.add(esm);
        }
        return names;
    }
}
