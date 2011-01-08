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
   			<div class="container">
				<div id="header">
					<a href="${rootRef}/home"><h1 class="title">Semantic careers</h1></a>
					<div class="menu">
						<ul>
							<li><a href="${rootRef}/home">home</a></li>
							<li><a href="${rootRef}/jobs">job listings</a></li>
							<li><a href="${rootRef}/add">post a job</a></li>
						</ul>
						<br style="clear:left"/>
					</div>
				</div>
			<div id="content">
      			${content}
      		</div>      		
      		<div id="footer">
      		
      		</div>
   </body>
<style>
<!--

/* http://meyerweb.com/eric/tools/css/reset/ v1.0 | 20080212 */
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

blockquote, q
{
	quotes: none;
}

blockquote:before, blockquote:after, q:before, q:after
{
	content: '';
	content: none;
}

ins
{
	text-decoration: none;
}
del
{
	text-decoration: line-through;
}

/* tables still need 'cellspacing="0"' in the markup */
table
{
	border-collapse: collapse;
	border-spacing: 0;
}

/* Global --------------------------------------------------------- */

/* BEGIN post reset DEFAULT HTML tag styles */

body
{
	color: #444;
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	font-size: 13px;
	line-height: 18px;
	background: #fbfbfb url('/Content/Img/bg-site.png') repeat-x top left; 			
	text-align: center;
}

code
{
	font-family: Consolas, Monaco, Lucida Console, Liberation Mono, DejaVu Sans Mono, Bitstream Vera Sans Mono, Courier New;
}

