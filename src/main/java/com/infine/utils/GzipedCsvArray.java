package com.infine.utils;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * Created by aramponi032414 on 10/10/2016.
 */
public class GzipedCsvArray {
    final BufferedReader in;


    public GzipedCsvArray(String fileName) throws IOException {
        this(new FileInputStream(fileName));
    }

    public GzipedCsvArray(InputStream in) throws IOException {
        this.in = new BufferedReader(new InputStreamReader(new GZIPInputStream(in)));
    }

    public double[] next() throws IOException {
        String nextLine = null;
        try {
            nextLine = in.readLine();
            if (nextLine == null)
                return null;
            String items[] = nextLine.split(",");
            double res[] = new double[items.length];
            for (int i = 0; i < items.length; i++) {
                res[i] = Double.parseDouble(items[i]);
            }
            return res;
        } catch (Throwable t) {
            System.err.printf("Error while parsing %s\n", nextLine);
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        GzipedCsvArray gzipedCsvArray = new GzipedCsvArray(args[0]);

        double[] array;
        while ((array = gzipedCsvArray.next()) != null) {
            System.out.println(array);
        }
    }
}
