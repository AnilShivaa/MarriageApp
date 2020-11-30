function vali(frm) {
	//reading form data
	var name=frm.pname.value;
	var age=frm.age.value;
	
	//checking error or not
	var isValid=true;
	
	//validating form
	if(name==""){
		alert("Name is required, please enter");
		frm.pname.focus();
		isValid=false;
	}
	else if(name.length<5){
		alert("Name must have 5 character")
		frm.pname.focus();
		isValid=false;
	}
	
	if(age==""){
		alert("Age is required");
		frm.pname.focus();
		isValid=false;
	}
	else if(isNaN(age)){
		alert("Age is not number");
		frm.pname.focus();
		isValid=false;
	}
	else if(age<1 || age>120){
		alert("enter correct age between 1 to 120");
		frm.pname.focus();
		isValid=false;
	}
	
	return isValid; //true for valid and false for invalid
}


