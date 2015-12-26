<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<script type="text/javascript" charset="utf-8">
$(function(){
	$("#searchMoiveBtn").click(function(){
		var params = $('#dg').datagrid('options').queryParams; // 先取得 // datagrid // 的查询参数
		var fields =$('#queryForm').serializeArray(); // 自动序列化表单元素为JSON对象
		$.each( fields, function(i, field){
			params[field.name] = field.value; // 设置查询参数
		}); 
		$('#dg').datagrid('reload'); // 设置好查询参数 reload 一下就可以了
	});
	
	  $("#getMoiveBasicInfo").click(function(){
		  var aj = $.ajax( {  
			    url:basePath+'/moive/loadMoiveBasicInfoBaiBuBaiKe',// 跳转到
																	// action
			    data:{"url" : $("#loadBaiduBaikeAddr").val()},  
			    type:'post',  
			    cache:false,  
			    dataType:'json',  
			    success:function(data){
			    	$("#moiveId").val(data.moiveId);
			    	$("#moivePosterRef").val(data.moivePosterRef);
			    	$("#moiveCName").val(data.moiveCName);
			    	$("#moiveType").val(data.moiveType);
			    	$("#moiveEName").val(data.moiveEName);
			    	$("#moiveEpisode").val(data.moiveEpisode);
			    	$("#moiveActor").val(data.moiveActor);
			    	$("#moiveProduceTime").val(data.moiveProduceTime);
			    	$("#moivePlayTime").val(data.moivePlayTime);
			    	$("#moiveProduceCompany").val(data.moiveProduceCompany);
			    	$("#moiveShowTime").val(data.moiveShowTime);
			    	$("#moiveReflectTime").val(data.moiveReflectTime);
			    	$("#moiveReleaseCompany").val(data.moiveReleaseCompany);
			    	$("#moiveLaguage").val(data.moiveLaguage);
			    	$("#moiveMakingLocation").val(data.moiveMakingLocation);
			    	$("#moiveDirector").val(data.moiveDirector);
			    	$("#moiveProducer").val(data.moiveProducer);
			    	$("#moiveLevel").val(data.moiveLevel);
			    	$("#moiveShortDrama").val(data.moiveShortDrama);
			    	$("#moiveTag").val(data.moiveTag);
			    	$("#moiveStatus").val(data.moiveStatus);
			    },  
			    error : function() {  
			          alert("异常！");  
			     }  
			});
	  });
	  $("#getMoivePosterBtn").click(function(){
		  $.ajax({
	            url:basePath+'/moive/loadPosterImageFromUrl',
	            data:{"url":$("#loadPosterAddr").val()},
	            dataType:"text",
	            type:"POST",
	            success:function(data,textStatus){
	            	$("#moivePosterRef").val(data);
	            },
	            error:function(XMLHttpRequest, textStatus, errorThrown){
                       alert("失败");
                       console.log(XMLHttpRequest.status);// 200客户端请求已成功
                       console.log(XMLHttpRequest.readyState);// 4响应内容解析完成，可以在客户端调用了
                       console.log(textStatus);// parsererror
	            }
	    });
	  });
	  $("#getDownLoadLinkBtn").click(function(){
		  $.ajax({
	            url:basePath+'/moive/loadDownLinkFromHtml',
	            data:{"url":$("#loadDownloadLinkAddr").val()},
	            dataType:"text",
	            type:"POST",
	            success:function(data,textStatus){
	            	var text = "";
	            	var listData=$.parseJSON(data);// 解析json字符串
	                $.each(listData,function(idx,item){ // 循环对象取值
	               		text+=item.moiveLinkName;
	            		text+="###";
	            		text+=item.moiveLinkRef;
	            		text+="\r\n";
	                 });
	            	$("#downloadLinkText").val(text);
	            },
	            error:function(XMLHttpRequest, textStatus, errorThrown){
                       alert("失败");
                       console.log(XMLHttpRequest.status);// 200客户端请求已成功
                       console.log(XMLHttpRequest.readyState);// 4响应内容解析完成，可以在客户端调用了
                       console.log(textStatus);// parsererror
	            }
	    });
	  });
	  $("#saveMoiveInfo").click(function(){
		  $.ajax({
	            url:basePath+'/moive/insertMoiveInfo',
	            data:{
	            	"moiveId":$("#moiveId").val(),
	            	"moivePosterRef":$("#moivePosterRef").val(),
	            	"moiveCName":$("#moiveCName").val(),
	            	"moiveType":$("#moiveType").val(),
	            	"moiveClass":$("#moiveClass").val(),
	            	"moiveEpisode":$("#moiveEpisode").val(),
	            	"moiveUpdateEpisode":$("#moiveUpdateEpisode").val(),
	            	"moiveActor":$("#moiveActor").val(),
	            	"moiveProduceTime":$("#moiveProduceTime").val(),
	            	"moivePlayTime":$("#moivePlayTime").val(),
	            	"moiveProduceCompany":$("#moiveProduceCompany").val(),
	            	"moiveShowTime":$("#moiveShowTime").val(),
	            	"moiveReflectTime":$("#moiveReflectTime").val(),
	            	"moiveReleaseCompany":$("#moiveReleaseCompany").val(),
	            	"moiveLaguage":$("#moiveLaguage").val(),
	            	"moiveMakingLocation":$("#moiveMakingLocation").val(),
	            	"moiveDirector":$("#moiveDirector").val(),
	            	"moiveProducer":$("#moiveProducer").val(),
	            	"moiveLevel":$("#moiveLevel").val(),
	            	"moiveShortDrama":$("#moiveShortDrama").val(),
	            	"moiveTag":$("#moiveTag").val(),
	            	"moiveStatus":$("#moiveStatus").val(),
	            	"moiveShortDrama":$("#moiveShortDrama").val(),
	            	"moiveDrama":moiveDrama.getContent()
	            },
	            dataType:"text",
	            type:"POST",
	            success:function(data,textStatus){
	            	saveMoiveLinkInfo(data);
	            },
	            error:function(XMLHttpRequest, textStatus, errorThrown){
                       alert("失败");
                       console.log(XMLHttpRequest.status);// 200客户端请求已成功
                       console.log(XMLHttpRequest.readyState);// 4响应内容解析完成，可以在客户端调用了
                       console.log(textStatus);// parsererror
	            }
	    });
	  });
	
	$('#dg').datagrid({
        url:basePath+'moive/selectMoiveList',
        loadMsg:'数据加载中请稍后……',
        selectOnCheck: true,
        checkOnSelect: true,
        method:'post',
        iconCls:'icon-edit',
        singleSelect:false, // 多选
        fitColumns: true,
        fit:true,
        collapsible:true,// 可折叠
        sortName: 'moiveCreateTime', // 排序的列
        sortOrder: 'desc', // 倒序
        remoteSort: true, // 服务器端排序
        idField:'moiveId', // 主键字段
        striped: true, // 奇偶行颜色不同
        pagination:true,// 分页控件
        rownumbers:true, // 显示行号
        columns:[[
        	{ field:'ck',checkbox:true },
            {field:'moiveCName',title:'名称',width:5},
            {field:'moiveType',title:'类型',width:5},
            {field:'moiveClass',title:'分类',width:10},
            {field:'moiveEpisode',title:'总集数',width:10},
            {field:'moiveUpdateEpisode',title:'当前更新集数',width:10},
            {field:'moiveTag',title:'标签',width:10},
            {field:'moiveClicks',title:'点击量',width:10},
            {field:'moiveStatus',title:'状态',width:10},
            {field:'moiveIsRecommend',title:'是否推荐',width:10},
            {field:'moiveUpdateTime',title:'更新时间',width:10},
            {field:'moiveCreateTime',title:'创建时间',width:10}
        ]],
        toolbar:[{
			text:'新增',
			iconCls:'icon-add',
			handler:function(){
				addrow();
			}
		},'-',{
			text:'删除',
			iconCls:'icon-remove',
			handler:function(){
				deleterow();
			}
		},'-'],
		onLoadSuccess:function(){
			$('#dg').datagrid('clearSelections'); // 一定要加上这一句，要不然datagrid会记住之前的选择状态，删除时会出问题
		}
	});
	
	    // 新增
function addrow(){
	$('#w').window('open');
}
// 删除
	function deleterow(){
		$.messager.confirm('提示','确定要删除吗?',function(result){
        if (result){
        	var rows = $('#dg').datagrid('getSelections');
        	var ps = "";
        	$.each(rows,function(i,n){
        		if(i==0) 
        			ps += "?moiveIds="+n.moiveId;
        		else
        			ps += "&moiveIds="+n.moiveId;
        	});
        	$.post(basePath+'moive/deleteMoives'+ps,function(data){
	        	$('#dg').datagrid('reload'); 
        		$.messager.alert('提示',data.mes,'info');
        	});
        }
    });
	}

function saveMoiveLinkInfo(data){
	  $.ajax({
            url:basePath+'/moiveLink/insertMoiveLinkInfo',
            data:{"moiveId":data,"moiveLinkStr":$("#downloadLinkText").val()},
            dataType:"text",
            type:"POST",
            success:function(data,textStatus){
            },
            error:function(XMLHttpRequest, textStatus, errorThrown){
               alert("失败");
               console.log(XMLHttpRequest.status);// 200客户端请求已成功
               console.log(XMLHttpRequest.readyState);// 4响应内容解析完成，可以在客户端调用了
               console.log(textStatus);// parsererror
            }
    });
}

function cleanPageData(){
	$("#loadBaiduBaikeAddr").val("");
	$("#loadPosterAddr").val("");
  	$("#moiveId").val("");
  	$("#moivePosterRef").val("");
  	$("#moiveCName").val("");
  	$("#moiveType").val("");
  	$("#moiveEName").val("");
  	$("#moiveActor").val("");
  	$("#moiveProduceTime").val("");
  	$("#moivePlayTime").val("");
  	$("#moiveProduceCompany").val("");
  	$("#moiveShowTime").val("");
  	$("#moiveReflectTime").val("");
  	$("#moiveReleaseCompany").val("");
  	$("#moiveLaguage").val("");
  	$("#moiveMakingLocation").val("");
  	$("#moiveDirector").val("");
  	$("#moiveProducer").val("");
  	$("#moiveLevel").val("");
  	$("#moiveShortDrama").val("");
  	$("#moiveTag").val("");
  	$("#moiveStatus").val("");
  	$("#moiveShortDrama").val("");
  	moiveDrama.setContent();
}

</script>
<div class="easyui-layout" style="width: 100%; height: 100%;">
	<div data-options="region:'north',title:'搜索条件',iconCls:'icon-ok'"
		style="height: 150px">
		<form id="queryForm" style="margin: 10; text-align: center;">
			<table width="100%">
				<tr>
					<td>影视名称：<input name="moiveSearchName" style="width: 200">
					</td>
				</tr>
				<tr>
					<td>类型： <select class="easyui-combobox" name="moiveSearchType"
						style="width: 200px;">
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
						name="moiveSearchStatus" style="width: 200px;">
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
		style="width: 900px; height: 600px; padding: 10px;">
		<div class="easyui-tabs"
			data-options="tabWidth:112,fit:true,tools:'#tab-tools'">
			<div title="基本信息" style="padding: 10px">
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
			<div title="下载链接" style="padding: 10px">
				抓取下载地址： <input id="loadDownloadLinkAddr" class="easyui-textbox"
					style="width: 500">
				<button id="getDownLoadLinkBtn">获取参数</button>
				<br> 地址:<br>
				<textarea id="downloadLinkText" style="width: 100%; height: 92%"></textarea>
			</div>
			<div title="描述详情" style="padding: 10px">
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