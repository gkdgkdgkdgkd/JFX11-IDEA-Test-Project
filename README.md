本项目已携带`jmods`文件，只需安装`JDK11`以上版本，进入`TestJFX`目录，运行：

# Linux
```bash
jlink --module-path jmod/linux:out/production:lib --add-modules TestJFX --output linux
linux/bin/java -m TestJFX/sample.Main
```

# Win
```bash
jlink --module-path "jmod/win;out/production;lib" --add-modules TestJFX --output win
win/bin/java -m TestJFX/sample.Main
```

# Mac
```bash
jlink --module-path jmod/mac:out/production:lib --add-modules TestJFX --output mac
mac/bin/java -m TestJFX/sample.Main
```

若出现以下问题，把对应的目录直接删除即可。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200531031401656.png)

[参考博客](https://blog.csdn.net/qq_27525611/article/details/106444423)
