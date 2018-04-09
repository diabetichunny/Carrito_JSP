package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.Producto;
import controllers.ControladorProducto;
import classes.Articulo;
import java.util.ArrayList;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    HttpSession sesion = request.getSession(true);
    ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList)sesion.getAttribute("carrito");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"Proyecto de Programación II\">\n");
      out.write("    <meta name=\"author\" content=\"Johann Cruz\">\n");
      out.write("    <title>Tienda virtual - Carrito</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header id=\"header\"><!--header-->\n");
      out.write("        <div class=\"header-middle\"><!--header-middle-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <div class=\"logo pull-left\">\n");
      out.write("                            <a href=\"index.html\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-8\">\n");
      out.write("                        <div class=\"shop-menu pull-right\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li><a href=\"\"><i class=\"fa fa-user\"></i> Cuenta</a></li>                                \n");
      out.write("                                <li><a href=\"login.html\"><i class=\"fa fa-lock\"></i> Iniciar Sesi&oacute;n</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!--/header-middle-->\n");
      out.write("\n");
      out.write("        <div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <div class=\"navbar-header pull-left\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mainmenu pull-left\">\n");
      out.write("                            <ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("                                <li><a href=\"shop.jsp\">Productos</a></li>\n");
      out.write("                                <li><a href=\"cart.jsp\" class=\"active\">Carrito</a></li> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    <section id=\"cart_items\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"table-responsive cart_info\">\n");
      out.write("                <table class=\"table table-condensed\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"cart_menu\">\n");
      out.write("                            <td class=\"image\" colspan=\"2\">Producto</td>\n");
      out.write("                            <td class=\"price\">Precio</td>\n");
      out.write("                            <td class=\"quantity\">Cantidad</td>\n");
      out.write("                            <td class=\"total\" colspan=\"2\">Total</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 
                            ControladorProducto cp = new ControladorProducto();
                            double total = 0;
                            if (articulos != null && !articulos.isEmpty()) {                                                    
                                for (Articulo a: articulos) {
                                    Producto prod = cp.getProducto(a.getIdProducto());

                                    double total_prod = Math.round(prod.getPrecio() * a.getCantidad());
                                    total += total_prod;
                                    String prod_id = String.valueOf(prod.getId());
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"cart_product\">\n");
      out.write("                                <a href=\"\"><img style=\"width:110px; height:110px; padding-right:25px \" src=\"");
      out.print( prod.getImg());
      out.write("\" alt=\"\"></a>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cart_description\">\n");
      out.write("                                <h4><a href=\"\">");
      out.print( prod.getNombre() );
      out.write("</a></h4>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cart_price\">\n");
      out.write("                                <p>RD$ ");
      out.print( prod.getPrecio() );
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cart_quantity\">\n");
      out.write("                                <div class=\"cart_quantity_button\">\n");
      out.write("                                    <a class=\"cart_quantity_up agregar-item\" href=\"\"> + </a>\n");
      out.write("                                    <input class=\"cart_quantity_input\"  type=\"text\" name=\"quantity\" id=\"item-count-\" value=\"");
      out.print( a.getCantidad());
      out.write("\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                    <a class=\"cart_quantity_down remove-item\" href=\"\"> - </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cart_total\">\n");
      out.write("                                <p class=\"cart_total_price\">RD$ ");
      out.print( total_prod );
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cart_delete\">\n");
      out.write("                                <a class=\"cart_quantity_delete delete-link\" id=\"articulo-");
      out.print(  prod_id );
      out.write("\"><i class=\"fa fa-times\" style=\"color:#666a72;\"></i></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                }
                            }
                            else  { 
                        
      out.write("\n");
      out.write("                        <tr style=\"text-align: center\">\n");
      out.write("                            <td colspan=\"4\"><h1>No hay art&iacute;culos. A&ntilde;ada m&aacute;s <a href=\"./shop.jsp\">aqu&iacute;</a>.</h1></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
  }   
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                ");
 if (articulos != null && !articulos.isEmpty()) { 
      out.write("\n");
      out.write("                    <a class=\"btn btn-default btn-lg\" href=\"./shop.jsp\" style=\"margin-bottom: 10px; margin-left: 10px;\">Seguir comprando</a>\n");
      out.write("                    ");
  }   
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section> <!--/#cart_items-->\n");
      out.write("\n");
      out.write("    <section id=\"do_action\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\t\t\n");
      out.write("                <div class=\"col-sm-4 col-md-4 col-xs-5\"></div>\n");
      out.write("                <div class=\"col-sm-4 col-md-4 col-xs-5\"></div>\n");
      out.write("                <div class=\"col-sm-4 col-md-4 col-xs-5\">\n");
      out.write("                    <div class=\"total_area\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><h4>Total <span>RD$ ");
      out.print( total );
      out.write("</span></h4></li>\n");
      out.write("                        </ul>              \n");
      out.write("                        <div style=\"text-align: center;\" class=\"compra\">\n");
      out.write("                            <a class=\"btn btn-default btn-lg check_out\" style=\"text-align: center;\" href=\"\">Hacer Compra</a>    \n");
      out.write("                        </div>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section><!--/#do_action-->\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/carrito.js\"></script>\n");
      out.write("    <script src=\"js/prueba.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
