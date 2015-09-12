<?xml version="1.0" encoding="UTF-8" ?>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
            <title>Cooking Book</title>
            <link rel="stylesheet" type="text/css" href="decorators/css/style.css">	
                
              
                
                </head>

                <body>		

                    <header id="header">
                        <div class="innertube">
                            <h1>Header...</h1>
                        </div>
                    </header>

                    <div id="wrapper">

                        <main>
                            <div id="content">
                                <div class="innertube">
                                    <h1>Heading</h1>
                                    <decorator:body/>
                                </div>

                            </div>
                        </main>

                        <nav id="nav">
                            <div class="innertube">
                                <h3>Left heading</h3>
                                <ul>
                                    <li><a href="#">Link 1</a></li>
                                    <li><a href="#">Link 2</a></li>
                                    <li><a href="#">Link 3</a></li>
                                    <li><a href="#">Link 4</a></li>
                                    <li><a href="#">Link 5</a></li>
                                </ul>
                                <h3>Left heading</h3>
                                <ul>
                                    <li><a href="#">Link 1</a></li>
                                    <li><a href="#">Link 2</a></li>
                                    <li><a href="#">Link 3</a></li>
                                    <li><a href="#">Link 4</a></li>
                                    <li><a href="#">Link 5</a></li>
                                </ul>
                                <h3>Left heading</h3>
                                <ul>
                                    <li><a href="#">Link 1</a></li>
                                    <li><a href="#">Link 2</a></li>
                                    <li><a href="#">Link 3</a></li>
                                    <li><a href="#">Link 4</a></li>
                                    <li><a href="#">Link 5</a></li>
                                </ul>
                            </div>
                        </nav>

                    </div>

                    <footer id="footer">
                        <div class="innertube">
                            <p>Footer...</p>
                        </div>
                    </footer>

                </body>
                </html>