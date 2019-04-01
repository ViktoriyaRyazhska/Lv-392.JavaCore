package ua.com.lozinska.additionalList1.task2;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Double> sequenceNumbers = new ArrayList<>(20);
        sequenceNumbers.add(0, 0.0);
        sequenceNumbers.add(1, (5.0/8));
        for (int i = 2; i <20 ; i++) {
            sequenceNumbers.add(i,((sequenceNumbers.get(i - 1))/2)+
                    ((sequenceNumbers.get(i - 2))*3.0/4));
        }
        System.out.println(sequenceNumbers);

    }
}
