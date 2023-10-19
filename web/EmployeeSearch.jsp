<%-- 
    Document   : EmployeeSearch
    Created on : Oct 17, 2023, 7:56:50 PM
    Author     : NC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10">
                    <h1 class="">Employee details</h1><br/>
                    <table class="table table-striped table-primary" id="mytable">
                        <tr>
                            <th>Employee ID</th>
                            <th>Employee Number</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Mobile No</th>
                            <th>Email</th>
                            <th>salary(Rs.)</th>
                            <th>Create User Account</th>
                        </tr>
                        <tbody id="tabledata"></tbody>
                    </table>
                </div>
                <div class="col-sm-1"></div>
            </div>

        </div>
    </body>
        <script>
        $(document).ready(function () {
            search();
        });
 
        function search() {
            var xhttp = new XMLHttpRequest();
            xhttp.onload = function () {
                console.log(this.responseText);
                document.getElementById("tabledata").innerHTML = this.responseText;
            }
            xhttp.open("POST", "EmployeeSearch");
            xhttp.send();
        }
    </script>
</html>
