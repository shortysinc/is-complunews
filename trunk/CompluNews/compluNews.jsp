<%@ page language="java" contentType="text/html; charset=utf-8" %>
  
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>CompluNews</title>
<meta name="keywords" content="" />
<meta name="Soothing" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<div id="fb-root"></div>
<!-- Facebook plugin Html5 SDK -->
<script>
	(function(d, s, id) 
	{
  		var js, fjs = d.getElementsByTagName(s)[0];
  		if (d.getElementById(id)) 
  			return;
  		js = d.createElement(s); js.id = id;
  		js.src = "//connect.facebook.net/es_ES/all.js#xfbml=1";
  		fjs.parentNode.insertBefore(js, fjs);
	}
	(document, 'script', 'facebook-jssdk'));
</script>
<body>
<div id="wrapper">
<!-- start header -->
<div id="header">
	<div id="logo">
		<h1><a href="#"><span>CompluNews(Falta Logo)</span></a></h1>
		<p>Designed By JS</p>
	</div>
	<div id="menu">
		<ul id="main">
			<li class="current_page_item"><a href="#">Homepage</a></li>
			<li><a href="#">Services</a></li>
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
	</div>
	
</div>
<!-- end header -->
	<!-- start page -->
	<div id="page">
		<div id="sidebar1" class="sidebar">
			<ul>
				<li>
					<h2>Recent Posts</h2>
					<ul>
						<li><a href="#">Aqui las noticias recientes</a></li>
						
					</ul>
				</li>
				<li>
					<h2>Recent Comments</h2>
					<ul>
						<a class="twitter-timeline"  href="https://twitter.com/shortys_inc"  data-widget-id="332199032535519232">Tweets por @shortys_inc</a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>

				  </ul>
				</li>
				<li>
					<h2>Categories</h2>
					<ul>
						<li><a href="#">Aqui irian las categorias de las noticias (tags)</a></li>
						
					</ul>
				</li>
				<li>
					<h2>Archives</h2>
					<ul>
						<li><a href="#">Se muestra el mes y las noticias que hay ese mes</a> (nº de noticias de ese mes)</li>
						<li><a href="#">September</a> (23)</li>
						
					</ul>
				</li>
			</ul>
		</div>
		<!-- start content -->
		<div id="content">
			<div class="post">
				<h1 class="title"><a href="#">Bienvenidos a CompluNews!</a></h1>
				<p class="byline">Posted on October 1st, 2013 by <a href="#">JS</a></p>
				<div class="entry">
					<p><strong>CompluNews</strong> somos bla bla bla...diseñado por <a href="#">JS</a>. </p>
					<p class="links"><a href="#" class="more">Read More</a></p>
				</div>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">Noticias</a></h2>
				<p class="byline">Posted on October 1st, 2013 by <a href="#">JS</a></p>
				<div class="entry">
				<p>Aqui ponemos las noticias y esas cosas </p>
				<!-- 	<h3>An H3 Followed by a Blockquote:</h3>
					<blockquote>
						<p>&#8220;Lo que sea.&#8221;</p>
					</blockquote>
					<h3>Bulleted List:</h3>
					<ul>
						<li>lo que sea.</li>
					</ul>
					<h3>Numbered List:</h3>
					<ol>
						<li>lo que sea.</li>
						<
					</ol>
					<p class="links"><a href="#" class="more">Read More</a></p> -->
                    
			  </div>
			</div>
			
		</div>
		<!-- end content -->
		<!-- start sidebars -->
		<div id="sidebar2" class="sidebar">
			<ul>
				<li>
					<form id="searchform" method="get" action="#">
						<div>
							<h2>Site Search</h2>
							<input type="text" name="s" id="s" size="15" value="" />
						</div>
					</form>
				</li>
				<li>
					<h2>Tags</h2>
					<p class="tag"><a href="#">intenacional</a> <a href="#">nacional</a> <a href="#">deportes</a> </p></li>
				<li>
					<h2>Facebook</h2>
					<div id="Facebook"> </div>
				</li>
				<li>
                <div class="fb-like-box" data-href="http://www.facebook.com/thecontortionist" data-width="230" data-direction="center" data-show-faces="true" data-stream="true" data-header="true"></div>
				</li>
				<li>
					<h2>Facebook</h2>
					<ul>
						<li><a href="#">lo que sea</a></li>
						
						
					</ul>
				</li>
			</ul>
		</div>
		<!-- end sidebars -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end page -->
</div>
<div id="footer">
	<p class="copyright">&copy;&nbsp;&nbsp;2013 All Rights Reserved &nbsp;&bull;&nbsp; Design by <a href="https://www.facebook.com/shortys.inc">JS</a>.</p>
</div>
</body>
</html>
