package org.apache.jsp.WEB_002dINF.jsp.SNPChromosome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- NAVBAR\n");
      out.write("    ================================================== -->\n");
      out.write("    <div class=\"navbar-wrapper\"><!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->\n");
      out.write("        <div class=\"navbar navbar-fixed-top\">\n");
      out.write("            <div class=\"navbar-inner\">\n");
      out.write("                <div class=\"container\"><!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div id=\"sm-navbar-logo\"><a class=\"brand\" href=\"http://www.narf.ac.uk/index.html\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/logo-sm.png\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- <a class=\"brand\" href=\"index.html\"><img src=\"img/narf-logo.png\" width=\"170\" height=\"70\"></a>\n");
      out.write("                    <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed within .navbar-collapse.collapse. -->\n");
      out.write("                    <div class=\"nav-collapse collapse\">\n");
      out.write("                        <ul class=\"nav pull-right\">\n");
      out.write("                            <li class=\"active\"><div class=\"well2 well-ard\"><a href=\"http://www.narf.ac.uk/chickens/index.html\">Find NARF Chickens</a></div></li>\n");
      out.write("                            <li class=\"dropdown\"><a href=\"http://www.narf.ac.uk/biological-toolbox/index.html\">Biological Toolbox</a></li>\n");
      out.write("                            <li><a href=\"http://www.narf.ac.uk/transgenics/index.html\">Transgenics</a>\n");
      out.write("                                <!-- \n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"#\">Farming Industry</a></li>\n");
      out.write("                                    <li><a href=\"#\">Animal Breeders</a></li>\n");
      out.write("                                    <li><a href=\"#\">Pharmaceutical Industry</a></li>\n");
      out.write("                                    <li><a href=\"#\">Poultry Vets</a></li>\n");
      out.write("                                    <li><a href=\"#\">Supermarkets</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                -->\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"http://avianbase.narf.ac.uk/\">Genomics</a></li>\n");
      out.write("                            <li><a href=\"http://www.narf.ac.uk/education/index.html\">Education &amp; Events</a>\n");
      out.write("                            <li class=\"dropdown\"><a href=\"http://www.narf.ac.uk/about/index.html\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">About us<b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"http://www.narf.ac.uk/about/index.html\">About NARF</a></li>\n");
      out.write("                                    <li><a href=\"http://www.narf.ac.uk/about/impact.html\">Impact</a></li>\n");
      out.write("                                    <li><a href=\"http://www.narf.ac.uk/about/funding.html\">Funding</a></li>\n");
      out.write("                                    <li><a href=\"http://www.narf.ac.uk/about/opportunities.html\">Opportunities</a></li>\n");
      out.write("                                    <!--\n");
      out.write("                                    <li><a href=\"#\">Public Sector</a></li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li class=\"nav-header\">Nav header</li>\n");
      out.write("                                    <li><a href=\"#\">Governance</a></li>\n");
      out.write("                                    -->\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"http://www.narf.ac.uk/news/index.html\">News</a></li>\n");
      out.write("                            <li><a href=\"http://www.narf.ac.uk/contact.html\">Contact us</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!--/.nav-collapse collapse -->\n");
      out.write("                </div><!-- /.container -->\n");
      out.write("            </div><!-- /.navbar-inner -->\n");
      out.write("        </div> <!-- /.navbar navbar-fixed-top -->\n");
      out.write("    </div><!-- /.navbar-wrapper -->\n");
      out.write("\n");
      out.write("    <div id=\"push\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"push\">\n");
      out.write("    </div>\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}