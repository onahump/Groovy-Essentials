String html = """
<html>
    <head>
        <title>Groovy Servlet</title>
    </head>
    <body>
        <p>
Hello, ${request.remoteHost}: ${session.counter}! ${new Date()}
        </p>
    </body>
</html>
"""