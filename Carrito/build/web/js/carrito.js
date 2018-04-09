/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(() => {
   $('tr .delete-link').click((e) => {
       let idprod = e.currentTarget.id.split('-')[1];
 
       $.ajax({
          url: 'borrar-item',
          type: 'POST',
          data: {idprod: idprod},
          success: (r) => location.reload()
       });
   });
     
   $('.agregar-item').on("click", (e) => {
        let idprod = e.currentTarget.id.split('-')[2];
       
        $.ajax({
          url: 'agregar-producto',
          type: 'POST',
          data: {
              idproducto: idprod,
              cantidad: 1
          },
          success: (r) => location.reload()
       });
   });
   
      $('.eliminar-item').on("click", (e) => {
        e.preventDefault();
        let idprod = e.currentTarget.id.split('-')[2];
        let cantidad = $('.eliminar-item').parent().find('.cantidad-item').val() - 1;
        
        
        if (idprod >= 1){
            $.ajax({
                url: 'borrar-item',
                type: 'POST',
                data: {
                    idprod: idprod,
                    cantidad: cantidad
                },
                success: (r) => location.reload()
            });
            
        }
        else{
            $.ajax({
               url: 'borrar-item',
               type: 'POST',
               data: {idprod: idprod},
               success: (r) => location.reload()
            });
        }
        
   });
});