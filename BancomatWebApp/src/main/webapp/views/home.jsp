<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link  href="static/css/BancomatStyle.css" rel="stylesheet" >


<meta charset="UTF-8">

<title>Welcome</title>
</head>
<body>
<!-- Logo banca -->

<img alt="" class="center" src="https://www.imaginbank.com/deployedfiles/imaginbank/Estaticos/Imagenes/imaginBank_logo_en.png">
<div style="color: white;" class="center"> Since 2022</div>

<!-- Menù a tendina per accedere alle altre sezioni -->
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
            Home
          </a>
          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
            <li><a class="dropdown-item" href="http://127.0.0.1:8080/BancomatWebApp/vers">Versamento</a></li>
            <li><a class="dropdown-item" href="http://127.0.0.1:8080/BancomatWebApp/prel">Prelievo</a></li>
            <li><a class="dropdown-item" href="http://127.0.0.1:8080/BancomatWebApp/listamovimenti">Lista Movimenti</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>



<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://www.paviafree.it/images/stories/533356766.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Venezia</h5>
        <p>a.d. 1374</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://images.posarellivillas.com/ccontent_page/1107051495800060xx/large/bandiera-firenze.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Firenze</h5>
        <p>a.d. 1397</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="http://web.neoimage.it/museotemp/genova/it/wp-content/themes/doria-pdp/foto/opere/affreschi/villa-del-principe-museo-genova-ratto-di-europa.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Genova</h5>
        <p>a.d. 1407</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>



<!-- footer -->

 <footer  class=" bd-footer  py-5  mt-5  bg-light "><!-- la modifica bg qui -->
  <div class="container  py-5"><!-- la modifica bg qui -->
    <div class="row ">
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
</body>
</html>