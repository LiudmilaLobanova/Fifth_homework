package ru.netology.sqr;

public class SQRService {

    public int numberSqrMatches(int border1, int border2) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            int sqrVar = i * i;
            if (border1 <= sqrVar & sqrVar <= border2) {
                counter++;
            }
        }
        return counter;

    }
}
