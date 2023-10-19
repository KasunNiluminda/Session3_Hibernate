package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchDepartment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Department Search</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<h1>Search Department via Departmnet code</h1>-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <!--<br/>-->\n");
      out.write("                    <h1 class=\"mt-3 mb-4\">Search Department via Department code</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row mb-4\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <label>Department ID :</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <input type=\"text\" id=\"depid\" name=\"depid\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                    <button class=\"btn btn-warning btn-block\" onclick=\"search()\">Search</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <!--<div class=\"row\"></div>-->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\"></div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <table class=\"table\" id=\"deptb1\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Description</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function search() {\n");
      out.write("            var depid = document.getElementById('depid').value;\n");
      out.write("//            alert(depid);\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("//                var response = this.responseText;\n");
      out.write("                if (this.status === 200) {\n");
      out.write("                    var response = this.responseText;\n");
      out.write("//                    alert(response);\n");
      out.write("                    document.getElementById('deptb1').innerHTML = response;\n");
      out.write("                } else {\n");
      out.write("                    alert('Error: ' + this.status);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            xhttp.open('GET', 'DepartmentSearch?depid=' + depid, true);\n");
      out.write("\n");
      out.write("            xhttp.send();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
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
