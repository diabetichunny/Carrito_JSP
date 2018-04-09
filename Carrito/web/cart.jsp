<%@page import="classes.Producto"%>
<%@page import="controllers.ControladorProducto"%>
<%@page import="classes.Articulo"%>
<%@page import="java.util.ArrayList"%>
<%
    HttpSession sesion = request.getSession(true);
    ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList)sesion.getAttribute("carrito");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Proyecto de Programación II">
    <meta name="author" content="Johann Cruz">
    <title>Tienda virtual - Carrito</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
</head><!--/head-->

<body>
    <header id="header"><!--header-->
        <div class="header-middle"><!--header-middle-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="logo pull-left">
                            <h3><a href="./">Carrito WEB</a></h3>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="shop-menu pull-right">
                            <ul class="nav navbar-nav">
                                <li><a href=""><i class="fa fa-user"></i> Cuenta</a></li>                                
                                <li><a href="login.html"><i class="fa fa-lock"></i> Iniciar Sesi&oacute;n</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--/header-middle-->

        <div class="header-bottom"><!--header-bottom-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-9">
                        <div class="navbar-header pull-left">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <div class="mainmenu pull-left">
                            <ul class="nav navbar-nav collapse navbar-collapse">
                                <li><a href="shop.jsp">Productos</a></li>
                                <li><a href="cart.jsp" class="active">Carrito</a></li> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    
    <section id="cart_items">
        <div class="container">
            <div class="table-responsive cart_info">
                <table class="table table-condensed">
                    <thead>
                        <tr class="cart_menu">
                            <td class="image" colspan="2">Producto</td>
                            <td class="price">Precio</td>
                            <td class="quantity">Cantidad</td>
                            <td class="total" colspan="2">Total</td>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                            ControladorProducto cp = new ControladorProducto();
                            double total = 0;
                            if (articulos != null && !articulos.isEmpty()) {                                                    
                                for (Articulo a: articulos) {
                                    Producto prod = cp.getProducto(a.getIdProducto());

                                    double total_prod = Math.round(prod.getPrecio() * a.getCantidad());
                                    total += total_prod;
                                    String prod_id = String.valueOf(prod.getId());
                        %>
                        <tr>
                            <td class="cart_product">
                                <a href=""><img style="width:110px; height:110px; padding-right:25px " src="<%= prod.getImg()%>" alt=""></a>
                            </td>
                            <td class="cart_description">
                                <h4><a href=""><%= prod.getNombre() %></a></h4>
                            </td>
                            <td class="cart_price">
                                <p>RD$ <%= prod.getPrecio() %></p>
                            </td>
                            <td class="cart_quantity">
                                <div class="cart_quantity_button">
                                    <a class="cart_quantity_up agregar-item" id="add-item-<%=  prod_id %>" href=""> + </a>
                                    <input class="cart_quantity_input cantidad-item" type="text" name="quantity" id="item-count-<%=  prod_id %>" value="<%= a.getCantidad()%>" autocomplete="off" size="2" readonly>
                                    <a class="cart_quantity_down eliminar-item" id="add-item-<%=  prod_id %>" href=""> - </a>
                                </div>
                            </td>
                            <td class="cart_total">
                                <p class="cart_total_price">RD$ <%= total_prod %></p>
                            </td>
                            <td class="cart_delete">
                                <a class="cart_quantity_delete delete-link" id="articulo-<%=  prod_id %>"><i class="fa fa-times" style="color:#666a72;"></i></a>
                            </td>
                        </tr>
                        <%
                                }
                            }
                            else  { 
                        %>
                        <tr style="text-align: center">
                            <td colspan="4"><h1>No hay art&iacute;culos. A&ntilde;ada m&aacute;s <a href="./shop.jsp">aqu&iacute;</a>.</h1></td>
                        </tr>
                        <%  }   %>
                    </tbody>
                </table>
                <% if (articulos != null && !articulos.isEmpty()) { %>
                    <a class="btn btn-default btn-lg" href="./shop.jsp" style="margin-bottom: 10px; margin-left: 10px;">Seguir comprando</a>
                    <%  }   %>
            </div>
        </div>
    </section> <!--/#cart_items-->

    <section id="do_action">
        <div class="container">
            <div class="row">		
                <div class="col-sm-4 col-md-4 col-xs-5"></div>
                <div class="col-sm-4 col-md-4 col-xs-5"></div>
                <div class="col-sm-4 col-md-4 col-xs-5">
                    <div class="total_area">
                        <ul>
                            <li><h4>Total <span>RD$ <%= total %></span></h4></li>
                        </ul>              
                        <div style="text-align: center;" class="compra">
                            <a class="btn btn-default btn-lg check_out" style="text-align: center;" href="" id="btn-hacer-compra">Hacer Compra</a>    
                        </div>                        
                    </div>
                </div>
            </div>
        </div>
    </section><!--/#do_action-->

    <script src="js/jquery.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
    <script src="js/carrito.js"></script>

</body>
</html>