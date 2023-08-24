public class Main {
    public static void main(String[] args) {
        ConversorTexto conversor;

        if (args[0].equals("pdf")) {
            conversor = new ConversorPDF();
        } else if (args[0].equals("tex")) {
            conversor = new ConversorTeX();
        } else if (args[0].equals("ascii")) {
            conversor = new ConversorASCII();
        }
    }
}