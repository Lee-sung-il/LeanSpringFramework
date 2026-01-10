<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
Welcome to the login page!
<form method="post" action="/login">
    <div class="row align-items-center g-3">

        <!-- Name -->
        <div class="col-md-4 d-flex align-items-center">
            <label for="name" class="me-2 mb-0" style="min-width: 70px;">
                Name
            </label>
            <input
                    type="text"
                    class="form-control"
                    id="name"
                    name="name"
            >
        </div>

        <!-- Password -->
        <div class="col-md-4 d-flex align-items-center">
            <label for="password" class="me-2 mb-0" style="min-width: 90px;">
                Password
            </label>
            <input
                    type="password"
                    class="form-control"
                    id="password"
                    name="password"
            >
        </div>

        <!-- Button -->
        <div class="col-md-4">
            <input type="submit" class="btn btn-primary w-100">
                Submit
            </input>
        </div>

    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>
</body>
</html>