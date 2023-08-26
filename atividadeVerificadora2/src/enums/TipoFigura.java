package enums;

public enum TipoFigura {
    Triangulo {
        @Override
        public String toString() {
            return "TRIANGULO";
        }
    },

    Retangulo {
        @Override
        public String toString() {
            return "RETANGULO";
        }
    }
}
