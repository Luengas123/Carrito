<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalogo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>

        <jsp:include page="components/Nevagacion.jsp" />

        <h5>Carrito</h5>
        <hr/>

        <div class="row">
            <div class="col-sm-9">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-bordered table-striped">
                            <thead style="background-color: #2747f7;">
                                <tr>
                                    <th>Imagen</th>
                                    <th>Producto</th>
                                    <th>Precio ($/)</th>
                                    <th>Cantidad</th>
                                    <th>Importe</th>
                                    <th>Accion</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${carrito}" var="item">
                                    <tr>
                                        <td>
                                            <img src="assets/img/productos/${item.pruducto.imagen}" width="50%" height="60" alt="${item.producto.nombre}"/>
                                        </td>
                                        <td>${item.producto.nombre}</td>
                                        <td>${item.producto.precio}</td>
                                        <td>${item.cantidad}</td>
                                        <td>${item.Importe()}</td>
                                        <td>
                                            <a href="#" title="Eliminar" class="btn btn-danger btn-sm">
                                                <i class="fa fa-trash-alt"></i>
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

            <div class="col-sm-3">
                <div class="card">
                    <div class="card-body">
                        <div class="row">
                            <h5>RESUMEN COMPRA</h5>
                            <hr /> 
                            <button class="btn btn-warning btn-block btn-lg">
                                <div class="d-flex justify-content-between">
                                    <span><i class="fa fa-credit-card"></i> PROCESAR</span>
                                </div>
                            </button>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    </body>
</html>
