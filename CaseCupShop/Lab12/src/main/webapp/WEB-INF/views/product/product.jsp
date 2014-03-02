<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Case Cup Shop</title>
	<link rel="stylesheet" href="/resource/css/style.css" type="text/css" media="all"/>
</head>
<body>

	<div class="border">
		<div id="bg">
			background
		</div>
		<div class="page">
			<div class="sidebar">
				<a href="index.html" id="logo"><img src="/resource/images/logo.png" alt="logo"></a>
				<ul>
					<li>
						<a href="index.html">Home</a>
					</li>
					<li>
						<a href="about.html">Profile</a>
					</li>
					<li class="selected">
						<a href="services.html">Products</a>
					</li>
					<li>
						<a href="portfolio.html">History</a>
					</li>
                    <li>
						<a href="contact.html">Cart</a>
					</li>
					<li>
						<a href="contact.html">Contact</a>
					</li>
					<li>
						<a href="blog.html">Blog</a>
					</li>
				</ul>
				<p>&nbsp;</p>
			</div>
			<div class="body">
				<div class="portfolio">
					<h2>Products</h2>
                    
					<ul class="navigation">
                    <form action="index.html">
					<input type="text" onFocus="this.select()" onBlur="this.value=!this.value?'Enter product name or price':this.value;" onClick="this.value='';" value="Search product" size="30">
					<input type="submit" id="submit" value="search">
				</form>
                
					  <li>
							<a href="services.html">Iphone</a>
						</li>
						<li>
							<a href="services.html">Samsung</a>
						</li>
					</ul>
					<h3>&nbsp;</h3>
					<ul>
					  <!-- วนลูปตรงนี้ค่ะ อิอิ แถวละสาม-->
                      <c:choose>
						<c:when test="${products != null}">
						<table border="1" cellspacing="0" cellpadding="0">
       				    <tr>
                            <c:forEach items="${products}" var="product" varStatus="status">
            				<li>
							<a href="#"><img src="images/logo10.jpg" alt=""></a> 
                            <span>NAME: ${product.name} PRICE:${product.price} </span>
                            <span>DESCRIPTION:${product.description} </span>
                            <a href="#">ADD CART</a>
						    </li>
                            </c:forEach>

        				</tr>
                        </table>
    					</c:when>
						<c:otherwise>
    						<H1> There is no student with the given name</H1>
						</c:otherwise>
					</c:choose>
						<%--<li>--%>
							<%--<a href="#"><img src="images/logo10.jpg" alt=""></a> --%>
                            <%--<span>NAME:  &nbsp; PRICE:</span> --%>
                            <%--<span>DESCRIPTION: </span>--%>
                            <%--<a href="#">ADD CART</a>--%>
						<%--</li>--%>
                        <%----%>
                        <%--<li>--%>
							<%--<a href="#"><img src="images/logo10.jpg" alt=""></a> --%>
                            <%--<span>NAME:  &nbsp; PRICE:</span> --%>
                            <%--<span>DESCRIPTION: </span>--%>
                            <%--<a href="#">ADD CART</a>--%>
						<%--</li>--%>
                        <%----%>
                        <%--<li>--%>
							<%--<a href="#"><img src="images/logo10.jpg" alt=""></a> --%>
                            <%--<span>NAME:  &nbsp; PRICE:</span> --%>
                            <%--<span>DESCRIPTION: </span>--%>
                            <%--<a href="#">ADD CART</a>--%>
						<%--</li>--%>
                        <%----%>
                        <%--<li>--%>
							<%--<a href="#"><img src="images/logo10.jpg" alt=""></a> --%>
                            <%--<span>NAME:  &nbsp; PRICE:</span> --%>
                            <%--<span>DESCRIPTION: </span>--%>
                            <%--<a href="#">ADD CART</a>--%>
						<%--</li>--%>
                        <%----%>
                        <%--<li>--%>
							<%--<a href="#"><img src="images/logo10.jpg" alt=""></a> --%>
                            <%--<span>NAME:  &nbsp; PRICE:</span> --%>
                            <%--<span>DESCRIPTION: </span>--%>
                            <%--<a href="#">ADD CART</a>--%>
						<%--</li>--%>
						
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>