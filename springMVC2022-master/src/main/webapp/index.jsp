<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPRING MVC</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body> 
<!--  bootstrap ten form örneği aldım kopyaladım-->
	<h1 class="h2 text-center m-4">CALCULATE</h1>
	<div class="container"> <!-- form un tamamına css verebilmek için div -->
		<form action="submit"> <!--submit e basınca action gerçekleşiyor, sayılar, işlem olmak üzere sonucController a gidiyor-->
	<!--  buradaki submit ile sonucController daki submit aynu olmalı-->	
			<div class="mb-3">
				<label for="number1" class="form-label">Number 1</label>
			 	<input type="number" class="form-control" id="number1" name="number1" placeholder="Please type first number">
			</div>
			<div class="mb-3">
				<label for="sayi2" class="form-label">Number 2</label>
			 	<input type="number" class="form-control" id="number2" name="number2" placeholder="Please type second number">
			</div>
		
			<button type="submit" class="btn btn-primary"target="_blank">Calculate</button>
		</form>
	</div>
</body>
</html>