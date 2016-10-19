package com.isograd.exercise;

/*****
 *Solution by lavrenti with structure change by alan
 * */

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IsoContest {
    private static IsoContest main;
    private int nbLines = 0;
    private String result = null;

    public static void main(String[] argv) throws Exception {
        main = new IsoContest();

        String line;
        Scanner sc = new Scanner(main.getInputStream(argv));

        int n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++) {
            line = sc.nextLine();
            // TODO add computing here
        }

        int result = 0;

        // TODO add computing here

        System.out.println(result);
        main.result = "" + result;
    }

    public static IsoContest getMain() {
        return main;
    }

    public String getResult() {
        return result;
    }

    public static InputStream getInputStream(String[] args) {
        InputStream ret = System.in;
        if (args != null && args.length > 0 && args[0] != null) {
            if (args[0].length() > 0) {
                String file = args[0];
                try {
                    ret = IsoContest.class.getResourceAsStream("/" + file);
                } catch (Exception ex) {
                    System.err.println("Impossible to open that stream: " + file);
                }
            }
        }
        return ret;
    }

}

