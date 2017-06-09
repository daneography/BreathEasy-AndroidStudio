<?php
    $con = mysqli_connect("breatheasy.000webhostapp.com", "id1922525_breatheasy", "ARTlab2017", "id1922525_breatheasy");
    
    $name = $_POST["name"];
    $patientNumber = $_POST["patientNumber"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, patientNumber, password) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "ssis", $name, $username, $patientNumber, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>