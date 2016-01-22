<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jspf"%>
<script type="text/javascript" charset="utf-8" src="<%=basePath%>js/data.js?v=1">
	
</script>
<div class="easyui-layout" style="width: 100%; height: 100%;">
		<div class="easyui-panel" title="操作窗口"  style="padding:10px;">
		数据来源:
		<input id="loadDataText" class="easyui-textbox" data-options="prompt:'百科链接地址'" style="width:20%;height:20px">
		<a id="loadDataBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:120px">开始采集数据</a>
		</div>
		<div class="easyui-panel" title="设置信息" style="" data-options="collapsible:true">
			<table>	
				<tr>
					<td>类型:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>类    型:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
			</table>
		</div>
		<div class="easyui-panel" title="基本信息" style="" data-options="collapsible:true">
			<table>	
				<tr>
					<td>中文名:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>类    型:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>中文拼音:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>中文首字母:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>外文名:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>主    演:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>出品时间:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>片    长:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>出品公司:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>上映时间:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>发行公司:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>票    房:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>制片地区:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>对白语言:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>拍摄地点:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>色    彩:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>拍摄日期:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>imdb编码:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>导    演:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>在线播放平台:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>编    剧:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>出品人:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>制片人:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>监    制:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
				<tr>
					<td>执行制片人:</td>
					<td>
						<input class="easyui-textbox">
					</td>
					<td>下映时间:</td>
					<td>
						<input class="easyui-textbox">
					</td>
				</tr>
			</table>
		</div>
</div>