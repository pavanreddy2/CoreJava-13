package com.ar.method.instanceMethods;

public class WithReturnTypeWithOutInputParameter {

    /**
     * WithReturnType & WithOutInputParameter
     * @return
     */
    public int m1 () {
        return 100;
    }

    public char m2 () {
        return 'A';
    }

    public String m3 () {
        return "NIKI";
    }

    public Double m4() {
        return 10000d;
    }

    public static void main(String[] args) {

        //By Creating Object...
        WithReturnTypeWithOutInputParameter ref = new WithReturnTypeWithOutInputParameter();
       int i = ref.m1();
       char ch =  ref.m2();
       String str =  ref.m3();

        System.out.println(i);
        System.out.println(ch);
        System.out.println(str);

        double d = ref.m4();
        System.out.println(d);
    }
}
