package posGrad;

public class Redirect extends DispatcherStrategy {

	public void dispatch(HttpServletRequest request, HttpServletResponse response) {
		response.sendRedirect();
	}
}
