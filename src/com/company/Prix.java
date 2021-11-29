package com.company;

public class Prix {
    public static void Prix(float prix, float reduc1, float reduc2) {
//        float prix = 10;
//        float reduc1 = 0.5f;
//        float reduc2 = 0.3f;
        if (reduc1 > reduc2) {
            prix = prix * (1 - reduc1);
            System.out.println("Prix avec la première réduc : " + prix);
            prix = prix * (1 - reduc2);
            System.out.println("Prix avec la deuxième réduc : " + prix);
        } else {
            System.err.println("ERREUR ://");
        }

    }
}
