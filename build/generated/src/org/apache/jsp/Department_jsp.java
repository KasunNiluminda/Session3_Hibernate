package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Department_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"bootstrap/bootstrap.css\">-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("            <div class=\"col-sm-8 \">\n");
      out.write("                <!--<form>-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Department ID</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"depid\" placeholder=\"Department ID Here..\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Department Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"depname\" placeholder=\"Department Name Here..\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Department Status</label>\n");
      out.write("                    <select id=\"status\" class=\"form-control\">\n");
      out.write("                        <option value=\"1\">Active</option>\n");
      out.write("                        <option value=\"0\">Inactive</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" onclick=\"saveData()\">Save New Department</button>\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" onclick=\"saveData()\"></button>\n");
      out.write("                </div>\n");
      out.write("                <!--</form>-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!--<button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Open Modal</button>-->\n");
      out.write("            <!--  Modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                    <!-- Modal content-->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                            <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <p>Some text in the modal.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <table class=\"table table-striped table-primary\" id=\"mytable\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Department ID</th>\n");
      out.write("                            <th>Department Name</th>\n");
      out.write("                            <th>Department Status</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <div id=\"tabledata\"></div>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function saveData() {\n");
      out.write("            var depid = document.getElementById('depid').value;\n");
      out.write("            var depname = document.getElementById('depname').value;\n");
      out.write("            var status = document.getElementById('status').value;\n");
      out.write("\n");
      out.write("            //        console.log(depid + \" \" + depname + \" \" + status);\n");
      out.write("\n");
      out.write("            // Send the data to the server using Ajax\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("                $('#myModal').modal('show');\n");
      out.write("//                $('#myModal').modal('toggle');\n");
      out.write("                $(\"input:text\").val(\"\");\n");
      out.write("                search();\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"DepartmentSave?depid=\" + depid + \"&depname=\" + depname + \"&status=\" + status, true);\n");
      out.write("            xhttp.send();\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function search() {\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            xhttp.onload = function () {\n");
      out.write("//                alert(this.responseText);\n");
      out.write("                console.log(this.responseText);\n");
      out.write("                document.getElementById('tabledata').innerHTML = this.responseText;\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"POST\", \"DepartmentSearchData\");\n");
      out.write("            xhttp.send();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
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
