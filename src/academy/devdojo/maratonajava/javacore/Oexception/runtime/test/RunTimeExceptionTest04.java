package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndex");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do IndexOut");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do Illegal");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            //nao pode colocar a excecao mais generica antes
        }
    }


}
