#指定基础镜像
FROM java:8

#添加jar包到容器
ADD springboot-demo1-0.0.1-SNAPSHOT.jar /app.jar

#声明容器暴露端口
EXPOSE 8080

#容器启动后，要执行的指令
CMD ["java","-jar","/app.jar"]