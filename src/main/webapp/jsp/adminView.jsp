<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

    <style>
        /* General */
        .btn-project {
            font-family: 'Poppins', sans-serif;
            background: #7386D5;
            color: #fff;
            transition: all 0.3s;
        }

        .btn:hover {
            opacity: 1.5;
        }

        #content {
            width: 100%;
            padding: 20px;
            min-height: 100vh;
            transition: all 0.3s;
        }

        .btn-block {
            background: #7386D5;
        }

        /* General */


        /* Form */
        * {
            box-sizing: border-box;
        }

        input[type=text],
        select,
        textarea {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;
        }

        label {
            padding: 12px 12px 12px 0;
            display: inline-block;
        }

        input[type=submit] {
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        .container {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }

        .col-25 {
            float: left;
            width: 25%;
            margin-top: 6px;
        }

        .col-75 {
            float: left;
            width: 75%;
            margin-top: 6px;
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }

        /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 600px) {

            .col-25,
            .col-75,
            input[type=submit] {
                width: 100%;
                margin-top: 0;
            }
        }

        /* Form */
    </style>



</head>

<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <a class="navbar-brand">StockX</a>
    <form class="form-inline">
        <button type="button" class="btn btn-project" data-toggle="modal" data-target="#logoutModal">Logout</button>

    </form>

</nav>

