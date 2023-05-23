public class Romanica extends Linguagem {
    public Romanica(String name, int numFalantes) {
        super(name, numFalantes, "América Latina", "sujeito-objeto-verbo");
        if (this.nome.contains("Francês")) {
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
}