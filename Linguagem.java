public class Linguagem {
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String name, int numFalantes, String regioesFaladas, String ordemDasPalavras) {
        this.nome = name;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public void getInfo() {
        System.out.println("---/// \n");
        System.out.println(this.nome + " é falado por " + this.numFalantes + " pessoas principalmente em "
                + this.regioesFaladas + ".");
        System.out.println("A linguagem segue a ordem das palavras: " + this.ordemDasPalavras + ".");
        System.out.println("---/// \n");

    }

    public static void main(String[] args) {
        Mayan maiaMexicana = new Mayan("Lingua Mexicana Maia", 5000);
        maiaMexicana.getInfo();

        Romanica frances = new Romanica("Francês", 1100000000);
        frances.getInfo();

        Romanica italiano = new Romanica("Italiano", 300000000);
        italiano.getInfo();
    }

}
