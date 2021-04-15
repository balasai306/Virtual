
function validate() {
	var name = document.getElementById("name");
	var uname = document.getElementById("uname");
	var pass = document.getElementById("pass");
	var cpass = document.getElementById("cpass");
	var uage = document.getElementById("age");
	
	if (name.value == "") {
		alert("blank name");

		return false;
	} else {
		// console.log(name.length); is used to find lenth of string
		name.style.border = " solid 3px black ";

	}
	if (uname.value == "") {
		uname.style.border = " solid 3px red ";
		alert("blank user name");

		return false;
	}

	if (uname.value != "") {
		uname.style.border = " solid 3px black ";
		var user = uname.value;
		for (let i = 0; i < user.length; i++) { //48,57
			if ((user.charCodeAt(i) >= 48) && (user.charCodeAt(i) <= 57)) {
				uname.style.border = " solid 3px red ";
				alert("no numbers in  user name");
				return false;
			}


		}

	} else {
		// console.log(name.length); is used to find length of string
		uname.style.border = " solid 3px black ";

	}
	
		if (uage.value!=""&&Number.isInteger(parseInt( uage.value))&&((uage.value).length<4)) {
		ageTemp=uage.value;
		    
	         console.log(ageTemp);
	       
		age.style.border = " solid 3px black ";

	} else {
		alert("age should be only numbers and not more than 3 digits");
		age.style.border = " solid 3px red ";

	}

	
	
	if (pass.value == "" || (pass.value).length < 10) {
		alert("password cannot be blank or lessthan 9 charcters");
		pass.style.border = " solid 3px red ";
		return false;
	} else if ((pass.value).length > 9) {
		pass.style.border = " solid 2px black ";

		var validation = /(?=.*[A-Z].*[A-Z])(?=.*[0-9])(?=.*[$%&])(?=.*[a-z])/;

		var valid = validation.test(pass.value);
		
		if (valid == false) {

			alert("Password should two capital letters,one character like $,%,& and one number");
			return false;

		} else {

			pass.style.border = " solid 2px black ";

		}


	}
	
	
	
	if (cpass.value != "" && ((cpass.value).compareTo(pass.value) == 0)) {

		cpass.style.border = " solid 2px black ";

	} else {
		alert("password does not match");
		return false;
	}



	return true;

}


