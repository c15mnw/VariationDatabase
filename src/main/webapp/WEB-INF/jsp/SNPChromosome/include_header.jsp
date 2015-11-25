<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <!-- NAVBAR
    ================================================== -->
    <div class="navbar-wrapper"><!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container"><!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <div id="sm-navbar-logo"><a class="brand" href="http://www.narf.ac.uk/index.html"><img src="${pageContext.request.contextPath}/static/img/logo-sm.png"></a>
                    </div>
                    <!-- <a class="brand" href="index.html"><img src="img/narf-logo.png" width="170" height="70"></a>
                    <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed within .navbar-collapse.collapse. -->
                    <div class="nav-collapse collapse">
                        <ul class="nav pull-right">
                            <li class="active"><div class="well2 well-ard"><a href="http://www.narf.ac.uk/chickens/index.html">Find NARF Chickens</a></div></li>
                            <li class="dropdown"><a href="http://www.narf.ac.uk/biological-toolbox/index.html">Biological Toolbox</a></li>
                            <li><a href="http://www.narf.ac.uk/transgenics/index.html">Transgenics</a>
                                <!-- 
                                <ul class="dropdown-menu">
                                    <li><a href="#">Farming Industry</a></li>
                                    <li><a href="#">Animal Breeders</a></li>
                                    <li><a href="#">Pharmaceutical Industry</a></li>
                                    <li><a href="#">Poultry Vets</a></li>
                                    <li><a href="#">Supermarkets</a></li>
                                </ul>
                                -->
                            </li>
                            <li><a href="http://avianbase.narf.ac.uk/">Genomics</a></li>
                            <li><a href="http://www.narf.ac.uk/education/index.html">Education &amp; Events</a>
                            <li class="dropdown"><a href="http://www.narf.ac.uk/about/index.html" class="dropdown-toggle" data-toggle="dropdown">About us<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="http://www.narf.ac.uk/about/index.html">About NARF</a></li>
                                    <li><a href="http://www.narf.ac.uk/about/impact.html">Impact</a></li>
                                    <li><a href="http://www.narf.ac.uk/about/funding.html">Funding</a></li>
                                    <li><a href="http://www.narf.ac.uk/about/opportunities.html">Opportunities</a></li>
                                    <!--
                                    <li><a href="#">Public Sector</a></li>
                                    <li class="divider"></li>
                                    <li class="nav-header">Nav header</li>
                                    <li><a href="#">Governance</a></li>
                                    -->
                                </ul>
                            </li>
                            <li><a href="http://www.narf.ac.uk/news/index.html">News</a></li>
                            <li><a href="http://www.narf.ac.uk/contact.html">Contact us</a></li>
                        </ul>
                    </div><!--/.nav-collapse collapse -->
                </div><!-- /.container -->
            </div><!-- /.navbar-inner -->
        </div> <!-- /.navbar navbar-fixed-top -->
    </div><!-- /.navbar-wrapper -->

    <div id="push">
    </div>
    
    <div id="push">
    </div>
    