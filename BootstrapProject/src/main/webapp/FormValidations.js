function validateForm()
{
	var proId=document.getElementById("proId").value;
	var proName=document.getElementsById("proName").value;
	var proPrice=document.getElementsById("proPrice").value;
	var proBrand=document.getElementsById("proBrand").value;
	var proMade=document.getElementsById("proMade").value;
	
	if(proId.trim()==="" && proName.trim()==="" && proPrice.trim()==="" && proBrand.trim()==="")
	{
		alert("all fields mus be filled out");
		return false;
	}
	
	if(parseFloat(proPrice)<0)
	{
		alert("product Price must be a non-negative value");
		return false;
	}
	
	if(proName.length > 50 || proBrand.length > 50)
	{
		alert("prduct name and product brand must be less than 50 characters");
		return false;
	}
	
	//get mgf and exp date
	var proMfgDate=document.getElementById("proMfgDate").value;
	var proExpDate=document.getElementById("proExpDate").value;
	
	//convert int data formate
	var manufacturingDateObj=new Date(proMfgDate);
	var expiryDateObj=new Date(proExpDate);
	
	//check the valiadation date
	if(manufacturingDateObj>expiryDateObj)
	{
		alert("manufacturing date cannot br=e greater than expiry date");
		return false;
	}
	
	return true;
}