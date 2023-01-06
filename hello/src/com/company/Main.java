package com.company;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/home/rameshkumar/Downloads/archive/matches.csv");
        BufferedReader br = new BufferedReader(fr);
        String s;
        ArrayList<String> lines = new ArrayList<>();
        while ((s = br.readLine()) != null) {
            // System.out.println(s);
            lines.add(s);
        }
        ArrayList<String[]> recoreds = new ArrayList<>();
        lines.forEach(E -> {
            recoreds.add(E.split(","));
        });
        recoreds.forEach((E -> {
            for (var i : E) {
                System.err.print(i + " | ");
            }
            System.out.println();
        }));
        br.close();
    }
}




