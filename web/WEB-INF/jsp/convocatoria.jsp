<%@ include file="includes.jsp" %>
<%@ include file="header.jsp" %>
<body>
    <div id="tabs">
        <ul>
          <li><a href="#fragment-1"><span>Registrar Convocatoria </span></a></li>
          <li><a href="#fragment-2"><span>List Conv </span></a></li>
        </ul>
        <div id="fragment-1">
            <form:form method="post" action="../conv/register" 
                          modelAttribute="formConv" id="formConv" cssClass="login">
               <p>
                 <label for="name" >Nombre: </label>
                 <form:input path="name" />
               </p>

               <p>
                 <label for="dateStart">Inicio Convocatoria: </label>
                 <form:input path="dateStart" id="dateStart" />
               </p>

                <p>
                 <label for="dateFin">Termino Convocatoria: </label>
                 <form:input path="dateFin" id="dateFin" />
               </p>
                 <p>
                 <label for="dateProject">Inicio Proyecto: </label>
                 <form:input path="dateProject" id="dateProject" />
               </p>
               <table
                   <thead>
                    <tr > 
                      <th>Puestos</th>
                      <th>Area</th>
                       <th>Posicion</th>
                      <th>Accion</th>
                    </tr>
                   </thead>
                   <tbody id="bodyConv">
                       <input type="hidden" id="numberClon" value="0">
                       <td> <form:input path="perfilPuesto[0].num" id="num"/> </td>
			<td>
                            <form:select  path="perfilPuesto[0].area.id" id="area" >
                                <form:option label="--Seleccione--" value="0"/>
                                <form:options items="${listArea}" itemValue="id" itemLabel="name" />
                            </form:select>
                        </td>
                        <td>
                            <form:select  path="perfilPuesto[0].id" id="puesto">
                                <form:option label="--Seleccione--" value="0"/>
                                 <form:options items="${listPuesto}" itemValue="id" itemLabel="name" />
                            </form:select>
                        </td>
                        <td><a href="#" onclick="cloneTr()">Agregar </a></td>
                    </tbody>
                </table>
               <p class="login-submit">
                 <button type="submit" class="login-button">Enviar</button>
               </p>
               </form:form>
        </div>
        <div id="fragment-2">

        </div>
    </div>
  
</body>
</html>