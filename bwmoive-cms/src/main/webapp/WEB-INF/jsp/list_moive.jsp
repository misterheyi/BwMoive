<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<script type="text/javascript" charset="utf-8" src="<%=basePath%>js/moive/listMoive.js"> </script>
<div class="easyui-layout" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'搜索条件',iconCls:'icon-ok'"
		style="height:150px">
		<form id="queryForm" style="margin:10;text-align: center;">
			<table width="100%">
				<tr>
					<td>影视名称：<input name="moiveSearchName" style="width: 200">
					</td>
				</tr>
				<tr>
					<td>类型： <select class="easyui-combobox" name="moiveSearchType"
						style="width:200px;">
							<option value="1">电视剧</option>
							<option value="2">电影</option>
							<option value="3">综艺</option>
							<option value="4">动漫</option>
							<option value="5">其他</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>状态： <select class="easyui-combobox"
						name="moiveSearchStatus" style="width:200px;">
							<option value="1">显示</option>
							<option value="2">隐藏</option>
							<option value="3">下线</option>
							<option value="3">删除</option>
					</select>
					</td>
				</tr>
				<tr>
					<td><a href="#" id="searchMoiveBtn" class="easyui-linkbutton"
						iconCls="icon-search">检索</a></td>
				</tr>
			</table>
		</form>
	</div>
	<div data-options="region:'center',title:'结果集',iconCls:'icon-ok'">
		<table id="dg" data-options="border:false"></table>
	</div>
		<div id="w" class="easyui-window" title="Modal Window"
		data-options="modal:true,closed:true,iconCls:'icon-save'"
		style="width:900px;height:600px;padding:10px;">
		<div class="easyui-tabs"
			data-options="tabWidth:112,fit:true,tools:'#tab-tools'">
			<div title="基本信息" style="padding:10px">
				抓取基本信息百度百科地址：<input id="loadBaiduBaikeAddr" class="easyui-textbox"
					style="width: 500">
				<button id="getMoiveBasicInfo">获取参数</button>
				<br> 海报图地址：<input id="loadPosterAddr" class="easyui-textbox"
					style="width: 500">
				<button id="getMoivePosterBtn">下载图片</button>
				<br> ID：<input id="moiveId" class="easyui-textbox"
					style="width: 200"> 海报地址：<input id="moivePosterRef"
					class="easyui-textbox" style="width: 200"> 中文名：<input
					id="moiveCName" class="easyui-textbox" style="width: 200">
				<br> 电影类型：<input id="moiveType" class="easyui-textbox"
					style="width: 200"> 英文名：<input id="moiveEName"
					class="easyui-textbox" style="width: 200"> 主演：<input
					id="moiveActor" class="easyui-textbox" style="width: 200">
				<br> 出品时间：<input id="moiveProduceTime" class="easyui-textbox"
					style="width: 200"> 片长：<input id="moivePlayTime"
					class="easyui-textbox" style="width: 200"> 出品公司：<input
					id="moiveProduceCompany" class="easyui-textbox" style="width: 200">
				<br> 上映时间：<input id="moiveShowTime" class="easyui-textbox"
					style="width: 200"> 下映时间：<input id="moiveReflectTime"
					class="easyui-textbox" style="width: 200"> 发行公司：<input
					id="moiveReleaseCompany" class="easyui-textbox" style="width: 200">
				<br> 对白语言：<input id="moiveLaguage" class="easyui-textbox"
					style="width: 200"> 制片地区：<input id="moiveMakingLocation"
					class="easyui-textbox" style="width: 200"> 导演：<input
					id="moiveDirector" class="easyui-textbox" style="width: 200">
				<br> 出品人：<input id="moiveProducer" class="easyui-textbox"
					style="width: 200"> 等级：<input id="moiveLevel"
					class="easyui-textbox" style="width: 200"> 分类：<select
					id="moiveClass"><option value="1">电视剧</option>
					<option value="2">电影</option>
					<option value="3">综艺</option>
					<option value="4">动漫</option>
					<option value="5">其他</option>
				</select> <br> 总集数：<input id="moiveEpisode" class="easyui-textbox"
					style="width: 200"> 当前更新集数：<input id="moiveUpdateEpisode"
					class="easyui-textbox" style="width: 200"> 是否推荐：<input
					id="moiveIsRecommend" class="easyui-textbox" style="width: 200">
				<br> 概要剧情：<input id="moiveShortDrama" class="easyui-textbox"
					style="width: 200"> 标签：<input id="moiveTag"
					class="easyui-textbox" style="width: 200"> <br>
			</div>
			<div title="下载链接" style="padding:10px">
				抓取下载地址： <input id="loadDownloadLinkAddr" class="easyui-textbox"
					style="width: 500">
				<button id="getDownLoadLinkBtn">获取参数</button>
				<br> 地址:<br>
				<textarea id="downloadLinkText" style="width: 100%;height: 92%"></textarea>
			</div>
			<div title="描述详情" style="padding:10px">
				<script type="text/plain" id="moiveDrama">
       			详细剧情
    		</script>
				<script type="text/javascript">
					var moiveDrama = UE.getEditor('moiveDrama', {
		        autoClearinitialContent:true, //focus时自动清空初始化时的内容
		        wordCount:false, //关闭字数统计
		        elementPathEnabled:false,//关闭elementPath
		        initialFrameHeight: 310
		    });
				</script>
			</div>
		</div>
		<div id="tab-tools">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-save'" id="saveMoiveInfo"></a>
		</div>
	</div>
</div>