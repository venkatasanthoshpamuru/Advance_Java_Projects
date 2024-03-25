function validationForm(){
// get the data from form
var proId = document.getElementById("proId").value;
var proName = document.getElementById("proName").value;
var proPrice = document.getElementById("proPrice").value;
var proBrand = document.getElementById("proBrand").value;
var proMadaIn = document.getElementById("proMadeIn").value;

 if(proId.trim()===""||proName.trim()=== ""||proPrice.trim()===""||proBrand.trim()===""||proMadaIn.trim()===""){
	 alert("All fields must be filled out");
	 return false;
 }
 if(parseFloat(proPrice)<0){
	 alert("Price must not be negative..please enter more than zero value");
	 return false;
 }
 if(proName.length >30 || proBrand.length >30){
 alert("Product or product Brand lenth should not more then 30 charecters");
 return false;
 }
 // Get manufacturing and expiring date
 var proManfacturingDate =document.getElementById("proManfacturingDate").value;
 var proExpireDate = document.getElementById("proExpireDate").value;
 
 // Convert sting date into date formate
 var manfacturingDateObject = new Date(proManfacturingDate);
 var expireDateObject = new Date(proExpireDate); 
 
 if(manfacturingDateObject > expireDateObject){
	 alert("Manfacturing date cannot be greater then expire date");
	 return false;
 }
 return true;
}









