package com.mycompany.aula03_10;

public class Exemplo02 {
    public static void main(String[] args) {
            Classe01 c1 = new Classe01(100);

            try {
                c1.f(200);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            catch (Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("Terminal o método f()");
            }
    }
}
