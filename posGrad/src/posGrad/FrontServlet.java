package posGrad;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		Command c = CommandFactory.create(request.getParameter("opcao"));
		
		String resultPage = c.execute();
		
		DispatcherStrategy ds = DispatcherFactory.create(request.getParameter("opcao"));
		ds.dispatch(request, response);
	}
}
