<?php
function saveOncologyReport($patientId, $diagnosis, $isMalignant) {
    // Connect to secure medical database
    $db = mysqli_connect("localhost", "med_user", "secure_pass", "hospital_db");
    
    $status = $isMalignant ? 'Malignant' : 'Benign';
    
    $query = "INSERT INTO cancer_reports (patient_id, diagnosis, status) 
              VALUES ($patientId, '$diagnosis', '$status')";
              
    return mysqli_query($db, $query);
}
?>
