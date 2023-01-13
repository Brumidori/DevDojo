package academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio;

public enum TipoPagamento{
        //posivel criar enum dentro da propria classe
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor*0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.05;
        }
    };
        //metodo abstract nao tem corpo - para ser sobrescrito apenas
        public abstract double calcularDesconto(double valor);
    }