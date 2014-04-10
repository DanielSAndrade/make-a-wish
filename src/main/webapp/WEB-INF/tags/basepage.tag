<%@tag language="java" pageEncoding="ISO-8859-1"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>XBox</title>
<link rel="icon" href="/favicon.ico" type="image/x-icon" />
<link href="/static/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script type="text/javascript">
  (function() {
   var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
   po.src = 'https://apis.google.com/js/client:plusone.js';
   var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
 })();
</script>
</head>
<body style="zoom: 1;">
	<div id="header">
		<jsp:invoke fragment="header" />
	</div>
	<div id="body">
		<jsp:doBody />
	</div>
	<div id="footer">
		<jsp:invoke fragment="footer" />
	</div>
</body>
</html>