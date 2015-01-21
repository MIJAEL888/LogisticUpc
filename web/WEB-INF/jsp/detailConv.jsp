<%@ include file="includes.jsp" %>
<%@ include file="header.jsp" %>
<body>
    <div id="tabs">
        <ul>
          <li><a href="#fragment-1"><span>Detail Convocatoria </span></a></li>
          <li><a href="#fragment-2"><span>List Conv </span></a></li>
        </ul>
        <div id="fragment-1">
            <h1>Registro creado....</h1>
               <p>
                 <label for="name" >Nombre: </label>
                 <span>${formConv.name}</span>
               </p>

               <p>
                 <label for="dateStart">Inicio Convocatoria: </label>
                  <span>${formConv.dateStart}</span>
               </p>

                <p>
                 <label for="dateFin">Termino Convocatoria: </label>
                  <span>${formConv.dateFin}</span>
               </p>
                 <p>
                 <label for="dateProject">Inicio Proyecto: </label>
                  <span>${formConv.dateStart}</span>
               </p>
               <p class="login-submit">
                   <button type="button" class="login-button">Aceptar</button>
               </p>
        </div>
        <div id="fragment-2">

        </div>
    </div>
  
</body>
</html>