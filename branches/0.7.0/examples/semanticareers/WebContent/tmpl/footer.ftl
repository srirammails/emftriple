<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" >
   <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
      <title>${title}</title>
      <link rel="stylesheet" type="text/css" href="${rootRef}/stylesheets/main.css" title="Main CSS stylesheet" />
      ${foafAlternate}
   </head>
   <body>
   	<div class="sticky-wrap">
		<div class="sticky-main">
   			<div class="container">
				<div class="header">
					<a hre="${rootRef}/home"><h1 class="title">Semantic careers</h1></a>
					<div class="menu">
						<ul>
							<li><a href="${rootRef}/home">home</a></li>
							<li><a href="${rootRef}/jobs">job listings</a></li>
							<li><a href="${rootRef}/add">post a job</a></li>
						</ul>
						<br style="clear:left"/>
					</div>
				</div>
			<div class="content">
      			${content}
      		</div>      		
      		<div class="footer">
      		
      		</div>
      	</div>
	</div>
<style>
<!--
html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td
{
    margin: 0;
    padding: 0;
    border: 0;
    font-size: 100%;
    vertical-align: baseline;
    background: transparent;
}

body
{
    line-height: 1;
}

ol, ul
{
    list-style: none;
}

div {
	display: block;
}

table
{
    border-collapse: collapse;
    border-spacing: 0;
}

body
{
    color: #444;
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    font-size: 13px;
    line-height: 18px;
    background: #fbfbfb url('/Content/Img/bg-site.png') repeat-x top left;          
    text-align: center;
}

input, select, button, textarea
{
    border: 1px solid #999;
    font-size: 100%;
    font-family:  'Helvetica Neue',Helvetica,Arial,sans-serif;
}

input
{
    margin: 5px 0px 5px 0px;
    padding: 3px;
}

a
{
    color: #07c;
    text-decoration: none;
    cursor: pointer;
}

a:hover
{
    text-decoration: underline;
}

a:visited
{
    color: #4A6B82;
}

.clear
{
    clear:both;
}

.sticky-wrap {
	min-height: 100%;
	margin: 0 auto;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}

.sticky-main {
	overflow: auto;
	overflow-x: auto;
	overflow-y: auto;
	padding-bottom: 90px;
}

h1
{
    font-family: Trebuchet MS, Helvetica, sans-serif;
    font-weight: bold;
    font-size: 170%;
    margin-bottom: 1em;
}

h2
{
    font-family: Trebuchet MS, Helvetica, sans-serif;
    font-size: 140%;
    font-weight: bold;
    margin-bottom: 1em;
}

h3
{
    font-family: Trebuchet MS, Helvetica, sans-serif;
    font-size: 110%;
    font-weight: bold;
    margin-bottom: 1em;
}

.container {
	margin: 0px auto;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
	text-align: left;
	width: 975px;
	background: white;
	background-image: initial;
	background-repeat-x: initial;
	background-repeat-y: initial;
	background-attachment: initial;
	background-position-x: initial;
	background-position-y: initial;
	background-origin: initial;
	background-clip: initial;
	background-color: white;
	zoom: 1;
}

.header {
	background-color: transparent;
	position: relative;
	padding: 0px 15px;
	padding-top: 0px;
	padding-right: 15px;
	padding-bottom: 0px;
	padding-left: 15px;
	height: 305px;
	background-color: #F9F9F9;
}

.menu
{
	width: 100%;
	background-color: #333; 
}

.menu ul
{
	margin: 0; padding: 0;
	float: left;
}

.menu ul li
{
	display: inline;
}

.menu ul li a
{
	float: left; text-decoration: none;
	color: white;
	padding: 10.5px 11px;
	background-color: #333; 
}

.menu ul li a:visited
{
	color: white;
}

.menu ul li a:hover, .menu ul li .current
{
	color: #fff;
	background-color:#0b75b2;
}
	
.content {
	padding: 15px;
	padding-top: 15px;
	padding-right: 15px;
	padding-bottom: 15px;
	padding-left: 15px;
	width: 945px;
	position: relative;
	margin-bottom: 50px;
	margin-top: -214px;
}

.jobs-content {
	float: left;
	padding: 15px;
	width: 915px;
	-webkit-box-shadow: 0px 3px 10px #DDD;
	-moz-box-shadow: 0px 3px 10px #DDD;
	box-shadow: 0px 3px 10px #DDD;
	background: white;
	min-height: 600px;
}

.main {
	width: 660px;
	float: left;
	margin-right: 30px;
	padding: 15px;
}

.sidebar {
	float: right;
	width: 225px;
	margin-bottom: 30px;
	padding: 15px;
	background-color:#fff;
	clear:both;
}

.searchform
{
    
}

.searchform label
{
    font-weight:bold;
    display:inline-block;
    width:45px;
    padding-left:5px;
}

.searchform a#viewall
{
    float:right;
    display:block;
    padding: 0 3px;
}

.searchform input[type=text] {
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    padding: 3px 6px;
    margin: 0 0 10px 0;
    width:150px;
}

.item {
	padding-bottom: 20px;
	width: 98%;
}

#jobslist .jobsheader {
	clear: both;
	margin-bottom: 15px;
	margin: 0px 0px 15px;
	padding: 4px 5px 5px 15px;
	width: 480px;
	height: 20px;
}

.listitem {
	background: white;
	border-bottom: 1px solid #E9E9E9;
	border-right: 1px solid transparent;
	clear: both;
	float: left;
	font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
	font-size: 12px;
	padding: 10px;
	width: 480px;
	position: relative;
}

div.listitem p
{
    margin:0;
    clear:none;
}

div.listitem a.title
{
    font-weight:bold;
    font-size:14px;
    display:inline-block;
    margin-right:5px;
}

.listitem .one-line
{
    white-space:nowrap;
    overflow:hidden;
    text-overflow:ellipsis;
}

.listitem > .right
{
    float:right;
    text-align:right;
    padding-left:12px;
}

.listitem > .right > p
{
    text-align:right;
    margin:0;
}

div.listitem a.employer
{
    font-weight:bold;
    color:#444;
    display:inline-block;
    max-width:300px;
}

.listitem > .location
{
    font-size:11px;
    font-style:italic;
    margin-bottom:4px;
}

.listitem > .description
{
    clear:right;
    color:#888;
    margin:0;
    white-space:nowrap;
    overflow:hidden;
    text-overflow:ellipsis;
}

.item > a
{
    display:block;
}

h1.title
{
    font-size:26px;
    font-weight:bold;
    color:#fd8008;
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    line-height:120%;
    margin:0;
    margin-bottom:5px;
}

.item h1.title
{
    font-size:26px;
    font-weight:bold;
    color:#fd8008;
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    line-height:120%;
    margin:0;
    margin-bottom:5px;
}

.item .main h3
{
    font-size:16px;
    font-weight:bold;
    clear:both;
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}

.jobdetail #byline 
{
    margin-bottom:28px;
}

.item .description
{
    margin-bottom:20px;
}



-->
</style>
</body>
</html>