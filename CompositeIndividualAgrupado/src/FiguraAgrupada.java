import java.util.ArrayList;

public class FiguraAgrupada implements Figura {
	private ArrayList<Figura> figuras = new ArrayList<>();

	 // M�todo para adicionar uma figura � lista
	 public void adicionar(Figura fig) {
	     figuras.add(fig);
	 }

	 // M�todo para remover uma figura da lista
	 public void remover(Figura fig) {
	     figuras.remove(fig);
	 }

	 public void desenha() {
	     for (Figura fig : figuras) {
	         fig.desenha();
	     }
	 }
	 
	 public void mudaCorDeFundo(Cor cor) {
	     for (Figura fig : figuras) {
	         fig.mudaCorDeFundo(cor);
	     }
	 }
}
