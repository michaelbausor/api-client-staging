FROM googleapis/artman:latest

ADD app /app

ENTRYPOINT ["/app/bin/regenerate"]
