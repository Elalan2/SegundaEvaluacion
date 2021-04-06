<%-- 
    Document   : index
    Created on : 16/02/2021, 03:37:34 AM
    Author     : alann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar contraseña</title>  
        <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="assets/dist/js/recuperacion.js"></script>
        <link href="assets/dist/css/inicio.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <div class='container col-lg-3'>
            <form action="recuperar" method="post" id="formmodificar">
                <div class="form-group text-center">
                    <img src="imagenes/585e4beacb11b227491c3399.png" height="80" width="80"/>
                    <p><strong>Ingrese usuario</strong></p>
                </div>
                <div class="form-group">
                <label>Correo</label>
                <input type="email" name="mail_usu" id="mail_usu" placeholder="ejemplo@gmail.com" class="form-control"/></br>
                </div>
                <div class="form-group"
                     <label>Nueva contraseña</label>
            <input type="password" name="password_usu" id="password_usu" placeholder="********" class="form-control"></br></div>
            
                
                No tienes cuenta? <a href="registro.jsp">Registrarme</a></br>
                <div class="form-group">
            <input class="btn btn-outline-primary btn-block" type="button" value="ModificarContra" id="btnmodificarcontra"/>
            </form>
        </div>
        
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="assets/dist/js/bootstrap.bundle.min.js"></script>
      

    </body>
</html>
