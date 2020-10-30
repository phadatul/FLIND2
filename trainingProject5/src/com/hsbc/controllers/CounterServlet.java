package com.hsbc.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int iHitCounter;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() throws ServletException{
		try { FileReader fileReader = new FileReader("InitDestroyCounter.initial"); 
		BufferedReader bufferedReader = new BufferedReader(fileReader); 
		String initial=null;
		try {
			initial = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		iHitCounter = Integer.parseInt(initial); 
		return; 
		} 
		catch (FileNotFoundException ignored) { } // no saved state 
		catch (IOException ignored) { } // problem during read 
		catch (NumberFormatException ignored) { } // corrupt saved state // No luck with the saved state, check for an init parameter 
		String initial = getInitParameter("initial"); 
		try { iHitCounter = Integer.parseInt(initial); 
		return; } 
		catch (NumberFormatException ignored) { } // null or non-integer value // Default to an initial count of "0" 
		iHitCounter = 0; 
		
	} 
		
	
    public CounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		 out.println("<form><fieldset style='width:15%'>");
         out.println("<h3>Welcome to my website !</h3><hr>");
         out.println("You are visitor number: "+ (++iHitCounter));
         out.println("</fieldset></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void destroy() { 
	      // This is optional step but if you like you
	      // can write hitCount value in your database.
		
		saveState();
	} 
	public void saveState() { 
		try { 
			FileWriter fileWriter = new FileWriter("InitDestroyCounter.initial"); 
			String initial = Integer.toString(iHitCounter); 
			fileWriter.write(initial, 0, initial.length()); 
			fileWriter.close(); 
			return; 
			} 
		catch (IOException e) { 
		}
	
	}

}
