if [ ! -f swagger-codegen.sh ]; then
    echo "Script must be run from root dir of project!"
    exit 1
fi
rm -r clientlib/*
swagger-codegen generate -i http://localhost:8080/v2/api-docs -l java -c swagger-codegen-config.json -o clientlib
