<%@ page import="com.example.MessageService" %>
<html> 
    <body>
         <h2>Hello Adi!</h2> 
         <p><%= MessageService.getWelcomeMessage() %></p>
         <p>Software is all up in the clouds!</p> 
         <p> This line is proof that code is automatically pushed through a pipeline!!</p>
    </body> 
</html>
