<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="com.hanna.books.models.*, com.hanna.books.services.*, java.util.List, java.util.ArrayList" %>
<html>
<head>
	<style>
		body {
  		background-color: white;
		}

		h1 {  		
  		color: LightPink;
  		text-align: center;
  		font-size: 65px;
  		//text-shadow: 2px 2px white;
		}
		
		a {
		width: 50%;
		clear: both;
		margin: auto;
		color: Black;
		text-align: center;
  		font-family: Times New Roman;
  		font-size: 15px;
		}
		
		p {
		border: 4px PaleGoldenRod;
		border-radius: 50px;
		border-style: double;
		background-color: LightYellow;
		padding: 10px 15px;
		margin: 20px 50px;
		color: Peru;
		text-align: center;
  		font-family: verdana;
  		font-size: 20px;
		}
	</style>
	<title>BooksMain</title>
</head>
<body>
	<h1>Welcome to the online Book Shelf</h1>
    
    <div style="width: 650px; margin: auto;">
		<p>The following endpoints can be used:</p>
	</div>
	<div style="text-align: center;">
		<a href="http://localhost:8091/book">http://localhost:8091/book</a>
		<br>
		<a>Get all books from database in Json format.</a>
		<br>
		<br>
		<a>http://localhost:8091/book/{theme}, Get books by theme. Works with Postman.</a>
		<br>
		<br>
		<a>http://localhost:8091/book/post, Post new book. Takes Json format. Works with Postman.</a>
		<br>
		<br>
		<a>http://localhost:8091/book/put/{id} Change book info by id. Takes Json format. Works with Postman</a>
		<br>
		<br>
		<a>http://localhost:8091/book/delete/{id} Delete book by id. Works with Postman</a>
	</div>	
</body>
</html>