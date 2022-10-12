#!/usr/bin/env bash

PREFIX=harbor.onedev.neustar.biz/cs-loms-nonprod
NAME=notification-service:1
IMAGE_NAME=$PREFIX/$NAME


mvn -DskipTests clean package

#docker login harbor.onedev.neustar.biz OR docker login harbor.onedev.neustar.biz -u robot$cs-loms-nonprod+coms-loms-nt -p eo2QAD2XndmQd5xcRJ5FxaKk9A3xChZa

docker build -t $IMAGE_NAME .

docker push $IMAGE_NAME

docker run -p 8080:8080 -e SERVER_PORT=8080 $IMAGE_NAME