textarea
{
	xfont-family: Consolas, Monaco, Lucida Console, Liberation Mono, DejaVu Sans Mono, Bitstream Vera Sans Mono, Courier New;
	border: 1px solid #999;
	font-size: 90%;
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

input[type=radio] 
{
	border:none;
	vertical-align:middle;
}

input[type=radio] + label 
{
	vertical-align:middle;
}

input[type=checkbox] 
{
	border:0;
}

input[type=text], input[type=password], textarea
{
	outline:none;
	border: 1px solid #ccc;
}

input[type=text]:focus, input[type=password]:focus, textarea:focus, input[type=submit]:focus, button:focus
{
	border-color:#fd8008;
}

input[type=submit], button
{
	min-width:90px;
	outline:none;
}

input[type=submit].progress, button.progress, a.progress
{
    color:#aaa;
    text-decoration:none;
    text-shadow: none;
}

input[type=submit].orange-submit.progress
{
    color:#FFCA99;
}

a.progress:hover
{
    text-decoration:none;
}

pre
{
	font-family: Consolas, Monaco, Lucida Console, Liberation Mono, DejaVu Sans Mono, Bitstream Vera Sans Mono, Courier New;
	margin-bottom: 10px;
	overflow: auto;
	width: auto;
	padding: 5px;
	background-color: #eee;
	padding-bottom: 20px !ie7;
	max-height: 600px;
}


blockquote
{
	margin-bottom: 10px;
	margin-right: 15px;
	padding: 10px 10px 1px 10px;
	background-color: #F5F5F5;
}

b, strong
{
	font-weight: bold;
}

i, em
{
	font-style: italic;
}

ul
{
	list-style: disc;
	margin-left: 30px;
	margin-bottom: 1em;
}
ol ul, ul ol, ul ul, ol ol
{
	margin-bottom: 0px;
}

p
{
	clear: both;
	margin-bottom: 1em;
}

ol
{
	list-style: decimal;
	margin-left: 30px;
	margin-bottom: 1em;
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

h3 > a, h3 > a:visited, h3 > a:hover
{
    text-decoration:none;
	color: inherit;
}


hr
{
	border: 0;
	color: #aaa;
	background-color: #aaa;
	height: 1px;
	margin-bottom: 20px;
}

sup
{
	font-size: 80%;
	position: relative;
	top: -0.4em;
}

sub
{
	position: relative;
	top: 0.3em;
	font-size: 80%;
}

kbd
{
	padding: 2px 4px;
	white-space: nowrap;
	color: #000;
	background: #eee;
	border-width: 1px 3px 3px 1px;
	border-style: solid;
	border-color: #ccc #aaa #888 #bbb;
}

/* END post-reset default HTML tag styles */

.clear
{
	clear:both;
}

.fl { float: left; }
.fr { float: right; }

.container
{
	margin: 0px auto;
	text-align: left;
	width: 975px; /* fixes page height calculation in IE7 -- do not remove unless you've verified */ /* http://www.positioniseverything.net/articles/haslayout.html */
	background:#fff;
	zoom: 1;
}

.menu
{
	width: 100%;
	-webkit-box-shadow: 0px 3px 10px #DDD;
	-moz-box-shadow: 0px 3px 10px #DDD;
	box-shadow: 0px 3px 10px #DDD;
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

#footer .container
{
	background:transparent;
}

.bg-white
{
	background-color:#fff;
}

.page-description
{
	color: #333;
	font-size: 120%;
	margin: 1.2em 1.2em 0.5em 1.2em;
	line-height: 120%;
}

.main
{
	width:660px;
	float:left;
	margin-right:30px;
	margin-bottom:30px;
}

.sidebar
{
	float:right;
	width:225px;
	margin-bottom:30px;
	background-color:#fff;
}

#sidebar
{
	float: right;
	overflow: hidden;
	margin-bottom: 60px;
	width: 220px;
	background-color:#fff;
}

#mainbar
{
	float: left;
	margin-bottom: 40px;
	width: 680px;
}

#mainbar-full
{
	xwidth: 960px;
}

#mainbar-footer
{
	clear: both;
	width: 100%;
}

.module
{
	font-size:120%;
	color: #444;
	padding: 8px 8px 2px 8px;
	margin-bottom: 10px;
}

.module p
{
	line-height: 1.3;
	margin-bottom: 0.5em;
}

#footer
{
	color: transparent;
	background: transparent;
	clear: both;
	overflow: hidden;
	padding: 15px;
	margin-top: 30px;
}

.content-page
{
	clear: both;
	color: #333;
	font-size: 150%;
	line-height: 1.2;
}

.content-page-dense
{
	clear: both;
	color: #333;
	font-size: 120%;
	line-height: 1.2;
}

.content-page-dense li
{
	line-height: 1.4;
}

.user-name
{
	float: left;
	width: 125px;
}

.user-flair
{
	float: left;
}

.user-info
{
	height: 35px;
	width: 185px;
}

.user-info .user-gravatar32
{
	float: left;
	width: 32px;
	height: 32px;
}

.user-info .user-action-time
{
	margin-top: 2px;
	margin-bottom: 4px;
}

.user-info .user-details
{
	float: left;
	margin-left: 5px;
	width: 145px;
	overflow: hidden;
	white-space: nowrap;
}

.user-details {
	color:#888888;
	line-height:17px;
}

.user-details td {
	color:Black;
	padding:4px 0;
}

.no-overflow {
	color:#999999;
	overflow:hidden;
	white-space:nowrap;
	width:230px;
}

#header
{
	background-color:transparent;
	position:relative;
	padding:0px 15px;
	height:305px;
	background-color:#f9f9f9;
}

#header > #nav-container
{
	width:570px;
	right:10px;
	position:absolute;
	float:right;
}

#header > #nav-container > ul.nav
{
	margin:0;
	padding:0;
	list-style-type:none;
	float:right;
	clear:right;
}

#header > #nav-container > ul.nav > li
{
	margin:0;
	padding:0 8px;
	list-style-type:none;
	float:left;
	display:block;
}

#header > #nav-container > ul#nav-global
{
	padding-top:8px;
	height:18px;
	font-weight:bold;
	white-space:nowrap;
}

#header > #nav-container > ul#nav-global > li
{
    border-right:1px solid #ccc;
    line-height:14px;
}

#header > #nav-container > ul#nav-global > li.last
{
    border:0;
}

#header > #nav-container > ul#nav-careers
{
	margin-top:30px;
	margin-bottom:35px;
	width:610px;
}

#header > #nav-container > ul#nav-careers > li
{
	float:right;
}

#header > #nav-container > ul#nav-careers > li > a
{
	color: #fff;
	background: #9c9c9c url(/Content/Img/header-nav-bg.png) repeat-x;
	border-right:1px solid #939393;
	border-left:1px solid #939393;
	padding: 3px 12px;
}

#header > #nav-container > ul#nav-careers > li > a:hover, #header > #nav-container > ul#nav-careers > li > a.selected {
	background: #fb8008;
	border:0;
	border-right:1px solid #fb8008;
	border-left:1px solid #fb8008;
	text-decoration:none;
}

#home
{
	clear:both;
	margin-top:214px;
}

#home p
{
	line-height:125%;
}

#home > div
{
   float:left;
   margin-bottom:30px;
}

#home #main
{
	width:610px;
	margin-right:30px;
}

#home #sidebar
{
	width:300px;
}

#home h2
{
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	font-size: 26px;
	line-height:100%;
	padding-bottom: 10px;
	margin: 0 0 15px 0;
	border-bottom: 2px solid #e9e9e9;
	clear:both;
	text-transform:lowercase;
}

#home h3
{
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	background-color:#eee;
	font-size:18px;
	line-height:100%;
	font-weight:bold;
	padding:5px;
	padding-left:15px;
	margin:0;
	margin-bottom:15px;
}

#home h3 a
{
	color:inherit;
}

#home > #main > div
{
	clear:both;
	margin-bottom:30px;
}

#home > #main > #searchlistings > form > input[type=submit]
{
	margin-left:15px;
}

#home > #main > #searchlistings > form > div
{
	float:left;
	margin-left:15px;
}

#home > #main > #searchlistings > form > div > label
{
	font-weight:bold;
	display:block;
}

#home > #main > #searchlistings strong
{
    display:inline-block;
    width:66px;
}

#home #filecv a.arrow
{
	clear:both;
	float:left;
	margin-top:8px;
}

#home #featuredlistings > div, #home #featuredkeywords > div
{
	clear:none;
	float:left;
	margin-bottom:10px;
	padding:0 15px;
	width:45%;
	line-height:140%;
	border:0;
}

#home #featuredlistings > div > a.joblink
{
	font-weight:bold;
	display:block;
	height:18px;
	overflow:hidden;
}

 #home #featuredkeywords > div
 {
     width:auto;
 }

#home > #sidebar > div > p
{
	padding-left:15px;
}

#home #filecv
{
	padding-left: 115px;
	background: transparent url(/Content/Img/thb-cv.png) no-repeat 15px top;	
	min-height: 100px;
	width:450px;
}

.orange-submit, .blue-submit, .orange-submit:visited, .blue-submit:visited
{
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	font-weight:bold;
	font-size:13px;
	color:#fff;
	line-height:16px;
	margin:0;

	display:inline-block;
	-moz-border-radius:12px;
	-webkit-border-radius:12px;
	border-radius:12px;
	padding:3px 13px;
	
	position:relative;
	float:none;
	
	cursor:pointer;
	-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	-moz-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	box-shadow: 0 1px 2px rgba(0,0,0,.2);
	text-shadow: 0 1px 1px rgba(0,0,0,.3);
}

a.orange-submit, a.blue-submit
{
    height:16px;
}

a.orange-submit:hover, a.blue-submit:hover
{
    text-decoration:none;
}

.orange-submit {
	color: #fef4e9;
	border: solid 1px #da7c0c;
	background: #f78d1d url(/Content/Img/orange-submit-bg.png) repeat-x top left;   
	background: -webkit-gradient(linear, left top, left bottom, from(#faa51a), to(#f47a20));
	background: -moz-linear-gradient(top,  #faa51a,  #f47a20);
	x-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#faa51a', endColorstr='#f47a20');
}

.orange-submit:hover, .orange-submit:focus {
	background: #f16814;
	background: -webkit-gradient(linear, left top, left bottom, from(#f88e11), to(#f06015));
	background: -moz-linear-gradient(top,  #f88e11,  #f06015);
	x-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#f88e11', endColorstr='#f06015');	
}

.orange-submit:active {
	color: #fcd3a5;
	background: #f78d1d url(/Content/Img/orange-submit-bg-active.png) repeat-x top left;
	background: -webkit-gradient(linear, left top, left bottom, from(#f47a20), to(#faa51a));
	background: -moz-linear-gradient(top,  #f47a20,  #faa51a);
	x-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#f47a20', endColorstr='#faa51a');
	top: 1px;
}

.blue-submit {
    color: #fef4e9;
    border: solid 1px #1b5aa3;
    background: #1f60ab url(/Content/Img/blue-submit-bg.png) repeat-x top left;
    background: -moz-linear-gradient(top , #5E9BE1, #236CC0);    
    background: -webkit-gradient(linear, left top, left bottom, from(#5E9BE1), to(#236CC0));
    x-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#5E9BE1', endColorstr='#236CC0');
}

.blue-submit:hover, .blue-submit:focus 
{
    background:#1e64b4;
    background: -webkit-gradient(linear, left top, left bottom, from(#457fc3), to(#1e64b4));
    background: -moz-linear-gradient(top,  #457fc3,  #1e64b4);
    x-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#457fc3', endColorstr='#1e64b4');
}

.blue-submit:active {
    color: #d7e9ff;
    background: #1f60ab url(/Content/Img/blue-submit-bg-active.png) repeat-x top left;
    background: -webkit-gradient(linear, left top, left bottom, from(#236CC0), to(#5E9BE1));
    background: -moz-linear-gradient(top,  #236CC0,  #5E9BE1);
    x-filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#236CC0', endColorstr='#5E9BE1');
    top: 1px;
}

.orange-submit.no-lower, .blue-submit.no-lower
{
    padding-top:3px;
    text-transform:none;
}

#home input[type=text] {
	font-size: 14px;
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	padding: 3px 6px;
	margin: 0 0 15px 0;
	background: #fff url(/Content/Img/bg-search.png) no-repeat left -1px;
	padding-left: 32px;
}

#home .searchform input[type=text]
{
	width:242px;
}

#home input[type=text]#location
{
	background: #fff url(/Content/Img/bg-search-loc.png) no-repeat left -1px;
}

#home #testimonials
{
	clear:both;
	color:#666;
}

#home #testimonials > div
{
	float:left;
	width:41%;
	margin-right:25px;
	padding:0 10px 0 15px;
	background: url(/Content/Img/home-quote-small.png) no-repeat left 3px;
}

#home #testimonials > div > p
{
	font-style:italic;
	margin-bottom:15px;
}

#home #testimonials > div > span
{
	display:block;
	font-style:normal;
	clear:right;
	float:right;
}

#home #testimonials > div > p + span
{
	font-weight:bold;
	margin-bottom:-1px;
}

#home #sidebar h2 + p 
{
	padding-left:15px;
}

div.userjobs
{
	margin-bottom:25px;
}

div.userjobs > p
{
	margin-bottom:10px;
}

div.userjobs > p > span
{
	color:#999;
}

div.userjobs > p > span.posted
{
	display:block;
	font-size:11px;
}

div.userjobs > p > a.userjob
{
	font-weight:bold;
}

div.sidebar > div.userjobs
{
	padding-left:15px;
}

img.impression, img.analytic, span.analytic
{
	display:none;
}

#content
{
	clear:both;
	float:left;
	padding:15px;
	width:945px;
	position:relative;
	margin-bottom:50px;
	margin-top:-214px;
}

#jobs-content
{
	float:left;
	padding:15px;
	width:915px;
	-webkit-box-shadow: 0px 3px 10px #ddd;
	-moz-box-shadow: 0px 3px 10px #ddd;
	box-shadow: 0px 3px 10px #ddd;
	background:#fff;
	min-height:600px;
}

.item 
{
	padding-bottom: 20px;
	width: 98%;
}

#jobslist.jobsheader 
{
	clear: both;
	margin-bottom: 15px;
	margin: 0px 0px 15px;
	padding: 4px 5px 5px 15px;
	width: 480px;
	height: 20px;
}

div.listitem 
{
	clear: both;
	float: left;
	width: 639px;
	background: white;
	border-bottom: 1px solid #E9E9E9;
	border-right: 1px solid transparent;	
	font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
	font-size: 12px;
	padding: 10px;	
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

#subheader
{
	padding:0 0 15px 0;
	clear: both;
	float:left;
	width:100%;
	background:#fff;
}

#subheader h2
{
	float: left;
	font-size: 170%;
	line-height: 34px;
	margin-bottom: 0px;
}

#subheader a
{
	color: #000;
}

/* Pagination Sizer Control */
.page-sizer
{
	float: left;
	margin-top: 5px;
	margin-bottom: 30px;
	padding-top: 5px;
	display: block;
}

/* Pagination */

.pagination, .pager
{
	width:100%;
	padding:10px 0 0 0;
	text-align:right;
	clear:both;
}

.pagination > a, .pager > a
{
	background-color:#eee;
	color:inherit;
	display:inline-block;
	margin-left:5px;
	padding:0 3px;
	min-width:14px;
	font-size:12px;
	text-align:center;
}

.pagination > a.selected, .pagination > a:hover, .pager > a:hover, .pager > a.current
{
	background-color:#fd8008;
	color:#fff;
	text-decoration:none;
}

.pagination > a.prev-next, .pager > a.next, .pager > a.prev
{
	background-color:transparent;
	margin:0 10px;
	width:auto;
	text-align:right;
	white-space:nowrap;
}

.pagination > a.prev-next:hover, .pager > a.next:hover, .pager > a.prev:hover
{
	background-color:transparent;
	color:inherit;
	text-decoration:underline;
}


.highlight-text
{
	color: #333;
	background-color: #FFFFCC;
	padding: 3px;
	line-height: 1.4;
}

.t1
{
	width: 100px;
}
.t2
{
	vertical-align: middle;
	padding-left: 10px;
}

.public-url-message
{
	position: absolute;
	display: none;
	font-size: 90%;
}

#float-left
{
	float: left;
}

#float-right
{
	float: right;
	font-size: 150%;
	width: 150px;
}

-->
</style>
</html>