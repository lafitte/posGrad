package posGrad;

public class DispatcherFactory {

	public static DispatcherStrategy create(String opcao) {
		if (opcao.equals("redirect")) {
			return new DispatcherRedirect();
		} else {
			return new DispatcherForward();
		}
	}
}
