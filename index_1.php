<?php
    function My_login($username,$password)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command = "SELECT user_name, depression, phone, others_phone FROM tb_users WHERE user_name='{$username}' and password='{$password}'";
        $result = $con_db->query($sql_command);
        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $username = $row['user_name'];
            $depression = $row['depression'];
            $phone = $row['phone'];
            $others_phone = $row['others_phone'];
            echo 'user_name:' . $username . ';Sometimes pessimistic:' . $depression . ';phone:' . $phone . ';others_phone:' . $others_phone;
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_regestration($username,$password)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command1 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command1);
        if ($result->num_rows > 0) {
            echo 'Failed: Username exist.';
        } else {
            $sql_command2 = "INSERT INTO tb_Users(user_name, password) VALUES('{$username}', '{$password}')";
            $con_db->query($sql_command2);
            echo "Succeed.";
        }
        $con_db->close();
    }
    function My_sharediary($category,$diary_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command = "INSERT INTO tb_News(category,URL) VALUES('{$category}','{$diary_text}')";
        $con_db->query($sql_command);
        echo "Succeed";
        $con_db->close();
    }
    function My_search_diary($search_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command10 = "SELECT URL FROM tb_News WHERE category='{$search_text}'";
        $result = $con_db->query($sql_command10);
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()){
                echo  $row['URL'] . ";" ;
                echo "/n";
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_search_story($search_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command10 = "SELECT URL FROM tb_News WHERE category='{$search_text}'";
        $result = $con_db->query($sql_command10);
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()){
                echo  $row['URL'] . ";" ;
                echo "/n";
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_search_question($search_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command10 = "SELECT URL FROM tb_News WHERE category='{$search_text}'";
        $result = $con_db->query($sql_command10);
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()){
                echo  $row['URL'] . ";" ;
                echo "/n";
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_search_key($search_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command10 = "SELECT URL FROM tb_News WHERE URL LIKE '%{$search_text}%'";
        $result = $con_db->query($sql_command10);
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()){
                echo  $row['URL'] . ";" ;
                echo "/n";
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_configration($username,$depression,$phone,$othersphone)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command3 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command3);
        if ($result->num_rows > 0) {
            $sql_command4 = "Update tb_Users SET depression='{$depression}', phone='{$phone}', others_phone='{$othersphone}' WHERE user_name='{$username}'";
            $con_db->query($sql_command4);
            echo "Succeed.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    function My_diary1($username)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command = "SELECT diary1 FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command);
        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $diary = $row['diary1'];

            echo $diary ;
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_diary2($username)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command = "SELECT diary2 FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command);
        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $diary = $row['diary2'];
            
            echo $diary ;
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_diary3($username)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command = "SELECT diary3 FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command);
        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $diary = $row['diary3'];
            
            echo $diary ;
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_diary4($username)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command = "SELECT diary4 FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command);
        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $diary = $row['diary4'];
            
            echo $diary ;
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    function My_diary1_edit($username,$diary_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command3 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command3);
        if ($result->num_rows > 0) {
            $sql_command4 = "Update tb_Users SET diary1='{$diary_text}' WHERE user_name='{$username}'";
            $con_db->query($sql_command4);
            echo "Succeed.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    function My_diary2_edit($username,$diary_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command3 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command3);
        if ($result->num_rows > 0) {
            $sql_command4 = "Update tb_Users SET diary2='{$diary_text}' WHERE user_name='{$username}'";
            $con_db->query($sql_command4);
            echo "Succeed.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    function My_diary3_edit($username,$diary_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command3 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command3);
        if ($result->num_rows > 0) {
            $sql_command4 = "Update tb_Users SET diary3='{$diary_text}' WHERE user_name='{$username}'";
            $con_db->query($sql_command4);
            echo "Succeed.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    function My_diary4_edit($username,$diary_text)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command3 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command3);
        if ($result->num_rows > 0) {
            $sql_command4 = "Update tb_Users SET diary4='{$diary_text}' WHERE user_name='{$username}'";
            $con_db->query($sql_command4);
            echo "Succeed.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    function My_findfriendfuction($friend)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command5 = "SELECT tb_users.full_name,tb_users.online,tb_location.building,tb_location.floor FROM tb_users LEFT JOIN tb_location ON tb_users.connected_mac=tb_location.mac WHERE tb_users.full_name  LIKE '{$friend}%'";
        $result = $con_db->query($sql_command5);
        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $fullnameField = $row['full_name'];
            $timeField = $row['online'];
            $buildingField = $row['building'];
            $floorField = $row['floor'];
            echo 'fulltime:' . $fullnameField . ';time:' . $timeField . ';building:' . $buildingField . ';floor:' . $floorField;
        }else {
            echo 'Failed';
        }
        $con_db->close();
    }
    
    function My_nowtime($username,$nowtime)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command6 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command6);
        if ($result->num_rows > 0) {
            $sql_command7 = "Update tb_Users SET online='{$nowtime}' WHERE user_name='{$username}'";
            $con_db->query($sql_command7);
            echo "Succeed update nowtime.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    
    function My_localaddress($username,$local_mac)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command8 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command8);
        if ($result->num_rows > 0) {
            $sql_command9 = "Update tb_Users SET connected_mac='{$local_mac}' WHERE user_name='{$username}'";
            $con_db->query($sql_command9);
            echo "Succeed update nowtime.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    
    
    function My_score($username,$score)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command8 = "SELECT user_name FROM tb_users WHERE user_name='{$username}'";
        $result = $con_db->query($sql_command8);
        if ($result->num_rows > 0) {
            $sql_command9 = "Update tb_Users SET degree='{$score}' WHERE user_name='{$username}'";
            $con_db->query($sql_command9);
            echo "Succeed update nowscore.";
        }else {
            echo 'Failed: No value.';
        }
        $con_db->close();
    }
    
    function My_interest($myinterest)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command10 = "SELECT URL FROM tb_News WHERE category='{$myinterest}'";
        $result = $con_db->query($sql_command10);
        if ($result->num_rows > 0) {
            echo $myinterest . ":";
            while ($row = $result->fetch_assoc()){
                echo  $row['URL'] . ";" ;
                echo "\n";
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();
    }
    
    function My_fr($name,$feature)
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command11 = "INSERT INTO tb_face(P_Name,P_Feature) VALUES('{$name}','{$feature}')";
        $con_db->query($sql_command11);
        echo "Succeed";
        $con_db->close();
    }
    
    function My_fr_getallname()
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command12 = "SELECT P_Name FROM tb_face";
        $result = $con_db->query($sql_command12);
        if ($result->num_rows > 0) {
            //echo $myinterest . ":";
            while ($row = $result->fetch_assoc()){
                echo  $row['P_Name'] . ";" ;
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();
        
    }
    
    function My_fr_getallfeature()
    {
        $con_db = new mysqli("localhost", "root", "root", "hw1_db");
        if ($con_db->connect_error) {
            echo "Failed to connect to MySQL: " . $con_db->connect_error;
        }
        $sql_command13 = "SELECT P_Feature FROM tb_face";
        $result = $con_db->query($sql_command13);
        if ($result->num_rows > 0) {
            //echo $myinterest . ":";
            while ($row = $result->fetch_assoc()){

                echo  $row['P_Feature'] . ";" ;
            }
        } else {
            echo 'Failed';
        }
        $con_db->close();

    }
    
    $method=$_POST['method'];
    switch($method){
        case 'login':
            $username=$_POST['username'];
            $password=$_POST['password'];
            My_login($username,$password);
            break;
        case 'register':
            $username=$_POST['username'];
            $password=$_POST['password'];
            My_regestration($username,$password);
            break;
        case 'configration':
            $username=$_POST['username'];
            $depression=$_POST['depression'];
            $phone=$_POST['phone'];
            $othersphone=$_POST['othersphone'];
            My_configration($username,$depression,$phone,$othersphone);
            break;
        case 'findfriend':
            $friend=$_POST['friend'];
            My_findfriendfuction($friend);
            break;
        case 'nowtime':
            $username=$_POST['username'];
            $nowtime=$_POST['nowtime'];
            My_nowtime($username,$nowtime);
            break;
        case 'local_address':
            $username=$_POST['username'];
            $local_mac=$_POST['local_mac'];
            My_localaddress($username,$local_mac);
            break;
        case 'get_diary1':
            $username=$_POST['username'];
            My_diary1($username);
            break;
        case 'get_diary2':
            $username=$_POST['username'];
            My_diary2($username);
            break;
        case 'get_diary3':
            $username=$_POST['username'];
            My_diary3($username);
            break;
        case 'get_diary4':
            $username=$_POST['username'];
            My_diary4($username);
            break;
        case 'edit_diary1':
            $username=$_POST['username'];
            $diary_text=$_POST['diary_text'];
            My_diary1_edit($username,$diary_text);
            break;
        case 'edit_diary2':
            $username=$_POST['username'];
            $diary_text=$_POST['diary_text'];
            My_diary2_edit($username,$diary_text);
            break;
        case 'edit_diary3':
            $username=$_POST['username'];
            $diary_text=$_POST['diary_text'];
            My_diary3_edit($username,$diary_text);
            break;
        case 'edit_diary4':
            $username=$_POST['username'];
            $diary_text=$_POST['diary_text'];
            My_diary4_edit($username,$diary_text);
            break;
        case 'fr':
            $name=$_POST['name'];
            $feature=$_POST['feature'];
            My_fr($name,$feature);
            break;
        case 'fr_getallname':
            My_fr_getallname();
            break;
        case 'fr_getallfeature':
            My_fr_getallfeature();
            break;
        case 'share_diary':
            $category=$_POST['catogary'];
            $diary_text=$_POST['diary_text'];
            My_sharediary($category,$diary_text);
            break;
        case 'search_diary':
            $search_text=$_POST['search_text'];
            My_search_diary($search_text);
            break;
        case 'search_story':
            $search_text=$_POST['search_text'];
            My_search_story($search_text);
            break;
        case 'search_question':
            $search_text=$_POST['search_text'];
            My_search_question($search_text);
            break;
        case 'search_key':
            $search_text=$_POST['search_text'];
            My_search_key($search_text);
            break;
        case 'test':
            $username=$_POST['username'];
            $score=$_POST['score'];
            My_score($username,$score);
            break;
        default:
            break;
    }
    ?>
