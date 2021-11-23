# Android_Componentization_Study  2021/07/31

1.拆分功能，统一配置build.gradle
2.各个module配置AndroidManifest.xml  （注意资源文件重名问题）
3.各个module跳转传值及分组件开发编译  （大多推荐https://github.com/alibaba/ARouter）

参考
https://www.jianshu.com/p/ed845d796710
https://www.jianshu.com/p/748bf621a9a0

2021-11-23  
ps：每一个子module需要添加annotationProcessor 'com.alibaba:arouter-compiler:?'
    kotlin 需要额外配置， Kotlin configuration reference 'Other#2'
    ARoute的初始化与销毁都在Application中执行