<%-- 
    Document   : CreateUser
    Created on : Oct 17, 2023, 9:12:28 PM
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

        <%-- Display the employeeno parameter --%>
        <!--<p>Employee Number: ${param.employeeID}</p>-->
        <div class="container">
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <h1>Create User</h1><br/>
                    <div class="form-group">
                        <label>Employee ID</label>
                        <input type="text" class="form-control" id="empid" readonly>
                    </div>

                    <div class="form-group">
                        <label>User Name</label>
                        <input type="text" class="form-control" id="username" placeholder="User name Here">
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="text" class="form-control" id="password" placeholder="Password Here">
                    </div>
                    <div class="form-group">
                        <label>Department Status</label>
                        <select id="status" class="form-control">
                            <option value="1">Active</option>
                            <option value="0">Inactive</option>
                        </select>
                    </div>
                    <br>
                    <div class="form-group">
                        <button class="btn btn-primary btn-block" onclick="saveData()">Save System User</button>
                    </div>

                </div>
                <div class="col-sm-3"></div>
            </div>
        </div>


        <div class="container">

            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">System User Saving</h4>
                        </div>
                        <div class="modal-body">
                            <p>System User Save Complete.</p>
                        </div>
                        <!--                        <div class="modal-footer">
                                                    <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
                                                </div>-->
                        <div class="modal-footer">
                            <button type="button" class="btn btn-success" data-dismiss="modal" onclick="goToEmployeeSearch()">Close</button>
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </body>
    <script>
        // Set the Employee ID value
        var employeeID = "${param.employeeID}";
        document.getElementById("empid").value = employeeID;

        function saveData() {
            var empid = document.getElementById('empid').value;
            var username = document.getElementById('username').value;
            var password = document.getElementById('password').value;
            var status = document.getElementById('status').value;

            if (empid !== "" && username !== "" && password !== "" & status !== "") {
                var xhttp = new XMLHttpRequest();
                xhttp.onload = function () {
                    $('#myModal').modal('toggle');
                    $("input:text").val("");
                }
                xhttp.open("POST", "CreateSystemUser?empid=" + empid + "&username=" + username + "&password=" + password + "&status=" + status);
                xhttp.send();
            } else {
                alert("Please enter all data.");
            }

        }

        // Function to navigate to EmployeeSearch.jsp
        function goToEmployeeSearch() {
            window.location.href = "EmployeeSearch.jsp";
        }


    </script>

</html>
