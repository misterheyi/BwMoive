<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>后台管理系统</title>
<script type="text/javascript" src="${ctx}/js/data.js"></script>
</head>
<body>
	<div class="easyui-panel" title="操作面板" style="">
		<input id="loadDataText" type="text" style="width: 100%" value="">
		<div></div>
		<a id="loadDataBtn" href="javascript:void(0);" class="easyui-linkbutton">采集数据</a>
		<a id="saveDataBtn" href="javascript:void(0);" class="easyui-linkbutton">保存数据</a>
	</div>
	<div class="easyui-panel" title="数据面板" style="">
		海报地址
		<input id="vPicPath" style="width: 30%">
		<a id="loadImageBtn" href="javascript:void(0);" class="easyui-linkbutton">采集图片</a>
		<input id="vPic" style="width: 30%">
		<div></div>
		类型
		<select class="easyui-combobox" id="tId" style="width:100px;">
			<c:forEach items="${typeTreeList}" var="typeTree">
				<option value="${typeTree.tId}"/>${typeTree.tName}
				<c:forEach items="${typeTree.subType}" var="type">
					<option value="${type.tId}"/>--${type.tName}
				</c:forEach>
			</c:forEach>	
		</select>
		地区
		<select class="easyui-combobox" id="aId" style="width:100px;">
			<c:forEach items="${areaList}" var="area">
				<option value="${area.aId}"/>${area.aName}
			</c:forEach>
		</select>
		年代
		<input id="vYear" class="easyui-textbox" type="text">
		备注
		<input id="vNote" class="easyui-textbox" type="text">
		关键词
		<input id="vTags" class="easyui-textbox" type="text">
		是否连载
		<select class="easyui-combobox" id="vIsUnion" style="width:100px;">
			<option value="0"/>否
			<option value="1"/>是
		</select>
		更新周期
		<input id="vCycle">
		版本
		<input id="vVer" class="easyui-textbox" type="text">
		<div></div>
		备用说明<input id="vRemark" class="easyui-textbox" type="text" style="width: 50%">
		<div></div>
		站内评分<input id="vScore" class="easyui-textbox" type="text">
		豆瓣评分<input id="vDoubanScore" class="easyui-textbox" type="text">
		时光评分<input id="vmTimeScore" class="easyui-textbox" type="text">
		imdb评分<input id="vImdbScore" class="easyui-textbox" type="text">
		美团评分<input id="vMeituanScore" class="easyui-textbox" type="text">
	</div>
	<div class="easyui-panel" title="基础数据" style="">
		名称<input id="vName" class="easyui-textbox" type="text">
		中文拼音<input id="vSpell" class="easyui-textbox" type="text">
		首字母<input id="vLetter" class="easyui-textbox" type="text">
		别名<input id="vNickName" class="easyui-textbox" type="text">
		英文名称<input id="vEnName" class="easyui-textbox" type="text">
		出品时间<input id="vPublishYear" class="easyui-textbox" type="text">
		出品公司<input id="vPublishCompany" class="easyui-textbox" type="text">
		发行公司<input id="vShowBox" class="easyui-textbox" type="text">
		<div></div>
		制片地区<input id="vPublishArea" class="easyui-textbox" type="text">
		拍摄地点<input id="vVideoArea" class="easyui-textbox" type="text">
		拍摄日期<input id="vVideoTime" class="easyui-textbox" type="text">
		首播时间，上映时间<input id="vOnTime" class="easyui-textbox" type="text">
		下映时间<input id="vOffTime" class="easyui-textbox" type="text">
		导演<input id="vDirector" class="easyui-textbox" type="text">
		编剧<input id="vWriter" class="easyui-textbox" type="text">
		制片人<input id="vProducer" class="easyui-textbox" type="text">
		<div></div>
		类型<input id="vType" class="easyui-textbox" type="text">
		主演<input id="vActor" class="easyui-textbox" type="text">
		集数<input id="vTotal" class="easyui-textbox" type="text">
		片长<input id="vLength" class="easyui-textbox" type="text">
		票房<input id="vBoxOffice" class="easyui-textbox" type="text">
		语言<input id="vLanguage" class="easyui-textbox" type="text">
		色彩<input id="vColor" class="easyui-textbox" type="text">
		imdb编码<input id="vImdb" class="easyui-textbox" type="text">
		<div></div>
		每集长度<input id="vPerLength" class="easyui-textbox" type="text">
		出品人<input id="vPresenter" class="easyui-textbox" type="text">
		在线播放平台<input id="vOnlineShow" class="easyui-textbox" type="text">
		播出平台<input id="vTvShow" class="easyui-textbox" type="text">
		<div></div>
	</div>
	<div class="easyui-panel" title="描述" style="">
		概要描述
		<div></div>
		<textarea rows="" cols="" id="vDrama" style="width: 100%;"></textarea>
		详细描述
		<div></div>
		<!-- 加载编辑器的容器 -->
		<script id="container" name="container" type="text/plain"></script>
		<!-- 实例化编辑器 -->
	</div>
</body>
</html>