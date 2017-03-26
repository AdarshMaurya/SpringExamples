<!DOCTYPE html>
<html lang="en">
<head>
<title>Barclays IB QA Dashboard</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 550px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

/* On small screens, set height to 'auto' for the grid */
@media screen and (max-width: 767px) {
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse visible-xs">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">Barclays IB QA</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="/">Home</a></li>
					<li class="active"><a href="/dashboard">Dashboard</a></li>
					<li><a href="/milestone">2017 Milestones</a></li>
					<li><a href="/all-project">Projects</a></li>
					<li><a href="/qa_team">QA Team</a></li>
					<li><a href="/inbuilt_tools">Inbuilt Tools</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav hidden-xs">
				<h2>Barclays IB QA</h2>
				<ul class="nav nav-pills nav-stacked">
					<li><a href="/">Home</a></li>
					<li class="active"><a href="/dashboard">Dashboard</a></li>
					<li><a href="/milestone">2017 Milestones</a></li>
					<li><a href="/all-project">Projects</a></li>
					<li><a href="/qa_team">QA Team</a></li>
					<li><a href="/inbuilt_tools">Inbuilt Tools</a></li>
				</ul>
				<br>
			</div>
			<br>

			<div class="col-sm-9">
				<div class="well">
					<h4>Defect Dashboard</h4>
					<p>Table- Different Project Monthly Summary comes here: Sample
						below</p>
					<table border="1">
						<thead>
							<td>Project</td>
							<td>Servity1</td>
							<td>Servity2</td>
							<td>Servity3</td>
						</thead>
						<tr>
							<td>Web Portal</td>
							<td>2</td>
							<td>1</td>
							<td>0</td>
						</tr>

						<tr>
							<td>Banking</td>
							<td>4</td>
							<td>2</td>
							<td>5</td>
						</tr>

						<tr>
							<td>Sales</td>
							<td>3</td>
							<td>2</td>
							<td>4</td>
						</tr>

					</table>

				</div>

				<div class="row">
					<div class="col-sm-3">
						<div class="well">
							<h4>WPS</h4>
							<p>WPS details comes below: Sample</p>
							<table border="1">
								<thead>
									<td>Area</td>
									<td>Stakeholder Name</td>
									<td>Release Name</td>
								</thead>
								<tr>
									<td>WPS</td>
									<td>Reena</td>
									<td>QA186</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<h4>WPS</h4>
							<p>WPS details comes below: Sample</p>
							<table border="1">
								<thead>
									<td>Area</td>
									<td>Stakeholder Name</td>
									<td>Release Name</td>
								</thead>
								<tr>
									<td>WPS</td>
									<td>Reena</td>
									<td>QA186</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<h4>Banking</h4>
							<p>Banking details comes below: Sample</p>
							<table border="1">
								<thead>
									<td>Area</td>
									<td>Stakeholder Name</td>
									<td>Release Name</td>
								</thead>
								<tr>
									<td>Banking</td>
									<td>Jas</td>
									<td>Prod#56</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<h4>Sales</h4>
							<p>Sales details comes below: Sample</p>
							<table border="1">
								<thead>
									<td>Area</td>
									<td>Stakeholder Name</td>
									<td>Release Name</td>
								</thead>
								<tr>
									<td>Sales</td>
									<td>Sophie</td>
									<td>Stage#186</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<div class="well">
							<p>Text</p>
							<p>Text</p>
							<p>Text</p>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="well">
							<p>Text</p>
							<p>Text</p>
							<p>Text</p>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="well">
							<p>Text</p>
							<p>Text</p>
							<p>Text</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-8">
						<div class="well">
							<p>Text</p>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="well">
							<p>Text</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
