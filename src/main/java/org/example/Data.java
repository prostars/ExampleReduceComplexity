package org.example;

import java.util.Objects;

// legacy code라고 가정하고 get, set을 가지고 있다.
public class Data {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(final int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(final int c) {
        this.c = c;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Data data = (Data) o;
        return a == data.a && b == data.b && c == data.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
