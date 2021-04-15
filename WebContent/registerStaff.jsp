<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Regestration form</title>
  <link rel="stylesheet" href="style.css">
  
 <!--<script type="text/javascript" src="script.js"></script>  --> 
</head>

<body>
	
	<div>
  <h1 style="text-align: center; font-size: 40px;">Online Registration</h1>
  <br>
 
  <form onsubmit="validate()" action="AdminStaffServlet" id="form" name="Online Registration">

    
    <label>User Name/loginId: </label>
    <br />
    <input type="text" id="uname" name="username"placeholder="enter username " />
    <br />
    <br />
    <label>Password: </label>
    <br />
    <input type="password" name="password"id="pass" placeholder="enter Password" />
    <br />
    <br />
    <label>Confirm Password: </label>
    <br />

    <input type="password" name="cpassword"id="cpass" placeholder="Re-enter password " />
    <br />
    <br />
    
    <label>Name: </label>
    <br />
    <input type="text" name="name" id="name" placeholder="enter  name ">
    <br />
    <br />
    
    <label>Age: </label>
    <br />
    <input type="text" name="age" id="age" placeholder="enter  age ">
    <br />
    <br />
    <label>email: </label>
    <br />
    <input type="text" name="email" id="email" placeholder="enter  email ">
    <br />
    <br />
     <label>Address: </label>
     <br>
     
    <label>House no: </label>
    <br />
    <input type="text" name="houseNum" id="houseNum" placeholder="enter house number ">
    <br />
    <br />
    
      <label>Street: </label>
    <br />
    <input type="text" name="street" id="street" placeholder="enter  street name ">
    <br />
    <br />
    
       <label>City: </label>
    <br />
    <input type="text" name="city" id="city" placeholder="enter  city name ">
    <br />
    <br />
    
       <label>State: </label>
    <br />
    <input type="text" name="state" id="state" placeholder="enter state name ">
    <br />
    <br />
    
       <label>Country: </label>
    <br />
    <input type="text" name="country" id="country" placeholder="enter your country name ">
    <br />
    <br />
    
    
    
  
   
    <br />
    <br />
    <p style="text-align: center">
      <button id="button" onclick="validate()" type="submit" center>Submit Form</button>
      <br />
      <br />
      <button type="reset" id="button">Reset Form</button>
    </p>
    <br />
  </form>
  
   <div style=" margin:10px 5px 5px 5px;text-align:center">
 <button id="class" name="Return" style="width: 150px">
			<a href="admin.jsp" style="text-decoration: none";"color:black">Return</a>
		</button>
		<br>	<br>
		</div>
</body>
<!-- <script src="/Online registrationform/js/jquery.js"></script>
<script>
  $(document).ready(function(){
    function validate() {
    var name = $("#name").val();
    var uname = $("#uname").val();
    var pass = $("#pass").val();
    var cpass = $("#cpass").val();
    var Address = $("#Address").val();
    var radio1 = $("#radio1").val();
    var radio2 = $("#radio2").val();
    var radio3 = $("#radio3").val();
    if (name == "") {
      // alert("blank  name");
      name.style.border = " solid 3px red ";
      return false;
    } else {
      // console.log(name.length); is used to find lenth of string
      name.style.border = " solid 2px black ";

    }
    if (uname == "") {
      uname.style.border = " solid 3px red ";
      alert("blank user name");

      return false;
    }

    if (uname != "") {
      uname.style.border = " solid 2px black ";
      // var user = uname;
      for (let i = 0; i < uname.length; i++) { //48,57
        if ((user.charCodeAt(i) >= 48) && (user.charCodeAt(i) <= 57)) {
          uname.style.border = " solid 3px red ";
          alert("no numbers in  user name");
          return false;
        }


      }

    } else {
      // console.log(name.length); is used to find lenth of string
      name.style.border = " solid 3px black ";
      return true;
    }
    if (pass.val() == "" || (pass.val()).length < 10) {
      alert("password cannot be blank or lessthan 9 charcters");
      pass.style.border = " solid 3px red ";
      return false;
    } else if ((pass).length > 9) {
      pass.style.border = " solid 2px black ";

      var validation = /(?=.*[A-Z].*[A-Z])(?=.*[0-9])(?=.*[$%&])(?=.*[a-z])/;
      //(?=,*[0-9])(?=,*[$%&])(?=,*[a-z])
      var valid = validation.test(pass);
      if (valid == false) {

        alert("Password should two capital letters,one character like $,%,& and one number");
        pass.style.border = " solid 3px red ";
        return false;

      } else {
        name.style.border = " solid 2px black ";


      }


    }
    if (cpass != "" && cpass == pass) {
      name.style.border = " solid 2px black ";
    } else {
      alert("password doesnot match");
      return false;
    }
    if (Address.length > 500) {
      Address.style.border = " solid 3px red ";
      alert("Address cannot be more than 500 charecters");

      return false;
    }
    if (radio1.checked == true) {

    } else if (radio2.checked == true) {
      //do nothing
    } else if (radio3.checked == true) {
      //do nothing
    } else {
      alert("please select the gender")
      return false;
    }
    return true;

  };
  });
  
  
  
</script> -->

</html>