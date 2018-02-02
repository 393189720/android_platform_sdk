#使用须知#
1.此开发包集成了android-query、gson
2.使用方法：
 1）继承FMApp,则完成了aquery的初始化配置，并在初始化中给cacheAppDir赋值，值为应用的文件缓存目录；
 2）网络请求继承FMHttpRes,
 请求代码参照如下：
 public static void xx(xx,xx,xx){
    Bundle bundle = new Bundle();
    bundle.putString("sessionId", sessionId);
    bundle.putString("topicId", topicId);
    callback.url(BASEURL + "UpdateCommentCount.html?" + encodeUrl(bundle)).type(TopicCollectionBean.class)
    .method(AQuery.METHOD_GET).header("accept", "application/json");
    aquery.ajax(callback);
 }
 具体使用方法可参照https://code.google.com/p/android-query/wiki/API
 3）页面请继承FMBaseActivity或FMBaseFragment，然后直接调用mAQuery实例即可。详细使用方法同样参照2）中网址文档。
 
3.问题说明：
 1）关于本工程下的libs文件夹中的android-support-v4.jar会出现引用冲突的问题，需要引用自己项目中的android-support-v4.jar到本项目中