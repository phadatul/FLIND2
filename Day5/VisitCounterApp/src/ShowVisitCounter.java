

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowVisitCounter")
public class ShowVisitCounter extends HttpServlet {   
	private int counter;
	
	@Override
	public synchronized void init() {
		Properties properties = new Properties();
		try {
			FileReader reader = new FileReader("counter.value");
			properties.load(reader);
			counter = Integer.parseInt(properties.getProperty("value"));
			reader.close();
			System.out.println("Counter value read from file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public synchronized void destroy() {
		Properties properties = new Properties();
		properties.setProperty("value", Integer.valueOf(counter).toString());
		try {
			FileWriter writer = new FileWriter("counter.value");
			properties.store(writer, null);
			writer.close();
			System.out.println("Counter value saved to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		synchronized(this) {
			++counter;
		}
		
		response.getWriter().println("Visit count: " + counter);
	}
}
