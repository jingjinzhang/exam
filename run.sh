#!/bin/bash

echo "开始运行"
mvn clean package
for i in {1..2}  
do  
    echo "--------------------------------"
    echo "test${i}程序运行结果："
    java -jar ./test${i}/target/test${i}.jar
done
# java -jar ./test1/target/17935test.jar