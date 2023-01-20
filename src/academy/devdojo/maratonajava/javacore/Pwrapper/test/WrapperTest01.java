package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {

    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1;
        double doubleP = 1;
        char charP = 1;
        boolean booleanP = false;


        //objetos - sao referencias e nao valor
        //autoboxing
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        //unboxing- transformar Wrapper em int
        int i = intW;

        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
