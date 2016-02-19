<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>后台管理系统</title>
<script type="text/javascript" src="${ctx}/js/data.js?v=1.0"></script>
</head>
<body style="width: 98%">
	<div class="easyui-panel" title="操作面板" style="width: 100%;">
		<a id="saveDataBtn" href="javascript:void(0);" class="easyui-linkbutton">保存数据</a>
	</div>
	<div class="easyui-panel" title="采集面板" style="width: 100%;">
		数据采集地址:<input id="loadDataText" type="text" style="width: 80%;margin-top: 2px;" value="">
		<a id="loadDataBtn" href="javascript:void(0);" class="easyui-linkbutton">采集数据</a>
		<div></div>
		海报采集地址:<input id="vPicPath" style="width: 80%">
		<a id="loadImageBtn" href="javascript:void(0);" class="easyui-linkbutton">采集图片</a>
	</div>
	<div class="easyui-panel" title="人工输入数据面板" style="width: 100%;">
	<table cellpadding="5">
			<tr>
				<td>频道:</td>
				<td><input id="cId" style="width: 100%;"/></td>
				<td>类型:</td>
				<td><input id="tId" style="width: 100%"></td>
				<td>地区:</td>
				<td><input id="aId" style="width: 100%;"/></td>
				<td>年代:</td>
				<td><input id="vYear" class="easyui-textbox" type="text" data-options="required:true"></td>
				<td>关键词:</td>
				<td><input id="vTags" class="easyui-textbox" type="text"></td>
				<td>备注:</td>
				<td><input id="vNote" class="easyui-textbox" type="text"></td>
			</tr>
			<tr>
				<td>是否连载:</td>
				<td>		
					<select class="easyui-combobox" id="vIsUnion" style="width:100%;">
						<option value="0"/>否
						<option value="1"/>是
					</select>
				</td>
				<td>更新周期:</td>
				<td><input id="vCycle"></td>
				<td>版本:</td>
				<td><input id="vVer" class="easyui-textbox" type="text"></td>
				<td>备用说明:</td>
				<td><input id="vRemark" class="easyui-textbox" type="text" style="width: 100%"></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>站内评分:</td>
				<td><input id="vScore" class="easyui-textbox" type="text"></td>
				<td>豆瓣评分:</td>
				<td><input id="vDoubanScore" class="easyui-textbox" type="text"></td>
				<td>时光评分:</td>
				<td><input id="vmTimeScore" class="easyui-textbox" type="text"></td>
				<td>imdb评分:</td>
				<td><input id="vImdbScore" class="easyui-textbox" type="text"></td>
				<td>美团评分:</td>
				<td><input id="vMeituanScore" class="easyui-textbox" type="text"></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
	<div class="easyui-panel" title="基础数据" style="width: 100%;">
	<table cellpadding="5">
		<tr>
			<td>图片地址:</td>
			<td><input id="vPic" class="easyui-textbox" type="text"></td>
			<td>名称:</td>
			<td><input id="vName" class="easyui-textbox" type="text"></td>
			<td>中文拼音:</td>
			<td><input id="vSpell" class="easyui-textbox" type="text"></td>
			<td>首字母:</td>
			<td><input id="vLetter" class="easyui-textbox" type="text"></td>
			<td>别名:</td>
			<td><input id="vNickName" class="easyui-textbox" type="text"></td>
			<td>英文名称:</td>
			<td><input id="vEnName" class="easyui-textbox" type="text"></td>
		</tr>
		<tr>
			<td>出品时间:</td>
			<td><input id="vPublishYear" class="easyui-textbox" type="text"></td>
			<td>出品公司:</td>
			<td><input id="vPublishCompany" class="easyui-textbox" type="text"></td>
			<td>发行公司:</td>
			<td><input id="vShowBox" class="easyui-textbox" type="text"></td>
			<td>制片地区:</td>
			<td><input id="vPublishArea" class="easyui-textbox" type="text"></td>
			<td>拍摄地点:</td>
			<td><input id="vVideoArea" class="easyui-textbox" type="text"></td>
			<td>拍摄日期:</td>
			<td><input id="vVideoTime" class="easyui-textbox" type="text"></td>
		</tr>
		<tr>
			<td>上映时间</td>
			<td><input id="vOnTime" class="easyui-textbox" type="text"></td>
			<td>下映时间</td>
			<td><input id="vOffTime" class="easyui-textbox" type="text"></td>
			<td>导演</td>
			<td><input id="vDirector" class="easyui-textbox" type="text"></td>
			<td>编剧</td>
			<td><input id="vWriter" class="easyui-textbox" type="text"></td>
			<td>制片人</td>
			<td><input id="vProducer" class="easyui-textbox" type="text"></td>
			<td>类型</td>
			<td><input id="vType" class="easyui-textbox" type="text"></td>
		</tr>
		<tr>
			<td>主演:</td>
			<td><input id="vActor" class="easyui-textbox" type="text"></td>
			<td>集数:</td>
			<td><input id="vTotal" class="easyui-textbox" type="text"></td>
			<td>片长:</td>
			<td><input id="vLength" class="easyui-textbox" type="text"></td>
			<td>票房:</td>
			<td><input id="vBoxOffice" class="easyui-textbox" type="text"></td>
			<td>语言:</td>
			<td><input id="vLanguage" class="easyui-textbox" type="text"></td>
			<td>色彩</td>
			<td><input id="vColor" class="easyui-textbox" type="text"></td>
		</tr>
		<tr>
			<td>IMDB编码:</td>
			<td><input id="vImdb" class="easyui-textbox" type="text"></td>
			<td>每集长度:</td>
			<td><input id="vPerLength" class="easyui-textbox" type="text"></td>
			<td>出品人</td>
			<td><input id="vPresenter" class="easyui-textbox" type="text"></td>
			<td>在线播放平台</td>
			<td><input id="vOnlineShow" class="easyui-textbox" type="text"></td>
			<td>播出平台</td>
			<td><input id="vTvShow" class="easyui-textbox" type="text"></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	</div>
	<div class="easyui-panel" title="描述" style="width: 100%;">
		<div>概要描述</div>
		<textarea rows="" cols="" id="vDrama" style="width: 100%"></textarea>
		<div>详细描述</div>
		<!-- 加载编辑器的容器 -->
		<textarea id="container" style="width: 100%;height: 500px;"></textarea>
		<!-- 实例化编辑器 -->
	</div>
</body>
</html>