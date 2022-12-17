package org.example;

public class DataHandlerAfter {
    public Data buildData(boolean isConditionA, boolean isConditionB, boolean isConditionC, String extraCondition) {
        return makeData(getSomeValue(isConditionA, isConditionB, isConditionC, extraCondition));
    }

    private int getSomeValue(boolean isConditionA, boolean isConditionB, boolean isConditionC, String extraCondition) {
        if (isConditionA) {
            return 10;
        }
        // else if로 변경해도 로직은 동일하다. else if로 변경해보면, NPath가 감소하는 것을 볼 수 있다.
        else if (extraCondition.equals("ForceB") || isConditionB) {
            return 20;
        }
        else if (isConditionC) {
            return 30;
        }
        return 40;
    }

    private Data makeData(int base) {
        Data data = new Data();
        data.setA(base + 1);
        if (base == 30) {
            data.setB(base + 2);
        } else {
            data.setB(base + 4);
        }
        data.setC(base + 3);
        return data;
    }
}
