package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class searchScoped_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/advanced/header.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
 
request.setCharacterEncoding("UTF-8");
boolean isRTL = UrlUtil.isRTL(request, response);
String  direction = isRTL?"rtl":"ltr";
if (new RequestData(application,request, response).isMozilla()) {

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\">\n");
 
} else {

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");

}

      out.write("<!------------------------------------------------------------------------------\n");
      out.write(" ! Copyright (c) 2000, 2007 IBM Corporation and others.\n");
      out.write(" ! All rights reserved. This program and the accompanying materials \n");
      out.write(" ! are made available under the terms of the Eclipse Public License v1.0\n");
      out.write(" ! which accompanies this distribution, and is available at\n");
      out.write(" ! http://www.eclipse.org/legal/epl-v10.html\n");
      out.write(" ! \n");
      out.write(" ! Contributors:\n");
      out.write(" !     IBM Corporation - initial API and implementation\n");
      out.write(" ------------------------------------------------------------------------------->");
      out.write('\n');
      out.write('\n');
 
	SearchData data = new SearchData(application, request, response);
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("SearchLabel", request));
      out.write("</title>\n");
      out.write("     \n");
      out.write("<style type=\"text/css\">\n");
      out.write("/* need this one for Mozilla */\n");
      out.write("HTML { \n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tborder:0px;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder:0px;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TABLE {\n");
      out.write("\tfont: ");
      out.print(prefs.getToolbarFont());
      out.write(";\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tmargin: 0px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("FORM {\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\theight:100%;\n");
      out.write("\tmargin:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("INPUT {\n");
      out.write("\tfont: ");
      out.print(prefs.getToolbarFont());
      out.write(";\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("INPUT {\n");
      out.write("    font-size: 1.0em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A {\n");
      out.write("\tcolor:WindowText;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#searchTD {\n");
      out.write("\tpadding-");
      out.print(isRTL?"right":"left");
      out.write(":7px;\n");
      out.write("\tpadding-");
      out.print(isRTL?"left":"right");
      out.write(":4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#searchWord {\n");
      out.write("\tmargin-left:5px;\n");
      out.write("\tmargin-right:5px;\n");
      out.write("\tborder:1px solid ThreeDShadow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#searchLabel {\n");
      out.write("\tcolor:WindowText;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#go {\n");
 
    if (data.isMacMozilla()) {

      out.write("\n");
      out.write("    background:GrayText;\n");
 
    } else {

      out.write("\n");
      out.write("    background:ThreeDShadow;\n");

    }

      out.write("\n");
      out.write("\tcolor:Window;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tborder:1px solid ThreeDShadow;\n");
      out.write("\tmargin-left:1px;\n");
      out.write("\tfont-size: 1.0em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#scopeLabel {\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("\tcolor:#0066FF; \n");
      out.write("\tcursor:pointer;\n");
      out.write("\tpadding-left:15px;   /* This should be the same for both RTL and LTR. */\n");
      out.write("}\n");
      out.write("\n");
      out.write("#scope { \n");
      out.write("\ttext-align:");
      out.print(isRTL?"left":"right");
      out.write(";\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\n");
      out.write("\tborder:0px;\n");
      out.write("\tcolor:WindowText;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("}\n");
      out.write("\n");

	if (data.isIE()) {

      out.write("\n");
      out.write("#go {\n");
      out.write("\tpadding-");
      out.print(isRTL?"right":"left");
      out.write(":1px;\n");
      out.write("}\n");

	}

      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("var isIE = navigator.userAgent.indexOf('MSIE') != -1;\n");
      out.write("var isMozilla = navigator.userAgent.toLowerCase().indexOf('mozilla') != -1 && parseInt(navigator.appVersion.substring(0,1)) >= 5;\n");
      out.write("\n");
      out.write("var advancedDialog;\n");
      out.write("\n");
      out.write("function openAdvanced() \n");
      out.write("{ \n");
      out.write("    var scope = document.getElementById(\"scope\").firstChild;\n");
      out.write("    var workingSet = \"\"; \n");
      out.write("    if (scope != null) \n");
      out.write("              workingSet = document.getElementById(\"scope\").firstChild.nodeValue;                \n");
      out.write("    var minSize = 300; \n");
      out.write("    var maxHeight= 500;  \n");
      out.write("    var maxWidth = 600;       \n");
      out.write("    var w = minSize; \n");
      out.write("    var h = minSize; \n");
      out.write("      \n");
      out.write("    // If we have large fonts make the dialog larger, up to 500 pixels high, 600 wide\n");
      out.write("    try {         \n");
      out.write("        var letterHeight = document.getElementById(\"searchWord\").offsetHeight; \n");
      out.write("        var requiredSize = 16 * letterHeight; \n");
      out.write("        if (requiredSize > minSize) { \n");
      out.write("            if (requiredSize < maxWidth) { \n");
      out.write("                w = requiredSize; \n");
      out.write("            } else { \n");
      out.write("                w =  maxWidth; \n");
      out.write("            }\n");
      out.write("            if (requiredSize < maxHeight) { \n");
      out.write("                h = requiredSize; \n");
      out.write("            } else {               \n");
      out.write("                h = maxHeight;\n");
      out.write("            }\n");
      out.write("        } \n");
      out.write("             \n");
      out.write("    } catch (e) {} \n");
      out.write("    \n");

if (data.isIE()){

      out.write("\n");
      out.write("\tvar l = parent.screenLeft + (parent.document.body.clientWidth - w) / 2;\n");
      out.write("\tvar t = parent.screenTop + (parent.document.body.clientHeight - h) / 2;\n");

} else {

      out.write("\n");
      out.write("\tvar l = parent.screenX + (parent.innerWidth - w) / 2;\n");
      out.write("\tvar t = parent.screenY + (parent.innerHeight - h) / 2;\n");

}

      out.write("\n");
      out.write("\t// move the dialog just a bit higher than the middle\n");
      out.write("\tif (t-50 > 0) t = t-50;\n");
      out.write("\t\n");
      out.write("\twindow.location=\"javascript://needModal\";\n");
      out.write("\tadvancedDialog = window.open(\"workingSetManager.jsp?workingSet=\"+encodeURIComponent(workingSet), \"advancedDialog\", \"resizable=yes,height=\"+h+\",width=\"+w+\",left=\"+l+\",top=\"+t );\n");
      out.write("\tadvancedDialog.focus(); \n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeAdvanced()\n");
      out.write("{\n");
      out.write("\ttry {\n");
      out.write("\t\tif (advancedDialog)\n");
      out.write("\t\t\tadvancedDialog.close();\n");
      out.write("\t}\n");
      out.write("\tcatch(e) {}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * This function can be called from this page or from\n");
      out.write(" * the advanced search page. When called from the advanced\n");
      out.write(" * search page, a query is passed.\n");
      out.write(" * noRefocus is a boolean which if true suppresses\n");
      out.write(" * switch of focus to the search view\n");
      out.write(" */\n");
      out.write("function doSearch(query, noRefocus)\n");
      out.write("{\n");
      out.write("\tvar workingSet = document.getElementById(\"scope\").firstChild.nodeValue;\n");
      out.write("\n");
      out.write("\tvar form = document.forms[\"searchForm\"];\n");
      out.write("\tvar searchWord = form.searchWord.value;\n");
      out.write("\tvar maxHits = form.maxHits.value;\n");
      out.write("\tif (!searchWord || searchWord == \"\")\n");
      out.write("\t\treturn;\n");
      out.write("\tquery =\"searchWord=\"+encodeURIComponent(searchWord)+\"&maxHits=\"+maxHits;\n");
      out.write("\tif (workingSet != '");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("All", request)));
      out.write("')\n");
      out.write("\t\tquery = query +\"&scope=\"+encodeURIComponent(workingSet);\n");
      out.write("\t\t\n");
      out.write("\t/******** HARD CODED VIEW NAME *********/\n");
      out.write("\t// do some tests to ensure the results are available\n");
      out.write("\tif (parent.parent.HelpFrame && \n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame && \n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame.showView &&\n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame.ViewsFrame && \n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame.ViewsFrame.search && \n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame.ViewsFrame.search.searchViewFrame) \n");
      out.write("\t{\n");
      out.write("\t    if (!noRefocus) {\n");
      out.write("\t\t    parent.parent.HelpFrame.NavFrame.showView(\"search\");\n");
      out.write("\t\t}\n");
      out.write("\t\tvar searchView = parent.parent.HelpFrame.NavFrame.ViewsFrame.search.searchViewFrame;\n");
      out.write("\t\tsearchView.location.replace(\"searchView.jsp?\"+query);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function getSearchWord() {\n");
      out.write("    var form = document.forms[\"searchForm\"];\n");
      out.write("    var searchWord = form.searchWord.value;\n");
      out.write("    if (searchWord ) {\n");
      out.write("        return searchWord;\n");
      out.write("    }\n");
      out.write("    return \"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function rescope() {\n");
      out.write("    if (parent.parent.HelpFrame && \n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame && \n");
      out.write("\t\tparent.parent.HelpFrame.NavFrame.ViewsFrame) {\n");
      out.write("\t\tvar viewsFrame = parent.parent.HelpFrame.NavFrame.ViewsFrame;\n");
      out.write("\t\tif (viewsFrame.toc && viewsFrame.toc.tocViewFrame) {\n");
      out.write("\t\t    var tocView = viewsFrame.toc.tocViewFrame;\n");
      out.write("\t\t    tocView.repaint();\n");
      out.write("\t\t}\n");
      out.write("\t\tif (viewsFrame.index && viewsFrame.index.indexViewFrame) {\n");
      out.write("\t\t    var indexView = viewsFrame.index.indexViewFrame;\n");
      out.write("\t\t    indexView.repaint();\n");
      out.write("\t\t}\n");
      out.write("\t\tdoSearch(null, true);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function fixHeights()\n");
      out.write("{\n");
      out.write("\tif (!isIE) return;\n");
      out.write("\t\n");
      out.write("\tvar h = document.getElementById(\"searchWord\").offsetHeight;\n");
      out.write("\tdocument.getElementById(\"go\").style.height = h;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function onloadHandler(e)\n");
      out.write("{\n");
      out.write("\tvar form = document.forms[\"searchForm\"];\n");
      out.write("\tform.searchWord.value = '");
      out.print(UrlUtil.JavaScriptEncode(data.getSearchWord()));
      out.write("';\n");
      out.write("\tfixHeights();\n");

    if (data.isScopeRequest() && RequestScope.filterBySearchScope(request)) {

      out.write("\n");
      out.write("    rescope();\n");

    }

      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\" onload=\"onloadHandler()\"  onunload=\"closeAdvanced()\">\n");
      out.write("\n");
      out.write("\t<form  name=\"searchForm\"   onsubmit=\"doSearch()\">\n");
      out.write("\t<div role=\"search\">\n");
      out.write("\t\t<table id=\"searchTable\" align=\"");
      out.print(isRTL?"right":"left");
      out.write("\" valign=\"middle\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\">\n");
      out.write("\t\t\t<tr nowrap  valign=\"middle\">\n");
      out.write("\t\t\t\t<td ");
      out.print(isRTL?"nowrap":"");
      out.write(" id=\"searchTD\">\n");
      out.write("\t\t\t\t\t<label id=\"searchLabel\" for=\"searchWord\" accesskey=\"");
      out.print(ServletResources.getAccessKey("SearchLabel", request));
      out.write("\">\n");
      out.write("\t\t\t\t\t&nbsp;");
      out.print(ServletResources.getLabel("SearchLabel", request));
      out.write("\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"searchWord\" name=\"searchWord\" value='' size=\"24\" maxlength=\"256\" \n");
      out.write("\t\t\t\t\t       alt=\"");
      out.print(UrlUtil.htmlEncode(ServletResources.getString("expression_label", request)));
      out.write("\" \n");
      out.write("\t\t\t\t\t       title=\"");
      out.print(UrlUtil.htmlEncode(ServletResources.getString("expression_label", request)));
      out.write("\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t<input type=\"submit\" role=\"button\" onclick=\"this.blur();doSearch()\" value=\"");
      out.print(ServletResources.getString("GO", request));
      out.write("\" id=\"go\" alt=\"");
      out.print(ServletResources.getString("GO", request));
      out.write("\" title=\"");
      out.print(ServletResources.getString("GO", request));
      out.write("\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"maxHits\" value=\"500\" >\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td nowrap>\n");
      out.write("\t\t\t\t\t<a id=\"scopeLabel\" href=\"javascript:openAdvanced();\" title=\"");
      out.print(ServletResources.getString("ScopeTooltip", request));
      out.write("\" alt=\"");
      out.print(ServletResources.getString("ScopeTooltip", request));
      out.write("\" onmouseover=\"window.status='");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("ScopeTooltip", request)));
      out.write("'; return true;\" onmouseout=\"window.status='';\">");
      out.print(ServletResources.getLabel("Scope", request));
      out.write("</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td nowrap>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"workingSet\" value='");
      out.print(UrlUtil.htmlEncode(data.getScope()));
      out.write("'>\n");
      out.write("\t\t\t\t\t<div id=\"scope\" >");
      out.print(UrlUtil.htmlEncode(data.getScope()));
      out.write("</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t</form>\t\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
