FROM ubuntu:latest
LABEL authors="vijay"

ENTRYPOINT ["top", "-b"]