$(function(){
		$("#searchMoiveBtn").click(function(){
			var params = $('#dg').datagrid('options').queryParams; // 先取得 //
																	// datagrid
																	// // 的查询参数
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
