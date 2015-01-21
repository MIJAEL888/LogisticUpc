$(function(){	
    
   $( "#tabs" ).tabs(); 
     $( "#dateStart" ).datepicker({
        defaultDate: "-3w",
        changeMonth: true,
        numberOfMonths: 1,
        dateFormat: "dd/mm/yy"
      });
       $( "#dateFin" ).datepicker({
        defaultDate: "-3w",
        changeMonth: true,
        numberOfMonths: 1,
        dateFormat: "dd/mm/yy"
      });
       $( "#dateProject" ).datepicker({
        defaultDate: "-3w",
        changeMonth: true,
        numberOfMonths: 1,
        dateFormat: "dd/mm/yy"
      });
    $(window).load(function(){
     
    });
});

function cloneTr(){
    var copyNum = parseInt($("#numberClon").val()) + 1;
    var strLine = "<tr>"+
        "<td>"+
            "<input id='num" + copyNum+"' type='text' value='"+$("#num").val()+"' name='perfilPuesto["+copyNum+"].num' readonly='readonly' readonly='readonly'>"+ 
        "</td>"+
        "<td>" +
            "<input id='area"+copyNum+"' type='hidden' value='"+$("#area").val()+"' name='perfilPuesto["+copyNum+"].area.id' readonly='readonly' class='idNe'>"+
            "<input id='areaName" + copyNum+"' type='text' value='"+$("#area option:selected").text()+"' readonly='readonly'>"+ 
        "<td>"+
            "<input id='puesto"+copyNum+"' type='hidden' value='"+$("#puesto").val()+"' name='perfilPuesto["+copyNum+"].id' readonly='readonly' class='idNe'>"+
            "<input id='puestoName" + copyNum+"' type='text' value='"+$("#puesto option:selected").text()+"' readonly='readonly'>"+ 
        "</td>"+
            "<td><a href='#' onclick='removeTrTeo(this)' >Remove</a></td>"+
      "</tr>";
    $("#bodyConv").append(strLine);
    $("#num").val(0);
    $("#area").val(0);
    $("#puesto").val(0);
    $("#numberClon").val(copyNum);
}

function removeTrTeo(element){
	$(element).parent().parent().remove();
}