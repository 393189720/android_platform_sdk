#ʹ����֪#
1.�˿�����������android-query��gson
2.ʹ�÷�����
 1���̳�FMApp,�������aquery�ĳ�ʼ�����ã����ڳ�ʼ���и�cacheAppDir��ֵ��ֵΪӦ�õ��ļ�����Ŀ¼��
 2����������̳�FMHttpRes,
 �������������£�
 public static void xx(xx,xx,xx){
    Bundle bundle = new Bundle();
    bundle.putString("sessionId", sessionId);
    bundle.putString("topicId", topicId);
    callback.url(BASEURL + "UpdateCommentCount.html?" + encodeUrl(bundle)).type(TopicCollectionBean.class)
    .method(AQuery.METHOD_GET).header("accept", "application/json");
    aquery.ajax(callback);
 }
 ����ʹ�÷����ɲ���https://code.google.com/p/android-query/wiki/API
 3��ҳ����̳�FMBaseActivity��FMBaseFragment��Ȼ��ֱ�ӵ���mAQueryʵ�����ɡ���ϸʹ�÷���ͬ������2������ַ�ĵ���
 
3.����˵����
 1�����ڱ������µ�libs�ļ����е�android-support-v4.jar��������ó�ͻ�����⣬��Ҫ�����Լ���Ŀ�е�android-support-v4.jar������Ŀ��