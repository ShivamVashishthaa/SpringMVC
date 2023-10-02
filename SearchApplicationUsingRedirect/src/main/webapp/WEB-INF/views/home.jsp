<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
  	<div class="container">
  		<div class="card mx-auto mt-5 bg-dark" style="width:50%">
  			<div class="card-body py-5" >
  				<h3 class="text-center text-white text-upper" style="text-transform: uppercase">My Search</h3>
  				<form class = mt-3 action="Search">
  					<div class="form-group">
  						<input type="text" 
  							name="QueryBox" 
  							placeholder="enter your keyword"
  							class="form-control">
  					</div>
  					<div class="container text-center">
  						<button class="btn-btn-outline-light mt-3">Search</button>
  					</div>
  				</form>
  			</div>
  		</div>
  	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>