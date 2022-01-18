# 日志冲突处理

[参考](https://juejin.cn/post/6945220055399399455)

## 门面/抽象

- slf4j: simple logging facade for java
- jcl: apache commons logging
- jboss-logging: xxx

## 实现

- log4j
- log4j2
- logback
- jul

## 直接实现

### log4j

log4j-$version.jar

org.apache.log4j.Logger

properties配置

### log4j2

log4j-api-$version.jar

log4j-core-$version.jar(包含了api)

org.apache.logging.log4j.Logger

xml/yaml配置

## sl4fj通用实现

引入抽象/门面(通用):slf4j-api,另添加具体实现(桥接)

### log4j

slf4j-log4j12(包含了log4j)

### log4j2

log4j-slf4j-impl(包含了log4j-core(包含了log4j-api))

### simple

slf4j-simple

### jdk

桥接: slf4j-jdk14

### logback

logback-classic

## 实践

### 推荐: slf4j + logback/log4j2

### slf4j的具体实现

#### slf4j-$impl

slf4j-log4j12

slf4j-simple

slf4j-jdk14

#### 此外

log4j-slf4j-impl

logback-classic

### a-to-b: 将a的实现替换为b

log4j-to-slf4j: 将log4j的实现替换为slf4j的(具体)实现

### a-over-b: 将a抽象适配(复制接口)为b -> 代码中的依赖不被破坏

如:log4j-over-slf4j,原有代码中依赖log4j,将其转为slf4j实现

