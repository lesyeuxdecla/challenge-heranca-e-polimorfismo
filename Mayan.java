public class Mayan extends Linguagem {
    public Mayan(String nome, int numFalantes) {
        super(nome, numFalantes, "America Central", "verbo-objeto-sujeito");
    }
    public void getInfo() {
        System.out.println("--------------------------------------------------------- \n");
        System.out.println(this.nome + " é falado por " + this.numFalantes + " pessoas principalmente em " + this.regioesFaladas + "\n Fato interresante: " + this.nome + " é uma lingua ergativa.");
        System.out.println("A linguagem segue a ordem das palavras: " + this.ordemDasPalavras + ".");
        System.out.println("--------------------------------------------------------- \n");

    }
}