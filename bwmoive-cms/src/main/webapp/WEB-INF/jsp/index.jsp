<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
</script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript">
	
</script>
<html>
<head>
<meta charset="UTF-8">
<title>数据采集</title>
<style type="text/css">
dt, dd {
	margin: 0;
	padding: 0;
}
</style>
</head>
<body>
	
	视频名称:<input type="text" ></br>
	视频类型:
	<input name="vType" type="checkbox" value="checkbox"/>电影
	<input name="vType" type="checkbox" value="checkbox"/>电视剧
	<input name="vType" type="checkbox" value="checkbox"/>动漫
	<input name="vType" type="checkbox" value="checkbox"/>综艺
	<input name="vType" type="checkbox" value="checkbox"/>其他
	<br>
	地区
	<input name="vType" type="checkbox" value="checkbox"/>大陆
	<input name="vType" type="checkbox" value="checkbox"/>港台
	<input name="vType" type="checkbox" value="checkbox"/>欧美
	<input name="vType" type="checkbox" value="checkbox"/>日剧
	<input name="vType" type="checkbox" value="checkbox"/>韩剧
	<input name="vType" type="checkbox" value="checkbox"/>其他
	<br>
	影视类型
	<input name="vType" type="checkbox" value="checkbox"/>喜剧
	<input name="vType" type="checkbox" value="checkbox"/>冒险
	<input name="vType" type="checkbox" value="checkbox"/>幻想
	<input name="vType" type="checkbox" value="checkbox"/>悬念
	<input name="vType" type="checkbox" value="checkbox"/>惊悚
	<input name="vType" type="checkbox" value="checkbox"/>战争
	<input name="vType" type="checkbox" value="checkbox"/>西部
	<input name="vType" type="checkbox" value="checkbox"/>记录
	<input name="vType" type="checkbox" value="checkbox"/>记录
	<input name="vType" type="checkbox" value="checkbox"/>记录
	<input name="vType" type="checkbox" value="checkbox"/>记录
	<input name="vType" type="checkbox" value="checkbox"/>记录
	<br>
	<script type="text/plain" id="desc">
      	详细剧情
    </script>
	<script type="text/javascript">
		var moiveDrama = UE.getEditor('desc', {
			autoClearinitialContent : true, //focus时自动清空初始化时的内容
			wordCount : false, //关闭字数统计
			elementPathEnabled : false,//关闭elementPath
			initialFrameHeight : 310
		});
	</script>
</body>
</html>