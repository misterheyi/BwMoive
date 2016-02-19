<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>视频管理</title>
<script type="text/javascript" src="${ctx}/js/datamanager.js?v=1.0"></script>
</head>
<body>
		<table id="dg"></table>
		<div id="tb" style="padding:5px;height:auto">  
        		<div style="margin-bottom:5px">  
        			<a id="linkManager" href="javascript:void(0);" class="easyui-linkbutton"  plain="true">管理链接</a>  
        		</div>  
       			 <div>  
     		 <input id="vNameSearchText" class="easyui-textbox" data-options="prompt:'名称'"/>
					<a id="searchBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search'">检索</a>
	        </div>  
    	</div>  
    	 
	 <div id="popdataplaywin">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'north',split:true" style="height:100px">
					<input id="vId" type="hidden"/>
					<input id="lName" class="easyui-textbox" data-options="prompt:'名称'"/>
					<input id="lLink" class="easyui-textbox" data-options="prompt:'链接地址'"/>
					<a id="addLinkBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加下载链接</a>
			</div>
			<div data-options="region:'center'" style="padding:10px;">
				<table id="playdg"></table>
			</div>
		</div>
	</div>
</body>
</html>