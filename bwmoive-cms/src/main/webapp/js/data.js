$(function() {

	//抓取数据
	$("#loadDataBtn").click(function(){
		$.ajax({
			url : basePath + 'data/loadingData',
			data : {
				"source" : $("#loadDataText").val()
			},
			type : "POST",
			cache : false,  
			dataType : "json",
			beforeSend : function(){
				loading();
			},
			success : function(data, textStatus) {
				//$.messager.alert('提示', data.mes, 'info');
			},
		    complete: function () {
		    	hideLoading();
		    },
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log("获取链接异常");
			}
		});
	});
	
});

function loading(){
	$.messager.progress({ 
		title:'请稍后', 
		msg:'数据抓取中...'
	});
}

function hideLoading(){
	$.messager.progress('close');
}