<body>
    <br>
    <br>
    <div class="container">
        <div class="row" style="background: lavender">
            <span class="border-bottom"></span>
            <div class="col">
                <!-- Fist Column-->
            </div>
            <div class="col-xl-8">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs justify-content-center" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" data-toggle="tab" href="#option1">Import Data</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#option2">Manage Company</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#option3">Manage Exchange</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#option4">Update IPO details</a>
                    </li>
                </ul>
            </div>
            <div class="col">
                <!--side column-->
            </div>
        </div>
    </div>

    <!-- Tab panes -->
    <div class="tab-content">
        <div id="option1" class="container tab-pane active"><br>
            <h3>Import Excel</h3>
            <br>
            <br>
            <p>Select File to be Uploaded</p>
            <form action="">
                <input type="file" name="fileChoose" />

                <input type="submit" value="submit" name="choose" />
            </form>
            <br>
            <br>
            <br>
            <a href="#"><u>Click here to download sample Excel File</u></a>
        </div>
        <div id="option2" class="container tab-pane fade"><br>
            <h3>Manage Company</h3>
            <br>
            <ul class="nav nav-tabs justify-content-center" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="tab" href="#listcompany">Manage Company</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#newcompany">Import Data</a>
                </li>
            </ul>

            <!-- Company Tab panes -->
            <div class="tab-content">
                <div id="listcompany" class="container tab-pane active"><br>
                    <h3>List of companies</h3>
                    <br>
                    <div>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>
                                        <Picture>Pic</Picture>
                                    </th>
                                    <th>Company Name</th>
                                    <th>CEO/BOD</th>
                                    <th>Brief</th>
                                    <th>Edit</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th>
                                        <Picture>Pic</Picture>
                                    </th>
                                    <td>John</td>
                                    <td>Doe</td>
                                    <td>john@example.com</td>
                                    <td>edit</td>
                                </tr>
                                <tr>
                                    <th>
                                        <Picture>Pic</Picture>
                                    </th>
                                    <td>Mary</td>
                                    <td>Moe</td>
                                    <td>mary@example.com</td>
                                    <td>edit</td>
                                </tr>
                                <tr>
                                    <th>
                                        <Picture>Pic</Picture>
                                    </th>
                                    <td>July</td>
                                    <td>Dooley</td>
                                    <td>july@example.com</td>
                                    <td>edit</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div id="newcompany" class="container tab-pane fade"><br>
                    <h3>Create New Company</h3>
                    <br>
                    <div class="container">
                        <form action="/action_page.php">
                            <div class="row">
                                <div class="col-25">
                                    <label for="companyname">Company Name</label>
                                </div>
                                <div class="col-75">
                                    <input type="text" id="companyname" name="companyname" placeholder="Company Name">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-25">
                                    <label for="coe">COE and Board Members</label>
                                </div>
                                <div class="col-75">
                                    <input type="text" id="coe" name="coe" placeholder="COE and Board Members">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-25">
                                    <label for="turnover">Turn Over</label>
                                </div>
                                <div class="col-75">
                                    <input type="text" id="turnover" name="turnover" placeholder="Turn Over">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-25">
                                    <label for="subject">Breif Description</label>
                                </div>
                                <div class="col-75">
                                    <textarea id="subject" name="breif" placeholder="breif"
                                        style="height:200px"></textarea>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-25">
                                    <label for="date">IPO Date</label>
                                </div>
                                <div class="col-75">
                                    <input type="text" id="date" name="date" placeholder="">
                                </div>
                            </div>
                            <div class="row">
                                <input type="submit" class='btn btn-info' value="Save">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div id="option3" class="container tab-pane fade"><br>
            <h3>Manage Exchange</h3>
            <br>
            <!-- Nav tabs -->
            <ul class="nav nav-tabs" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="tab" href="#addStock">Add Stock Details</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#listStock">List Stocks</a>
                </li>
                <!--Exchange Tab Panes-->

                <!-- Tab panes -->
                <div class="tab-content">
                    <div id="addStock" class="container tab-pane active"><br>
                        <h3>Add New Stock Details</h3>
                        <br>
                        <div class="container">
                            <form action="/action_page.php">
                                <div class="row">
                                    <div class="col-25">
                                        <label for="stockname">Stock Name</label>
                                    </div>
                                    <div class="col-75">
                                        <input type="text" id="stockname" name="stockname" placeholder="Stock Name">
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-25">
                                        <label for="address">Contact Address</label>
                                    </div>
                                    <div class="col-75">
                                        <input type="text" id="address" name="address" placeholder="Contact Address">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-25">
                                        <label for="subject">Breif Description</label>
                                    </div>
                                    <div class="col-75">
                                        <textarea id="subject" name="breif" placeholder="breif"
                                            style="height:100px"></textarea>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-25">
                                        <label for="remarks">Remarks</label>
                                    </div>
                                    <div class="col-75">
                                        <textarea id="remarks" name="remarks" placeholder="Remarks"
                                            style="height:100px"></textarea>
                                    </div>
                                </div>
                                <div class="row">
                                    <input type="submit" class='btn btn-info' value="Save">
                                </div>
                            </form>
                        </div>
                    </div>
                    <div id="listStock" class="container tab-pane fade"><br>
                        <h3>List All Stocks</h3>
                        <br>
                        <div>
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>
                                            <Picture>Pic</Picture>
                                        </th>
                                        <th>Company Name</th>
                                        <th>CEO/BOD</th>
                                        <th>Brief</th>
                                        <th>Edit</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th>
                                            <Picture>Pic</Picture>
                                        </th>
                                        <td>John</td>
                                        <td>Doe</td>
                                        <td>john@example.com</td>
                                        <td>edit</td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <Picture>Pic</Picture>
                                        </th>
                                        <td>Mary</td>
                                        <td>Moe</td>
                                        <td>mary@example.com</td>
                                        <td>edit</td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <Picture>Pic</Picture>
                                        </th>
                                        <td>July</td>
                                        <td>Dooley</td>
                                        <td>july@example.com</td>
                                        <td>edit</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!--Exchange Tab Panes-->

            </ul>
        </div>
        <div id="option4" class="container tab-pane fade"><br>
            <h3>Update IPO details</h3>
            <br>
            <br>
            <div class="container">
                <form action="#">
                    <div class="row">
                        <div class="col-25">
                            <label for="companyname">Company Code</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="companyname" name="companyname" placeholder="Company Code">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="stockExchangeName">Stock Exchange Name</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="stockExchangeName" name="stockExchangeName"
                                placeholder="Stock Exchange Name">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="pps">Price per Share</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="pps" name="pps" placeholder="Price">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="totalshare">Total no of Share</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="totalshare" name="totalshare" placeholder="Total Number of Share">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="opendate">Open Date</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="opendate" name="opendate" placeholder="Open Date">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="remarks">Remarks</label>
                        </div>
                        <div class="col-75">
                            <textarea id="remarks" name="remarks" placeholder="Remarks" style="height:200px"></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <input type="submit" class='btn btn-info' value="Update">
                    </div>
                </form>
            </div>
        </div>
    </div>
    </div>


    <!--Logout Modal-->
    <div class="modal fade" id="logoutModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Logout</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <!-- Modal body -->
                <!--Update Modal-->
                <div class="modal-body">
                    <hr>
                    Are you Sure? <br>
                    <hr>
                    <form action="logout" method="post">
                        <input type="submit" name="logout-option" value="Yes" class="btn btn-content btn-block" /> <br>
                    </form>
                </div>
                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
    <!--Logout Modal-->
</body>


</html>