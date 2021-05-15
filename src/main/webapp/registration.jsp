<%-- 
    Document   : registration
    Created on : May 9, 2021, 6:3:31 PM
    Author     : Rhume
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--=========================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--=================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--=================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--=======================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--=====================================================-->
    </head>
    <body>
        
        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100 p-t-25 p-b-10">
                    <form class="login100-form validate-form" method="POST" action="RegistrationControl">
                        <span class="login100-form-title p-b-10">
                            Welcome
                        </span>
                        
                        <div class="wrap-input100 validate-input m-t-35 m-b-20" data-validate = "Enter email">
                            <input class="input100" type="email" name="email">
                            <span class="focus-input100" data-placeholder="Email Address"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-20" data-validate="Enter password">
                            <input class="input100" type="password" name="password">
                            <span class="focus-input100" data-placeholder="Password"></span>
                        </div>
                        
                        <div class="wrap-input100 validate-input m-b-20" data-validate="Confirm password">
                            <input class="input100" type="password" name="confirmPassword">
                            <span class="focus-input100" data-placeholder="Confirm Password"></span>
                        </div>
                        
                        <div class="wrap-input100 validate-input m-b-20" data-validate="Enter First Name">
                            <input class="input100" type="text" name="firstName">
                            <span class="focus-input100" data-placeholder="First Name"></span>
                        </div>
                        
                        <div class="wrap-input100 validate-input m-b-20" data-validate="Enter Last Name">
                            <input class="input100" type="text" name="lastName">
                            <span class="focus-input100" data-placeholder="Last Name"></span>
                        </div>
                        
                        <div class="wrap-input100 validate-input m-b-20" data-validate="Enter Phone Number">
                            <input class="input100" type="text" name="phoneNumber">
                            <span class="focus-input100" data-placeholder="Phone Number"></span>
                        </div>
                        
                        <div class="container-login100-form-btn">
                            <div class="login100-form-btn">
                                <input type="submit" data-placeholder="Register" name="registerBtn" />
                            </div>
                            
                            <!--
                            <button class="login100-form-btn" name="loginBtn">
                                Login
                            </button>
                            -->
                        </div>

                    </form>
                </div>
            </div>
        </div>


        <div id="dropDownSelect1"></div>

        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/daterangepicker/moment.min.js"></script>
        <script src="vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>

        
    </body>
</html>
