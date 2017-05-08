<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
<head>
    <title>Successful add</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h2>Result</h2>
	<p> Name:  ${song.name}</p>
    <p> BPM:  ${song.BPM}</p>
    <p> Duration:  ${song.duration}</p>
    <a href="add.html">Submit another message</a>
</body>
</html>