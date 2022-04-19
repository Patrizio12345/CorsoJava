//versamento
$(document).ready(function () {
	
   //registro evento pulsante search	
   $('#btn-versamento').click(function (event) {   
    //preparo la request in json
    var requestData = {
	    'movimentazione':{
		  
		  'operazione':"VERSAMENTO",
		  'taglio':$( "#taglio option:selected" ).text(),
		  'quantita':$('#rangeValore').val(),
		  'nominativo':$('#txt-nominativo').val()
	    }
     };
    
     //chiamo il server---------------
    var response=fire_ajax_post("api/movimento_add", requestData);

 });
});

function deleteAereo(itemId){
//chiamo il server---------------	
var response=fire_ajax_pathvar("api/delete/"+itemId);
var response_object=response.responseJSON;

//elaboro la risposta in formato testo
 var response_text=response.responseText;
$('#text-feedback').text(response_text);
    

$("#listaMovId tr.mia").remove();

 //elaboro la risposta in formato ogetto
$.each(response_object.movimentiSearchResponse, function(i, item) {
    var riga="<tr class='mia'>";
	     riga+="<td>"+item.id+"</td>";
	     riga+="<td>"+item.dataEora+"</td>";
	     riga+="<td>"+item.operazione+"</td>";
         riga+="<td>"+item.nominativo+"</td>";
	     riga+="<td>"+item.taglio+"</td>";
	     riga+="<td>"+item.quantita+"</td>";
         riga+="<td>"+item.taglio*item.quantita+"</td>";
	     riga+="<td><button onClick='elimina-movimento(\""+item.id+"\")' type='button' class='btn btn-danger'>delete</button></td>";
   riga+="</tr>";
   $("#listaMovId").append(riga);
    });	
}




//prelievo
$(document).ready(function () {
	
   //registro evento pulsante search	
   $('#btn-prelievo').click(function (event) {   
    //preparo la request in json
    var requestData = {
	    'movimentazione':{
		  'quantita':1,
          'altroImporto':$("#altro_Importo").val(),
		  'operazione':"PRELIEVO",
		  'taglio':$( "#importo option:selected").text(),
		  'nominativo':$('#txt-nominativo1').val()
	    }
     };

     //chiamo il server---------------
    var response=fire_ajax_post("api/movimento_add", requestData);

 });

});

function deleteAereo(itemId){
//chiamo il server---------------	
var response=fire_ajax_pathvar("api/delete/"+itemId);
var response_object=response.responseJSON;

//elaboro la risposta in formato testo
 var response_text=response.responseText;
$('#text-feedback').text(response_text);
    

$("#listaMovId tr.mia").remove();

 //elaboro la risposta in formato ogetto
$.each(response_object.movimentiSearchResponse, function(i, item) {
    var riga="<tr class='mia'>";
	     riga+="<td>"+item.id+"</td>";
	     riga+="<td>"+item.dataEora+"</td>";
	     riga+="<td>"+item.operazione+"</td>";
         riga+="<td>"+item.nominativo+"</td>";
	     riga+="<td>"+item.taglio+"</td>";
         riga+="<td>"+item.altroImporto+"</td>";
	     riga+="<td>"+item.taglio-item.saldo+"</td>";
	     riga+="<td><button onClick='elimina-movimento(\""+item.id+"\")' type='button' class='btn btn-danger'>delete</button></td>";
   riga+="</tr>";
   $("#listaMovId").append(riga);
    });	
}
