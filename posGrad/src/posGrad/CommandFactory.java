package posGrad;
import Command;

public class CommandFactory {

	public static Command create(String opcao) {
		return new Command();
	}
}
