一个组件的编写，里面主要是学习使用的组件，这个组件是文件上传下载的使用

原理很简单，
    applicationContext-mvc.xml中配置文件上传解析器
    在FileUpLoadController中配置相关接收文件
    <input type="file" name="upload" /> 上传中的名字要跟Controller中接收的一致
