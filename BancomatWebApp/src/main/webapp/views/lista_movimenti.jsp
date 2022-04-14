<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link  href="static/css/BancomatStyle.css" rel="stylesheet" >
<meta charset="UTF-8">
<title>Report Movimenti</title>
</head>
<body>
<!-- Logo banca -->
<img alt="" class="center" src="https://www.imaginbank.com/deployedfiles/imaginbank/Estaticos/Imagenes/imaginBank_logo_en.png">
<div style="color: white;" class="center"> Since 2022</div>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Imagin Bank</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
      <ul class="navbar-nav">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Lista Movimenti
          </a>
          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
          <li><a class="dropdown-item" href="http://127.0.0.1:8080/BancomatWebApp/bank">Home</a></li>
            <li><a class="dropdown-item" href="http://127.0.0.1:8080/BancomatWebApp/vers">Versamento</a></li>
            <li><a class="dropdown-item" href="http://127.0.0.1:8080/BancomatWebApp/prel">Prelievo</a></li>
           </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>


<p style="color:white;">LISTA MOVIMENTI</p>

<span class="d-block p-2 bg-dark text-white">Saldo :</span>

<!-- Tabella -->
<p style="color:white;">Transazioni</p>
<table class="table table-dark table-striped">
 
    <tr>
    <th scope="col">ID</th>
    <th scope="col">UUID</th>
      <th scope="col">Data-Ora</th>
      <th scope="col">Bitcoin Wallet</th>
      <th scope="col">Operazione</th>
      <th scope="col">Nominativo</th>
       <th scope="col">Taglio</th>
      <th scope="col">Quantità</th>
      <th scope="col">Bitcoin wallet dopo operazioni</th>
      <th scope="col">Canc</th>
    </tr>
  
 <c:set var="numMov" scope="session" value="0"/>
  <c:forEach var="movimento" items="${moveWay.listaMovimentiRestituiti}">
   <c:set var="numMov" scope="session" value="${numMov+1}"/>
    <tr>
     <td> <c:out value="${numMov}"/></td>
       <td> <c:out value="${movimento.id}"/></td>
      <td> <c:out value="${movimento.dataEora}"/></td>
      <td> Importo presente: <c:out value="${movimento.conto}"/></td>
      <td> <c:out value="${movimento.operazione}"/></td>
     <td> <c:out value="${movimento.nominativo}"/></td>
     <td> <c:out value="${movimento.taglio}"/></td>
     <td> <c:out value="${movimento.quantita}"/></td>
      <td>Moneytizzazione!</td>
      <td><a href="elimina-movimento?id=<c:out value="${movimento.id}"/>"> <input class="myclass" type="button"  value="Delete"/></a></td>
    </tr>
    </c:forEach>
  
</table>


<!-- footer -->

 <footer class=" bd-footer py-5 mt-5 bg-light "><!-- la modifica bg qui -->
  <div class=" container py-5"><!-- la modifica bg qui -->
    <div class="row">
      <div class="col-lg-3 mb-3">
        <a class="d-inline-flex align-items-center mb-2 link-dark text-decoration-none" href="" aria-label="Bootstrap">
       <img src="static/images/ufo.png" alt="">
          <span class="fs-5">SpaceProject</span>
        </a>
        <ul class="list-unstyled small text-muted">
          <li class="mb-2">Designed and built with all the love in the world by the <a href="/docs/5.1/about/team/">SpaceProject team</a> with the help of <a href="https://github.com/Academy-Neotech">Neotech Academy</a>.</li>
          <li class="mb-2">Code licensed <a href="https://github.com/Patrizio12345/CorsoJava" target="_blank" rel="license noopener">MIT</a>, docs <a href="https://creativecommons.org/licenses/by/3.0/" target="_blank" rel="license noopener">ZZ BY TOP/1.0</a>.</li>
          <li class="mb-2">Currently v0.0.1.</li>
          
         <a href="https://www.instagram.com/"><img src="static/images/instagram.png" alt=""></a>
         <a href="https://www.youtube.com/"> <img src="static/images/youtube.png" alt=""></a>
          <a href="https://www.facebook.com/"><img src="static/images/facebook.png" alt=""></a>
          <a href="https://twitter.com/?lang=en"><img src="static/images/twitter.png" alt=""></a>
          
          <div>Icons made by
          <a href="https://www.flaticon.com/free-icons/facebook" title="Flaticon">flaticon.com</a>
          </div>
          
           <div>collaboration with
          <a href="https://www.freepik.com/" title="Freepik">freepik.com</a>
          </div>
        </ul>
      </div>
      <div class="col-6 col-lg-2 offset-lg-1 mb-3">
        <h5>Links</h5>
        <ul class="list-unstyled">
          <li class="mb-2"><a href="http://127.0.0.1:8080/PM_WebApp04/testP">Home</a></li>
          <li class="mb-2"><a href="/docs/5.1/">Docs</a></li>
          <li class="mb-2"><a href="https://spring.io/projects/spring-boot">SpringProject</a></li>
         <li class="mb-2"><a href="/docs/5.1/">Blog</a></li>
        </ul>
      </div>
      <div class="col-6 col-lg-2 mb-3">
        <h5>Guides</h5>
        <ul class="list-unstyled">
          <li class="mb-2"><a href="/docs/5.1/getting-started/">Getting started</a></li>
          <li class="mb-2"><a href="https://getbootstrap.com/">Bootstrap starter pack</a></li>
          <li class="mb-2"><a href="/docs/5.1/getting-started/webpack/">Webpack</a></li>
          <li class="mb-2"><a href="/docs/5.1/getting-started/parcel/">Parcel</a></li>
        </ul>
      </div>
      <div class="col-6 col-lg-2 mb-3">
        <h5>Projects</h5>
        <ul class="list-unstyled">
      
          <li class="mb-2"><a href="https://www.flaticon.com/free-icons/facebook">Icons</a></li>
          <li class="mb-2"><a href="https://www.rfsworld.com/">RFS</a></li>
          <li class="mb-2"><a href="https://www.neotech.srl/">Starter</a></li>
        </ul>
      </div>
      <div class="col-6 col-lg-2 mb-3">
        <h5>Community</h5>
        <ul class="list-unstyled">
          <li class="mb-2"><a href="https://github.com/">GitHub</a></li>
          <li class="mb-2"><a href="https://discord.com/">Discord</a></li>
          <li class="mb-2"><a href="https://mvnrepository.com/">Maven Repository</a></li>
          <li class="mb-2"><a href="https://www.w3schools.com/">w3s Collective</a></li>
          <li class="mb-2"><a href="https://slack.com/">Slack</a></li>
          <li class="mb-2"><a href="https://stackoverflow.com/">Stack Overflow</a></li>
          
        </ul>
      </div>
    </div>
  </div>
</footer>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</html>