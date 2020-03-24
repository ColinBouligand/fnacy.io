/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-11 13:23:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.livres;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import commerce.catalogue.service.CatalogueManager;
import commerce.catalogue.domaine.modele.Livre;
import commerce.catalogue.domaine.modele.Article;
import java.util.Iterator;

public final class affiche_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/livres/../enTetePage.html", Long.valueOf(1551293940000L));
    _jspx_dependants.put("/admin/livres/../piedDePage.html", Long.valueOf(1551293940000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Site web marchand</title>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/style.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" id=\"storefront-woocommerce-style-css\" href=\"../../css/themes/storefont/assets/sass/woocommerce/woocommerce.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../js/jplayer-2.9.2/skin/blue.monday/css/jplayer.blue.monday.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/jplayer-2.9.2/jplayer/jquery.jplayer.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/jplayer-2.9.2/add-on/jplayer.playlist.min.js\"></script>\r\n");
      out.write("<style type='text/css'>\r\n");
      out.write("\t\t\t#wrapper {\r\n");
      out.write("\t\t\t\tmax-width: 100%;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"inner-wrapper\">\r\n");
      out.write("\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"site-title\">Administration du site web marchand</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 if (application.getAttribute("catalogueManager")==null) {
    response.sendRedirect("./index.jsp") ;
  }
  else {
	CatalogueManager catalogueManager = (CatalogueManager)application.getAttribute("catalogueManager") ;

      out.write("\r\n");
      out.write("    <section class=\"entry\">\r\n");
      out.write("      <table>\r\n");

    Livre livre = null ;
    Article article = null ; 
    Boolean enteteAffiche = false ;
    Iterator<Article> listeDesLivres = catalogueManager.getArticles().iterator() ;
    while(listeDesLivres.hasNext()) {
	  article = listeDesLivres.next() ; 
	  if (article instanceof Livre) {
        if (!enteteAffiche) {

      out.write("\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>R&eacute;f&eacute;rence&nbsp;</th>\r\n");
      out.write("            <th>Titre</th>\r\n");
      out.write("            <th>Auteur</th>\r\n");
      out.write("            <th>Disponibilit&eacute;</th>\r\n");
      out.write("            <th>ISBN</th>\r\n");
      out.write("\t\t\t<th>Image</th>\r\n");
      out.write("            <th>Nombre de pages</th>\r\n");
      out.write("            <th>prix</th>\r\n");
      out.write("            <th>&nbsp;</th>\r\n");
      out.write("            <th>&nbsp;</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");

          enteteAffiche = true ;
        }
        livre = (Livre)article ;

      out.write("\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>");
      out.print(livre.getRefArticle() );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(livre.getTitre() );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(livre.getAuteur() );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(livre.getDisponibilite() );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(livre.getISBN() );
      out.write("</td>\r\n");

        if (livre.getImage() != null) { 

      out.write("\r\n");
      out.write("\t\t    <td>");
      out.print(livre.getImage() );
      out.write("</td>\r\n");

        }
        else { 

      out.write("\r\n");
      out.write("\t\t    <td>Inexistante</td>\r\n");

        }

      out.write("\r\n");
      out.write("            <td>");
      out.print(livre.getNbPages() );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(livre.getPrix() );
      out.write("</td>\r\n");
      out.write("            <td><a href=\"controleLivres.jsp?refArticle=");
      out.print(livre.getRefArticle() );
      out.write("&amp;commande=AModifier\">Modifier</a></td>\r\n");
      out.write("            <td><a href=\"javascript:deleteObject('refArticle','");
      out.print(livre.getRefArticle() );
      out.write("')\">Supprimer</a></td>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("// <![CDATA[\r\n");
      out.write("\tfunction deleteObject(id,idval)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(confirm(\"Etes-vous sur de vouloir supprimer cet article ?\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tlocation.href = \"controleLivres.jsp?commande=supprimer&\" + id + \"=\" + idval;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("// ]]>\r\n");
      out.write("            </script>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");

      }
    } 

      out.write("\r\n");
      out.write("      </table>\t\t\t\t\r\n");
      out.write("      <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td><a href=\"ajoute.jsp\">Ajouter un nouveau livre</a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     </section>\r\n");

  }

      out.write('\r');
      out.write('\n');
      out.write("\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t\t<div id=\"credit\" class=\"col-right\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<object type=\"image/svg+xml\" data=\"../../images/deezer.svg\" width=\"152\" height=\"34\"></object>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tDesigned by\r\n");
      out.write("\t\t\t\t\t<a title=\"Premium WordPress Themes & Plugins by WooThemes\" alt=\"Premium WordPress Themes & Plugins by WooThemes\" href=\"http://www.woothemes.com/\">\r\n");
      out.write("\t\t\t\t\t\t<img width=\"74\" height=\"19\" alt=\"WooThemes\" src=\"../../images/woothemes.png\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
