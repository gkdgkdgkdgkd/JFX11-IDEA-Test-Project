本项目已携带jmods文件，只需要在对应的平台运行以下命令即可：

# linux
```bash
jlink --module-path jmod/linux:out/production:lib --add-modules TestJFX --output linux
linux/bin/java -m TestJFX/sample.Main
```

# win
```bash
jlink --module-path "jmod/win;out/production;lib" --add-modules TestJFX --output win
win/bin/java -m TestJFX/sample.Main
```

# mac
```bash
jlink --module-path jmod/mac:out/production:lib --add-modules TestJFX --output mac
mac/bin/java -m TestJFX/sample.Main
```

若出现以下问题，把对应的目录直接删除即可。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200531031401656.png)

附博客：
https://www.cnblogs.com/6b7b5fc3/p/12995609.html
