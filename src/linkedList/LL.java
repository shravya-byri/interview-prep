package linkedList;

import java.lang.reflect.Field;

public class LL {
    public static class Friend {
        String name;
        int age;
        int weight = 50;
        public Friend(String d, int n) {
            name = d;
            age = n;
        }
    }

    public static void main(String[] args) {
       Friend f = new Friend("barre", 22);
       System.out.println(f.name);
    }
}