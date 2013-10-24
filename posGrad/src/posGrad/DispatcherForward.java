package posGrad;

public class DispatcherForward extends DispatcherStrategy {
	
	public void dispatch(HttpServletRequest request, HttpServletResponse response) {
		request.getRequestDispatcher("").forward();
	}

}
