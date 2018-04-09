/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Producto;
import models.ModeloProducto;

/**
 *
 * @author johann
 */
public class ControladorProducto {
    public String getProductos() {
        ModeloProducto mp = new ModeloProducto();
        String htmlcode = "";
        
        for(Producto p : mp.getAllProductos()) {
            htmlcode += "<div class=\"col-sm-4\">\n" +
            "               <div class=\"product-image-wrapper\">\n" +
            "                   <div class=\"single-products\">\n" +
            "                       <div class=\"productinfo text-center\">\n" +
            "                           <img style=\"width:250px; height:250px;\" src=\"" + p.getImg() + "\" alt=\"\" />\n" +
            "                           <h2>RD$" + p.getPrecio() + "</h2>\n" +
            "                           <p>" + p.getNombre() + "</p>\n" +
            "                           <a href=\"product-details.jsp?id="+ p.getId() +"\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Ver detalles</a>\n" +
            "                       </div>\n" +
            "                       <div class=\"product-overlay\">\n" +
            "                           <div class=\"overlay-content\">\n" +
            "                               <h2>RD$" + p.getPrecio() + "</h2>\n" +
            "                               <p>" + p.getNombre() + "</p>\n" +
            "                               <a href=\"product-details.jsp?id="+ p.getId() +"\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Ver detalles</a>\n" +
            "				</div>\n" +
            "                       </div>\n" +
            "                   </div>\n" +
            "                   <div class=\"choose\">\n" +
            "                       <ul class=\"nav nav-pills nav-justified\">\n" +
            "                           <li><a href=\"\"><i class=\"fa fa-plus-square\"></i>Add to wishlist</a></li>\n" +
            "                           <li><a href=\"\"><i class=\"fa fa-plus-square\"></i>Add to compare</a></li>\n" +
            "                       </ul>\n" +
            "           	</div>\n" +
            "               </div>\n" +
            "             </div>";            						
        }
        
        return htmlcode;
    }
    
    public Producto getProducto(int id) {
        return new ModeloProducto().getProducto(id);
    }
}
