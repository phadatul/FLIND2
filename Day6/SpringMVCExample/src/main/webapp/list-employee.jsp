<%@ page import="com.example.helloworldspring.Employee, java.util.List" %>
<% List<Employee> list = (List<Employee>) request.getAttribute("list"); %>

<div>  
    <div>Employee count: <%= list.size() %></div> 
    <ol>
    <% for (Employee e : list) { %>
        <li><%= e %></li>
    <% } %>
    </ol>
</div>