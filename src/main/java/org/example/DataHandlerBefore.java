package org.example;

public class DataHandlerBefore {
    public Data buildData(boolean isConditionA, boolean isConditionB, boolean isConditionC, String extraCondition) {
        int someValue;
        if (isConditionA) {
            someValue = 10;
        }
        else {
            if (extraCondition.equals("ForceB") || isConditionB) {
                someValue = 20;
            } else {
                if (isConditionC) {
                    someValue = 30;
                } else {
                    someValue = 40;
                }
            }
        }

        Data data = new Data();
        data.setA(someValue + 1);
        if (someValue == 30) {
            data.setB(someValue + 2);
        } else {
            data.setB(someValue + 4);
        }
        data.setC(someValue + 3);
        return data;
    }
}
