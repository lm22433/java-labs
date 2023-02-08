package io.github.theblacksquidward;

public class StringTest {

    public static void main(String[] args) {
        String x = "a";
        StringUtils.append(x);
        System.out.println(x);

        System.out.println(StringUtils.append2(x));

        StringBox stringBox = new StringBox("a");
        StringUtils.concat(stringBox);
        System.out.println(stringBox.getValue());
    }
}
