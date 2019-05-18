<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Music App</title>
</head>
<body>
<h1>Music Album Management by X-workz</h1>
<h3>${albumName}</h3>
<form action="addAlbum.do" method="post">
<table border="1">
<tr>
<td>AlbumName:</td>
<td><input type="text" name="albumName"/></td>
</tr>

<tr>
<td>Artist:</td>
<td><input type="text" name="artist"/></td>
</tr>

<tr>
<td>Language:</td> <select name="language">
	<option value="">--select--</option>
	<option value="KAN">KANNADA</option>
	<option value="ENG">ENGLISH</option>
	<option value="HIN">HINDI</option>
	<option value="TEL">TELUGU</option>
	<option value="TAM">TAMIL</option>
	<option value="MAL">MALAYALAM</option>
	<option value="ARA">ARABIC</option>
	</select>
	</tr>

<tr>
<td>Genre:</td> <select name="genre">
	<option value="">--select--</option>
	<option value="MEL">MELODY</option>
	<option value="CLA">CLASSICAL</option>
	<option value="GHA">GHAZAL</option>
	<option value="ROC">ROCK</option>
	<option value="TRA">TRANCE</option>
	<option value="MET">METAL</option>
	</select>
	</tr>


<tr>
<td>Date:</td>
<td><input type="text" name="date"/></td>
</tr>

<tr>
<td>NoOfSongs:</td>
<td><input type="text" name="noOfSongs"/></td>
</tr>

<tr>
<td><input type="submit" value="Add Album"/></td>
</tr>

<tr>
<td><input type="reset" name="Clear"/></td>
</tr>

<tr>
<td><input href="Search.jsp"/>click here to search album</td>
</tr>
</table>


</form>

</body>
</html>