package posGrad;

public class DispatcherRedirect extends DispatcherStrategy {

	public void dispatch(HttpServletRequest request, HttpServletResponse response) {
		request.getRequestDispatcher("").redirect();
	}
}
