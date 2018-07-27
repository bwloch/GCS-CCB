package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/advanced/fheader.jsp");
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\">\n");

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
 
	LayoutData data = new LayoutData(application,request, response);
	FrameData frameData = new FrameData(application,request, response);
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>");
      out.print(ServletResources.getString("Help", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
 
if (data.isMozilla()) {

      out.write("\n");
      out.write("HTML {\n");
      out.write("\tborder-");
      out.print(isRTL?"left":"right");
      out.write(":1px solid ThreeDShadow;\n");
      out.write("}\n");
 
} else {

      out.write("\n");
      out.write("FRAMESET {\n");
      out.write("\tborder-top:1px solid ThreeDShadow;\n");
      out.write("\tborder-left:1px solid ThreeDShadow;\n");
      out.write("\tborder-right:1px solid ThreeDShadow;\n");
      out.write("\tborder-bottom:1px solid ThreeDShadow;\n");
      out.write("}\n");

}

      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <frameset id=\"contentFrameset\" rows=\"");
      out.print(frameData.getContentAreaFrameSizes());
      out.write("\" frameborder=0\" framespacing=\"0\" border=\"0\" spacing=\"0\">\n");
      out.write("\t<frame name=\"ContentToolbarFrame\" title=\"");
      out.print(ServletResources.getString("topicViewToolbar", request));
      out.write("\" src='");
      out.print("contentToolbar.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("'  marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" >\n");
      out.write("\t<frame ACCESSKEY=\"K\" name=\"ContentViewFrame\" title=\"");
      out.print(ServletResources.getString("topicView", request));
      out.write("\" src='");
      out.print(UrlUtil.htmlEncode(data.getContentURL()));
      out.write("'  marginwidth=\"10\"");
      out.print((data.isIE() && "6.0".compareTo(data.getIEVersion()) <=0)?"scrolling=\"yes\"":"");
      out.write(" marginheight=\"0\" frameborder=\"0\" >\n");
      out.write("\t");

	    AbstractFrame[] frames = frameData.getFrames(AbstractFrame.BELOW_CONTENT);
	    for (int f = 0; f < frames.length; f++) {
	        AbstractFrame frame = frames[f];
	        String url = frameData.getUrl(frame);
	
      out.write("\n");
      out.write("\t<frame name=\"");
      out.print(frame.getName());
      out.write("\" src=\"");
      out.print(url );
      out.write('"');
      out.write(' ');
      out.print(frame.getFrameAttributes());
      out.write(" >\n");
      out.write("\t");
 
	 } 
	
      out.write("\n");
      out.write("</frameset>\n");
      out.write("\n");
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
