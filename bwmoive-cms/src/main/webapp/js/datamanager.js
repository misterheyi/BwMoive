$(function(){
	
	$("#searchBtn").click(function() {
		var params = $('#dg').datagrid('options').queryParams; // 先取得 //
		// // 的查询参数
		params.vName = $("#vNameSearchText").val();
		$('#dg').datagrid('reload'); // 设置好查询参数 reload 一下就可以了
	});
	
	//保存链接地址
	$("#addLinkBtn").click(function() {
		$.ajax({
			url : basePath + '/link/saveLink',
			data : {
				"vId" : $("#vId").val(),
				"lName" : $("#lName").val(),
				"lLink" : $("#lLink").val()
			},
			type : "POST",
			cache : false,  
			dataType : "json",
			beforeSend : function(){
			},
			success : function(data, textStatus) {
				$('#playdg').datagrid('reload'); // 设置好查询参数 reload 一下就可以了
			},
		    complete: function () {
		    },
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log("异常"+errorThrown);
			}
		});
	});
	
	$("#linkManager").click(function(){
		managerDataPlay();
	});
	
    $('#dg').datagrid({
    	title:'检索结果',
        url: basePath + '/data/selectDataList',
		loadMsg : '数据加载中请稍后……',
		selectOnCheck : true,
		checkOnSelect : true,
		method : 'post',
		iconCls : 'icon-search',
		singleSelect : false, // 多选
		fitColumns : true,
		fit : true,
		idField : 'vId', // 主键字段
		striped : true, // 奇偶行颜色不同
		pagination : true,// 分页控件
		rownumbers : true, // 显示行号
        columns:[[
            {field : 'ck', checkbox : true},
            {field:'vId',title:'编号'},
            {field:'vName',title:'名称',width: 100},
            {field:'vLetter',title:'首写字母'},
            {field:'cId',title:'频道'},
            {field:'tId',title:'类型'},
            {field:'aId',title:'地区'},
            {field:'vYear',title:'年份'},
            {field:'vWeekHit',title:'周点击'},
            {field:'vMonthHit',title:'月点击'},
            {field:'vHit',title:'总点击'}, 
            {field : 'vUpdateTime',title : '更新时间',formatter:function(value,row,index){return new Date(value).format("yyyy-MM-dd hh:mm:ss");}}
        ]],		
        toolbar  : '#tb' ,
		onLoadSuccess : function() {
			$('#dg').datagrid('clearSelections'); // 一定要加上这一句，要不然datagrid会记住之前的选择状态，删除时会出问题
		}
    });
    
	//管理
    function managerDataPlay(){
		var rows = $('#dg').datagrid('getSelections');
		//这里有一个jquery easyui datagrid的一个小bug，必须把主键单独列出来，要不然不能多选
		if(rows.length==0){
			$.messager.alert('提示',"请选择一条内容！",'info');
			return;
		}
		if(rows.length > 1){
			$.messager.alert('提示',"只能选择一条内容进行更新",'info');
			return;
		}
		var item = rows[0];
		//隐藏视频ID
		$("#vId").val(item.vId);
	    $('#playdg').datagrid({
	    	title:'检索结果',
	        url: basePath + '/link/selectLinkByVId',
			loadMsg : '数据加载中请稍后……',
			selectOnCheck : true,
			checkOnSelect : true,
			method : 'post',
			queryParams: { 'vId': item.vId },
			iconCls : 'icon-search',
			singleSelect : false, // 多选
			fitColumns : true,
			fit : true,
			idField : 'lId', // 主键字段
			striped : true, // 奇偶行颜色不同
			pagination : false,// 分页控件
			rownumbers : true, // 显示行号
	        columns:[[
	            {field : 'ck', checkbox : true},
	            {field:'lId',title:'编号'},
	            {field:'lName',title:'名称'},
	            {field:'lLink',title:'链接'},
	            {field:'lType',title:'类型'},
	            {field:'lStatus',title:'状态'},
	            {field : 'lUpdateTime',title : '更新时间',formatter:function(value,row,index){return new Date(value).format("yyyy-MM-dd hh:mm:ss");}}
	        ]],		
			onLoadSuccess : function() {
				$('#playdg').datagrid('clearSelections'); // 一定要加上这一句，要不然datagrid会记住之前的选择状态，删除时会出问题
			}
	    });
	    
	    var $win;
	    $win = $('#popdataplaywin').window({
	            title:'['+item.vId+']链接管理',
	            width: 500,
	            height: 500,
	            top:($(window).height() - 500) * 0.5,  
	            left:($(window).width() - 500) * 0.5,
	            shadow: true,
	            modal:true,
	            iconCls:'icon-add',
	            closed:true,
	            minimizable:false,
	            maximizable:false,
	            collapsible:false
	         });
		
	    $win.window('open');
	};
    

});